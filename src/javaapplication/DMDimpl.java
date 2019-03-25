/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author bhosaman
 */
public class DMDimpl extends DMD {

    public int seats = 150;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public static void main(String[] args) {
        DMD impl = new DMDimpl();

        System.out.println("Super class variable=" + impl.seats);

        System.out.println("Sub class method=" + impl.getSeats());

    }
}
