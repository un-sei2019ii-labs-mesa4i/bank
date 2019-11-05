package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity(foreignKeys = {@ForeignKey(entity = ApplicationUser.class,
        parentColumns = "appUserId",
        childColumns = "owner",
        onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = ApplicationAccount.class,
                parentColumns = "appAccountEmail",
                childColumns = "appAccount",
                onDelete = ForeignKey.CASCADE)
}
)
public class SavingsAccount implements Serializable {

    @PrimaryKey

    public int savingsAccountId;

    @ColumnInfo(name = "balance")
    public double balance;

    @ColumnInfo(name = "appAccount")
    public String appAccount;

    @ColumnInfo(name = "owner")//id del owner
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
