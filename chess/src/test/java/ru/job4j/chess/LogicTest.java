package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.G5;

public class LogicTest {

    /**
     *  Первое -  фигура не найдена;
     *  Второе - слон ходит по диагонали, но стоит фигура - ловим OccupiedCellException;
     * Третье - слон пошел не по диагонали,  ловим ImpossibleMoveException;
     */

    @Test(expected = FigureNotFoundException.class)
    public void moveWhenNotFigure()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C2, G5);
    }


    @Test(expected = OccupiedCellException.class)
    public void moveWhenOccupied()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.E3));
        logic.move(Cell.C1, G5);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void moveWhenImpossible()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.A6);
    }
}
