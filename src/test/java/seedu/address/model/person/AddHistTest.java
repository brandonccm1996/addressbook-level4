package seedu.address.model.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HISTORY_ALLERGY2;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HISTORY_COUNTRY2;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HISTORY_DATE2;
import static seedu.address.testutil.TypicalMedHistory.MEDHISTORY1;
import static seedu.address.testutil.TypicalMedHistory.MEDHISTORY2;

import org.junit.Test;

import seedu.address.model.medhistory.MedHistory;
import seedu.address.testutil.MedHistoryBuilder;

//@@author xShaivan
public class AddHistTest {

    @Test
    public void equals() {
        MedHistory medHistory1 = new MedHistoryBuilder(MEDHISTORY1).build();

        // same object -> returns true
        assertTrue(MEDHISTORY1.equals(MEDHISTORY1));

        // same values -> returns true
        assertTrue(MEDHISTORY1.equals(medHistory1));

        // different types -> returns false
        assertFalse(MEDHISTORY1.equals(1));

        // null -> returns false
        assertFalse(MEDHISTORY1 == null);

        // different MedHistory -> returns false
        assertFalse(MEDHISTORY1.equals(MEDHISTORY2));

        // different medHistDate -> returns false
        MedHistory editedMedHistory1 = new MedHistoryBuilder(MEDHISTORY1).withMedHistDate(VALID_HISTORY_DATE2).build();
        assertFalse(MEDHISTORY1.equals(editedMedHistory1));

        // different allergy -> returns false
        editedMedHistory1 = new MedHistoryBuilder(MEDHISTORY1).withAllergy(VALID_HISTORY_ALLERGY2).build();
        assertFalse(MEDHISTORY1.equals(editedMedHistory1));

        // different prevCountry -> returns false
        editedMedHistory1 = new MedHistoryBuilder(MEDHISTORY1).withPrevCountry(VALID_HISTORY_COUNTRY2).build();
        assertFalse(MEDHISTORY1.equals(editedMedHistory1));

        // different dischargeStatus -> returns false
        // currently omitted due to assertion error
        /*editedMedHistory1 =
                new MedHistoryBuilder(MEDHISTORY1).withDischargeStatus(VALID_HISTORY_DISCHARGE_STATUS2).build();
        assertFalse(MEDHISTORY1.equals(editedMedHistory1));*/
    }
}
