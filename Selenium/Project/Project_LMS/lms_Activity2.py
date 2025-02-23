# Get the heading of the webpage.
# Goal: Make sure it matches “Learn from Industry Experts” exactly

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

    # Start the Driver
with webdriver.Firefox() as driver:

    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/lms/")
    driver.maximize_window()

    # Get the heading of the webpage.
    page_heading = driver.find_element(By.XPATH, "//h1[contains(@class,'title')]")
    print ("The Page heading is : ",page_heading.text)

    # Verify the heading of the webpage.
    if(page_heading.text =="Learn from Industry Experts"):
        print ("The Page heading is : ",page_heading.text)
    else:
        print ("Wrong Website ") 

    #close the browser
    driver.quit()