package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
                throw new ImpossibleMoveException(
                        String.format("Could not move by diagonal from %s to %s", position, dest)
                );
            }
        int size = Math.abs(position().getX() - dest.getX());
        Cell[] steps = new Cell[size];
        int deltaX = (dest.getX() - position().getX()) / size;
        int deltaY = (dest.getY() - position().getY()) / size;
        for (int index = 0; index < size; index++) {
          //  int x = (index + 1) * deltaX + (position().getX()); /* вычислить ячейку через index + deltaX */
            // int y = (index + 1) * deltaY + (position().getY()); /* вычистить ячейку через index + deltaY */
                    steps[index] = Cell.findBy((index + 1) * deltaX + (position().getX()), (index + 1) * deltaY + (position().getY()));
        }
        return steps;

    }

    public boolean isDiagonal(Cell position, Cell dest) {
       // int size = Math.abs(position().getX() - dest.getX());
        if ((dest.getX() - position().getX() / Math.abs(position().getX() - dest.getX()) == Math.abs(1) && dest.getY() - position().getY() / Math.abs(position().getX() - dest.getX())  == Math.abs(1)));
        return true;
        }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
