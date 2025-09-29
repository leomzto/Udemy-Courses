/*
Declare a vector of integers named vec  and initialize 
the vector to 10,20,30,40, and 50 

Modify the first element of the vector to be 100  
and modify the last element of the vector to be 1000.

The final vector should then be 100, 20, 30, 40, and 1000.
*/

#include <vector>
using namespace std;

vector<int> use_vector() {
    //----WRITE YOUR CODE BELOW THIS LINE----
    
    vector <int> vec {10, 20, 30, 40, 50};

    vec.at(0) = 100;
    vec.at(4) = 1000;

    //----WRITE YOUR CODE ABOVE THIS LINE----
    //----NO NOT MODIFY THE CODE BELOW THIS LINE----
    return vec;
}