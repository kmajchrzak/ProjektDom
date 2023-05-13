package org.example;

public class Window {
    public boolean isOpen = false;


    @Override
    public String toString() {
        return "\nWindow::: " +
                "is Open = " + isOpen;
    }

    public void setOpen(boolean isOpen) {
        isOpen = true;
    }

    public Window() {
    }

}
