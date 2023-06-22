# 싱글턴 패턴 - Singleton Pattern
<hr>

> **💡 싱글턴 패턴은 특정 클래스의 객체 인스턴스가 하나만 만들어지도록 해 주는 패턴이다.**
> 
> **다른 어떤 클래스에서도 자신의 인스턴스를 추가로 만들지 못하게 해야하고 인스턴스가 필요하다면 반드시 클래스 자신을 거치도록 해야한다.**

### 📝 싱글턴 패턴 구현
**_Singleton.java_**
```java
public class Singleton {
    private static Singleton instance; // 1
    // 기타 인스턴스 변수 가능
    
    private Singleton() {} // 2
    
    public static Singleton getInstance() { // 3
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    // 기타 메서드 가능
}
```
1.`private static Singleton instance`
* Singleton 클래스의 하나뿐인 인스턴스를 저장하는 `static`변수.

2.`private Singleton()`
* 생성자를 private 으로 선언하고 외부에서 클래스의 인스턴스를 만들지 못한다.
* 따라서 Singleton 에서만 클래스의 인스턴스를 만들 수 있다.

3.`public static Singleton getInstance()`
* 클래스의 인스턴스를 만들어서 리턴하는 메서드.
* 해당 메서드는 외부에서 접근이 가능해야하므로 `static`
* 이 메서드를 통해서 Singleton 클래스의 유일한 하나의 인스턴스를 받을 수 있다.
* `getInstance()` 가 최초로 불리기 전까지는 instance 가 null 이다.
* 즉 인스턴스가 필요한 상황이 닥치기 전까지 아예 인스턴스를 생성하지 않게 되는 것이다. 이러한 방법을 _'게으른 인스턴스 생성(lazy instantiation)'_ 이라 부른다.

<br>

****

### 🎯 싱글턴 패턴의 목적
* 메모리의 절약을 위해 인스턴스가 필요할 때 똑같은 인스턴스를 매번 생성하지 않고 기존 하나의 인스턴스를 사용한다.
* 레지스트리 설정에 대한 정보 등 여러개일 때 문제가 생길 수 있을 때 사용한다.
* 전역 변수에 객체를 대입하면 애플리케이션이 시작될 때 바로 객체가 생성된다. 만약 객체가 자원을 많이 차지하면 비효율적이다. 필요할때 생성하는 _'게으른 인스턴스 생성(lazy instantiation)'_ 
 방법을 가진 싱글톤 패턴을 이용하면 자원을 더 효율적으로 관리할 수 있다.
* 따라서 자원을 많이 잡아먹는 인스턴스가 있으면 유용하게 쓸 수 있다.

<br>

****

### 🔎 싱글턴 패턴의 단점, 문제 및 해결법
* 위의 코드를 그대로 아중 스레드 환경에서 사용하면 문제가 생긴다. 2개 이상의 스레드가 `getInstance()`를 동시에 접근하고 `if (instance == null)`
을 통과하면 2개의 다른 인스턴스를 생성하게 된다.
  1. `synchronized Singleton getInstance()` 를 사용하여 동기화하면 된다. 한 스레드가 메서드의 사용을 끝내기 전까지는 다른 스레드가 기다린다. 
하지만 이런 동기화는 성능이 100배 정도 저하될 수 있다. 
  2. 인스턴스를 필요할 때가 아닌 처음부터 만든다.
  3. 'DLC(Double-Checked Locking' 을 사용하여 `getInstance()` 에서 동기화되는 부분을 줄인다.* 


* 클래스 로더가 두개 이상이면 각기 다른 싱글턴의 인스턴스를 가지게 될 수도 있다. 클래스 로더를 직접 지정하면 이 문제를 피할 수 있다.


* 싱글턴은 느슨한 결합 원칙에 위배된다. Singleton 에 의존하는 객체는 전부 하나의 객체에 단단하게 결합되기 때문이다.


* 단일 책임 원칙을 위배한다 (SRP: Single Responsibility Principle).


* **enum을 사용하면 싱글턴의 여러 문제를 해결할 수 있다.**