package co.edu.unal.se1.dataAccess.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class ApplicationAccount implements Serializable {

    @PrimaryKey @NonNull
    public String appAccountEmail;

    @ColumnInfo(name = "password")
    public int password;

    @ColumnInfo(name = "savingsAccount")
    public int savingsAccount;

    public String getAppAccountEmail() {
        return appAccountEmail;
    }

    public void setAppAccountEmail(String appAccountEmail) {
        this.appAccountEmail = appAccountEmail;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(int savingsAccount) {
        this.savingsAccount = savingsAccount;
    }
}
