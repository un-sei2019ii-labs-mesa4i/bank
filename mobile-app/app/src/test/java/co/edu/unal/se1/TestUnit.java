package co.edu.unal.se1;

import android.content.Context;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import co.edu.unal.se1.businessLogic.controller.*;

@RunWith(MockitoJUnitRunner.class)
public class TestUnit extends junit.framework.TestCase {
    private static final String VALIDATION_MESSAGE = "Login was successful";

    @Mock
    Context mockContext;

    @Test
    public void createAppAccountValidator () {
        ApplicationAccountController appAccountController = new ApplicationAccountController(mockContext);
    }
}
