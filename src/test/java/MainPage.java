/*
Главная страница
 */

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement searchInput=$x("//input[@type='text']");;

    public MainPage(String url){
        Selenide.open(url);
    }

    public SearchPages clickOnSearch(String value){
        searchInput.setValue(value);
        searchInput.sendKeys(Keys.ENTER);
        return new SearchPages();
    }



}
