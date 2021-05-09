package java_study;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    /*
        stream은 컬렉션즈가 데이터를 가지고 있다면 
        이 데이터를 전달받아 처리하는 것이다.
        stream은 데이터를 담고 있는 컬렉션이 아니다.
        stream은 함수적이다.(소스를 바꾸지 않는다.)
        스트림은 오직 한번만 처리한다.
        무제한일 수 있다.(Short Circuit 메서드를 사용하여 제한)
        중개 오퍼레이션은 lazy하다. 
        중개 오프레이션은 종료 오퍼레이션이 오지 않으면 실행되지 않는다.
        손쉽게 병렬 처리가 가능하다. parallelStream을 이용하여 병렬처리 가능  
    */
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("Yoo");
        names.add("Lee");
        names.add("JongHyun");
        names.add("HanSystem");

        // Stream<String> strStream = names.stream().map(String::toUpperCase);
        List<String> collet = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());
        //collect가 종료 오퍼레이션이다. collect를 해주지 않으면 대문자로 변경되지 않는다.
        
        collet.forEach(System.out::println);
    }
}
