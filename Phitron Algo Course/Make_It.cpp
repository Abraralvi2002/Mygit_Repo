#include<bits/stdc++.h>
using namespace std;
int dp[100005];
bool checker(int val, int n){
    if(val == n){
        return true;
    }
    if(val > n){
        return false;
    }
    if(dp[val] != -1){
        return dp[val];
    }

    bool op1 = checker(val + 3, n);
    bool op2 = checker(val * 2, n);
    dp[val] = (op1 || op2);

    return dp[val];
}

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;

        memset(dp,-1,sizeof(dp));

        bool res = checker(1,n);
        if(res){
            cout<<"YES"<<endl;
        }else{
            cout<<"NO"<<endl;
        }
    }
   
    return 0;
}