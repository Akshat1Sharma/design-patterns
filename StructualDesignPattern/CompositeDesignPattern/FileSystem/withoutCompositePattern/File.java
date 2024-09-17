package StructualDesignPattern.CompositeDesignPattern.FileSystem.withoutCompositePattern;

public class File {
    private String name;
    private int size;

    public File(String name,int size){
        this.name = name;
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}
