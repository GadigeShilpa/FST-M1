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

    #Find the menu item that says “All Courses”” and click it
    driver.find_element(By.XPATH, "//ul[contains(@class,'nav-menu')]/li[2]/a[1]").click()
    wait.until(EC.visibility_of_element_located((By.XPATH,"//div[@class='ld-course-list-items row']")))
    courses = driver.find_element(By.XPATH, "//h3[@class='entry-title']")
    print(f'Number of similar elements: {len(courses)}')
    # Close the WebDriver
    driver.quit()