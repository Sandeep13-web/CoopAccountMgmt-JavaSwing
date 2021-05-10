package org.personal.CoopAccMgmt;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import static org.personal.CoopAccMgmt.AccountCreate.createAcc;
import static org.personal.CoopAccMgmt.AccountStatus.accStatus;
import static org.personal.CoopAccMgmt.DepositBalance.balanceDeposit;
import static org.personal.CoopAccMgmt.LoanAccount.accLoan;
import static org.personal.CoopAccMgmt.WithdrawBalance.balanceWithdraw;

public interface CooperativeAccMgmt  extends AccountCreate , DepositBalance , AccountStatus,
WithdrawBalance , LoanAccount{

    public static final List<CooperativeInformation> accounts = new LinkedList<>();
    
    static void display(){
            System.out.println("--------------------------------");
            System.out.println("| Welcome to the Co-operative!! |");
            System.out.println("| Enter your choice:            |");
            System.out.println("| 1. Create an Account          |");
            System.out.println("| 2. Check Account Status       |");
            System.out.println("| 3. Deposit Balance            |");
            System.out.println("| 4. Withdraw Balance           |");
            System.out.println("| 5. Check Loan Account Detail  |");
            System.out.println("--------------------------------");
    }
    
    
    static void initAcc(){
        
        CooperativeInformation accOne = new CooperativeInformation();
        accOne.setId(1);
        accOne.setacHolderName("Ram");
        accOne.setAccountType("Saving");
        accOne.setBalance(100000L);
        
        accounts.add(accOne);
        
        CooperativeInformation accTwo = new CooperativeInformation();
        accTwo.setId(2);
        accTwo.setacHolderName("Shyam");
        accTwo.setAccountType("Loan");
        accTwo.setBalance(5000000L);

        accounts.add(accTwo);
        
    }

    public static void main(String[] args) {
        
        Long initialBalance = 1L, balanceTotal = 1L, balanceChange = 1L;
        char cont = 'n';
        Scanner sc = new Scanner(System.in);
        
        initAcc();
        
        do {
            display();
            
            int options;
            options = sc.nextInt();
            
            switch (options) {
                case 1:
                    createAcc();
                    
                   break;
                   
                case 2:
                    accStatus();

                    break;  
                    
                case 3:
                    balanceDeposit();
                    break;
                    
                case 4:
                    balanceWithdraw();
                    break;
                    
                case 5:
                    accLoan();
                  break;
                  
                default:
                    System.out.println("---------- Please Enter Number According to Your Choice --------");
                    break;
            }
            System.out.println("Do you want to return back to Menu?\n  "
                    + "(y/Y)YEs \n (n/N) NO");
            cont = sc.next().charAt(0);
        } while (cont == 'y' || cont == 'Y');  
        System.out.println("Goodbye!!!");
    }
    
    static Integer findOne(int id) {
        Integer index = null;
        for (CooperativeInformation account : accounts) {
            if (account.getId() == id) {
                index = accounts.indexOf(account);
                break;
            }
        }
        return index;
    }

    static CooperativeInformation findTwo(int index) {
        CooperativeInformation selectIndex = null;
        for (CooperativeInformation a : accounts) {
            if (accounts.indexOf(a) == index) {
                selectIndex = a;
                break;
            }
        }
        return selectIndex;
    }
}
