#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
    cin>>n;
    int i, a[n];
    for (i=0;i<n;i++){
        cin>>a[i];
    }
    int t;
    cin>>t;
    while(t--){
        int x;
        cin>>x;
        cout<<a[x-1]<<endl;
        for (i=x-1;i<n-1;i++){
            a[i] = a[i+1];
        }
        n = n - 1;
    }
	return 0;
}