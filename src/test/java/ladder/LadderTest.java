package ladder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    void testRunWhenNoLine() {
        Ladder ladder = new Ladder(1);
        int target = ladder.run(1);
        assertThat(target).isEqualTo(1);

        target = ladder.run(2);
        assertThat(target).isEqualTo(2);
    }

    @Test
    void testRunWhenTwoByOneOneLine() {
        Ladder ladder = new Ladder(2);
        ladder.drawLine(0);
        int target = ladder.run(1);
        assertThat(target).isEqualTo(2);

        target = ladder.run(2);
        assertThat(target).isEqualTo(1);
    }

    @Test
    void testRunWhenThreeByOneOneLine() {
        //1 1 0
        Ladder ladder = new Ladder(3);
        ladder.drawLine(0);
        int target = ladder.run(1);
        assertThat(target).isEqualTo(2);

        target = ladder.run(2);
        assertThat(target).isEqualTo(1);

        target = ladder.run(3);
        assertThat(target).isEqualTo(3);
    }

    @Test
    void testRunWhenThreeByOneOneLine2() {
        //0 1 1
        Ladder ladder = new Ladder(3);
        ladder.drawLine(1);

        int target = ladder.run(1);
        assertThat(target).isEqualTo(1);

        target = ladder.run(2);
        assertThat(target).isEqualTo(3);

        target = ladder.run(3);
        assertThat(target).isEqualTo(2);

    }
}
