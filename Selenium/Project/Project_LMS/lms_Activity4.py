#Get the title of the second most popular course.
#Make sure it matches “Email Marketing Strategies” exactly.

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

    # Start the Driver
with webdriver.Firefox() as driver:

    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/lms/")
    driver.maximize_window()

    # Get the heading of the webpage.
    course2_Title = driver.find_element(By.XPATH, ".//div[contains(@class,'ld-course-list-items ')]/div[2]/article[1]/div[2]/h3[1]")

    # Verify the heading of the webpage.
    if(course2_Title.text =="Email Marketing Strategies"):
        print ("The title of the second most popular course is : ",course2_Title.text)
    else:
        print ("Wrong Website ") 

    #close the browser
    driver.quit()