package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.C1;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack rsl = new BishopBlack(C1);

        assertThat(rsl.position(), is(C1));
    }

    @Test
    public void way() {
    }

    @Test
    public void isDiagonal() {
    }

    @Test
    public void copy() {
    }
}