import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {
    @Test
    public void checkIfCellisAlive() {
        Cell cell = new Cell(1);

        int acctualCellState = cell.stateOfCell();

        assertEquals(1, acctualCellState);
    }

    @Test
    public void checkIfCellisNotAlive() {
        Cell cell = new Cell(0);

        int acctualCellState = cell.stateOfCell();

        assertEquals(0, acctualCellState);
    }

    @Test
    public void checkIfCellisKilledProperly() {
        Cell cell = new Cell(1);
        cell.killCell();

        int acctualCellState = cell.stateOfCell();

        assertEquals(0, acctualCellState);
    }
}
