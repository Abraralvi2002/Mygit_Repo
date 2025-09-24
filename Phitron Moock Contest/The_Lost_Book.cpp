#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int ar[n];
    for(int i = 0;i<n;i++){
        cin>>ar[i];
    }
    int tar;
    cin>>tar;
    for(int i = 0;i<n;i++){
        if(ar[i] == tar){
            cout<<i<<endl;
            return 0;
        }
    }
    cout<<-1<<endl;
    return 0;
}