package sample;
/*各 case ラベルの後にはコロン（:）が使用され、
 *  break 文が各ケースの末尾に配置されています。
 *  これにより、一致する case ブロックが実行された後、
 *  switch文から抜け出すことができます
 */
public class SwitchSample {

    public static void main(String[] args) {
        int score = 72; // 成績

        switch (score / 10) {
            case 10: 
                System.out.println("満点です！");
                break;
            case 9: 
            case 8: 
                System.out.println("よくできました！");
                break;
            case 7: 
            case 6: 
                System.out.println("合格です！");
                break;
            default: 
                System.out.println("赤点です。。。");
        }
    }

}