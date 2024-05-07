package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.opendoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillup();
        gasCar.opendoor();

        /* 메서드 오버라이딩 조건
        1. 메서드 이름 : 이름이 같아야 한다.
        2. 메서드 매개변수(파라미터) : 타입, 순서, 개수가 같아야 한다.
        3. 반환 타입 : 반환 타입이 같아야 한다. 단, 반환 타입이 하위 클래스 타입일 수 있다.
        4. 접근 제어자 : 오버라이딩 메서드의 접근 제어자는 상위 클래스의 메서드보다 더 제한적이어서는 안된다.
            - 상위 클래스 메서드가 protected로 선언되어 있으면, 하위 클래스에서는 public 또는 protected로
              오버라이드 할 수 있지만, private, default로 오버라이드 할 수 없다.
        5. 예외 : 오버라이딩 메서드는 상위 클래스의 메서드보다 더 많은 체크 예외를 throws 로 선언할 수 없다.
                 하지만 더 적거나 같은 수의 예외, 또는 하위 타입의 예외는 선언할 수 있다. (추후)
        6. static, final, private : 메서드 오버라이딩 될 수 없다.
            - static은 클래스 레벨에서 작동하므로 인스턴스 레벨에서 사용하는 오버라이딩이 의미가 없다.
              쉽게 말해서 그냥 클래스 이름을 통해 필요한 곳에 직접 접근하면 된다
            - final 메서드는 재정의를 금지한다. 상수는 값을 변경할 수 없다.
            - private 메서드는 해당 클래스 내에서만 접근 가능하기 때문에 하위 클래스에서 보이지 않는다
        7. 생성자는 오버라이딩 할 수 ㅇ벗다
         */
    }
}