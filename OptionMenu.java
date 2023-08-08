package project1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'Rs'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    // validate login information cust num and pin number
    public void getLogin() throws IOException
    {
        int x=1;
        do{
            try{
                data.put(9876543,1234);
                data.put(12345678,9876);

                System.out.println("welcome to atm project!");
                System.out.println("enter you customer NUmber:");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("enter your pin number:");
                setPinNumber(menuInput.nextInt());


            
                for(java.util.Map.Entry<Integer, Integer> entry : data.entrySet()){
                    if(entry.getKey()==getCustomerNumber() && entry.getValue() == getPinNumber()){
                        getAccountType();
                        x=0;
                        break; }
                }
                if(x==1){System.out.println("wrong customer number or pin number");}
                } 
            catch(Exception e)
            {
                System.out.println("Invalid input characters only numbers allowed");
                x=2;
            }
        }
         while (x==1);
    }

    // display account type menu with selection
    public void getAccountType() {
        System.out.println("select the account you want to access:");
        System.out.println("1.checking account");
        System.out.println("2.Saving Account");
        System.out.println("3.Exit");
        System.out.print("Choice:");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for banking with us");
                break;
            default:
                System.out.println("invalid choice");
                getAccountType();
        }
    }

    private void getChecking() {
        System.out.println("checking account");
        System.out.println("1.View balance");
        System.out.println("32.Withdraw funds");
        System.out.println("3.deposit funds");
        System.out.println("choice:");
        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("chceking account balance:" + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("thank you for banking with us");
                break;

            default:
                System.out.println("invalid choice");
                getChecking();
        }
    }

    private void getSaving() {
        System.out.println("saving account");
        System.out.println("1.View balance");
        System.out.println("2.Withdraw funds");
        System.out.println("3.deposit funds");
        System.out.println("choice:");
        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("saving account balance:" + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("thank you for banking with us");
                break;

            default:
                System.out.println("invalid choice");
                getSaving();

        }

    }
}