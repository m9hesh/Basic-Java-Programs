class PrimeNo{
    public static void main(String args[]){
        int m=0, n=0, flag =0;
        n = 3;
        m = n/2;
      
        if(n==0 || n==1){
            System.out.println(n+" is not a prime number");
        }else{
          for(int i = 2; i <= m; i++){
              if(n%2 == 0){
                  System.out.println(n+" is not a prime number");
                  flag++;
              }
          }
          if(flag == 0){
            System.out.println(n+" is a prime number");
          }
        }
    }
}
            
      
      
