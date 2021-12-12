package tests;

import dataProviders.GetSquareMethodDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import triangle.Triangle;

public class GetSquareMethodTest {
    @Test(dataProviderClass = GetSquareMethodDataProvider.class, dataProvider = "trueTriangleValue")
    public  void testGetSquareMethodTrueValue(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        Assert.assertEquals(tr.getSquare(), s);}

    @Test(dataProviderClass = GetSquareMethodDataProvider.class, dataProvider = "falseTriangleValue")
    public  void testGetSquareMethodFalseValue(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertFalse(tr.getSquare()>0 || tr.getSquare()<=0, "ошибка приложения, не является треугольником");}

}
