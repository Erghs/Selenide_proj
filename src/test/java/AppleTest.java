import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AppleTest extends BaseTest{

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    private final static String STR="iphone-13";

    @Test
    public void checkHref(){
        MainPage mainPage = new MainPage(BASE_URL);
        String href = mainPage.clickOnSearch(SEARCH_STRING).getHrefonFirstArticle();
        Assert.assertTrue(href.contains(STR));

    }
}

