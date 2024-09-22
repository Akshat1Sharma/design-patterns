package Builderdesignpattern.FileBuilder;

public abstract class FileBuilder {

    protected String encoding =  "UTF-8";

    public FileBuilder setEncoding(String encoding){
        this.encoding = encoding;
        return this;
    }

    public abstract String build();
}
