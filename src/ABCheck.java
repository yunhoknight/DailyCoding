public class ABCheck {
    public static void main(String[] args) {

        String str = "TgDrnjAz6kAbdEaxFkrKIsa";



        System.out.println(ABCheck(str));
    }

    public static boolean ABCheck(String str) {
        // TODO:
        // 문자열을 문자 배열로 전환하고,
        // 문자 배열을 순회하면서 a가 있으면, 해당 문자 + 5가 b 인지 여부 리턴
        // b가 있으면, 해당문자 + 5가 a인지 여부 리턴
        // 각 문자는 절대값으로 처리

        // 결과값을 담을 boolean 변수 선언
        boolean result = false;

        // 문자열을 문자 배열로 전환
        char[] words = str.toUpperCase().toCharArray();
        // 문자배열의 길이를 나타내는 변수 선언
        int LEN = words.length;

        for (int i = 0; i < LEN; i++) {
            if (i + 4 < LEN) {
                if (words[i] == 'A') {
                    if (words[i + 4] == 'B') return true;
                } else if (words[i] == 'B') {
                    if (words[i + 4] == 'A') return true;
                }
            }
        }
        return result;
    }
}
