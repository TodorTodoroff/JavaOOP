package WorkingWithAbstractionT1.Exercise.jediGalaxy;

public class Galaxy {
    private Field field;
    private JediMovement jediMovement;

    public Galaxy(Field field,JediMovement jediMovement) {
        this.field = field;
        this.jediMovement = new JediMovement();
    }

    public void moveEvil(int row, int col){
        while (row >= 0 && col >= 0) {
            if (this.field.isInBounds(row, col)) {
                this.field.setValue(row, col, 0);
            }
            row--;
            col--;
        }
    }

    public long moveJedi(int row, int col){
        return this.jediMovement.move(row, col, this.field);
    }
}
