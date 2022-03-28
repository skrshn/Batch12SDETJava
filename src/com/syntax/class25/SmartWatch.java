package com.syntax.class25;

public abstract class SmartWatch {

    //we can have instance variables in the abstract class
    private int RAM;
    protected int ROM;
    double displaySize;
    public String make;
    static boolean showTime=true;


    SmartWatch(int RAM, int ROM, double displaySize, String make){
            this.RAM=RAM;
            this.ROM=ROM;
            this.displaySize=displaySize;
            this.make=make;
    }
    public abstract void showHealthTips();
    public void updateOS(){
        checkOSUpdate();
        downloadUpdate();
        installUpdate();
        System.out.println("Updating the OS");
    }

    private void checkOSUpdate() {
        System.out.println("Checking if update is available");
    }
    private void downloadUpdate() {
        System.out.println("Downloading the update");
    }
    private void installUpdate() {
        System.out.println("Installing the update");
    }
    static void displayTime(){
        System.out.println("Displaying time");
    }
}

class AppleWatch extends SmartWatch{
    AppleWatch(int RAM, int ROM, double displaySize, String make){
        super(RAM,ROM,displaySize,make);
    }

    @Override
    public void showHealthTips(){
        System.out.println("Use the Health App to");
    }
}

class WatchTester{
    public static void main(String[] args) {
        SmartWatch appleWatch = new AppleWatch(2,16,10,"Apple");
        appleWatch.showHealthTips();
        appleWatch.displayTime();
        appleWatch.updateOS();
    }
}
