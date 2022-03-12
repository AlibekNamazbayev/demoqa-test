package namazbayev.alibek;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {
    @Test
    @DisplayName("Text box test")
    void SuccessTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Alibek");
        $("#userEmail").setValue("namazbayev.alibek@gmail.com");
        $("#currentAddress").setValue("some address");
        $("#permanentAddress").setValue("another address");
        $("#submit").scrollTo().click();

        $("#output").shouldBe(visible);
        $("#name").shouldHave(text("Alibek"));
        $("#email").shouldHave(text("namazbayev.alibek@gmail.com"));
        $("#output #currentAddress").shouldHave(text("some address"));
        $("#output #permanentAddress").shouldHave(text("another address"));
    }
}
