package StructualDesignPattern.CompositeDesignPattern.FileSystem.withoutCompositePattern;

import java.util.*;
public class Folder {
    private String name;

    private List<File> files = new ArrayList<>();

    private List<Folder> subFolder = new ArrayList<>();


    private Folder(String name){
        this.name = name;
    }

    public void addFile(File file){
        files.add(file);
    }

    public void addFolder(Folder folder){
        subFolder.add(folder);
    }

    public int getSize(){
        int totalSize = 0;

        for(File file : files){
            totalSize += file.getSize();
        }

        for(Folder folder : subFolder){
            totalSize += folder.getSize();
        }

        return totalSize;
    }
}
