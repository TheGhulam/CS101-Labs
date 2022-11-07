import java.util.Scanner;



public class test {
    private static String ing = "";
    public static void main(String args[]){


        // int i = 00002014;
        // int j = 2015;

        // System.out.println(i);
        // System.out.println(j);

        addIng("yeah");
        addIng("Ohh");
        addIng("yeah");

        System.out.println(ing);



    }

    public static void addIng(String i){
        ing += i + ", ";
    }

    public static void sumDivisor(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a natural number: ");
        int n = in.nextInt();
        in.close();

        int sum = 0;

        for (int i = 1; i < n; i ++){
            if ((n % i) == 0){
                sum += i;
            }
        }
        System.out.println("Sum of all proper divisors is " + sum);
    }

    public static int diethrow(){
        return (int) (Math.random() * 6) + 1;
    }

    public static String sameEnds(String string){
        int e = string.length() - 1;
        int b = string.length() / 2;

        while (--b >= 0){
            for (; b >= 0; --b){
                if (string.charAt(e) == string.charAt(b)) break;
            }
            for (int ee = e, bb = b; bb >= 0; --b, --e){
                if (string.charAt(bb) != string.charAt(ee)) break;
                if (bb == 0) return string.substring(0, b+1);
            }
        }
        return new String("");

    }

    public static void practice(){
        double change = 1, PI = 0, den = 1;
        boolean addition = true;

        while (change > 0.001){
            change = 4 * (1/den);
            den += 2;
            if (addition){
                PI += change;
                addition = false;
            }
            else{
                PI -= change;
                addition = true;
            }
        }
        System.out.println("Pi: "+ PI);

    }
    public static void aarraycopy(double[] src, int start, double[] tgt, int start2, int len){
        if (start < 0 || start + len > src.length || start2 < 0 || start2 + len > tgt.length) {
            throw new IllegalArgumentException("Out of bounds");
        }

        tgt[start2] = src[start];
        aarraycopy(src, start + 1, tgt, start2 +1, len-1);
    }
    public static void barraycopy(double[] src, int start, double[] tgt, int len){
    if (len != src.length) return;
    if (start<len){
            tgt[start] = src[start];
            barraycopy(src, start+1, tgt, len);
    }
    }
    public static void arraycopy(double[] src, int start, double[] tgt, int start2, int len){
    if (start < 0 || start + len > src.length || start2 < 0 || start2 + len > tgt.length) return;
    if (len > 0){
        tgt[start2] = src[start];
        arraycopy(src, start+1, tgt, start2+1, len-1);
    } 
    } 
    
}