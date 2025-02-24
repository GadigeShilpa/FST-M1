# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
    # Start the Driver
with webdriver.Firefox() as driver:

    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/lms/")
    driver.maximize_window()

    #Find the menu item that says “contact”” and click it
    driver.find_element(By.XPATH, "//ul[contains(@class,'nav-menu')]/li[4]/a").click()

    # Find the input fields
    full_name = driver.find_element(By.XPATH, "//input[contains(@id,'8-field_0')]") 
    email = driver.find_element(By.XPATH,"//input[contains(@id,'8-field_1')]")
    subject = driver.find_element(By.XPATH,"//input[contains(@id,'8-field_3')]")
    comment = driver.find_element(By.XPATH,"//textarea[contains(@id,'8-field_2')]")

    #pass input details
    full_name.send_keys("Shilpa")
    email.send_keys("test@gmail.com")
    subject.send_keys("Social Media Marketing")
    comment.send_keys("This is a test message")

    #Find submit button and click
    driver.find_element(By.XPATH,"//button[@data-submit-text='Send Message']").click()

    #Find Confirmation message
    success_message = driver.find_element(By.ID,"wpforms-confirmation-8")
    print("The Confirmation message displayed is:", success_message.text)

    # Close the WebDriver
    driver.quit()