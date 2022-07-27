import java.util.Scanner;

public class Greedy_Gas_station {
	
	public static int N;
	public static int[] distance;
	public static int[] price;
	public static int min_price;
	public static long total_cost=0; //total_cost는 혹시나 해서 long으로 선언 

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		
		distance = new int[N-1];//거리
		price = new int[N];//비용
		
		for(int i=0;i<N-1;i++) { //각 도시 사이의 거리 입력
			distance[i] = in.nextInt();
		}
		
		for(int i=0;i<N;i++) {// 각 도시의 Gasoline 가격
			price[i] = in.nextInt();
		}
		
		min_price = price[0]; // 이전까지의 과정 중 주유 최소 비용 
		
		for(int i=0;i<N-1;i++) {
			
			if(min_price>price[i]) { //기존의 min_price보다 더 싼 min_price가 나와야 새로운 주유소의 기름을 넣는다.
				
				//min_price가 갱신이 되지 않으면 기존의 min_price 주유소 기름을 넣었던 걸로 
				// 크게 크게 보는게 필요 
				min_price = price[i];
			}
			
			total_cost+=(min_price*distance[i]); //괄호 쳐 주는 습관 
		}
		
		System.out.println(total_cost);
		
		
		
		
		
		
		

	}

}
