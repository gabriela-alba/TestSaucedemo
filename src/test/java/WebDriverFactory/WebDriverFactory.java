package WebDriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	
	static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Configurar el navegador y las opciones
        	//WebDriverManager.chromedriver().clearDriverCache().setup();
            WebDriverManager.chromedriver().setup();
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins");
            // Inicializar el WebDriver
            driver = new ChromeDriver(option);
        }
        return driver;
    }
}
