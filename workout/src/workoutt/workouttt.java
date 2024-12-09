package workoutt;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workouttt 
{
	public static void main (String[]args) throws IOException, AWTException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		Robot ro=new Robot();
		java.awt.Dimension sourcefile=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(sourcefile);
		BufferedImage image=ro.createScreenCapture(rec);
		File destinationfile=new File("D://full-screenshot.jpg");
		ImageIO.write(image,"png",destinationfile);
	}		
}
