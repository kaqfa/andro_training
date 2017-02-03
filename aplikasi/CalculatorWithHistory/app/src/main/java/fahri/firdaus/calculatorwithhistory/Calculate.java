package fahri.firdaus.calculatorwithhistory;

import java.io.Serializable;

public class Calculate implements Serializable {
    public double num1, num2, result;
    public String operator;

    public Calculate(double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double calc(){
        if(operator.equals("tambah")){
            return num1 + num2;
        } else if(operator.equals("kurang")){
            return num1 - num2;
        } else if(operator.equals("kali")){
            return num1 * num2;
        } else if(operator.equals("bagi")){
            return num1 / num2;
        } else {
            return 0;
        }
    }
}
