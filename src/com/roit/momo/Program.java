/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.momo;

import com.roit.momo.dao.Momo;
import com.roit.momo.factory.MomoFactory;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MomoFactory momoFactory = new MomoFactory();
        int choice;
        char orderOther;

        //choice is for menu and orderOther is for ordering again
        Momo momo = null;

        
        System.out.println("Welcome to Momo Ordering System \r\n"
                + "---------------------------------------- \r\n"
                + "You have three choices Chicken Buff and Veg \r\n"
                + "Press 1 for Chicken Momo \r\n"
                + "Press 2 for Buff Momo \r\n"
                + "Press 3 for Veg Momo \r\n"
                + "press 4 to Exit \r\n"
                + "Please make a Choice");
        
        while (true) {
            
        choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    momo = momoFactory.getMomo("Chicken");
                    break;
                case 2:
                    momo = momoFactory.getMomo("Buff");
                    break;
                case 3:
                    momo = momoFactory.getMomo("Veg");
                    break;
                case 4:
                    System.exit(0);
            }
            if (momo != null)  momo.order(1);
            momoFactory.menu();
        }

    }

}
