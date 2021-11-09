package codeup.string;

/*
정보 선생님은 프로젝트 걸그룹 IOI를 매우 싫어 한다.
그 이유는 국제정보올림피아드(International Olympiad in Informatics:IOI)의 이름과 동일해서,
인터넷 검색창에 IOI를 입력할 경우 더 이상 국제정보올림피아드에 대한 정보를 찾기가 힘들어 졌기 때문이다.
입력으로 IOI가 입력될 경우, IOI is the International Olympiad in Informatics.를 출력하는 프로그램을 작성하시오.
만약 IOI가 아닌 다른 글자가 들어오는 경우, I don't care.를 출력한다.

입력
알파벳 한 단어가 입력된다.

출력
대문자 IOI가 입력되면, IOI is the International Olympiad in Informatics.를 출력하고, 그 외에는 I don't care.를 출력하시오.

입력 예시   
IOI

출력 예시
IOI is the International Olympiad in Informatics.

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1733 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.equals("IOI")) {
            System.out.println("IOI is the International Olympiad in Informatics.");
        } else {
            System.out.println("I don't care.");
        }
    }
}
