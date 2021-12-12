package dataProviders;

import org.testng.annotations.DataProvider;

public class DetectTriangleMethodDataProviders {

    @DataProvider
    public static Object[][] rectangularTrueValues() {
        return new Object[][]{
                {3, 4, 5},
                {121, 7320, 7321},
                {40, 399, 401}

        };
    }

    @DataProvider
    public static Object[][] rectangularFalseValues() {
        return new Object[][]{
                {-3, 4, 5},
                {0, 0, 0},
                {-80, -39, -89},
                {'a', 'b', 'c'}
        };
    }

    @DataProvider
    public static Object[][] ordynaryTrueValues() {
        return new Object[][]{
                {3, 7, 9},
                {153, 320, 200},
                {5, 401, 400}
        };
    }

    @DataProvider
    public static Object[][] ordynaryFalseValues() {
        return new Object[][]{
                {-3, 7, 9},
                {0, 0, 0},
                {1, 2, 4},
                {'a', 'b', 'c'}
        };
    }

    @DataProvider
    public static Object[][] isoscelesTrueValues() {
        return new Object[][]{
                {4, 4, 3},
                {100, 200, 200},
                {400, 400, 500}
        };
    }

    @DataProvider
    public static Object[][] isoscelesFalseValues() {
        return new Object[][]{
                {-4, -4, 3},
                {0, 0, 1},
                {1, 2, 4},
                {'a', 'a', 'c'}
        };
    }

    @DataProvider
    public static Object[][] equilateralTrueValues() {
        return new Object[][]{
                {4, 4, 4},
                {200, 200, 200},
                {400, 400, 400}
        };
    }

    @DataProvider
    public static Object[][] equilateralFalseValues() {
        return new Object[][]{
                {-4, -4, -4},
                {0, 0, 0},
                {400, 400, -400},
                {'a', 'a', 'a'}
        };
    }

}
