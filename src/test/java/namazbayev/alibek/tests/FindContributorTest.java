package namazbayev.alibek.tests;

import org.junit.jupiter.api.Test;

import java.nio.channels.Selector;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindContributorTest {
    @Test
    void ShouldFindContributor() {
        open("https://github.com/selenide/selenide");
        $(".layout-sidebar").$(byText("Contributors"));
    }
}
