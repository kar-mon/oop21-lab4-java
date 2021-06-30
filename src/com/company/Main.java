package com.company;

import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        var phone = new Phone();
        phone.setOperatingSystem(OS.Android);
        phone.setBrand(Brands.Xiaomi);
        var user = new Human();
        user.setDevice(phone);
        user.setCash(100.0);


        Application workout = new Application();
            workout.SupportedOS = OS.Android;
            workout.Paid = true;
            workout.Name = "Round & Workout Timer+";
            workout.Version = "7.41";
            workout.Author = "Timonium";
            workout.Price = 0.99;

        Application duolingo = new Application();
            duolingo.SupportedOS = OS.Android;
            duolingo.Paid = true;
            duolingo.Name ="duolingo";
            duolingo.Version ="depending on the device";
            duolingo.Author = "Duolingo";
            duolingo.Price = 150.0;

        Application  mimo = new Application();
            mimo.SupportedOS = OS.Android;
            mimo.Paid = false;
            mimo.Name = "Mimo";
            mimo.Version = "3.39.1";
            mimo.Author ="Mimohello GmbH";
            mimo.Price = 0.0;

        Application spotify = new Application();
            spotify.SupportedOS = OS.Android;
            spotify.Paid = false;
            spotify.Name = "Spotify";
            spotify.Version ="depending on the device";
            spotify.Author="Spotify Ltd.";
            spotify.Price=0.0;

        Application pvz = new Application();
            pvz.SupportedOS = OS.Android;
            pvz.Paid = false;
            pvz.Name = "Plants vs Zombies 2";
            pvz.Version = "8.9.1";
            pvz.Author ="ELECTRONIC ARTS";
            pvz.Price = 0.0;

        Application ovu = new Application();
            ovu.SupportedOS = OS.Android;
            ovu.Paid = false;
            ovu.Name = "OvuView";
            ovu.Version = "depending on the device";
            ovu.Author = "Tempdrop LLC";
            ovu.Price = 0.0;

        Application alarm = new Application();
            alarm.SupportedOS = OS.Android;
            alarm.Paid = false;
            alarm.Name = "Alarmy - Morning Alarm Clock";
            alarm.Version ="4.64.05";
            alarm.Author ="Alarm Clock Alarmy";
            alarm.Price = 0.0;

        Application imovie = new Application();
            imovie.SupportedOS = OS.iOS;
            imovie.Paid = false;
            imovie.Name = "iMovie";
            imovie.Version = "14";
            imovie.Author = "Apple";
            imovie.Price = 0.0;

        Application wallet = new Application();
            wallet.SupportedOS = OS.iOS;
            wallet.Paid = false;
            wallet.Name = "Apple Wallet";
            wallet.Version = "10.0";
            wallet.Author ="Apple";
            wallet.Price = 0.0;

        Application lan = new Application();
            lan.SupportedOS=OS.Widnows;
            lan.Paid = true;
            lan.Name = "LAN Drive";
            lan.Version = "8.0";
            lan.Author="Webrox";
            lan.Price=5.0;

        BrandApplication samsung = new BrandApplication(Brands.Samsung);
            samsung.SupportedOS = OS.Android;
            samsung.Paid = false;
            samsung.Name = "Samsung Gallery";
            samsung.Version = "3";
            samsung.Author = "Samsung";
            samsung.Price = 0.0;

        BrandApplication xiaomi = new BrandApplication(Brands.Xiaomi);
            xiaomi.SupportedOS = OS.Android;
            xiaomi.Paid = false;
            xiaomi.Name = "Mi home";
            xiaomi.Version = "12a";
            xiaomi.Author = "Xiaomi";
            xiaomi.Price = 0.0;

        user.installApplication(workout);
        user.installApplication(duolingo);
        user.installApplication(lan);
        user.installApplication(imovie);
        user.installApplication(pvz);

        phone.installBrandApplication(samsung);
        phone.installBrandApplication(xiaomi);

    }
}
