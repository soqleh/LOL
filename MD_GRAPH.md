MARKDOWN으로 그래프 그리기
==========================

## mermaid

### Flow chart

```mermaid
graph TD;
    A(에이)-->B[비];
    A(에이)-->C;
    B[비]-->D;
    C-->D;
```
---

```mermaid
graph TD;
    A-->B;
    A-->C;
    B-->D;
```
---

```mermaid
graph LR;
    A-->B;
    A-->C;
    B-->D;
```
---


### Sequence Diagram

```mermaid
sequenceDiagram
    participant Alice
    participant Bob
    Alice->>John: Hello John, how are you?
    loop Healthcheck
        John->>John: Fight against hypochondria
    end
    Note right of John: Rational thoughts <br/>prevail!
    John-->>Alice: Great!
    John->>Bob: How about you?
    Bob-->>John: Jolly good!
```

---

```mermaid
classDiagram
      Animal <|-- Duck
      Animal <|-- Fish
      Animal <|-- Zebra
      Animal : +int age
      Animal : +String gender
      Animal: +isMammal()
      Animal: +mate()
      class Duck{
          +String beakColor
          +swim()
          +quack()
      }
      class Fish{
          -int sizeInFeet
          -canEat()
      }
      class Zebra{
          +bool is_wild
          +run()
      }
```


---

```mermaid
classDiagram
Class01 <|-- AveryLongClass : Cool
Class03 *-- Class04
Class05 o-- Class06
Class07 .. Class08
Class09 --> C2 : Where am i?
Class09 --* C3
Class09 --|> Class07
Class07 : equals()
Class07 : Object[] elementData
Class01 : size()
Class01 : int chimp
Class01 : int gorilla
Class08 <--> C2: Cool label
```

[참고링크]<https://richwind.co.kr/147>   
[참고링크]<https://mermaid-js.github.io/mermaid/#/>
