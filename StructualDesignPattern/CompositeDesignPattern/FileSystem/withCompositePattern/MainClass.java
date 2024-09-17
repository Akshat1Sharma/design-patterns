package StructualDesignPattern.CompositeDesignPattern.FileSystem.withCompositePattern;

public class MainClass {

    public static void main(String[] args) {
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);


        Folder subFolder = new Folder("SubFolder");
        subFolder.addComponent(file1);

        Folder rootFolder = new Folder("RootFolder");

        rootFolder.addComponent(file2);
        rootFolder.addComponent(subFolder);

        System.out.println("Total Size " +rootFolder.getSize());
    }
    

}

