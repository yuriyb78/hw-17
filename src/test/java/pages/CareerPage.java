package pages;

import static com.codeborne.selenide.Selenide.open;

public class CareerPage {

    public CareerPage openPageCareer(){
        open("/career/");
        return this;
    }

}
