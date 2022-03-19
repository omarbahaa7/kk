import org.junit.Test;

import static org.junit.Assert.*;

public class EquilibriumTest {

    @Test
    public void equilibrium() {
        Equilibrium testclass = new Equilibrium();
        assertEquals("YES", testclass.equilibrium(3, new int[]{3, -1, 7, -5, 2, -4, 2, -1, -3}));
        assertEquals("NO", testclass.equilibrium(3, new int[]{4, 1, 7, -2, 4, -1, 1, -5, -3}));
        assertEquals("YES", testclass.equilibrium(3, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}));
        assertEquals("NO", testclass.equilibrium(3, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }
}
