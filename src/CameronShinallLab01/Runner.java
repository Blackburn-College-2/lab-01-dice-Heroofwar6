/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CameronShinallLab01;

import java.util.Scanner;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Die roll = new Die();
        Scanner input = new Scanner(System.in);
        System.out.print("How many dice do you want to roll (1 or 2)?");
        int diceAmount = input.nextInt();
        System.out.print("How often should I print? ");
        int rolls = input.nextInt();
        roll.roll(rolls, diceAmount);
    }

}
