package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;

import java.util.List;

import co.edu.unal.se1.dataAccess.model.SavingsAccount;
import co.edu.unal.se1.dataAccess.model.SavingsAccount;

public class SavingsAccountRepository extends  Repository{

    public SavingsAccountRepository(Context context) {
        super(context);
    }

    public List<SavingsAccount> getAllSavingsAccounts() {
        return database.savingsAccountDao().getAllSavingsAccounts();
    }

    public SavingsAccount getSavingsAccountById(int id) {
        return database.savingsAccountDao().getSavingsAccountById(id);
    }

    public void createSavingsAccount(final SavingsAccount savingsAccount) {
        database.savingsAccountDao().createAccount(savingsAccount);
    }

    public void updateSavingsAccount(SavingsAccount savingsAccount) {
        database.savingsAccountDao().updateAccount(savingsAccount);
    }

    public void deleteSavingsAccount(int id) {
        SavingsAccount savingsAccount = database.savingsAccountDao().getSavingsAccountById(id);
        database.savingsAccountDao().deleteAccount(savingsAccount);
    }
}
