import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[notname=q]").setValue("SELENIUM").pressEnter();
        $("[NotId=search]").shouldHave(text("https://SEleNium.org")); !
    }
}