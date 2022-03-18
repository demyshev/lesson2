package guru.qu.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

//    @BeforeAll
//    static void beforeAll() {
//        Configuration.browserSize = "1920x1080";
//    }

    @Test
    void successTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Anton");
        $("#userEmail").setValue("demyshev14@gmail.com");
        $("#currentAddress").setValue("No");
        $("#permanentAddress").setValue("asdasd");
        $("#submit").scrollTo().click();

        $("#output").shouldBe(visible);
        $("#name").shouldHave(text("Anton"));
        $("#email").shouldHave(text("demyshev14@gmail.com"));
        $("#output #currentAddress").shouldHave(text("No"));
        $("#output").$("#permanentAddress").shouldHave(text("asdasd"));

    }
}

