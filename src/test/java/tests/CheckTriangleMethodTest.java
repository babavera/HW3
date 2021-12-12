package tests;

import dataProviders.CheckTriangleMethodDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import triangle.Triangle;

public class CheckTriangleMethodTest {

    @Test(dataProviderClass = CheckTriangleMethodDataProvider.class, dataProvider = "positiveFractional")
        public  void testPositiveFractional(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertTrue(tr.checkTriangle());}

    @Test(dataProviderClass = CheckTriangleMethodDataProvider.class, dataProvider = "negativeFractional")
    public  void testNegativeFractional(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertFalse(tr.checkTriangle());}

    @Test(dataProviderClass = CheckTriangleMethodDataProvider.class, dataProvider = "positiveIntegers")
    public  void testPositiveIntegers(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertTrue(tr.checkTriangle());}

    @Test(dataProviderClass = CheckTriangleMethodDataProvider.class, dataProvider = "negativeIntegers")
    public  void testNegativeIntegersTest(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertFalse(tr.checkTriangle());}

    @Test(dataProviderClass = CheckTriangleMethodDataProvider.class, dataProvider = "zeroFractional")
    public  void testZeroFractional(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertFalse(tr.checkTriangle());}

    @Test(dataProviderClass = CheckTriangleMethodDataProvider.class, dataProvider = "zeroIntegers")
    public  void testZeroIntegers(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertFalse(tr.checkTriangle());}

    @Test(dataProviderClass = CheckTriangleMethodDataProvider.class, dataProvider = "fractionalAndIntegers")
    public  void testFractionalAndIntegers(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertTrue(tr.checkTriangle());}

    @Test(dataProviderClass = CheckTriangleMethodDataProvider.class, dataProvider = "charValue")
    public  void testCharValue(double a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertFalse(tr.checkTriangle(), "ошибка приложения, не является треугольником");}

}
