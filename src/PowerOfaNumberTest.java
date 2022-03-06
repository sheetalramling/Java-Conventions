import org.junit.jupiter.api.Test;

class PowerOfaNumberTest {

    @Test
    public void OnePowerOne() {
        if (PowerOfaNumber.exponentiation(1, 1) != 1) throw new AssertionError();
    }

    @Test
    public void TwoPowerOne() {
        if (PowerOfaNumber.exponentiation(2, 1) != 2) throw new AssertionError();
    }

    @Test
    public void TwoPowerTwo() {
        if (PowerOfaNumber.exponentiation(2, 2) != 4) throw new AssertionError();
    }

    @Test
    public void threePowerTwo() {
        if (PowerOfaNumber.exponentiation(3, 2) != 3 * 3) throw new AssertionError();
    }

}