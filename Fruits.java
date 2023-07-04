class Fruits{

int a;
int b;

void sweet(int a,int b){
int c=a+b;
System.out.println("Addition"+c);
}
void Sweet1(int x,int y){
    int z=x-y;
    System.out.println("Substraction"+z);
}

public static void main(String[] args){

Fruits fav=new Fruits();
fav.sweet(65,25);
fav.Sweet1(95,75);

}

}