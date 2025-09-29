#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    const int small_room_charge = 25;
    const int large_room_charge = 35;

    const float tax_rate = 0.06;

    const int estimate_valid_days = 30;

    int small_rooms, large_rooms;

    cout << "Estimate for carpet cleaning service" << endl;
    cout << "Number of small rooms: ";
    cin >> small_rooms;
    cout << "Number of large rooms: ";
    cin >> large_rooms;

    int cost = (small_rooms * small_room_charge) + (large_rooms * large_room_charge);
    float tax = cost * tax_rate;
    float total = (float)cost + tax;

    cout << "Cost: " << cost << endl;
    cout << "Tax: " << tax << endl;
    cout << "=============================" << endl;
    cout << "Total estimate: $" << total << endl;
    cout << "This estimate is valid for " << estimate_valid_days << " days" << endl;

    return 0;
}