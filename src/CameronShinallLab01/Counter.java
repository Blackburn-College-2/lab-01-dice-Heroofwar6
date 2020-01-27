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

    public int[] amount(int num, int[] added, int range) {
        if (range == 1) {
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
        }else if(range == 2){
            if (num == 2) {
                added[0]++;
            } else if (num == 3) {
                added[1]++;
            } else if (num == 4) {
                added[2]++;
            } else if (num == 5) {
                added[3]++;
            } else if (num == 6) {
                added[4]++;
            } else if (num == 7) {
                added[5]++;
            } else if (num == 8) {
                added[6]++;
            } else if (num == 9) {
                added[7]++;
            } else if (num == 10) {
                added[8]++;
            } else if (num == 11) {
                added[9]++;
            } else if (num == 12) {
                added[10]++;                
            }
        }
        return added;

    }
}
