

#Goal: Go to "My Account” link in the page and verify the page title
# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait
    # Start the Driver
with webdriver.Firefox() as driver:

    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)

    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/lms/")
    driver.maximize_window()

    #Find the menu item that says “My Account” and click it
    driver.find_element(By.XPATH, "//ul[contains(@class,'nav-')]//a[contains(text(),'My Account')]").click()
    myaccount_page_title = driver.title.replace("–", "")
    print(myaccount_page_title)

    # Get  the title of the page and verify it
    if(myaccount_page_title == "My Account  Alchemy LMS"):
        print ("The Page title is : ",driver.title)
        #Find login link and click it
        driver.find_element(By.XPATH, "//a[contains(@class,'login ld-')]").click()
        # Find the input fields
        user_name = driver.find_element(By.ID, "user_login")
        password = driver.find_element(By.ID, "user_pass")
        #pass input details
        user_name.send_keys("root")
        password.send_keys("pa$$w0rd")
        #Find login button and click
        driver.find_element(By.ID,"wp-submit").click()
        #Find the login message
        #login_Confirm_link = driver.find_element(By.LINK_TEXT,"Edit profile")
        # Wait for the success message and print it
        wait.until(EC.visibility_of_element_located((By.LINK_TEXT,"Edit profile")))
        print("You logged in successfully")
       
    else:
         print ("Wrong Website ") 

    #close the browser
    driver.quit()