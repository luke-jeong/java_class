package day10;

public class Main03 {
    public static void main(String[] args) {
        Article a1 = new Article(1);
        System.out.println(a1.toString());

        Article a2 = new Article(2, "테스트 게시물");
        System.out.println(a2.toString());

        Article a3 = new Article(3, "테스트 두번째", "자바학생");
        System.out.println(a3.toString());
    }
}
