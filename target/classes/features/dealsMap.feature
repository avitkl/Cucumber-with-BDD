Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters username and password 
		| username | password |
		| avitkl | avitkl@123 |
	Then user clicks on Login button 
	Then user name should be displayed on homepage 
	Then user moves to new deal page and user enters deal details 
		| title | amount | probability | commission |
		| test deal4 | 4000 | 80 | 40 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
	Then close the browser