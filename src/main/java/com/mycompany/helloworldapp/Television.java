/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworldapp;

/**
 *
 * @author quan
 */
public class Television {
    int channel;
    int volumeChannel = 1;
    boolean isOn = false;
    
    public Television(int channel, int volumeChannel, boolean isOn) {
        System.out.println("This is a Constructor");
        this.channel = channel;
        this.volumeChannel = volumeChannel;
        this.isOn = isOn;
    }
    //Định nghĩa 1 phương thức(method)
    void showDetail() {
        System.out.println("Detail object: Channel: "+
                this.channel+", volumeLevel: "+this.volumeChannel+
                ", isOn: "+this.isOn);
    }
}
