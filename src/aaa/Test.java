package aaa;

public class Test {
	public static void main(String[] args){
		          int i=3;
		         char a ='A',b='B',c='C';
		         hanio(i,a,b,c);
		      }
		      public static void hanio(int n,char a,char b,char c){
		          if(n==1)
		             System.out.println("�ƶ�"+n+"�����Ӵ�"+a+"��"+c);
		         else{
		             hanio(n-1,a,c,b);//������n-1�����Ӵ�a����b�ᵽc
		             System.out.println("�ƶ�"+n+"�����Ӵ�"+a+"��"+c);//������ֱ�Ӱ�n�ᶯc
		             hanio(n-1,b,a,c);//�ٰ�b�ϵ�n-1�����ӽ���a�ᵽc
		         }
	     }
}
