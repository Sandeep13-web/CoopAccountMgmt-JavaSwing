
package org.personal.CoopAccMgmt;

import static org.personal.CoopAccMgmt.CooperativeAccMgmt.accounts;

public interface LoanAccount {
    static void accLoan(){
          System.out.println("<-------------------- All Loan Accounts Details ---------------->");
                    for (CooperativeInformation acc : accounts) {
                        System.out.println("---------------------------------------");
                        System.out.println("Account Number: " + acc.getId());
                        System.out.println("Name: " + acc.getacHolderName());
                        System.out.println("Account Type: " + acc.getAccountType());
                        System.out.println("Balance: " + acc.getBalance());
                        System.out.println("---------------------------------------");
                    }
    }
}
