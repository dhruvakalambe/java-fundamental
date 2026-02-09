package basic.datatypes;

public class character {
    public static void main(String[] args) {
        char q = 'D';
        System.out.println(q);
        //Type Casting converting the char to its integer value
        char w = 'h';
        System.out.println((int)q);
        //Boundary Values
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
    }
}
