/**
 * Created by IntelliJ IDEA.
 * User: A.Danilov
 * Date: 12.03.2021
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */

public class RomesCalculation {
    String [] romes = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    String [] answer = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVI","XVI","XIX","XX"};
    int romInt1;
    int romInt2;
    RomesCalculation(String rom1, String rom2){
        for(int i = 0; i < romes.length; i++){
            if(romes[i].equals(rom1)){
                romInt1 = i+1;
            }
            if (romes[i].equals(rom2)) {
                romInt2 = i+1;
            }
        }

    }
    public void calc(String operand) {
        Calculation calculation = new Calculation(romInt1, romInt2);
        try {
            if (romInt1 == 0 | romInt2 == 0) {
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Неверный формат ввода выражения");
            System.exit(0);
        }

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
        try {
            System.out.println(answer[calculation.getResult() - 1]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Превышен лимит числа");
        }
    }

}
