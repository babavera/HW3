package tests;

import dataProviders.DetectTriangleMethodDataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;
import triangle.Triangle;

public class DetectTriangleMethodTest {

    @Test(groups = {"Group by true value"}, dataProviderClass = DetectTriangleMethodDataProviders.class, dataProvider = "rectangularTrueValues")
    public  void testRectangularTriangleTrueValue(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertEquals(tr.detectTriangle(), 8);}

    @Test(groups = {"Group by false value"}, dataProviderClass = DetectTriangleMethodDataProviders.class, dataProvider = "rectangularFalseValues")
    public  void testRectangularTriangleFalseValue(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertFalse(tr.detectTriangle() <= 0 || tr.detectTriangle() > 0, "Ошибка приложения, не является треугольником");}

    @Test(groups = {"Group by true value"}, dataProviderClass = DetectTriangleMethodDataProviders.class, dataProvider = "ordynaryTrueValues")
    public  void testOrdynaryTriangleTrueValue(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertEquals(tr.detectTriangle(), 4);}

    @Test(groups = {"Group by false value"}, dataProviderClass = DetectTriangleMethodDataProviders.class, dataProvider = "ordynaryFalseValues")
    public  void testOrdynaryTriangleFalseValue(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertFalse(tr.detectTriangle() <= 0 || tr.detectTriangle() > 0, "Ошибка приложения, не является треугольником");}

    @Test(groups = {"Group by true value"}, dataProviderClass = DetectTriangleMethodDataProviders.class, dataProvider = "isoscelesTrueValues")
    public  void testIsoscelesTriangleTrueValue(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertEquals(tr.detectTriangle(), 2);}

    @Test(groups = {"Group by false value"}, dataProviderClass = DetectTriangleMethodDataProviders.class, dataProvider = "isoscelesFalseValues")
    public  void testIsoscelesTriangleFalseValue(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertFalse(tr.detectTriangle() <= 0 || tr.detectTriangle() > 0, "Ошибка приложения, не является треугольником");}

    @Test(groups = {"Group by true value"}, dataProviderClass = DetectTriangleMethodDataProviders.class, dataProvider = "equilateralTrueValues")
    public  void testEquilateralTriangleTrueValue(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertEquals(tr.detectTriangle(), 1, "Ошибка приложения, является равносторонним треугольником");}

    @Test(groups = {"Group by false value"}, dataProviderClass = DetectTriangleMethodDataProviders.class, dataProvider = "equilateralFalseValues")
    public  void testEquilateralTriangleFalseValue(int a, int b, int c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertFalse(tr.detectTriangle() <= 0 || tr.detectTriangle() > 0, "Ошибка приложения, не является треугольником");}
}
