Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

         Given user is already on Login Page
         When title of login page is Free CRM
         Then user enters username and password
         | avitkl | avitkl@123 |
         Then user clicks on Login button
         Then user name should be displayed on homepage
         Then user moves to new deal page
         Then user enters deal details
         | test deal | 1000 | 50 | 10 |
         Then close the browser