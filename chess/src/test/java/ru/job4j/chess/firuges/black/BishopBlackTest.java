package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack rsl = new BishopBlack(C1);
        assertThat(rsl.position(), is(C1));
    }

    @Test
    public void whenWayOk() {
        BishopBlack rsl = new BishopBlack(C1);
        Cell[] cell = {D2, E3, F4, G5};
        assertThat(rsl.way(G5), is(cell));
    }

    @Test
    public void whenIsDiagonalThenOk() {
    BishopBlack one = new BishopBlack(C1);
    assertThat(one.isDiagonal(C1,G5), is(true));
    }

    @Test
    public void whenIsDiagonalThenNotOk() {
        BishopBlack one = new BishopBlack(C1);
        assertThat(one.isDiagonal(C1,G3), is(false));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenIsDiagonalThenNotOkExpected() throws ImpossibleMoveException {
        BishopBlack one = new BishopBlack(C1);
        one.way(H3);
    }

    @Test
    public void whenCopyThenOk() {
        BishopBlack rsl = new BishopBlack(C1);
       assertThat(rsl.copy(C2).position(), is(C2));
    }
}
