package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class Administrator implements Serializable {

    @PrimaryKey
    public int adminId;

    @ColumnInfo(name = "adminName")
    public String adminName;

    @ColumnInfo(name = "adminAppAccount")
    public String adminAppAccount;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminAppAccount() {
        return adminAppAccount;
    }

    public void setAdminAppAccount(String adminAppAccount) {
        this.adminAppAccount = adminAppAccount;
    }
}
