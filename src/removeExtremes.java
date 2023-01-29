public class removeExtremes {
    public static void main(String[] args) {

        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});;

        System.out.println(output);

    }
    public static String[] removeExtremes(String[] arr) {
        // TODO:
        // 가장 긴 문자열과 가장 짧은 문자열 변수 선언
        // 문자열을 순회하면서 해당 문자열의 길이를
        // 가장 긴 문자열과 가장 짧은 문자열과 비교하여 해당시 해당 index 값을 입력
        // splice()를 이용해 가장 긴 문자열과 가장 짧은 문자열 삭제

        // 빈배열을 입력받은 경우 null을 반환
        if(arr.length == 0) return null;

        int longest = 0;
        int longestIndex = 0;
        int shortest = 0;
        int shortestIndex = 0;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() >= longest) {
                longest = arr[i].length();
                longestIndex = i;
            }
            if(arr[i].length() <= shortest) {
                shortest = arr[i].length();
                shortestIndex = i;
            }
        }

        arr.slice(shortestIndex, longestIndex);

        return arr;
    }


}
