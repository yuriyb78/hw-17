package pages.components;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckCareerPage {

    public final SelenideElement animatedSection = $("h1.aos-animate"),
                                sectionWorks = $(".works"),
                                socFondSection = $(".works-item--blue"),
                                btnWantWorkThis = $(".front-menu [data-graph-path=\"modalVacancy\"]"),
                                modalWindow = $(".graph-modal.is-open");
    public void  checkAnimatedSection () {
        animatedSection.shouldHave(text(" РОССИЙСКИЙ РАЗРАБОТЧИК ПРОГРАММНЫХ ПРОДУКТОВ "));
    }

    public void checkSectonWorks () {
        sectionWorks.shouldBe(visible);
    }

    public void checkSectionSocFond () {
        socFondSection.shouldHave(text("Социальный фонд России"));
    }

    public void checkChangeTextOnSocFond () {
        socFondSection.hover()
                .shouldHave(text(" Социальное казначейство – Единая цифровая платформа в социальной сфере" +
                        ", «Электронный больничный», обеспечение эксплуатации информационных систем Фонда, Электронный архив "));
    }

    public void checkbtnWantWorkThis () {
        btnWantWorkThis.shouldHave(text("Хочу работать"));
    }

    public void checkOpenModalWindowWantWorkThis () {
        btnWantWorkThis.click();
        modalWindow.shouldBe(visible);

    }
}
