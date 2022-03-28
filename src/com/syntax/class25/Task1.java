package com.syntax.class25;

//    Create a WebDriver Interface that will have the following unimplemented behaviour:
//            openBrowser(), closeBrowser(), maximizeWindow(), findElement().
//            Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
public class Task1 {
    public static void main(String[] args) {
        WebDriver[] w={new ChromeDriver(),new FirefoxDriver()};

        for (WebDriver driver : w) {
            driver.openBrowser();
            driver.closeBrowser();
            driver.maximizeWindow();
            driver.findElement();
        }
    }
}
interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    public void openBrowser(){
        System.out.println("Chrome Open Browser");
    }
    public void closeBrowser(){
        System.out.println("Chrome Close Browser");

    }
    public void maximizeWindow(){
        System.out.println("Chrome Maximize Window");

    }
    public void findElement(){
        System.out.println("Chrome Find Element");

    }
}
class FirefoxDriver implements WebDriver{

    public void openBrowser(){
        System.out.println("Firefox Open Browser");
    }
    public void closeBrowser(){
        System.out.println("Firefox Close Browser");

    }
    public void maximizeWindow(){
        System.out.println("Firefox Maximize Window");

    }
    public void findElement(){
        System.out.println("Firefox Find Element");

    }
}
