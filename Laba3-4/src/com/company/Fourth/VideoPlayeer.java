package com.company.Fourth;

public class VideoPlayeer extends Player{


    @Override
    public void on() {
        System.out.println("playyer has been on");
    }

    @Override
    public void play() {
        System.out.println("playyer has been play");
    }

    @Override
    public void off() {
        System.out.println("playyer has been off");
    }

    @Override
    public void technic() {
        System.out.println("console.log(alll yours items)");
    }
}
