//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
static int square(int n){
    return n*n;
 }
 public static void main(String[] args){
    int number =5;
    if(number%2==0){
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }
    for(int i=1;i<=5;i++){
        System.out.println(i);
     }
    int ans=square(number);
    System.out.println("Square="+ans);
 }