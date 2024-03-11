package tests;

import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CareerPage;
import pages.components.CheckCareerPage;

import static io.qameta.allure.Allure.step;

public class PageCareerTest extends BaseTests {

    CareerPage careerPage = new CareerPage();
    CheckCareerPage checkCareerPage = new CheckCareerPage();

    @Story("Проверка страницы 'Карьера в БФТ-Холдинг'")
    @DisplayName("Проверка наличия анимированного блока")
    @Test
    void checkAnimatedSectionTest () {
        step("Открытие страницы 'Карьера в БФТ-Холдинг'", () -> {
            careerPage.openPageCareer();
        });

        step("Проверка наличия анимированного блока", () -> {
            checkCareerPage.checkAnimatedSection();
        });
    }

    @Story("Проверка страницы 'Карьера в БФТ-Холдинг'")
    @DisplayName("Проверка наличия блока c заказчиками")
    @Test
    void checkWorksSectionTest () {
        step("Открытие страницы 'Карьера в БФТ-Холдинг'", () -> {
            careerPage.openPageCareer();
        });

        step("Проверка наличия блока c заказчиками", () -> {
            checkCareerPage.checkSectionWorks();
        });
    }

    @Story("Проверка страницы 'Карьера в БФТ-Холдинг'")
    @DisplayName("Проверка наличия заказчика 'Социальный фонд России'")
    @Test
    void checkSectionSocFondTest () {
        step("Открытие страницы 'Карьера в БФТ-Холдинг'", () -> {
            careerPage.openPageCareer();
        });

        step("Проверка наличия заказчика 'Социальный фонд России'", () -> {
            checkCareerPage.checkSectionSocFond();
        });
    }

    @Story("Проверка страницы 'Карьера в БФТ-Холдинг'")
    @DisplayName("Проверка изменения текста на блоке заказчика при курсора на блок 'Социальный фонд России'")
    @Test
    void checkChangeTextOnSectionSocFondTest () {
        step("Открытие страницы 'Карьера в БФТ-Холдинг'", () -> {
            careerPage.openPageCareer();
        });

        step("Проверка изменения текста на блоке заказчика при курсора на блок 'Социальный фонд России'", () -> {
            checkCareerPage.checkChangeTextOnSocFond();
        });

    }

    @Story("Проверка страницы 'Карьера в БФТ-Холдинг'")
    @DisplayName("Проверка наличия в меню кнопки 'Хочу работать'")
    @Test
    void checkbtnWantWorkThisTest () {
        step("Открытие страницы 'Карьера в БФТ-Холдинг'", () -> {
            careerPage.openPageCareer();
        });

        step("Проверка наличия в меню кнопки 'Хочу работать'", () -> {
            checkCareerPage.checkBtnWantWorkThis();
        });
    }

    @Story("Проверка страницы 'Карьера в БФТ-Холдинг'")
    @DisplayName("Проверка открытия окна для заполнения формы 'Хочу работать'")
    @Test
    void checkbtncheckOpenModalWindowWantWorkThisTest () {
        step("Открытие страницы 'Карьера в БФТ-Холдинг'", () -> {
            careerPage.openPageCareer();
        });

        step("Проверка открытия окна для заполнения формы 'Хочу работать'", () -> {
            checkCareerPage.checkOpenModalWindowWantWorkThis();
        });
    }


}
