package org.personal.CoopAccMgmt;

import java.util.Scanner;
import static org.personal.CoopAccMgmt.CooperativeAccMgmt.findOne;
import static org.personal.CoopAccMgmt.CooperativeAccMgmt.findTwo;

public interface AccountStatus {
        static void accStatus(){
            try{
                        System.out.println("<-------------- Check Account Status ------------------->");
                        System.out.println("Enter your account Number : ");
                        Scanner sc = new Scanner(System.in);

                        int update3Id = sc.nextInt();
                        int index3 = findOne(update3Id);

                        CooperativeInformation acc = findTwo(index3);

                        System.out.println("---------------------------------------");
                        System.out.println("Account Number: " + acc.getId());
                        System.out.println("Name: " + acc.getacHolderName());
                        System.out.println("Account Type :" + acc.getAccountType());
                        System.out.println("Balance: " + acc.getBalance());
                        System.out.println("---------------------------------------");

                    } catch(NullPointerException e){
                        System.out.println("Account Not Found!!! Enter correct Account Number");
                    }

        }
}
