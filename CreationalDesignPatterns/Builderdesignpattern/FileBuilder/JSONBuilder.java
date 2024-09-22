package Builderdesignpattern.FileBuilder;

import java.util.Map;

public class JSONBuilder extends FileBuilder {
    private Map<String, Object> jsonData;
    private boolean prettyPrint = false;
    private int indentationLevel = 2;

    // Set the JSON data (key-value pairs)
    public JSONBuilder setJsonData(Map<String, Object> jsonData) {
        this.jsonData = jsonData;
        return this;
    }

    // Set pretty printing
    public JSONBuilder setPrettyPrint(boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
        return this;
    }

    // Set indentation level for pretty printing
    public JSONBuilder setIndentationLevel(int indentationLevel) {
        this.indentationLevel = indentationLevel;
        return this;
    }

    @Override
    public String build() {
        StringBuilder json = new StringBuilder();
        String indent = prettyPrint ? " ".repeat(indentationLevel) : "";
        String newline = prettyPrint ? "\n" : "";

        json.append("{").append(newline);
        jsonData.forEach((key, value) -> {
            json.append(indent)
                .append("\"").append(key).append("\": \"").append(value).append("\",")
                .append(newline);
        });

        json.setLength(json.length() - 2); // Remove the last comma
        json.append(newline).append("}");

        return json.toString();
    }
}
