package aaa;

public class Test {
	public static void main(String[] args){
		          int i=3;
		         char a ='A',b='B',c='C';
		         hanio(i,a,b,c);
		      }
		      public static void hanio(int n,char a,char b,char c){
		          if(n==1)
		             System.out.println("移动"+n+"号盘子从"+a+"到"+c);
		         else{
		             hanio(n-1,a,c,b);//把上面n-1个盘子从a借助b搬到c
		             System.out.println("移动"+n+"号盘子从"+a+"到"+c);//紧接着直接把n搬动c
		             hanio(n-1,b,a,c);//再把b上的n-1个盘子借助a搬到c
		         }
	     }
}
