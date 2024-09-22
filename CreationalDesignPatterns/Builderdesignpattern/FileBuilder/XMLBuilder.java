package Builderdesignpattern.FileBuilder;

import java.util.List;

public class XMLBuilder extends FileBuilder {
    private String rootElement;
    private List<String> elements;
    private boolean prettyPrint = false;
    private int indentationLevel = 4;

    // Set the root element for the XML file
    public XMLBuilder setRootElement(String rootElement) {
        this.rootElement = rootElement;
        return this;
    }

    // Set the nested elements for the XML file
    public XMLBuilder setElements(List<String> elements) {
        this.elements = elements;
        return this;
    }

    // Set pretty printing (indentation)
    public XMLBuilder setPrettyPrint(boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
        return this;
    }

    // Set indentation level for pretty printing
    public XMLBuilder setIndentationLevel(int indentationLevel) {
        this.indentationLevel = indentationLevel;
        return this;
    }

    @Override
    public String build() {
        StringBuilder xml = new StringBuilder();
        String indent = prettyPrint ? " ".repeat(indentationLevel) : "";

        // Add XML declaration
        xml.append("<?xml version=\"1.0\" encoding=\"").append(encoding).append("\"?>\n");

        // Open root element
        xml.append("<").append(rootElement).append(">\n");

        // Add nested elements
        for (String element : elements) {
            xml.append(indent).append(element).append("\n");
        }

        // Close root element
        xml.append("</").append(rootElement).append(">");

        return xml.toString();
    }
}
