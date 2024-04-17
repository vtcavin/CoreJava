package Lab13;
import java.util.Scanner;
public class FrequencyArray {
	void a1() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		System.out.println("Enter n values:");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1)
				System.out.println(arr[i]+count);
		}
		sc.close();
		
	}
	public static void main(String[] args) {
		FrequencyArray fr = new FrequencyArray();
		fr.a1();
	}
}
