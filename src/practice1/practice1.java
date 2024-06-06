package practice1;

public class practice1 {
    public static void main(String[] args) {

        System.out.println("2つの数の計算を行います。");

        System.out.println("数値Aを入力してください。");
        double numA = new java.util.Scanner(System.in).nextDouble();
        System.out.println("数値Bを入力してください。");
        double numB = new java.util.Scanner(System.in).nextDouble();

        double add = numA + numB;
        System.out.println(numA + " + " + numB + " = " + add);
        double sub = numA - numB;
        System.out.println(numA + " - " + numB + " = " + sub);
        double mul = numA * numB;
        System.out.println(numA + " × " + numB + " = " + mul);
        double div = (numB != 0) ? numA / numB : Double.NaN; // Zero除算をチェック
        if (numB != 0) {
            System.out.println(numA + " ÷ " + numB + " = " + div);
        } else {
            System.out.println(numA + " ÷ " + numB + " = NaN (ゼロ除算エラー)");
        }

        double maxA = Math.max(add, sub);
        double maxB = Math.max(mul, div);

        double result = Math.max(maxA, maxB);

        System.out.println("4つの計算で、結果が最も大きいのは " + result + " です。");
    }
}
