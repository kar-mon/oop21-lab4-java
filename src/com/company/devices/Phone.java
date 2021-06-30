package com.company.devices;

import javax.naming.Name;
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

    public void installApp(Application name){
        installedApplications.add(new Application());
    }

    public boolean installApplication(Application application) {
        if (application.SupportedOS != this.getOperatingSystem()) {
            System.out.println("This application is not supported by the OS installed on the device");
            return false;
        }
        var found = installedApplications.indexOf(application);
        if (found != -1) {
            if (application.Version == installedApplications.get(found).Version) {
                System.out.println("This application is already installed on the device");
                return false;
            }
            installedApplications.remove(found);
            installedApplications.add(application);

        }
        System.out.println("Installing application");
        return true;
    }

    public boolean installBrandApplication(BrandApplication application){
        if (this.brand == application.supportedBrand) {
            return this.installApplication(application);
        }
        System.out.println("This device brand is not supported");
        return false;


    }





}

