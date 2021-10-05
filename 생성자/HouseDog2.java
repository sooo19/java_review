//default 생성자
package 생성자;

public class HouseDog2 extends Animal{
	
	public HouseDog2() {

	}
	//생성자의 입력 항목이 없고 생성자 내부에 아무 내용이 없는 생성자를 default 생성자라고 부른다.
	//만약 클래스에 생성자가 하나도 없다면 컴파일러는 자동으로 위와같은 디폴트 생성자를 추가한다.
	public void sleep() {
        System.out.println(this.name+" zzz");
    }
	
	public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
	
	public static void main(String[] args) {
		//HouseDog dog = new HouseDog();
		//위와 같이 객체를 생성하면 오류가 발생한다. 생성자가 선언된 경우에는 객체 생성 규칙이 따로 있기 때문이다.
		HouseDog2 dog=new HouseDog2(); //생성자를 사용했을 때 얻게 되는 이득은 필수적인 행동을 객체 생성시에 제어할 수 있게 된다는 점이다.
									   //까먹고 객체 생성을 안하는 것을 방지하기 위해 만들어진 것이 생성자이다.
        System.out.println(dog.name);
	}
}
