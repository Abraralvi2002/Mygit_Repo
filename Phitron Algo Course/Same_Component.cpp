#include<bits/stdc++.h>
using namespace std;
char grid[1005][1005];
bool vis[1005][1005];
vector<pair<int,int>> shift = {{-1,0},{1,0},{0,-1},{0,1}};
int n,m,si,sj,ti,tj;
bool flag = false;

bool vaild(int i, int j){
    if(i<0 || i>=n || j<0 || j>=m ){
        return false;
    }
    return true;
}

void dfs(int si, int sj){

    vis[si][sj] = true;
    for(int i = 0;i<4;i++){
        int ci = si + shift[i].first;
        int cj = sj + shift[i].second;
        if(vaild(ci,cj) == true && !vis[ci][cj] && grid[ci][cj] != '-'){
            if(ci == ti && cj == tj){
                flag = true;
                return;
            }
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

    cin>>si>>sj>>ti>>tj;

    if(grid[si][sj] == '-' || grid[ti][tj] == '-'){
        cout<<"NO";
        return 0;
    }else if(si == ti && sj == tj){
        cout<<"YES";
        return 0;
    }

    dfs(si,sj);

    if(!flag){
        cout<<"NO";
    }else{
        cout<<"YES";
    }
    return 0;
}