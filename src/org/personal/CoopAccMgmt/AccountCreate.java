package org.personal.CoopAccMgmt;

import static org.personal.CoopAccMgmt.CooperativeAccMgmt.accounts;
import java.util.Scanner;

public interface AccountCreate {
    static void createAcc(){
        System.out.println("----- Create Account ------>");
        Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Your First Name:");
                    String firstName = sc.next();
                    System.out.println("Enter Your Last Name:");
                    String lastName = sc.next();
                    String accName = firstName.concat(" ").concat(lastName);
                    
                    System.out.println("Select Account Type: \n 1. Savings \n 2. Loan");//for acc type
                    int acType = sc.nextInt();

                    String accType = "Savings";

                    switch (acType) {
                        case 1:
                            accType = "Savings";
                            break;
                        case 2:
                            accType = "Loan";
                            break;
                        default:
                            accType = null;
                            break;
                    }
                    System.out.println("Enter Account Number :");
                    int accNum = sc.nextInt();
                    System.out.println("Enter Account Balance"); // Balance in acc
                    Long accBalance = sc.nextLong();

                    accounts.add(new CooperativeInformation(accNum, accName, accType, accBalance));

                    System.out.println(" ACCOUNT CREATED SUCCESSFULLY ! ! ! ");
    }
}
