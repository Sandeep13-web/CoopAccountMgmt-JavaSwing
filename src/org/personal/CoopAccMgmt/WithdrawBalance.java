package org.personal.CoopAccMgmt;

import java.util.Scanner;
import static org.personal.CoopAccMgmt.CooperativeAccMgmt.accounts;
import static org.personal.CoopAccMgmt.CooperativeAccMgmt.findOne;
import static org.personal.CoopAccMgmt.CooperativeAccMgmt.findTwo;

public interface WithdrawBalance {
    static void balanceWithdraw(){
        
                    Long initialBalance = 1L, balanceTotal = 1L, balanceChange = 1L;
        try{
                        System.out.println("<-----------  Withdraw Balance -------------->");
                        System.out.println("Enter your account Number : ");
                        Scanner sc = new Scanner(System.in);
                        int updateIdTwo = sc.nextInt();
                        int option3 = findOne(updateIdTwo);

                        CooperativeInformation AccountTwoUpdate = findTwo(option3);

                        System.out.println("Enter Balance To Withdraw : "); // To withdraw money

                            Long withdrawBalance = sc.nextLong();

                            for (CooperativeInformation a : accounts) {

                                if (a.getId() == updateIdTwo) {

                                    initialBalance = a.getBalance();

                                    balanceChange = withdrawBalance;

                                }
                            }

                            if (initialBalance < withdrawBalance) {

                                System.out.println("Insufficent Balance... Withdraw Unsuccessfull !!!!!");

                            } else {

                                balanceTotal = initialBalance - withdrawBalance;
                                AccountTwoUpdate.setBalance(balanceTotal);
                                accounts.set(accounts.indexOf(AccountTwoUpdate), AccountTwoUpdate);
                                System.out.println(" Withdraw Complete... Balance Updated !!");

                                CooperativeInformation acc = findTwo(option3);
                                System.out.println("---------------------------------------");
                                System.out.println("Account Number: " + acc.getId());
                                System.out.println("Name: " + acc.getacHolderName());
                                System.out.println("Account Type :" + acc.getAccountType());
                                System.out.println("Balance: " + acc.getBalance());
                                System.out.println("---------------------------------------");

                            }
                    
                    } catch(NullPointerException e){
                         System.out.println(" Account Not Found!!! Enter correct Account Number");
                    }

    }
}
