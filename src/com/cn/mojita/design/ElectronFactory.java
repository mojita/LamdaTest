package com.cn.mojita.design;


public class ElectronFactory {
    USBElectron device = null;//这个是设备

    public  USBElectron creatDevice(String name){
        switch (name) {
            case "computer":
                device = new Computer(name);
                break;
            case "mouse":
                device = new Mouse(name);
                break;
            default:
                break;
        }
        return device;
    }
}
