package lesson_01;

public class Variables {
    public static void main(String[] args) {

        byte age = 35;
        short count;
        count = 1000;

        System.out.println(age);
        System.out.println(count);
        System.out.println(60);

//        age = 128;  byte -> | -128 --- 127 |
        System.out.println(age);

        int myAge = 35;
        long myLongNumber = 1L;

        System.out.println("myLongNumber = " + myLongNumber);
        System.out.println("myAge = " + myAge);

        float myFloat = 35.6f;
        double myDouble = 456.9876;
/*
        boolean myTrue = true;
        boolean myFalse = false;
        System.out.println("myFalse = " + myFalse);
        System.out.println("myDouble = " + myDouble);
*/
        String myName = "Alex Alex Alex Alex Alex 15 true";
//        System.out.println("myName = " + myName);

        char myChar = ' ';
        char myChar2 = 'c';

        String myFirstName;
        String MyFirstName;
        String _myFirstName;
        String $myFirstName;
        String my_1_Name;
        int MY_AGE;
        String class_name; // for future use

    }
}
