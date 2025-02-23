# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

    # Start the Driver
with webdriver.Firefox() as driver:

    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/lms/")
    driver.maximize_window()

    # Get the heading of the webpage.
    firstInfo_Title = driver.find_element(By.XPATH, "//div[@id='uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810']/div[1]/div[1]/div[1]/div[2]/h3[1]")

    # Verify the heading of the webpage.
    if(firstInfo_Title.text =="Actionable Training"):
        print ("The title of the first info box is : ",firstInfo_Title.text)
    else:
        print ("Wrong Website ") 

    #close the browser
    driver.quit()