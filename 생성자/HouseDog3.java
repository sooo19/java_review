//생성자 오버로딩: 하나의 클래스에 여러 개의 입력항목이 다른 생성자를 만들 수 있다.
package 생성자;

public class HouseDog3 extends Dog {
    public HouseDog3(String name) {	//생성자 1
        this.setName(name);
    }

    public HouseDog3(int type) {	//생성자 2
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    public void sleep() {
        System.out.println(this.name+" zzz in house");
    } 

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    } 

    public static void main(String[] args) {
        HouseDog3 happy = new HouseDog3("happy");	//생성자 1을 통해 happy 이름 저장
        HouseDog3 yorkshire = new HouseDog3(1);		//생성자 2를 통해 yorkshire 선택
        System.out.println(happy.name);
        System.out.println(yorkshire.name);	//이름들 출력
    }
}
