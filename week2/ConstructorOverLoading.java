package week2;
class Cs{
	int p,q;
	public Cs() {
}
    Cs(int x,int y){
    	p=x;
    	q=y;
    	}
    public int add(int i,int j) {
    	return(i+j);
    }
    public int add (int i,int j,int k) {
    	return(i+j+k);
    }
    public float add(float f1,float f2) {
    	return(f1=f2);
    }
    public void printData() {
    	System.out.println("p=  "+p);
    	System.out.println("Q=   "+q);
    }}
    public class ConstructorOverLoading {
    	public static void main(String[] args) {
			int x=2,y=3,z=4;
			float m=7.8f,n=5.2f;
			Cs c=new Cs();
			Cs c1=new Cs(x,z);
			c1.printData();
			int k= c.add(x,y);
			int t=c.add(x, y,z);
			float ft=c.add(m, n);
			System.out.println("k=  "+k);
			System.out.println("t=  "+t);
			System.out.println("ft= "+ft);
		}

}

