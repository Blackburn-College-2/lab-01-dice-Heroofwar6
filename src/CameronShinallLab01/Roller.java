/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CameronShinallLab01;

/**
 *
 * @author cameron.shinall
 */
public class Roller {

    public void rolled(int[] counted, int rolls, int range, int sides) {
        Die checkRoll = new Die();
        System.out.println("After " + rolls + " rolls, the distribution is:");
        if (range == 1) {
            for (int i = 1; i <= sides; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();
            for (int i = 0; i < counted.length; i++) {
                System.out.print(counted[i] + "\t");
            }
            System.out.println();
        } else if (range == 2) {
            int index = 0;
            sides = sides*2;
            for (int i = 2; i <= sides; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();
            for (int i = 1; i < counted.length; i++) {                
                    System.out.print(counted[index] + "\t");
                    index++;
            }
            System.out.println();
        }
    }
}
