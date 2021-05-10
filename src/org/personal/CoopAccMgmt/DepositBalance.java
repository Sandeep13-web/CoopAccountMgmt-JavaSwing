package org.personal.CoopAccMgmt;


import static org.personal.CoopAccMgmt.CooperativeAccMgmt.accounts;
import static org.personal.CoopAccMgmt.CooperativeAccMgmt.findOne;
import static org.personal.CoopAccMgmt.CooperativeAccMgmt.findTwo;
import java.util.Scanner;

public interface DepositBalance {
    static void balanceDeposit(){
           
                    Scanner sc = new Scanner(System.in);
                    
                    Long initialBalance = 1L, balanceTotal = 1L, balanceChange = 1L;
                     try{
                            System.out.println("<--------- Deposit Balance ----------->");
                            System.out.println("Enter your account Number : ");
                            
                            int updateId = sc.nextInt();

                             int option2 = findOne(updateId);
                             CooperativeInformation accUpdate = findTwo(option2);
                             System.out.println("Enter Balance To Deposit : "); // To deposit money
                             Long accBalanceUpdate = sc.nextLong();
                                 for (CooperativeInformation a : accounts) {
                                     if (accounts.indexOf(a) == option2) {

                                         initialBalance = a.getBalance();

                                         balanceTotal = initialBalance + accBalanceUpdate;

                                     }
                                 }

                            accUpdate.setBalance(balanceTotal);
                            accounts.set(accounts.indexOf(accUpdate), accUpdate);
                            System.out.println(" Balance Deposited Successfully !!");

                            CooperativeInformation acc = findTwo(option2);

                            System.out.println("---------------------------------------");
                            System.out.println("Account Number: " + acc.getId());
                            System.out.println("Name: " + acc.getacHolderName());
                            System.out.println("Account Type :" + acc.getAccountType());
                            System.out.println("Balance: " + acc.getBalance());
                            System.out.println("---------------------------------------");

                        } catch( NullPointerException e){
                            System.out.println("Account Not Found ! Please enter correct Account Number");
                        }

    }
}
