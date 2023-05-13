package org.example;

import java.nio.channels.ConnectionPendingException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> windows = new ArrayList<>();
        Window window1 = new Window().setOpen(true);
        Window window2 = new Window();
        Window window3 = new Window();
        Window window4 = new Window();
        windows.add(String.valueOf(window1));
        windows.add(String.valueOf(window2));
        windows.add(String.valueOf(window3));
        windows.add(String.valueOf(window4));
        System.out.println(windows);

        Bed bed = new Bed(3);
        System.out.println(bed);

        Room room = new Room();
        bed.setDaysOfLinenChange(5);
        room.getRoomWindows();
        System.out.println(room);
    }
}