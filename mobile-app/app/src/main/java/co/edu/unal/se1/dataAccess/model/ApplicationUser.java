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
<<<<<<< HEAD
public class ApplicationUser implements Serializable {

    @PrimaryKey
=======

public class ApplicationUser implements Serializable {

    @PrimaryKey

>>>>>>> 2cc725aec82dd97241c8c101c5e3f1bf90a679e0
    public int appUserId;

    @ColumnInfo(name = "appUserName")
    public String appUserName;

    @ColumnInfo(name = "savingsAccount")
    public int savingsAccount;

    public int getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(int appUserId) {
        this.appUserId = appUserId;
    }

    public String getAppUserName() {
        return appUserName;
    }

    public void setAppUserName(String appUserName) {
        this.appUserName = appUserName;
    }

    public int getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(int savingsAccount) {
        this.savingsAccount = savingsAccount;
    }
}