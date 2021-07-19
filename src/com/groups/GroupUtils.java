package com.groups;

import java.util.List;

public class GroupUtils {

    public static void printAllItemsInGroup(Group parentGroup) {
        printSingleGroup(parentGroup);
        List<Group> childGroups = parentGroup.getSubGroups();
        if (childGroups.isEmpty()) {
            return;
        }
        for (Group cur : childGroups) {
            printAllItemsInGroup(cur);
        }
    }

    public static void printSingleGroup(Group group) {
        System.out.println(" Group id " + group.getId() + " Group name" + group.getName());
        List<Item> items = group.getItems();
        for (Item item : items) {
            System.out.println(item);
        }
    }

}
