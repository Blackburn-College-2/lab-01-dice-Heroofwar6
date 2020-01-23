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

    public int side() {
        this.side = (int) (6 * Math.random() + 1);
        return side;
    }

    public int[] roll(int r) {
        Counter count = new Counter();
        Roller rolled = new Roller();
            int amount = r;
            int side = 0;
            int[] addingUp = new int[6];
            for (int i = 0; i <= r; i++) {
                side = this.side();
                count.amount(side, addingUp);
                if(i == r){
                rolled.rolled(addingUp, amount);
                amount= amount+r;
                i=0;
                }
            }
            

            return addingUp;
       
    }
}
