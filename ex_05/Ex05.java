package ex_05;

import java.util.ArrayList;

public class Ex05 {

    public static ArrayList<String> myGetArgs(String... var) {
        ArrayList<String> myArray = new ArrayList<String>();
        for (String s : var) {
            myArray.add(s);
        }
        return myArray;
    }

    /*
    public static void main(String[] args) {
        ArrayList<String> myArray = myGetArgs("Volvo", "BMW", "Ford");
        System.out.println(myArray);
    }
    */
}
