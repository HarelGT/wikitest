import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class helper {
    public static final String CAT = "https://en.wikipedia.org/wiki/Cat";

    public static final String MYFOLDER = "C:/Users/Harel/";
    public static final String JPG = ".jpg";

    public static void scSht(WebDriver driver, String fileName) throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(MYFOLDER + fileName + JPG));
    }
}
