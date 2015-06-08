import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {
    @Test
    public void checkIfCellisAlive() {
        Cell cell = new Cell(1);

        int acctualCellState = cell.isAlive();

        assertEquals(1, acctualCellState);
    }

   
}
