package co.edu.unal.se1;

import android.content.Context;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import co.edu.unal.se1.businessLogic.controller.*;
import co.edu.unal.se1.dataAccess.model.ApplicationAccount;

@RunWith(MockitoJUnitRunner.class)
public class TestUnit extends junit.framework.TestCase {
    private static final String VALIDATION_MESSAGE = "Login was successful";

    @Mock
    Context mockContext;

    @Test
    public void verifyLoginValidate (ApplicationAccount appAcc, int pass) {
        ApplicationAccountController appAccountController = new ApplicationAccountController(mockContext);
        assertEquals(appAccountController.verifyLogin(appAcc,pass),true);
    }

    @Test
    public void createSavingsAcountValidate (int sourceId, int targetId, double value) {
        SavingsAccountController sac = new SavingsAccountController(mockContext);
        assertEquals(sac.sendMoney(sourceId, targetId, value, mockContext),true);
    }
}
