package org.personal.CoopAccMgmt;

public  class CooperativeInformation {

    private int id;
    private String acHolderName;
    private String accountType;
    private Long balance;

    public CooperativeInformation(int id, String acHolderName, String accountType, Long balance) {
        this.id = id;
        this.acHolderName = acHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public CooperativeInformation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getacHolderName() {
        return acHolderName;
    }

    public void setacHolderName(String acHolderName) {
        this.acHolderName = acHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

}