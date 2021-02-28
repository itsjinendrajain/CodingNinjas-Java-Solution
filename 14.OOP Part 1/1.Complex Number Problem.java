public class ComplexNumbers {
    int a1;int a2;int real;int img;
    
    public ComplexNumbers(int a,int b){
        this.a1=a;
        this.a2=b;
    }
    void print(){
        System.out.printf("%d + i%d",this.real,this.img);
    }
    void plus(ComplexNumbers p){
        this.real=p.a1+a1;
        this.img=p.a2+a2;
    }
    void multiply(ComplexNumbers p){
        this.real=(a1*p.a1)-(a2*p.a2);
        this.img=(a1*p.a2)+(a2*p.a1);
    }
	
}