# Iterator Pattern
> 반복자 패턴은 Collection(List, Set, Tree...)을 표현하지 않고 Collection의 요소를 탐색할 수 있도록 돕는 Behavioral Pattern 입니다. 


## 문제로 알아보는 Iterator Pattern의 필요성 
### 문제 상황 
Collection은 가장 많이 사용되는 데이터 유형이며, 각 그룹 요소들의 컨테이너 역할을 합니다.

![iterator1.png](..%2Fimages%2Fiterator%2Fiterator1.png)  
대부분의 Collection은 간단한 목록으로 저장하는 로직을 지닙니다.   
이에반해 Stack, Tree, Graph와 같이 복잡한 데이터 구조를 기반으로 하는 Collection도 존재합니다.   
Collection의 구성 방식에 제한받지 않으며 Collection에 존재하는 요소들을 액세스 할 수 있는 방법을 제공해야합니다.   
뿐만아니라 Collection에서 제공하는 기본 Method들을 사용할 수 있어야 합니다.   

![iterator2.png](..%2Fimages%2Fiterator%2Fiterator2.png)

서비스에서 Tree 구조를 사용하고 있다고 가정하겠습니다.   
Tree 요소들을 탐색하기 위해서 다양한 방식을 적용할 수 있습니다. (대표적으로 BFS / DFS가 존재합니다)   
새로운 알고리즘들을 컬렉션에 추가한다면 `데이터 저장`이라는 주요 책임이 점차 흐려집니다.  
이럴 땐 어떠한 방식을 적용해야 할까요?   

### 문제 해결
![iterator3.png](..%2Fimages%2Fiterator%2Fiterator3.png)  

Iterator 패턴을 사용해 이 문제를 해결할 수 있습니다.  
Iterator는 기본적으로 컬렉션의 요소를 가져오기 위한 기본 메서드를 제공합니다.     
이러한 Iterator를 구현해 원하는 알고리즘 방식으로 구현하면 됩니다.  
Iterator 패턴의 도입으로 인해 새로운 컬렉션 순회 방법이 생겨도 컬렉션이나 Client 코드의 변경 없이 사용할 수 있다는 장점이 있습니다.  

## 구조 

![iterator4.png](..%2Fimages%2Fiterator%2Fiterator4.png)

- Iterator
  - java는 기본적으로 Iterator를 제공합니다.
  - 컬렉션 순회에 필요한 작업을 선언합니다.
- ConcreteIterator
  - 컬렉션을 순회하기 위한 특정 알고리즘을 구현합니다. 
- Aggregate
  - Iterator 객체를 생성하는 인터페이스를 정의합니다. 
- ConcreteAggregate
  - 해당 ConcreteIterator의 인스턴스를 반환하는 Iterator 생성 인터페이스를 구현합니다. 

## 장점 및 단점 

- 장점 
    - 집합 객체가 가지고 있는 객체들에 손쉽게 접근할 수 있다. 
    - 일괄된 인터페이스를 사용해 여러 형태의 집합 구조를 순회할 수 있다. 
- 단점
  - 클래스가 늘어나고 복잡도가 증가한다. 

