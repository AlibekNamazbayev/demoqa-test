package namazbayev.alibek.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @BeforeAll
    static void BeforeAll() {
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void DragAndDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");

        SelenideElement elementA = $(By.id("column-a"));
        SelenideElement elementB = $(By.id("column-b"));

        $(elementA).dragAndDropTo(elementB);
        $(elementA).shouldHave(Condition.text("B"));

    }
}
