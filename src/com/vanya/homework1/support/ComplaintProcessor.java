package com.vanya.homework1.support;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplaintProcessor {

    private static final Pattern COMPLAINT_PATTERN = Pattern.compile(
            "(\\d+),\s*(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}),\s*([^,]+),\s*([^,]+),\s*(.*)");

    public List<Complaint> readNewComplaints(String logFilePath) throws IOException {
        List<Complaint> complaints = new ArrayList<>();
        Path path = Paths.get(logFilePath);

        if (!Files.exists(path)) {
            return complaints;
        }

        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            Matcher matcher = COMPLAINT_PATTERN.matcher(line);
            if (matcher.matches()) {
                complaints.add(new Complaint(
                        matcher.group(1),
                        matcher.group(2),
                        matcher.group(3),
                        matcher.group(4),
                        matcher.group(5)
                ));
            }
        }

        return complaints;
    }
}