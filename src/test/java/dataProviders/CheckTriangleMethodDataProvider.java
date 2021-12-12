package dataProviders;

import org.testng.annotations.DataProvider;


public class CheckTriangleMethodDataProvider {
    @DataProvider
    public static Object[][] positiveFractional() {
        return new Object[][]{
                {1.2, 4.3, 4.5},
                {2.1, 2.1, 2.1},
                {2.5, 2.5, 3.1},
        };
    }

    @DataProvider
    public static Object[][] negativeFractional() {
        return new Object[][]{
                {-1.2, 4.3, 4.5},
                {2.1, -2.1, 2.1},
                {2.5, 2.5, -3.1},
        };
    }

    @DataProvider
    public static Object[][] positiveIntegers() {
        return new Object[][]{
                {1, 4, 4},
                {2, 2, 2},
                {2, 4, 3},
                {3, 4, 5},
        };
    }

    @DataProvider
    public static Object[][] negativeIntegers() {
        return new Object[][]{
                {-1, 4, 4},
                {2, -2, 2},
                {2, 4, -3},
                {3, 4, -5}
        };
    }

    @DataProvider
    public static Object[][] zeroFractional() {
        return new Object[][]{
                {0, 4.0, 4.0},
                {2.0, 0, 2.0},
                {2.0, 4.0, 0},
                {0.0, 0.0, 0.0}
        };
    }


    @DataProvider
    public static Object[][] zeroIntegers() {
        return new Object[][]{
                {0, 4, 4},
                {2, 0, 2},
                {2, 2, 0},
                {0, 0, 0}
        };
    }

    @DataProvider
    public static Object[][] fractionalAndIntegers() {
        return new Object[][]{
                {3.2, 4, 4},
                {4.2, 3.2, 4},
                {3.2, 4, 4.2}
        };
    }

    @DataProvider
    public static Object[][] charValue() {
        return new Object[][]{
                {'a','a', 4},
                {'a', 'b', 'c'},
                {'f', 'g', 'g'},
        };
    }
}
