package September20;

import java.sql.SQLOutput;

public class StaticVar {
    public static int variable;
    public int variable2;

    static {
        variable = foo();
    }

    public static int foo() {
        System.out.println(variable);
        return 1;


    }
}
