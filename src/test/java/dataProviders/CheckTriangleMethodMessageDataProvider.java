package dataProviders;

import org.testng.annotations.DataProvider;

public class CheckTriangleMethodMessageDataProvider {

    @DataProvider
    public static Object[][] trueMessageVal() {
        return new Object[][]{
                {-1.0, 4.0, 4.0, "a<=0"},
                {2.0, -2.0, 2.0, "b<=0"},
                {2.0, 2.0, -6.0, "c<=0"},
                {2.0, 2.0, 5.0, "a+b<=c"},
                {2.0, 5.0, 2.0, "a+c<=b"},
                {5.0, 2.0, 2.0, "b+c<=a"},
        };
    }
    @DataProvider
    public static Object[][] falseMessageVal() {
        return new Object[][]{
                {1.0, -4.0, -4.0, "a<=0"},
                {-2.0, 2.0, -2.0, "b<=0"},
                {-2.0, -2.0, 6.0, "c<=0"},
                {-2.0, -2.0, 5.0, "a+b<=c"},
                {-2.0, 5.0, -2.0, "a+c<=b"},
                {-5.0, -2.0, 2.0, "b+c<=a"},
        };
    }

}
