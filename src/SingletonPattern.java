public class SingletonPattern {
    /*
    SingletonPattern
        [개념]
            - 싱클턴 패턴은 해당 클래스의 인스터스가 하나만 만들어지고, 어디서든지 그 인스턴스에 접근할 수 있도록 하기 위한 패턴입니다.

        [문제]
            - 멀티스레딩 문제
                - 각각의 쓰레드에서 객체를 생성할 때 if문 검사 당시에는
                  UniqueInstance값이 null이어서 객체가 쓰레드별도 생성되어 싱클톤 패턴을 위배하는 경우가 발생

                  [해결방안]
                        - ... public static syschronized Singleton getInstance(){
                                    ...
                              }
                                    -> syschronized(동기화)로 멀티스레딩 문제 해결 -> 속도의 문제 발생


        [문제 해결에 대한 다양한 방법]
            - 싱글톤을 사용하였을 때 문제가 발생에 대한 해결책
                1. syschronized(동기화)를 사용한다. -> getInstance()의 속도가 그리 중요하지 않다면 그냥 둡니다.
                    [예제]
                        public class Singleton{
                            private static Singleton uniqueInstance;

                            //기타 인스턴스 변수

                            private Singleton(){}

                            public static syschronized Singleton getInstance(){
                                if(uniqueInstance == null){
                                uniqueInstance = new Singleton();
                                return uniqueInstance;
                            }
                            //기타 메소드
                        }

                2. 인스턴스를 필요할 때 생성하지말고, 처음부터 만들어 버립니다.
                    [예제]
                        public class Singleton{
                            private static Singleton uniqueInstance = new Singleton();

                            private Singleton(){}

                            public static Singleton getInstance(){
                                return uniqueInstance;
                            }
                        }

                3. DCL(Double-Checking-Locking)을 써서 getInstance에서 동기화되는 부분을 줄입니다.
                    [개념]
                        - DCL을 사용하면, 일단 인스턴스가 생성되어 있는지 확인한 다음, 생성되어 있지 않았을 때만 동기화를 할 수 있습니다.
                          이렇게 하면 처음에만 동기화를 하고 나중에는 동기화를 하지 않아도 됩니다.

                          [예제]
                                public class Singleton{
                                    private volatile static Singleton uniqueInstance;

                                    private Singleton(){}

                                    public Static Singleton getInstance(){
                                        if( uniqueInstance == null ){
                                            syschronized (Singleton.class){
                                                if( uniqueInstance == null ){
                                                    uniqueInstance = new Singleton();
                                                }
                                            }
                                        }
                                        return uniqueInstance;
                                    }
                                }

    */
}
