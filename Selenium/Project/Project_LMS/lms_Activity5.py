#Goal: Go to "My Account” link in the page and verify the page title
# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

    # Start the Driver
with webdriver.Firefox() as driver:

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
    else:
         print ("Wrong Website ") 

    #close the browser
    driver.quit()
