#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> arr(n);
        for(int i = 0;i<n;i++){
            cin>>arr[i];
        }

        int left = 0, right = n-1;
        int max_height = 0;
        int L = 0, R = 0;

        while(left < right){
            
            int height = min(arr[left],arr[right]);

            if(height > max_height){
                max_height = height;
                L = left;
                R = right;
            }
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        cout<<L<<" "<<R<<endl;
    }

    return 0;
}