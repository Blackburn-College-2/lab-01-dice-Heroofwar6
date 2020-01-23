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
public class Counter {

    public int[] amount(int num, int[] added) {

        if (num == 1) {
            added[0]++;
        } else if (num == 2) {
            added[1]++;
        } else if (num == 3) {
            added[2]++;
        } else if (num == 4) {
            added[3]++;
        } else if (num == 5) {
            added[4]++;
        } else if (num == 6) {
            added[5]++;
        }
        return added;
    }
}
