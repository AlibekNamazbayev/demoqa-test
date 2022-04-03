package namazbayev.alibek.tests;

import namazbayev.alibek.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;


public class RegistrationFormTestWithPageObjects {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void FillFormOfRegistration() {

        registrationPage.openPage()
                .typeFirstName("Murat")
                .typeLastName("Abdilda");

        registrationPage.checkResultsValue("Student Name", "Murat Abdilda");

    }

}
