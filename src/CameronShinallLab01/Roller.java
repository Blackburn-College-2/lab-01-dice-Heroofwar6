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

    public void rolled(int[] counted, int rolls) {
        Die checkRoll = new Die();
        System.out.println("After " + rolls + " rolls, the distribution is:");
        for (int i = 0; i < counted.length; i++) {
            System.out.println((i + 1) + " was rolled " + counted[i] + " times.");

        }
    }
}
