package ex_02;

public class Ex02 {
    public static String getAngryDog(int nbr) {
        String dog = "";
        for (int i = 0; i < nbr; i++) {
            dog += "woof";
        }
        return dog;
    }

    public static void main(String[] args) {
        System.out.println(getAngryDog(3));
    }
}