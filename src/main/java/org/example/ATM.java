package org.example;
//useful links
// https://www.freecodecamp.org/news/static-variables-in-java/#:~:text=A%20static%20method%20means%20it,%2C%20performance%2C%20and%20code%20organization.
/**
 * When a variable is declared static in Java programming,
 * it means that the variable belongs to the class itself rather than
 * to any specific instance of the class
 * mainly used for memory management
 */
public class ATM
{

    public static int totalMoney = 0;
    public static int numATMs = 0;

    public int money;

    public ATM(int inputMoney){
        this.money = inputMoney;

        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;

            totalMoney =+ amountToWithdraw;
        }
    }

    public static void averageMoney(){
        System.out.println(totalMoney/numATMs);
    }

    public static void main( String[] args )
    {
        System.out.println("Total number of ATMs: " + ATM.numATMs);

        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM (500);

        System.out.println("Total number of ATMs: " + ATM.numATMs);

        System.out.println("Total amount of money in all ATMs: " + totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + totalMoney);

        ATM.averageMoney();
    }
}
