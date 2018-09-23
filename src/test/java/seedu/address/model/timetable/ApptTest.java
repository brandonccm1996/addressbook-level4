package seedu.address.model.timetable;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ApptTest {

    @Test
    public void equals() {
        Appt appt = new Appt("Hello");

        // same object -> returns true
        assertTrue(appt.equals(appt));

        // same values -> returns true
        Appt remarkCopy = new Appt(appt.value);
        assertTrue(appt.equals(remarkCopy));

        // different types -> returns false
        assertFalse(appt.equals(1));

        // null -> returns false
        assertFalse(appt.equals(null));

        // different remark -> returns false
        Appt differentRemark = new Appt("Bye");
        assertFalse(appt.equals(differentRemark));
    }
}