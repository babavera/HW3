package tests;

import dataProviders.CheckTriangleMethodMessageDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import triangle.Triangle;

public class CheckTriangleMethodMessageTest {

    @Test(dataProviderClass = CheckTriangleMethodMessageDataProvider.class, dataProvider = "trueMessageVal")
    public  void testCheckTriangleMethodTrueVal(double a, double b, double c, String s){
        Triangle tr = new Triangle(a, b, c);
        tr.checkTriangle();
        Assert.assertEquals(tr.getMessage(), s);} // Ошибка вместо "c<0" выводится "a+c<=b"

    @Test(dataProviderClass = CheckTriangleMethodMessageDataProvider.class, dataProvider = "falseMessageVal")
    public  void testCheckTriangleMethodFalseVal(double a, double b, double c, String s){
        Triangle tr = new Triangle(a, b, c);
        tr.checkTriangle();
        Assert.assertNotEquals(tr.getMessage(), s, "ошибка приложегния, неверное условие в блоке If ");}
}
