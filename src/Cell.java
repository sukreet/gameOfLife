
class Cell {
    int state;

    public Cell(int state) {
        this.state = state;
    }

    public int stateOfCell() {
        return this.state;
    }

    public void killCell() {
        this.state = 0;
    }
    public void makeCellAlive() {
        this.state = 1;
    }

}
