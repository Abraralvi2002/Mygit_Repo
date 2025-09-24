#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    priority_queue<int, vector<int>, greater<int>> pq;

    int q;
    cin>>q;
    while(q--){
        int n,x;
        cin>>n;
        if(n == 1){
            cin>>x;
            pq.push(x);
        }else if(n == 2){
            if(pq.empty()){
                cout<<"empty"<<"\n";
            }else{
                int mn = pq.top();
                cout<<mn<<"\n";
                while(!pq.empty() && pq.top() == mn){
                    pq.pop();
                }
            }
        }
        
    }
    return 0;
}