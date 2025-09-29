#include <bits/stdc++.h>

using namespace std;

int main()
{
    vector <int> vector1;
    vector <int> vector2;

    vector1.push_back(10);
    vector1.push_back(20);

    cout << "Elements: " << endl;
    cout << "0. " << vector1.at(0) << endl;
    cout << "1. " << vector1.at(1) << endl;
    cout << "Size: " << vector1.size() << endl;

    vector2.push_back(100);
    vector2.push_back(200);

    cout << "Elements: " << endl;
    cout << "0. " << vector2.at(0) << endl;
    cout << "1. " << vector2.at(1) << endl;
    cout << "Size: " << vector2.size() << endl;

    vector <vector<int>> vector_2d;

    vector_2d.push_back(vector1);
    vector_2d.push_back(vector2);

    cout << "Vector_2d: " << endl;
    cout << vector_2d.at(0).at(0) << " " << vector_2d.at(0).at(1) << endl;
    cout << vector_2d.at(1).at(0) << " " << vector_2d.at(1).at(1) << endl;

    vector1.at(0) = 1000;

    cout << "Vector_2d: " << endl;
    cout << vector_2d.at(0).at(0) << " " << vector_2d.at(0).at(1) << endl;
    cout << vector_2d.at(1).at(0) << " " << vector_2d.at(1).at(1) << endl;

    cout << "Vector 1: " << endl;
    cout << "0. " << vector1.at(0) << endl;
    cout << "1. " << vector1.at(1) << endl;

}