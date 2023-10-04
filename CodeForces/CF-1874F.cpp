#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
const int mod=1e9+7;
const int N=205;
int n,m[N];
ll f[N][N],g[N][N][N],fac[N]; 
int main(){
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
		scanf("%d",&m[i]);
	if(m[1]==n){
		printf("0");
		return 0;
	}
	for(int i=1;i<=n;i++)	g[i][i-1][0]=1;
	fac[0]=1;
	for(int i=1;i<=n;i++)	fac[i]=fac[i-1]*i%mod;
	for(int l=n;l>=1;l--)
		for(int r=l;r<=n;r++){
			for(int k=1;k<=r-l+1;k++)
				g[l][r][k]=g[l][r-1][k-1];
			for(int o=l;o<r;o++)
				if(r<=m[o+1])
					for(int k=0;k<=r-l+1;k++)
						g[l][r][k]=(g[l][r][k]+g[l][o][k]*(mod-f[o+1][r]))%mod;
			for(int k=0;k<=r-l+1;k++)
				f[l][r]=(f[l][r]+g[l][r][k]*fac[k])%mod;
			if(r<=m[l])
				g[l][r][0]=(g[l][r][0]+mod-f[l][r])%mod;
		}
	printf("%lld",f[1][n]);
}