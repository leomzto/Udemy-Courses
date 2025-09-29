/*
In this exercise, you will write code using cin  
and the extraction operator >>  to allow a user to enter their date of birth. 


The variable m represents the month, 
d represents the day, 
and y represents the year. 
Assume that the user will enter their date of birth in the order of 
month, day, year,
with each value being separated by a blank space.

You do not need to prompt the user for any information using cout

Our test program will automatically 'pretend' to be the user and enter the values 2  15  and 1993  automatically. 


So, your code should consist only of the cin  statement(s). 
No other code should be necessary.
*/

#include <iostream>
using namespace std;

void date_of_birth() {
    int m {};
    int d {};
    int y {};
    //----DO NOT MODIFY THE CODE ABOVE THIS LINE----
    //---- WRITE YOUR CODE BELOW THIS LINE----
    
    cin >> m >> d >> y;
    
    //---- WRITE YOUR CODE ABOVE THIS LINE----
    //---- Do NOT MODIFY THE CODE BELOW THIS LINE----
    cout << m << " " << d << " " << y;
}