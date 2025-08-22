#include<bits/stdc++.h>
using namespace std;
char grid[1005][1005];
bool vis[1005][1005];
vector<pair<int,int>> shift = {{-1,0},{1,0},{0,-1},{0,1}};
vector<int> v;
int n,m;
int rooms = 0;

bool vaild(int i, int j){
    if(i<0 || i>=n || j<0 || j>=m ){
        return false;
    }
    return true;
}

void dfs(int si, int sj){

    vis[si][sj] = true;
    rooms++;
    for(int i = 0;i<4;i++){

        int ci = si + shift[i].first;
        int cj = sj + shift[i].second;
        if(vaild(ci,cj) == true && !vis[ci][cj] && grid[ci][cj] != '#'){
            dfs(ci,cj);
        }
    }
}

int main(){
    
    cin>>n>>m;

    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            cin>>grid[i][j];
        }
    }
    memset(vis,false,sizeof(vis));

    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            if(grid[i][j] == '.' && !vis[i][j]){
                dfs(i,j);
                v.push_back(rooms);
                rooms = 0;
            }
        }
    }
    sort(v.begin(),v.end());
    if(!v.empty()){
        for(int x : v){
            cout<<x<<" ";
        }
    }else{
        cout<<0;
    }

    return 0;
}