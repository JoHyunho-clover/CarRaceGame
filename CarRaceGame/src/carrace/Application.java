package carrace;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import carrace.car.carImpl;

import repository.carRepository;

//���� ���α׷����� ���۴�.
public class Application {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		// ī�� ������ ����һ���
		carRepository repository= new carRepository();
		
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���. �� ������ ������ �ƴ� ��ǥ�Դϴ�.");
		
		//������� �Է��ҰŶ� next ���
		String cars=scanner.next();
		
		System.out.println("�õ��� Ƚ���� ��ȸ�ΰ���");
		try {
			int maxnum =scanner.nextInt();
			
			//Ű����� �Է��� ������ ,�� �������� ������ ���� �Ұ�
			//�׷��� �迭�� �̿��ؼ� �ϴµ� split�Լ��� ����""�� ����Ѵ�.
			String []carsArray= cars.split(",");
			
			//������ ī�� ����ҿ� �����ؾ���.
			for(String car: carsArray) {
				repository.save(new carImpl(car));
			}
			
			List<String> finArray = new ArrayList<String>();
			//= new String[carsArray.length];
			
			boolean fin=false;
			System.out.println("������");
			while(true) {
				int i=0;
				while(i<carsArray.length) {
					
					//�������ڿ� ���� �����ǰų� �������� �ʴ� ���� ���� r�� �����ϰ� ���� for���� ���� ���
					int r=repository.get(carsArray[i]).count(repository.get(carsArray[i]).randomNum());
					
					System.out.print(repository.get(carsArray[i]).name+" : ");
					for(int n=0; n<r;n++) {
						System.out.print(" -- ");
					}
					System.out.println();
					
					if(r==maxnum) {
						finArray.add(repository.get(carsArray[i]).name);
						fin=true;
					}
					i++;
				}
				System.out.println();
				
				if(fin==true) {
					System.out.print("���� ����� :");
					for(int j=0; j<finArray.size(); j++) {
						if(j>=1) {
							System.out.print(", ");
						}
						System.out.print(finArray.get(j));
					}
					break;
				}
			}
		}catch (InputMismatchException e){
			System.out.println("[ERROR] �õ� Ƚ���� ���ڿ��� �Ѵ�.");
		}
		scanner.close();
	}
}

