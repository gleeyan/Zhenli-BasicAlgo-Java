// @Author Zhenli Yang Coding Dojo Assignment

import java.util.Arrays;

public class BasicsTest {
    public static void main(String[] args){
        Basics basics = new Basics();
        basics.print1To255();
        basics.printOdd1To255();
        basics.printSum();
        int[] array = {1, 5, 10, 7, -2};
        basics.interateArray(array);
        basics.findMax(array);
        basics.getAvg(array);
        System.out.println(basics.arrayOddNum());
        System.out.println(basics.greaterThanY(array,4));

        System.out.println(Arrays.toString(basics.squareValues(array)));
        System.out.println(Arrays.toString(basics.eliminateNegNums(array)));
        System.out.println(Arrays.toString(basics.maxMinAvg(array)));
        System.out.println(Arrays.toString(basics.shiftArray(array)));
    }
}
