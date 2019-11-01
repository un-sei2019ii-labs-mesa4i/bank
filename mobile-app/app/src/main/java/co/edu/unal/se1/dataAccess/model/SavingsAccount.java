package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class SavingsAccount implements Serializable {

    @PrimaryKey
    public int savingsAccountId;

    @ColumnInfo(name = "balance")
    public String balance;

    @ColumnInfo(name = "appAccount")
    public double appAccount;

    @ColumnInfo(name = "owner")
    public double owner;

    public int getaccountId() {
        return savingsAccountId;
    }

    public void setAccountId(int id) {
        this.savingsAccountId = id;
    }

    public int getSavingsAccountId() {
        return savingsAccountId;
    }

    public void setSavingsAccountId(int savingsAccountId) {
        this.savingsAccountId = savingsAccountId;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public double getOwner() {
        return owner;
    }

    public void setOwner(double owner) {
        this.owner = owner;
    }

    /*public double getAppAccount() {
        return appAccount;
    }

    public void setAppAccount(double appAccount) {
        this.appAccount = appAccount;
    }*/
}
