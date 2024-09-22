package Builderdesignpattern.FileBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class CSVBuilder extends FileBuilder {
    private List<String> headers;
    private List<List<String>> rows;
    private String delimiter = ",";
    private boolean quoteEnclosed = false;
    private String newline = "\n";

    // Set the headers for the CSV file
    public CSVBuilder setHeaders(List<String> headers) {
        this.headers = headers;
        return this;
    }

    // Set the rows for the CSV file
    public CSVBuilder setRows(List<List<String>> rows) {
        this.rows = rows;
        return this;
    }

    // Set the delimiter (comma, semicolon, etc.)
    public CSVBuilder setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    // Set if fields should be enclosed in quotes
    public CSVBuilder setQuoteEnclosed(boolean quoteEnclosed) {
        this.quoteEnclosed = quoteEnclosed;
        return this;
    }

    // Set newline format (Unix, Windows)
    public CSVBuilder setNewline(String newline) {
        this.newline = newline;
        return this;
    }

    @Override
    public String build() {
        StringBuilder csv = new StringBuilder();

        // Add headers
        if (headers != null && !headers.isEmpty()) {
            csv.append(String.join(delimiter, headers)).append(newline);
        }

        // Add rows
        for (List<String> row : rows) {
            csv.append(row.stream()
                    .map(field -> quoteEnclosed ? "\"" + field + "\"" : field)
                    .collect(Collectors.joining(delimiter)))
               .append(newline);
        }

        return csv.toString();
    }
}
