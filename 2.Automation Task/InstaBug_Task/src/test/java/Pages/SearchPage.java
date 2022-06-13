package Pages;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public WebElement Search_Box()
    {
        By search = By.cssSelector(" div[class=\"a4bIc\"] > input[class=\"gLFyf gsfi\"]");
        WebElement search_box = Hooks.driver.findElement(search);
        return search_box;
    }


    public WebElement Search_Button()
    {
        By button = By.cssSelector("div[class=\"FPdoLc lJ9FBc\"] center > input[class=\"gNO89b\"]");
        WebElement search_button = Hooks.driver.findElement(button);
        return search_button;
    }

    public WebElement Search_Menu()
    {
        By Menu = By.cssSelector("div[class=\"mkHrUc\"]");
        WebElement Search_Menu = Hooks.driver.findElement(Menu);
        return Search_Menu ;
    }

    public WebElement Search_Suggestions()
    {
        By sug = By.cssSelector("div[class=\"wM6W7d\"] > span");
        WebElement sug_text = Hooks.driver.findElement(sug);
        return sug_text;
    }

    public WebElement Keyboard_Icon()
    {
        By keyboard = By.cssSelector("div[class=\"Umvnrc\"] > span");
        WebElement Keyboard_Icon = Hooks.driver.findElement(keyboard);
        return Keyboard_Icon ;
    }

    public WebElement Keyboard()
    {
        By keyboard = By.id("kbd");
        WebElement Keyboard = Hooks.driver.findElement(keyboard);
        return Keyboard ;
    }

    public WebElement MicrophoneIcon()
    {
        By Microphone = By.cssSelector("svg[class=\"goxjub\"]");
        return Hooks.driver.findElement(Microphone);
    }

    public WebElement MicrophonePage()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"button\"]"));
    }

    public WebElement English_Link()
    {
        return Hooks.driver.findElement(By.cssSelector("div[id=\"SIvCob\"] > a[dir=\"ltr\"]"));
    }

    public WebElement Arabic_Link()
    {
        return Hooks.driver.findElement(By.cssSelector("div[id=\"SIvCob\"] > a[dir=\"rtl\"]"));
    }

    public WebElement Country_Name()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"uU7dJb\"]"));
    }

}
