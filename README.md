# CarRaceGame
자동차 경주게임 with java

Application.java -> 메인으로 실행하는 파일
car.java -> 자동차에 대한 인터페이스파일
carImpl.java -> 자동차의 이름과 가지고 있는 전진 횟수를 나타냄
carRepository.java -> 입력한 자동차의 정보를 가지고 있으며 Map을 활용하였다. List로 해도 될것같다.

## 기능
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

>## 입출력 요구사항
>>경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)
>>>pobi,woni,jun


>## 시도할 횟수
>> 6


>## 우승자 안내 문구
>>  한명이면 한명만 나오고 두명이면 ,와 함께 나온다. 
>>> 최종 우승자: pobi, jun


>## 예외 상황 시 에러 문구를 출력해야 한다. 단, 에러 문구는 [ERROR] 로 시작해야 한다.
>> [ERROR] 시도 횟수는 숫자여야 한다.


>## 프로그래밍 실행결과 예시
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)   
pobi,woni,jun   
시도할 회수는 몇회인가요?   
5   

실행 결과  
pobi : -   
woni :    
jun : -   

pobi : --  
woni : -   
jun : --   
   
pobi : ---   
woni : --   
jun : ---   
   
pobi : ----   
woni : ---   
jun : ----   
   
pobi : -----   
woni : ----   
jun : -----   
   
최종 우승자: pobi, jun   




출처 : <https://github.com/woowacourse/java-racingcar-precourse>
