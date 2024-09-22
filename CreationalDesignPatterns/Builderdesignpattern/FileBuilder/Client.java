package Builderdesignpattern.FileBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        // CSV Builder Example
        CSVBuilder csvBuilder = new CSVBuilder()
                .setHeaders(Arrays.asList("ID", "Name", "Age"))
                .setRows(Arrays.asList(
                        Arrays.asList("1", "John", "30"),
                        Arrays.asList("2", "Alice", "25")
                ))
                .setDelimiter(",")
                .setQuoteEnclosed(true);
        System.out.println("Generated CSV:");
        System.out.println(csvBuilder.build());

        // XML Builder Example
        XMLBuilder xmlBuilder = new XMLBuilder()
                .setRootElement("employees")
                .setElements(Arrays.asList(
                        "<employee><id>1</id><name>John</name><age>30</age></employee>",
                        "<employee><id>2</id><name>Alice</name><age>25</age></employee>"
                ))
                .setPrettyPrint(true);
        System.out.println("\nGenerated XML:");
        System.out.println(xmlBuilder.build());

        // JSON Builder Example
        Map<String, Object> jsonData = new HashMap<>();
        jsonData.put("id", 1);
        jsonData.put("name", "John");
        jsonData.put("age", 30);

        JSONBuilder jsonBuilder = new JSONBuilder()
                .setJsonData(jsonData)
                .setPrettyPrint(true);
        System.out.println("\nGenerated JSON:");
        System.out.println(jsonBuilder.build());
    }
}