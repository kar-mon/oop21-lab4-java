package com.company.devices;

public class Human {
    private double cash;
    private Device device;


    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public boolean installApplication(Application application) {
        if (this.cash < application.Price){
            System.out.println("You do not have sufficient founds to finalize the purchase");
        }
        return device.installApplication(application);
    }



}
