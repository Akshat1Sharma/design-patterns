package StructualDesignPattern.CompositeDesignPattern.FileSystem.withCompositePattern;

import java.util.*;

public class Folder implements DocumentComponent{
    private String name;

    private List<DocumentComponent> components = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void addComponent(DocumentComponent component){
        components.add(component);
    }

    @Override
    public int getSize(){
        return components.stream().mapToInt(DocumentComponent::getSize).sum();
    }
}
