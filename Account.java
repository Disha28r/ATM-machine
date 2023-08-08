package project1;
import java.text.DecimalFormat;
import java.util.Scanner;;

public class Account {
    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'Rs.'###, ##0.00");
    
    //creating fields
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;
    
    //set the customer number
    public int setCustomerNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
        return customerNumber;
        
    }
    //get customer num
    public int getCustomerNumber()
    {
        return customerNumber;
    }

    //set the pin num
    public int setPinNumber(int pinNumber)
    {
        this.pinNumber=pinNumber;
        return pinNumber;
        
    }
    //get pin num
    public int getPinNumber()
    {
        return pinNumber;
        
    }
    //get checking balance
    public double getCheckingBalance()
    {
        return checkingBalance;
        
    }
    //get saving account balance
    public double getSavingBalance()
    {
        return savingBalance;
    }

    //calculate checking account withdrawal
    public double calcCheckingWithdraw(double amount)
    {
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
        
    }

    //calculate saving account withdraw
    public  double calcSavingWithdraw(double amount)
    {
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }
    //calculate checking account deposit
    public double calcCheckingDeposit(double amount)
    {
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }
    
    //calculate saving account deposit
    public double calcSavingDeposit(double amount)
    {
        savingBalance=(savingBalance+amount);
        return savingBalance;
    }

    //customer checking account withdraw input
    public void getCheckingWithdrawInput()
    {
        System.out.println("Chceking account balance:"+moneyFormat.format(checkingBalance));
        System.out.println("amount that you want to withdraw from checking account:");
        double amount=input.nextDouble();

        if((checkingBalance-amount)>=0)
        {
            calcCheckingWithdraw(amount);
            System.out.println("new checking account balance:"+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("balance cannot be negative"+"\n");
        }
    }

    //customer checking saving account withdraw input
    public void getSavingWithdrawInput()
    {
        System.out.println("Saving account Balnce:"+moneyFormat.format(savingBalance));
        System.out.println("amount you want to withdraw from saving account:");
        double amount=input.nextDouble();

        if((savingBalance-amount)>=0)
        {
            savingBalance = calcSavingWithdraw(amount);
            System.out.println("new saving account balance:"+moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("balance cannot be negative"+"\n");
        }

    }
    //customer checking account deposit input
    public void getCheckingDepositInput()
    {
        System.out.println("Checking account balance:"+moneyFormat.format(checkingBalance));
        System.out.println("amount you want to deopsit to checking account:");
        double amount= input.nextDouble();

        if((checkingBalance + amount)>=0)
        {
            calcCheckingDeposit(amount);
            System.out.println("new checking account balance:"+moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("Balance cannot be negative"+"\n");
        }
    }
    //customer saving account deposit input
    public void getSavingDepositInput()
    {
        System.out.println("saving account balance:"+moneyFormat.format(savingBalance));
        System.out.println("amount you want to deposit to saving account");
        double amount=input.nextDouble();
        if((savingBalance+amount)>=0)
        {
            calcSavingDeposit(amount);
            System.out.println("mew saving account balance:"+moneyFormat.format(savingBalance));
        }else{
            System.out.println("balance cannot be negative"+"\n");
        }
    }
}   

 