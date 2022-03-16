package namazbayev.alibek.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.nio.channels.Selector;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class FindContributorTest {
    @Test
    void ShouldFindContributor() throws InterruptedException {
        open("https://github.com/selenide/selenide");

        $(".Layout-sidebar").$(byText("Contributors")).closest("div")
                .$$("ul li").first().hover();

        sleep(5000);

        $$(".Popover-message").find(Condition.visible)
                .shouldHave(Condition.text("Andrei Solntsev"));


    }
}
