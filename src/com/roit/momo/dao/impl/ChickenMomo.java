/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.momo.dao.impl;

import com.roit.momo.dao.Momo;

/**
 *
 * @author User
 */
public class ChickenMomo implements Momo{
    private int price = 150;

    @Override
    public void order(int quantity) {
        int cost = price*quantity;
        
        System.out.println("Chicken Momo Ordered \r\n"
                + "Rs: "+cost);
    }
    
    
}
