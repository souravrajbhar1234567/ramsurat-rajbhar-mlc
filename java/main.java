
public class main{
public static void main(String[] args) {
    int n =5;
    int j = fibonnaci(n);
    System.out.println(j);
}
public static int fibonnaci(int n){
    if(n<=1){
        return n;
    }
    return (n-1)+(n-2);
}
}