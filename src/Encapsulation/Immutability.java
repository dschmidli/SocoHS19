package Encapsulation;

import java.util.ArrayList;

public class Immutability {
    public int i = 3;
    private ArrayList aList = new ArrayList();

    Immutability() {
        aList.add(0);
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public ArrayList getAList() {
        return aList;
    }

    public static void main(String[] args) {
        Immutability imu = new Immutability();

        System.out.println(imu.getI());
        imu.i = 4;
        System.out.println(imu.getI());
        imu.setI(5);
        System.out.println(imu.getI());

        ArrayList b = imu.getAList();
        System.out.println(imu.getAList());
        b.add(1);
        System.out.println(imu.getAList());
        b = new ArrayList();
        System.out.println(b);
    }
}
