/*두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.

        예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다. 다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
        두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.

        제한사항
        3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
        X, Y는 0으로 시작하지 않습니다.
        X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.*/


package 숫짜짝꿍;

public class Solution {
}

/* 너무 어려워서 일단 보류

#공부하면서 깨달은 것

1. charAt()이라는 녀석이다.
이 녀석은 String으로 저장된 문자열 중에서 한 글자만 선택해서
char타입으로 변환해주는 녀석이다.
ex) str = String "안녕하세요"
    char c = " "
    c = str.charAt(0)
    System.out.println(c)

    출력값 : "안"

숫자 받기
숫자로 받는 방법입니다
a를 0으로 입력한 후 b에서 숫자로 받습니다
- 48을 하는 이유는 숫자 0-9까지는 유니코드상 48-57입니다
그래서 48을 빼서 b에서 숫자 0을 집어넣었습니다

    String a = "0"
    int b = a.charAt(0)-48
    System.out.println(b)

    출력값 : 0

2. toString 메서드는 Object클래스의 메서드로
객체를 String(문자열) 타입으로 변경시켜준다

3. Integer.parseInt(Stiring s)
   숫자형의 문자열 b를 10진수의 integer값으로 변경해줌

4. append 메서드(String 클래스의 concat메서드와 같은 기능이지만 속도가 빠르다고 함)
    append()메서드는 문자열 맨끝에 문자를 붙여주는 메서드임
    StringBuffer 클래스의 메서드이므로 임포트 해줘야함

    (ex)
public class Main{
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("Java");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.append("왕이 되고 싶어요!"));
        System.out.println("append() 메소드 이후 문자열 : " + str);
    }
}

    출력값 :
    원본 문자열 : Java
    Java왕이 되고 싶어요!
    append() 메소드 이후 문자열 : Java왕이 되고 싶어요!

 */
