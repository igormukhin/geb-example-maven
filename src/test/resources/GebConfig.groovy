/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.Capabilities

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.phantomjs.PhantomJSDriverService
import org.openqa.selenium.remote.DesiredCapabilities


driver = { new FirefoxDriver() }
reportsDir = "target/geb-reports"

environments {
	
	// run as “mvn -Dgeb.env=chrome test”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}

	htmlunit {
		driver = { new HtmlUnitDriver() }
	}
	
	phantom {
		driver = { 
			Capabilities caps = new DesiredCapabilities()
			caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\tools\\phantomjs-1.9.7\\phantomjs.exe")
			new PhantomJSDriver(caps)
	    }
	}

}