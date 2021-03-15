/**
 * Created by IntelliJ IDEA.
 * User: A.Danilov
 * Date: 12.03.2021
 * Time: 11:39
 * To change this template use File | Settings | File Templates.
 */

public class ArabicCalculation {
    int aNum1;
    int aNum2;

//    ArabicCalculation(int num1, int num2) {
//        this.aNum1 = num1;
//        this.aNum2 = num2;
//    }

    public void calc(int num1, int num2, String operand) {
        Calculation calculation = new Calculation(num1, num2);
        if(operand.equals("+")){
            calculation.sum();
        }
        else if(operand.equals("-")){
            calculation.sub();
        }
        else if(operand.equals("/") || operand.equals(":")){
            calculation.div();
        }
        else if(operand.equals("*")){
            calculation.mul();
        }
        System.out.println(calculation.getResult());
    }

}
