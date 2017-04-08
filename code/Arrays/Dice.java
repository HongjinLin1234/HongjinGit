package Arrays;

import java.text.DecimalFormat;

import support.ArgsProcessor;

public class Dice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int D = ap.nextInt("The number of dice used in this simulation");
		int T = ap.nextInt("The number of times the dice are thrown");
		int a[]=new int[D];
		int i=0;
		int b[]=new int[T];
		for(i=0;i<=D-1;i++){
			System.out.print(i+" ");
		}
		System.out.println();
		for(int c=0;c<=D-1;c++){
			System.out.print("--");}
		System.out.println();
		double notsame=0;
		int sum=0;
		DecimalFormat df1 = new DecimalFormat("#");
		DecimalFormat df2 = new DecimalFormat("#.00");
		for(int j=1;j<=T;j++){
			sum=0;
			for(i=0;i<=D-1;i++){
			a[i]=(int)(Math.random()*6+1);
			sum=sum+a[i];
			System.out.print(a[i]+" ");
			}
			b[j-1]=sum;
			for(i=1;i<=D-1;i++){
				if(a[i]!=a[i-1]){notsame=notsame+1;break;}
			}
			
			System.out.println();
		}
		double P=(double)((1-notsame/T)*100);
		int count=1;
		int t=0;
		int c[]=new int[T];
		int d[]=new int[T];
		System.out.println();
		for(int k=0;k<=T-2;k++){
			for(int l=k+1;l<=T-1;l++){
			if(b[k]>b[l]){t=b[k];b[k]=b[l];b[l]=t;}
			
		}}
		System.out.print("All sums: ");
		for(int k=0;k<=T-1;k++){
		System.out.print(b[k]+" ");}
		System.out.println();
		t=0;
		for(int k=0;k<=T-2;k++){
			count=1;
			for(int l=k+1;l<=T-1;l++){
				if(b[k]==b[l]){count=count+1;k=l;}}
			    c[t]=b[k];
				d[t]=count;
				t=t+1;}
		if(b[T-1]==b[T-2]){d[t]=count+1;t=t-1;}
		else{c[t]=b[T-1];d[t]=1;}
				
			
			
		System.out.print("How many different sums: ");
		for(int k=0;k<=t;k++){
			System.out.print(c[k]+" ");}
		System.out.println();
		System.out.print("Number of times Sum was seen: ");
		for(int k=0;k<=t;k++){
			System.out.print(d[k]+" ");}
		sum=0;
		for(int k=0;k<=t;k++){
			sum=sum+d[k];
		}
		System.out.println();
		System.out.print("Percentage: ");
		for(int k=0;k<=t;k++){
			double Percent=(double)d[k]/sum*100;
			System.out.print(df1.format(Percent)+"% ");
		}
		System.out.println();
		System.out.println("the possibility of same value: "+df1.format(P)+"%");
		
		}
	}




