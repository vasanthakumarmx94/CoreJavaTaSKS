package Session;

public class findingEX_1 {

void polindrom(int n) {
	int r,rev=0;
	int m=n;
	while(n>0){
		r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	if(m==rev)
		System.out.println("Given number is polindrom");
	else
		System.out.println("Given number not a polindrom");
	}
void pattern(int n) {
	int k=1;
	for(int i=0;i<=n;i++) {
		for(int j=i-1;j<n*2;j=j+1) {
			System.out.print("  ");
		}
		for(int j=0;j<i;j++) {
			System.out.print(k+"   ");
			k=k+1;	
		}
		System.out.println();
	}
}

//void swapmax(int []a,int n) {
//	int mx=a[0];
//	int mnx=a[0];
//	for(int i=1;i<n;i++) {
//		if(a[i]>mx) {
//			mx=a[i];
//		}
//		if(a[i]<mnx) {
//			mnx=a[i];
//		}
//	}
//	}
}
