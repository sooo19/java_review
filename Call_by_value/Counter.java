package Call_by_value;	//Call by value: 값을 불러온다

/*
class Updater{
	public void update(int count) {
		count++;
	}
}

public class Counter {
	int count = 0;
	
	public static void main(String[] args) {
		Counter myCounter=new Counter();
		System.out.println("before update: "+myCounter.count);
		
		Updater myUpdater=new Updater();
		myUpdater.update(myCounter.count);
		System.out.println("after update: "+myCounter.count);
	}

}

*/

//이 예제도 update 메소드는 int 자료형 값을 전달받았기 때문에, 값의 변화가 없다.

/*
* Counter.java라는 파일 내에 Updater와 Counter라는 클래스 2개가 등장했다. 
* 이것은 조금 특이하지만 물론 가능한 코드이다. 
* 하나의 java파일내에는 여러개의 클래스를 선언할 수 있다. 
* 단 파일명이 Counter.java라면 Counter.java 내의 Counter라는 클래스는 public 으로 선언하라는 관례(규칙)가 있다.
*/


// 위 코드를 아래 코드와 같이 수정

class Updater{
	public void update(Counter counter) {	//객체를 전달받도록 변경
		counter.count++;
	}
}

public class Counter {
	int count = 0;
	
	public static void main(String[] args) {
		Counter myCounter=new Counter();
		System.out.println("before update: "+myCounter.count);
		
		Updater myUpdater=new Updater();
		myUpdater.update(myCounter);	//myCounter 객체 자체를 전달
		System.out.println("after update: "+myCounter.count);
	}
}