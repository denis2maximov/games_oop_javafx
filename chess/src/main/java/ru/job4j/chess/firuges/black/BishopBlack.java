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
        int deltaX = (dest.getX() - position().getX()) > 0 ? 1 : -1;
         int deltaY = (dest.getY() - position().getY()) > 0 ? 1 : -1;
         int pls = 0;
        for (int index = 0; index < size; index++) {
     //   steps[index] = Cell.findBy((index + 1) * deltaX + (position().getX()), (index + 1) * deltaY + (position().getY()));
        steps[index] = Cell.findBy((deltaX * (pls + 1) + position().getX()), deltaY * (pls + 1) + position().getY());
       // steps[index] = Cell.findBy(deltaX++ + position().getX(), deltaY++ + position().getY());
            pls++;
         System.out.println(steps[index]);
        }
        return steps;
    }

    public boolean isDiagonal(Cell position, Cell dest) {
       //  return Math.abs(position().getX() - dest.getX()) == Math.abs(position().getX() - dest.getX());
        return Math.abs(position.getX() - dest.getX()) == Math.abs(position.getY() - dest.getY());
        }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
