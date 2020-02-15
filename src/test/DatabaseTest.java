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

    void addEntry_InsertDuplicate_ErrorMessage() {
        Database db = new Database();

        db.addEntry(21, 22, "Ferrari", "G300");


        assertEquals(db.addEntry(21, 23, "Mercedes", "C"), "Record with that ID already exists in the database.");
    }

    @Test
    void retrieveSingleEntry() {
    }

    @Test
    void retrieveAllEntries() {
    }

    @Test
    void updateEntry() {
    }

    @Test
    void deleteEntry() {
    }
}