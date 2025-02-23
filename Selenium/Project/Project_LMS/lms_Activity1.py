# Goal: Read the title of the website and verify the text

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

    # Start the Driver
with webdriver.Firefox() as driver:

    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/lms/")
    driver.maximize_window()
        
    # Get  the title of the page and verify it
    page_title = driver.title.replace("–", "")
    print(page_title) 

    if(page_title=="Alchemy LMS  An LMS Application"):
        print("The Page title is : ",driver.title)
    else:
         print("Wrong Website ") 

    #close the browser
    driver.quit()