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
public class Transfer implements Serializable {

    @PrimaryKey(autoGenerate = true)
    public int transferId;

    @ColumnInfo(name = "depositorId")
    public int depositorId;

    @ColumnInfo(name = "receiverId")
    public int receiverId;

    @ColumnInfo(name = "amount")
    public double amount;

    public int getTransferId() {
        return transferId;
    }

    public int getDepositorId() {
        return depositorId;
    }

    public void setDepositorId(int depositorId) {
        this.depositorId = depositorId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}