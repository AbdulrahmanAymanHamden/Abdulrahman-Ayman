package Pages;

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
}
