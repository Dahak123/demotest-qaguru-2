package quru.qa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @Test
        void fillFornTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Bananchik");
        $("#lastName").setValue("jeltov");
        $("#userEmail").setValue("kojura1@mail.ru");
        $(".custom-control-input").click();


    }
}
