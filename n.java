public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int m = 2;
        int n = 1;
        int count = 0;
        if (Math.floor(n/2)==0 || n==0) {
            count++;
            n--;
            System.out.println("count_0="+count);
        } else if (Math.floor(m/2)==0 || m==0) {
            count++;
            m--;
        }
        while (n!=0 || m!=0) {
            int x = m%2;
            int y = n%2;
            
            if (Math.floor(m/2)!=0 && Math.floor(n/2)!=0) {
                if (x!=y) {
                    count++;
                }
                m=(int)Math.floor(m/2);
                n=(int)Math.floor(n/2);
            }
            if (n>=m && Math.floor(m/2)==0) {
                System.out.println("n="+n);
                System.out.println("y="+y);
                System.out.println("count_3="+count);
                if (y==1) {
                    count++;
                    System.out.println("count_4="+count);
                }
                n=(int)Math.floor(n/2);
            } else if (n<m && Math.floor(n/2)==0) {
           // if (Math.floor(n/2)==0 && Math.floor(m/2)!=0) {
                m=(int)Math.floor(m/2);
                if (x==1) {
                    count++;
                    System.out.println("count_5="+count);
                }
            }
            System.out.println("count_f="+count);
        }
        System.out.println("count_2="+count);
     }
}
