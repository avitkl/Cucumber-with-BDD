Feature: Free CRM Create Contacts

 Scenario Outline: Free CRM Create a new contact scenario
 
         Given user is already on Login Page
         When title of login page is Free CRM
         Then user enters "<username>" and "<password>"
         Then user clicks on Login button
         Then user name should be displayed on homepage
         Then user moves to new contact page
         Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
         Then close the browser
         
Examples:
        | username | password | firstname | lastname | position |
        | avitkl   | avitkl@123 | Tom | Peter | Manager |
        | avitkl   | avitkl@123 | David | Dsouza | Director |