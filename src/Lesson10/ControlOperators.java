package Lesson10;

public class ControlOperators {
    int a = 5, b=7;
    boolean value = true;
    public void foo(){
        if (false) {
            System.out.println("True");
            a++;
            if (a<b){
                System.out.println("yes");
            }
        }
        else if (b<a){
            System.out.println("False");
        }else {
            System.out.println("AAAA");
        }
    }


}
