#include<bits/stdc++.h>
using namespace std;

bool checker(int n, int a, int b){
    for(int i = 0;i*b <= n;i++){
        if((n - i*b) % a == 0){
            return true;
        }
    }
    return false;
}

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        bool l = checker(n,3,4);
        bool j = checker(n,3,5);

        if(l && j){
            cout<<"Both"<<"\n";
        }else if(l){
            cout<<"Leapy"<<"\n";
        }else if(j){
            cout<<"Jumpster"<<"\n";
        }else{
            cout<<"None"<<"\n";
        }
    }
    return 0;
}