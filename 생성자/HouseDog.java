package 생성자;

public class HouseDog extends Dog {
	
	public HouseDog(String name) {
		this.setName(name);
	}
	//메소드명이 클래스명과 동일하고 리턴 자료형이 없는 메소드를 생성자라고 한다.

	public void sleep() {
        System.out.println(this.name+" zzz in house");
    }
	
	public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
	
	public static void main(String[] args) {
		//HouseDog dog = new HouseDog();
		//위와 같이 객체를 생성하면 오류가 발생한다. 생성자가 선언된 경우에는 객체 생성 규칙이 따로 있기 때문이다.
		HouseDog dog=new HouseDog("happy"); //생성자를 사용했을 때 얻게 되는 이득은 필수적인 행동을 객체 생성시에 제어할 수 있게 된다는 점이다.
											//까먹고 객체 생성을 안하는 것을 방지하기 위해 만들어진 것이 생성자이다.
        System.out.println(dog.name);
	}

}

/* 생성자의 규칙
 * 1.클래스명과 메소드명이 동일하다.
 * 2.리턴타입을 정의하지 않는다.
 */
