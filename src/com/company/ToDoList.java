package com.company;

import java.util.ArrayList;

public class ToDoList {
    public static ArrayList<String> list = new ArrayList<>();

    private String item;

    public void ToDoList(String item){
        this.item = item;
    }

    public void addItem(String item){
        list.add(item);
    }

    public void removeItem(int index){
        list.remove(index);
    }

    public int listSize(){
        return list.size();
    }

    public String listIndex(int index){
        return list.get(index);
    }

}
