package hw4;

public class Q2 {
	public static void main(String[] args) {
        String s = "Hello World";
        char[] charArray = s.toCharArray();//把字串轉陣列
        reverseCharArray(charArray);//把陣列帶入方法
        String reversed = new String(charArray);//定義新的反轉字串
        System.out.println(reversed);
    }
	public static void reverseCharArray(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];//H=char[0]
            chars[left] = chars[right];//右的放到左
            chars[right] = temp;//char[10]=H
            left++;
            right--;
        }
    }
}







