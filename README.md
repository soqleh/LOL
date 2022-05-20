[설명] MarkDown 작성 연습
======================

# 1. 마크다운 
[**Markdown**](https://gist.github.com/ihoneymon/652be052a0727ad59601) 를 참고

### 장점
	1. 간결하다.
	2. 별도의 도구없이 작성가능하다.
	3. 다양한 형태로 변환이 가능하다.
	4. 텍스트(Text)로 저장되기 때문에 용량이 적어 보관이 용이하다.
	5. 텍스트파일이기 때문에 버전관리시스템을 이용하여 변경이력을 관리할 수 있다.
	6. 지원하는 프로그램과 플랫폼이 다양하다.
****
# 마크다운 사용법(문법)
## 헤더Headers
* 큰제목: 문서 제목
    ```
    This is an H1 은 아래와 같이 출력된다.
    =============
    ```
    This is an H1
    =============

    ```
    This is an H2 은 아래와 같이 
    -------------
    ```
    This is an H2
    -------------

* 글머리: 1~6까지만 지원
```
# This is a H1
## This is a H2
### This is a H3
#### This is a H4
##### This is a H5
###### This is a H6 는 아래와 같이 출력된다.
```
# This is a H1
## This is a H2
### This is a H3
#### This is a H4
##### This is a H5
###### This is a H6


## BlockQuote
이메일에서 사용하는 ```>``` 블럭인용문자를 이용한다.
```
> This is a first blockqute.
>	> This is a second blockqute.
>	>	> This is a third blockqute.는 아래와 같이 출력된다.
```
> This is a first blockqute.
>	> This is a second blockqute.
>	>	> This is a third blockqute.



## 목록
### ● 순서있는 목록(번호)
순서있는 목록은 숫자와 점을 사용한다.
```
1. 첫번째
2. 두번째
3. 세번째
```
1. 첫번째
2. 두번째
3. 세번째

### ● 순서없는 목록(글머리 기호: `*`, `+`, `-` 지원)

혼합해서 사용하는 것도 가능하다(내가 선호하는 방식)

```
* 1단계
  - 2단계
    + 3단계
      + 4단계 -> 이건 아래와 같이 출력된다.
```

* 1단계
  - 2단계
    + 3단계
      + 4단계

### 코드 블럭
* 코드블럭코드("\```") 을 이용하는 방법
**깃헙**에서는 코드블럭코드("\```") 시작점에 사용하는 언어를 선언하여 [문법강조(Syntax highlighting)](https://docs.github.com/en/github/writing-on-github/creating-and-highlighting-code-blocks#syntax-highlighting)이 가능하다.

```java
public class BootSpringBootApplication {
  public static void main(String[] args) {
    System.out.println("Hello, Honeymon");
  }
}
```


## ```<hr/>```
아래 줄은 모두 수평선을 만든다. 마크다운 문서를 미리보기로 출력할 때 *페이지 나누기* 용도로 많이 사용한다.

```
* * *

***

*****

- - -

---------------------------------------
```


## 링크
* 링크
```
* [Google](https://google.com, "google link")
* 외부링크: <http://example.com/>
* 이메일링크: <address@example.com>
```
* [Google](https://google.com, "google link")
* 외부링크: <http://example.com/>
* 이메일링크: <address@example.com>

## 강조
```
*single asterisks* //italic
**double asterisks** //bold
~~cancelline~~ //취소선
```

## 이미지
```
![Alt text](/path/to/img.jpg)
![Alt text](/path/to/img.jpg "Optional title")
```
![석촌호수 러버덕](http://cfile6.uf.tistory.com/image/2426E646543C9B4532C7B0)

사이즈 조절 기능은 없기 때문에 ```<img width="" height=""></img>```를 이용한다.

예
```
<img src="/path/to/img.jpg" width="40%" height="30%" title="px(픽셀) 크기 설정" alt="RubberDuck"></img>
```
<img src="http://cfile6.uf.tistory.com/image/2426E646543C9B4532C7B0" width="40%" height="30%" title="%(비율) 크기 설정" alt="RubberDuck"></img>

## 줄바꿈
3칸 이상 띄어쓰기(` `)를 하면 줄이 바뀐다.

****
