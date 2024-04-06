package sample;
//　IF分のネスト（処理の中のさらに制御分を含める「入れ子」構造

public class NestedIfExample {
    public static void main(String[] args) {
        int number = 30;

        if (number >= 20) {
            System.out.println("20以上");

            if (number < 40) {
                System.out.println("20以上40未満");

                if (number == 30) {
                    System.out.println("丁度30");
                }
            }
        }
    }
}
