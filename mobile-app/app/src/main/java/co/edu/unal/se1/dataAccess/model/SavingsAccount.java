package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
<<<<<<< HEAD
=======
import androidx.room.ForeignKey;
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class SavingsAccount implements Serializable {

    @PrimaryKey
<<<<<<< HEAD
=======

>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
    public int savingsAccountId;

    @ColumnInfo(name = "balance")
    public double balance;

    @ColumnInfo(name = "appAccount")
    public String appAccount;

<<<<<<< HEAD
    @ColumnInfo(name = "owner")
=======
    @ColumnInfo(name = "owner")//id del owner
>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
    public int owner;

    public int getSavingsAccountId() {
        return savingsAccountId;
    }

    public void setSavingsAccountId(int savingsAccountId) {
        this.savingsAccountId = savingsAccountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAppAccount() {
        return appAccount;
    }

    public void setAppAccount(String appAccount) {
        this.appAccount = appAccount;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }
}
