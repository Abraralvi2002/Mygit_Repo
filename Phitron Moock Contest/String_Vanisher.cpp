#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        long long int n;
        string s;
        cin>>n>>s;

        long long int res =  1;
        long long int count = 1;

        for(long long int i = 1;i<n;i++){
            if(s[i] == s[i-1]){
                count++;
                res = max(count,res);
            }else{
                count = 1;
            }
        }

        long long int alt = ceil((n+1)/2);
        cout<<max(res,alt)<<"\n";
    }
    return 0;
}