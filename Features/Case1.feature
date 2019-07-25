Feature: Customer registration

Scenario Outline: I want to login

Given The browser is configured and TestMe URL is opened
Then SignUp link is clicked
And "<UName>" is given
And Required details are given
And "<PWord>" is provided
And Remaining details are given
When submit button is clicked 
Then Login "<UName>" is given
And Login "<PWord>" is provided


Examples:
		| UName | PWord |
		| AlexUser | Alex@123 |
		