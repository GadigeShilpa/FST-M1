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
    #Find the menu item that says “All Courses”” and click it
    driver.find_element(By.XPATH, "//ul[contains(@class,'nav-menu')]/li[2]/a[1]").click()
    #Find the first course and click it
    driver.find_element(By.XPATH, "//div[contains(@class,'ld-course-list-items row')]/div[1]/article[1]/div[2]/p[2]/a[1]").click()
    #Find the first course content and click it
    driver.find_element(By.XPATH, "//div[contains(@class,'ld-item-list-items ')]/div[1]/div[1]/a[1]/div[2]").click()

    course_status = driver.find_element(By.XPATH, "//div[contains(@class,'ld-status ld-status-complete ld-secondary-background')]")

    # Verify the status of course as complete
    if(course_status =="COMPLETE"):
        print ("Your course is : ",course_status.text)
    else:
        print ("something wrong ") 

    #close the browser
    driver.quit()
    
