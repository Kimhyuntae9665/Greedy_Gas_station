import java.util.Scanner;

public class Greedy_Gas_station {
	
	public static int N;
	public static int[] distance;
	public static int[] price;
	public static int min_price;
	public static long total_cost=0; //total_cost�� Ȥ�ó� �ؼ� long���� ���� 

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		
		distance = new int[N-1];//�Ÿ�
		price = new int[N];//���
		
		for(int i=0;i<N-1;i++) { //�� ���� ������ �Ÿ� �Է�
			distance[i] = in.nextInt();
		}
		
		for(int i=0;i<N;i++) {// �� ������ Gasoline ����
			price[i] = in.nextInt();
		}
		
		min_price = price[0]; // ���������� ���� �� ���� �ּ� ��� 
		
		for(int i=0;i<N-1;i++) {
			
			if(min_price>price[i]) { //������ min_price���� �� �� min_price�� ���;� ���ο� �������� �⸧�� �ִ´�.
				
				//min_price�� ������ ���� ������ ������ min_price ������ �⸧�� �־��� �ɷ� 
				// ũ�� ũ�� ���°� �ʿ� 
				min_price = price[i];
			}
			
			total_cost+=(min_price*distance[i]); //��ȣ �� �ִ� ���� 
		}
		
		System.out.println(total_cost);
		
		
		
		
		
		
		

	}

}
