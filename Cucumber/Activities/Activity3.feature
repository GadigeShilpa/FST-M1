@activity3
Feature: Testing with Tags
@SimpleAlert @SmokeTest
Scenario: Testing with Simple Alert
  Given: User is on the page
  When: User clicks the Simple Alert button
  Then: Alert opens
  And: Read the text from it and print it
  And: Close the alert
  And: Read the result text

@ConfirmAlert 
Scenario: Testing with Confirm Alert

@PromptAlert
Scenario: Testing with Prompt Alert