package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtility {
    private WebDriver driver;

    public ScreenshotUtility(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshot(String fileName) {
        // Convert WebDriver object to TakeScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        // Capture screenshot as output type File
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        // Define destination path for the screenshot
        File destFile = new File("./screenshots/" + fileName + ".png");

        try {
            // Copy file from source to destination
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot captured: " + fileName);
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        }
    }
}
