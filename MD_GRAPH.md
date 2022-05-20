MARKDOWN으로 그래프 그리기
==========================

## mermain flow chart

```mermaid
graph TD;
    A(에이)-->B[비];
    A(에이)-->C;
    B[비]-->D;
    C-->D;
```

```mermaid
graph TD;
    A-->B;
    A-->C;
    B-->D;
```
```mermaid
graph LR;
    A-->B;
    A-->C;
    B-->D;
```

# Sequence Diagram

```sequence
Alice->Bob: Hello Bob, how are you?
Note right of Bob: Bob thinks
Bob-->Alice: I am good thanks!
```

```sequence
Alice->Bob: Hello Bob, how are you?
Note right of Bob: Bob thinks
Bob-->Alice: I am good thanks!
Bob->Sam: Hello Sam, Nice to see you.
Sam-->Bob: Me too.
Sam-> Alice: Hi, Alice.
Note left of Alice: Alice thinks
Alice-->Sam: I'm good.
```

```sequence
Alice->Bob: Hello Bob, how are you?
Note right of Bob: Bob thinks
Bob-->Alice: I am good thanks!
```

```flow
st=>start: Start
op=>operation: Your Operation
cond=>condition: Yes or No?
e=>end

st->op->cond
cond(yes)->e
cond(no)->op
```


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


[참고링크](https://richwind.co.kr/147)
