package org.example;

import java.util.ArrayList;

public class Room {
    Bed bed = new Bed();
    Window roomWindow1 = new Window();
    Window roomWindow2 = new Window();
    ArrayList<Window> roomWindows = new ArrayList<>();

    public ArrayList<Window> getRoomWindows() {
        roomWindows.add(roomWindow1);
        roomWindows.add(roomWindow2);
        return roomWindows;
    }

    @Override
    public String toString() {
        return "\n*** Room ***" + bed +
                 roomWindows ;
    }
}
