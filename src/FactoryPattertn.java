public class FactoryPattertn {
    /*
    FactoryPattertn
        [머릿말]
            - 팩토리 패턴은 생성 패턴(Creational Pattern) 중 하나이다.
            생성 패턴은 인스턴스를 만드는 절차를 추상화하는 패턴인데, 생성 패턴에 속하는 객체를 생성, 합성하는 방법이나 객체의 표현 방법을 시스템과 분리해줍니다.
            (생성 패턴은 시스템 상속보다 복합방법을 사용하는 방향으로 진화되어 가면서 더 중요해지고 있다.)

            - 생성 패턴의 중요한 이슈
                1. 생성 패턴은 시스템이 어떤 Concreate Class를 사용하는지에 대한 정보를 캡슐화합니다.
                2. 생성 패턴은 이들 클래스의 인스턴스들이 어떻게 만들고 어떻게 결합하는지에 대한 부분을 완전히 가려줍니다.
                -> 생성 패턴을 이용하면 무엇이 생성되고, 누가 이것을 생성하며, 이것이 어떻게 생성되는지, 언제 생성할 것인지 결정하는데 유연성을 확보할 수 있게 됩니다.

        [개념]
            - 여러 개의 서브 클래스를 가진 슈퍼 클래스가 있을 때 인풋에 따라 하나의 자식 클래스의 인스턴스를 리턴해주는 방식
            (객체를 생성하는 인터페이스는 미리 정의하되, 인스턴스를 만들 클래스의 결정은 서브 클래스 쪽에서 내리는 패턴)

        [종류]
            1. 간단한 팩토리 패턴(Simple Factory Pattern) : 디자인 패턴에 가깝지만 디자인 패턴은 아님
            2. 팩토리 메소드 패턴(Factory Method Pattern) : 서브클래스에서 어떤 클래스를 만들지를 결정하게 함으로써 객체 생성을 캡슐화합니다.
                -> 생산자 클래스 / 제품 클래스로 나눌 수 있다.
                -> 객체를 생성하기 위한 인터페이스를 정의하는데, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하게 만듭니다. 팩토리 메소드 패턴을 이용하면 클래스의 인스턴스를 만드는 일을 서브 클래스에게 맡기는 것이죠
            3. 추상 팩토리 패턴() : 추상 팩토리 패턴에서는 인터페이스를 이용하여 서로 연관된, 또는 의존하는 객체를 구상 클래스를 지정하지 않고도 생성할 수 있습니다.
     */
}
