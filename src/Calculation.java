/**
 * Created by IntelliJ IDEA.
 * User: A.Danilov
 * Date: 11.03.2021
 * Time: 12:41
 * To change this template use File | Settings | File Templates.
 */

public class Calculation {
    int num1;
    int num2;
    int result;

    Calculation(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void sum () {
        this.result = num1 + num2;
    }
    public void sub () {
        this.result = num1 - num2;
    }
    public void div () {
        try {
            this.result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
            return;
        }
    }
    public void mul () {
        this.result = num1 * num2;
    }

    public int getResult () {
        return result;
    }
}

