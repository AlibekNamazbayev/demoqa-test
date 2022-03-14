package namazbayev.alibek.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FindSelenideRepo {
    @Test
    @DisplayName("Поиск Selenide на Github")
    void ShouldFindSelenide() {

        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        sleep(5000);

        $$("ul.repo-list li").first().$("a").click();
        $("h1").shouldHave(Condition.text("selenide / selenide"));




    }
}
