package Lesson11;

public class OperatorSwitch {
    final int VALUE  = 2, FIRSTVALUE = 1, SECONDVALUE = 2, THIRDVALUE = 3;
    public void foo(){


        switch(VALUE){
            case FIRSTVALUE:
                System.out.println(25);
                break;
            case SECONDVALUE:
                System.out.println(73);
                break;
            case THIRDVALUE:
                System.out.println(48);
                break;
            default:
                System.out.println("Not found");

        }
    }
}
