import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: A.Danilov
 * Date: 04.03.2021
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */

public class Console {
    private boolean arabic_or_romes = true;
    int num1;
    int num2;
    int numRom1;
    int numRom2;
    Calculation ar;
    RomesCalculation rc;
    ArabicCalculation ac = new ArabicCalculation();

    private static String[] check (String input){
        String [] mass_input = input.split(" ");
        if(mass_input.length != 3){
            Scanner input_new = new Scanner(System.in);
            System.out.println("Неверный формат ввода данных");
            input = input_new.nextLine();
            return check(input);
        }
        else {
            return mass_input;
        }

    }

    public void console() {
        Scanner input_value = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение арабскими или римскими символами от 1 до 10, разделяя его пробелами");
        String input = input_value.nextLine();
        while(!input.isEmpty()){
            String [] mass_input = Console.check(input);
            String operand = mass_input[1];
            try{
                num1 = Integer.parseInt(mass_input[0]);
                num2 = Integer.parseInt(mass_input[2]);
                if(num1 > 10 | num1 < 1 || num2 > 10 | num2 < 1){
                    throw new Exception();
                }
            }catch(NumberFormatException e){
                arabic_or_romes = false;
                rc = new RomesCalculation(mass_input[0], mass_input[2]);
            } catch(Exception ex){
                System.out.println("Введите число от 1 до 10");
                System.exit(01);
            }
            if(arabic_or_romes){
                ac.calc(num1, num2, operand);
                //break;
            }
            else {
                rc.calc(operand);
                //break;
            }
            System.out.println("Введите следующее выражение: ");
            input = input_value.nextLine();
        }
    }



}
