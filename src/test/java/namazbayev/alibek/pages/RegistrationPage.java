package namazbayev.alibek.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    SelenideElement
            FirstNameInput = $("#firstName"),
            LastNameInput = $("#lastName"),
            ResultsTable = $(".table-responsive");

    //Открыть страницу
    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        return this;
    }

    //Ввести имя
    public RegistrationPage typeFirstName(String value) {
        FirstNameInput.setValue(value);

        return this;
    }

    //Ввести фамилию по ключу и значению
    public RegistrationPage typeLastName(String value) {
        LastNameInput.setValue(value);

        return this;
    }

    //проверка результатов
    public RegistrationPage checkResultsValue(String key, String value) {
        ResultsTable.$(byText(key))
                .parent().shouldHave(text(value));

         return this;
    }
}

