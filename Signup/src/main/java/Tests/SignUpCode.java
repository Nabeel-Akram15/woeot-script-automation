package Tests;


@Test
public class SignUpCode extends Base {
	driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
    driver.findElement(By.xpath("//*[@text='Sign up']")).sendKeys("Nabeel Ali");
    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='continueBtn']")));
    driver.findElement(By.xpath("//*[@id='continueBtn']")).sendKeys("na405762@gmail.com");
    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='continueBtn']")));
    driver.findElement(By.xpath("//*[@id='continueBtn']")).sendKeys("Nabeel12345");
    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='continueBtn']")));
    driver.findElement(By.xpath("//*[@id='continueBtn']")).click();
    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='continueBtn']")));
    driver.findElement(By.xpath("//*[@id='continueBtn']")).click();
    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='continueBtn']")));
    driver.findElement(By.xpath("//*[@id='continueBtn']")).click();
    new WebDriverWait(driver, 120).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Continue']")));
    driver.findElement(By.xpath("//*[@text='Continue']")).click();
    driver.findElement(By.xpath("//*[@text='Close']")).click();
    driver.pressKeyCode(AndroidKeyCode.MENU);
    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Continue']")));
    driver.findElement(By.xpath("//*[@text='Continue']")).click();
    driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    driver.getKeyboard().sendKeys("3164073951");
    driver.findElement(By.xpath("//*[@id='continueBtn']")).click();
    // driver.pressKeyCode(AndroidKeyCode.BACK);
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.getKeyboard().sendKeys("234425219");
    driver.findElement(By.xpath("//*[@id='continueBtn']")).click();
    new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='continueBtn']")));
    driver.findElement(By.xpath("//*[@id='continueBtn']")).click();
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    // driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
    driver.getKeyboard().sendKeys("055818823");
    driver.findElement(By.xpath("//*[@id='continueBtn']")).click();
    driver.findElement(By.xpath("//*[@id='continueBtn']")).click();
    new WebDriverWait(driver, 120).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Continue']")));
    driver.findElement(By.xpath("//*[@text='Continue']")).click();
    new WebDriverWait(driver, 120).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Continue']")));
    driver.findElement(By.xpath("//*[@text='Continue']")).click();
    driver.findElement(By.xpath("//*[@id='continueBtn']")).click();


}
