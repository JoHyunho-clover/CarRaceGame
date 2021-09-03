package carrace;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import carrace.car.carImpl;

import repository.carRepository;

//실제 프로그래밍의 동작단.
public class Application {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		// 카를 저장할 저장소생성
		carRepository repository= new carRepository();
		
		System.out.println("경주할 자동차 이름을 입력하세요. 단 구분은 공백이 아닌 쉼표입니다.");
		
		//공백없이 입력할거라 next 사용
		String cars=scanner.next();
		
		System.out.println("시도할 횟수는 몇회인가요");
		try {
			int maxnum =scanner.nextInt();
			
			//키보드로 입력을 받을때 ,를 기준으로 나누는 것은 불가
			//그래서 배열을 이용해서 하는데 split함수를 쓸때""를 써야한다.
			String []carsArray= cars.split(",");
			
			//각각의 카를 저장소에 저장해야지.
			for(String car: carsArray) {
				repository.save(new carImpl(car));
			}
			
			List<String> finArray = new ArrayList<String>();
			//= new String[carsArray.length];
			
			boolean fin=false;
			System.out.println("실행결과");
			while(true) {
				int i=0;
				while(i<carsArray.length) {
					
					//랜덤숫자에 의해 증가되거나 증가되지 않는 것을 통해 r에 저장하고 밑의 for문을 통해 출력
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
					System.out.print("최종 우승자 :");
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
			System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
		}
		scanner.close();
	}
}

