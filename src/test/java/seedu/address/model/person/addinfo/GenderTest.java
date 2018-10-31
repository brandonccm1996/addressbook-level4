package seedu.address.model.person.addinfo;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenderTest {

    @Test
    public void equals() {
        Gender gender = new Gender("F");
        Gender defaultGender = new Gender("");

        assertTrue(gender.equals(gender));

        assertFalse(gender.equals(new Gender("M")));

        assertFalse(gender.equals(null));

        assertTrue(defaultGender.equals(new Gender("")));
    }
}