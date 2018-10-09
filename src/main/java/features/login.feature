Feature: Login into FreeCRM Application

# Without Examples keyword
#Scenario: Login into FreeCRM
#       Given user is already on Login Page
#       When title of login page is Free CRM
#       Then user enters "avitkl" and "avitkl@123"
#       Then user clicks on Login button
#       Then user name should be displayed on homepage
#       Then close the browser
         
         
# With Examples Keyword         
 Scenario Outline: Login into FreeCRM
         Given user is already on Login Page
         When title of login page is Free CRM
         Then user enters "<username>" and "<password>"
         Then user clicks on Login button
         Then user name should be displayed on homepage
         Then close the browser
         
Examples:
        | username | password |
        | avitkl   | avitkl@123 |