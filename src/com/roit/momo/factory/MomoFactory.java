/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.momo.factory;

import com.roit.momo.dao.Momo;
import com.roit.momo.dao.impl.BuffMomo;
import com.roit.momo.dao.impl.ChickenMomo;
import com.roit.momo.dao.impl.VegMomo;

/**
 *
 * @author User
 */
public class MomoFactory {
    public Momo getMomo(String momoType){
        if(momoType.equalsIgnoreCase("Chicken")){
            return new ChickenMomo();
        }else if(momoType.equalsIgnoreCase("Buff")){
            return new BuffMomo();
        }else if(momoType.equalsIgnoreCase("Veg")){
            return new VegMomo();
        }else{
            return null;
        }
    }
    
    public void menu(){
        System.out.println("---------------------------------------- \r\n"
                + "Do you have any other orders? \r\n"
                + "---------------------------------------- \r\n"
                + "We Serve Chicken, Buff and Veg Momo \r\n"
                + "Press 1 for Chicken Momo \r\n"
                + "Press 2 for Buff Momo \r\n"
                + "Press 3 for Veg Momo \r\n"
                + "press 4 to Exit \r\n"
                + "Please make a Choice");
    }
    
}
