package test;

import main.Database;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void addEntry_3ItemsAdded_DatabaseSizeShouldBe3() {
        Database db = new Database();

        db.addEntry(21, 22, "Ferrari", "G300");
        db.addEntry(12, 23, "Mercedes", "C");
        db.addEntry(23, 26, "Honda", "Civic");

        assertEquals(db.getSize(), 3);
    }

    @Test
    void addEntry_InsertDuplicate_ErrorMessage() {
        Database db = new Database();
        db.addEntry(21, 22, "Ferrari", "G300");
        assertEquals(db.addEntry(21, 23, "Mercedes", "C"), "Record with that ID" +
                " already exists in the database.");
    }

    @Test
    void retrieveSingleEntry_addThenRetrieve_correctDetailsReturned() {
        Database db = new Database();
        db.addEntry(21, 22, "Ferrari", "G300");
        assertEquals(db.retrieveSingleEntry(21), "ID: 21 Year: 22 Make: Ferrari Model: G300\n");
    }

    @Test
    void retrieveAllEntries_addThenRetrieveAll_correctDetailsReturned() {
        // since the container for the database is a hashmap and we don't know the order
        // in which items are returned, it is a little harder to test this.
        Database db = new Database();

        db.addEntry(21, 22, "Ferrari", "G300");
        db.addEntry(22, 23, "Ferrari", "H430");
        assertEquals(db.retrieveAllEntries(), "List of vehicles (in no particular order):\n" +
                "ID: 21 Year: 22 Make: Ferrari Model: G300\n" +
                "ID: 22 Year: 23 Make: Ferrari Model: H430\n\n");
    }

    @Test
    void updateEntry_AddThenUpdate_EntryShouldBeUpdated() {
        Database db = new Database();

        db.addEntry(21, 22, "Ferrari", "G300");
        assertEquals(db.retrieveSingleEntry(21), "ID: 21 Year: 22 Make: Ferrari Model: G300\n");

        db.updateEntry(21, 23, "Ferrari", "H430");
        assertEquals(db.retrieveSingleEntry(21), "ID: 21 Year: 23 Make: Ferrari Model: H430\n");
    }

    @Test
    void deleteEntry_AddThenDelete_SizeShouldUpdateCorrectly() {
        Database db = new Database();

        db.addEntry(21, 22, "Ferrari", "G300");
        db.addEntry(12, 23, "Mercedes", "C");
        assertEquals(db.getSize(), 2);
        db.deleteEntry(12);
        assertEquals(db.getSize(), 1);

    }

    @Test
    void deleteEntry_DeleteAtNoEntries_ErrorMessage() {
        Database db = new Database();
        assertEquals(db.getSize(), 0);
        assertEquals(db.deleteEntry(12), "There are no entries in the table right now.");
    }
}