package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class ExternalUser implements Serializable {

    @PrimaryKey
    public int externalUserId;

    @ColumnInfo(name = "externalUserName")
    public int externalUserName;

    public int getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(int externalUserId) {
        this.externalUserId = externalUserId;
    }

    public int getExternalUserName() {
        return externalUserName;
    }

    public void setExternalUserName(int externalUserName) {
        this.externalUserName = externalUserName;
    }
}