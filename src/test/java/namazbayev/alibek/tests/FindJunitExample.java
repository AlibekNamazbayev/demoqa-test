package namazbayev.alibek.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindJunitExample {
    @BeforeAll
    static void BeforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void ShouldFindJunit5Code() {
        open("https://github.com/selenide/selenide");
        $(".js-repo-nav").find(byText("Wiki")).click();
        $(".Layout-main").find(byText("Soft assertions")).click();
        $(".Layout-main").shouldHave(Condition.text("@ExtendWith({SoftAssertsExtension.class})"));
        sleep(5000);


    }
}
