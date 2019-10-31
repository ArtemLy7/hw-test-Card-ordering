import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class CardOrderingTest {

    @Test
    void shouldTest() {
        open("http://localhost:9999/");
        //SelenideElement form = $("[class=form form_size_m form_theme_alfa-on-white]");
        $("[data-test-id=name] input").setValue("Филип Андреев");
        $("[data-test-id=phone] input").setValue("+79295657755");
        $("[data-test-id=agreement]").click();
        $("[class=button__content]").click();
        $("[data-test-id=order-success").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
