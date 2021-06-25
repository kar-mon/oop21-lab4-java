package com.company.devices;

import java.util.ArrayList;
import java.util.List;

public class Phone implements Device {
    private Brands brand;
    private String model;
    private OS operatingSystem;
    private List<Application> installedApplications;

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public OS getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OS operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Phone() {
        installedApplications = new ArrayList<>();
    }

    public boolean installApplication(Application application) {
        System.out.println("Installing app");
        return true;
    }
}
