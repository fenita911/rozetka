package pages;

import enums.Categories;
import enums.Subcategories;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.List;

public class MainPage extends BasePage {

    @FindBy(css = "sidebar-fat-menu>.menu-wrapper>ul.menu-categories>li.menu-categories__item>a")
    private List<WebElement> categories;

    @FindBy(css="ul>li>a.menu__link")
    private List<WebElement>subcategories;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void close(){
        driver.quit();
    }

    public void printCategory(){
        for(WebElement element:categories){
            System.out.println(element.getText());
        }

    }

    @Step("Вывести категории")
    public void printSubCategory(){
            System.out.println(subcategories.size());
        for(WebElement element:subcategories){
            if(element.isDisplayed()) {
                System.out.println(element.getText());
            }
        }

    }
    public void chooseCategory(Categories catName){
        for(WebElement element:categories){
            if (element.getText().contains(catName.toString())){
                element.click();
                break;
            }

        }

    }

    @Step("Навести на категорию {0}")
    public void hoverCategory(Categories catName){
        for(WebElement element:categories){
            if(element.getText().contains(catName.toString())){
                Actions hover = new Actions(driver);
                hover.moveToElement(element).perform();

            }
        }
    }

    @Step("Выбрать на категорию {0}")
    public void chooseSubCategory(Subcategories subName){
        for (WebElement element:subcategories){
            if (element.getText().contains(subName.toString())){
                element.click();
                break;
            }
        }
    }



}
