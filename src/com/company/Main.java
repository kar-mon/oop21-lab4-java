package com.company;

import com.company.devices.Application;
import com.company.devices.Human;
import com.company.devices.OS;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        var phone = new Phone();
        phone.setOperatingSystem(OS.Android);
        var human = new Human();
        human.setDevice(phone);
        var application = new Application();
        human.installApplication(application);

    }
}
