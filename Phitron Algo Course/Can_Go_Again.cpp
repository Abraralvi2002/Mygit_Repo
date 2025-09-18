#include <bits/stdc++.h>
using namespace std;

class Edge{
    public:
        int a, b, c;
        Edge(int a, int b, int c){
            this->a = a;
            this->b = b;
            this->c = c;
        }
};
vector<Edge> edge_list;
int dis[1005];
int n, e;
bool cycle = false;

void bellman_ford(){
    for (int i = 1; i <= n - 1; i++){
        for (auto ed : edge_list){
            int a, b, c;
            a = ed.a;
            b = ed.b;
            c = ed.c;

            if (dis[a] != INT_MAX && dis[a] + c < dis[b]){
                dis[b] = dis[a] + c;
            }
        }
    }

    for (auto ed : edge_list){
        int a, b, c;
        a = ed.a;
        b = ed.b;
        c = ed.c;

        if (dis[a] != INT_MAX && dis[a] + c < dis[b]){
            cycle = true;
            break;
        }
    }
}

int main(){

    cin >> n >> e;

    while (e--){
        int a, b, c;
        cin >> a >> b >> c;
        edge_list.push_back(Edge(a, b, c));
    }

    int s;
    cin >> s;

    for (int i = 1; i <= n; i++){
        dis[i] = INT_MAX;
    }
    dis[s] = 0;

    bellman_ford();

    int t;
    cin >> t;

    if(cycle){
        cout<<"Negative Cycle Detected"<<endl;
        return 0;   
    }

    while (t--){
        int d;
        cin >> d;
        if (dis[d] != INT_MAX){
            cout << dis[d] << endl;
        }else{
            cout << "Not Possible" << endl;
        }
    }

    return 0;
}