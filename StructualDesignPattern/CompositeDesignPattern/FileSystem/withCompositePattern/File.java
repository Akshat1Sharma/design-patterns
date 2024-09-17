package StructualDesignPattern.CompositeDesignPattern.FileSystem.withCompositePattern;


//Leaf : File
public class File  implements DocumentComponent{
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
