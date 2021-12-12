package dataProviders;

import org.testng.annotations.DataProvider;

public class GetSquareMethodDataProvider {

    @DataProvider
    public static Object[][] trueTriangleValue (){
        return new Object [][]{
                {1.2, 4.3, 4.5},
                {3, 4, 5},
                {12, 15, 15},
                {50, 50, 50}
        };
    }

    @DataProvider
    public static Object[][] falseTriangleValue (){
        return new Object [][]{
                {0, 4.5, 4.5},
                {3, -4, 5},
                {'5', '5', '5'},
                {0, 0, 0}
        };
    }
}
