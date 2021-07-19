package com.groups;

public class MyMain {

    public static void main(String[] args) {
        Group parentGroup = new Group("Songs");

        parentGroup.addItem(new Item("some song 1", 10, "USD"));
        parentGroup.addItem(new Item("some song 2", 12, "USD"));

        Group folk = new Group("Folk");
        folk.addItem(new Item("folk 1", 10, "USD"));
        folk.addItem(new Item("folk 2 ", 44, "USD"));

        Group jazz = new Group("Jazz");
        jazz.addItem(new Item("jazz_song_1", 20, "USD"));
        jazz.addItem(new Item("jazz_song_2", 10, "USD"));

        Group armeaJzz = new Group("Armenin jazz");
        jazz.addGroup(armeaJzz);

        parentGroup.addGroup(folk);
        parentGroup.addGroup(jazz);

        GroupUtils.printSingleGroup(jazz);
        GroupUtils.printAllItemsInGroup(parentGroup);
    }
}
