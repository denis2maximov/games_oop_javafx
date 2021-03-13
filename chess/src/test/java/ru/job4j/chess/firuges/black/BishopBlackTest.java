package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack rsl = new BishopBlack(C1);
        assertThat(rsl.position(), is(C1));
    }

    @Test
    public void way() {
        BishopBlack rsl = new BishopBlack(C1);
        Cell[] cell = {D2, E3, F4, G5};
        assertThat(rsl.way(G5), is( cell));
    }

    @Test
    public void isDiagonal() {
    }

    @Test
    public void copy() {
        BishopBlack rsl = new BishopBlack(C1);
       //   rsl.copy(C2).position();
        assertThat(rsl.copy(C2).position(), is(C2));
    }
}
///