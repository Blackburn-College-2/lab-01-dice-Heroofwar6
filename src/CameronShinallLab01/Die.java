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
public class Die {

    public int side;
    /**
     * 
     * @param range makes sure that the rolls are added up
     * @return gives the final roll
     */
    public int side(int range, int sides) {
        if (range == 1) {
            this.side = (int) (sides * Math.random() + 1);
        } else if (range == 2) {
            this.side = (int) (sides * Math.random() + 1);
            this.side = side + (int) (sides * Math.random() + 1);
        }
        return side;
    }

    /**
     *
     * @param r - amount of rolls before a print
     * @param a - amount of dice rolled
     * @return
     */
    public int[] roll(int r, int a, int s) {
        Counter count = new Counter();
        Roller rolled = new Roller();
        int amount = r;
        int side = 0;
        int range = s * a;
        //if(range == 12){
            //range=range-1;
        //}
        int[] addingUp = new int[range];
        for (int i = 0; i <= r; i++) {
            side = this.side(a,s);
            count.amount(side, addingUp, a);
            if (i == r) {
                rolled.rolled(addingUp, amount, a, s);
                amount = amount + r;
                i = 0;
            }
        }

        return addingUp;

    }
}
