package com.groups;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private static  int idGenerator = 1;
    private int id;
    private String name;
    private List<Group> subGroups;
    private List<Item> items;
    private Group parent;

    public Group(String name) {
        this.id = idGenerator;
        Group.idGenerator++;
        this.subGroups = new ArrayList<>();
        this.items = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGroup(Group group) {
        group.setParent(this);
        this.subGroups.add(group);
    }

    public void addItem(Item item) {
        item.setGroup(this);
        this.items.add(item);
    }

    public int getId() {
        return id;
    }

    public List<Group> getSubGroups() {
        return subGroups;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setParent(Group parent) {
        this.parent = parent;
    }

    public Group getParent() {
        return parent;
    }
}
