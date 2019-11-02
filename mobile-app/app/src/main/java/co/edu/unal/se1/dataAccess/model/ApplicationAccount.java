package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class ApplicationAccount implements Serializable {

    @PrimaryKey
    public String appAccountEmail;

    @ColumnInfo(name = "password")
    public String password;

    @ColumnInfo(name = "savingsAccount")
    public int savingsAccount;

    public String getAppAccountEmail() {
        return appAccountEmail;
    }

    public void setAppAccountEmail(String appAccountEmail) {
        this.appAccountEmail = appAccountEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(int savingsAccount) {
        this.savingsAccount = savingsAccount;
    }
}
