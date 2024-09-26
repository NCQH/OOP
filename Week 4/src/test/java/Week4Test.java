import org.junit.Test;
import org.junit.Assert;

public class Week4Test {
    @Test
    public void testMax2Int1() {
         Assert.assertEquals(-1, Week4.max2Int(-2147483648, -1));
    }

    @Test
    public void testMax2Int2() {
        Assert.assertEquals(0, Week4.max2Int(-1, 0));
    }

    @Test
    public void testMax2Int3() {
        Assert.assertEquals(1, Week4.max2Int(0, 1));
    }

    @Test
    public void testMax2Int4() {
        Assert.assertEquals(2147483647, Week4.max2Int(2147483647, 1));
    }

    @Test
    public void testMax2Int5() {
        Assert.assertEquals(1, Week4.max2Int(-1, 1));
    }

    @Test
    public void testMinArray1() {
        Assert.assertEquals(-5, Week4.minArray(new int[]{-5, -4, -3, -2, -1, 0}));
    }

    @Test
    public void testMinArray2() {
        Assert.assertEquals(0, Week4.minArray(new int[]{0, 1, 2, 3, 4}));
    }

    @Test
    public void testMinArray3() {
        Assert.assertEquals(-3, Week4.minArray(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }

    @Test
    public void testMinArray4() {
        Assert.assertEquals(-7, Week4.minArray(new int[]{-3, -7, -1, 0, 1, 2, 3}));
    }

    @Test
    public void testMinArray5() {
        Assert.assertEquals(-3, Week4.minArray(new int[]{-3, -3, -3, 0, 1, 2, 3}));
    }

    @Test
    public void testCalculateBMI1() {
        Assert.assertEquals("Thiếu cân", Week4.calculateBMI(50, 1.65));
    }

    @Test
    public void testCalculateBMI2() {
        Assert.assertEquals("Bình thường", Week4.calculateBMI(65, 1.7));
    }

    @Test
    public void testCalculateBMI3() {
        Assert.assertEquals("Thừa cân", Week4.calculateBMI(80, 1.8));
    }

    @Test
    public void testCalculateBMI4() {
        Assert.assertEquals("Béo phì", Week4.calculateBMI(90, 1.65));
    }

    @Test
    public void testCalculateBMI5() {
        Assert.assertEquals("Bình thường", Week4.calculateBMI(50, 1.6));
    }
}