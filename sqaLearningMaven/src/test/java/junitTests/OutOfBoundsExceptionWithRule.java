package junitTests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OutOfBoundsExceptionWithRule {
	@Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
        List<String> list = new ArrayList<String>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index: 0, Size: 0");
        list.get(0);
    }
}
