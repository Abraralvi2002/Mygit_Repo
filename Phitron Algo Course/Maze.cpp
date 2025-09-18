#include<bits/stdc++.h>
using namespace std;
char grid[105][105];
bool vis[105][105];
int level[105][105];
vector<pair<int,int>> moves = {{0,1},{0,-1},{-1,0},{1,0}};
pair<int,int> parent[105][105];
int n,m;
pair<bool,bool> flag = {false,false};
int si,sj,di,dj;

bool valid(int i,int j){
    if(i<0 || i>=n || j<0 || j>=m){
        return false;
    }else{
        return true;
    }
}

void bfs(int si,int sj){
    queue<pair<int,int>> q;
    q.push({si,sj});
    vis[si][sj] = true;
    level[si][sj] = 0;

    while(!q.empty()){
        pair<int,int> par = q.front();
        q.pop();
        int par_i = par.first;
        int par_j = par.second;

        for(int i = 0;i<4;i++){
            int ci = par_i + moves[i].first;
            int cj = par_j + moves[i].second;

            if(valid(ci,cj) && !vis[ci][cj] && (grid[ci][cj] == '.' || grid[ci][cj] == 'D')){
                q.push({ci,cj});
                vis[ci][cj] = true;
                level[ci][cj] = level[par_i][par_j] + 1;
                parent[ci][cj] = {par_i,par_j};
            }
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

    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            if(grid[i][j] == 'R'){
                si = i;
                sj = j;
                flag.first = true;
            }
            if(grid[i][j] == 'D'){
                di = i;
                dj = j;
                flag.second = true;
            }
        }
    }
    memset(vis,false,sizeof(vis));
    memset(level,-1,sizeof(level));
    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            parent[i][j] = {-1,-1};
        }
    }

    bfs(si,sj);

    if(level[di][dj] == -1 || !flag.first || !flag.second){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                cout<<grid[i][j];
            }
            cout<<endl;
        }
        return 0;
    }

    while(!(di==si && dj==sj)){
        if(grid[di][dj] != 'D'){
            grid[di][dj] = 'X';
        }
        pair<int,int> p = parent[di][dj];
        di = p.first;
        dj = p.second;
    }

    for(int i = 0;i<n;i++){ 
        for(int j = 0;j<m;j++){
            cout<<grid[i][j];
        }
        cout<<endl;
    }
    
    return 0;
}