Composition 
- "hava a " Relationship
- Car must have Engine and body
- If Car destroyed, both Engine and Body are   also destroyed

(See UML Diagram on board)

class Engine{
void start() {
System.out.println("Engine Start");
}
}
class Body{
void type() {
System.out.println("Saloon Type");
}
class Car{
Engine e;
Body b;
Car () { e=new Engine();
         b= new Body();
}
void specification(){
e.start();
b.type();
}
}
class Test{
public static void main(String a[]){
Car c= new Car();
c.specification();
}
}
........................................
Same with Data Members

class Engine{
int hrp;
Engine () { }
Engine(int hp) { hrp=hp;}
void start() {
System.out.println("Engine Power "+hrp);
}
}
class Body{
int size;
Body()  {}
Body(int s){size=s;}
void type() {
System.out.println("Saloon Size "+size);
}
}
class Car{
Engine e;
Body b;
int price;
Car () { e=new Engine();
         b= new Body();
}
Car (int p,int hp,int s) { 
e=new Engine(hp);
b= new Body(s); 
price=p; 
}
void specification(){
e.start();
b.type();
System.out.println("Car Price "+price);
}
}

class Test{
public static void main(String a[]){
Car c= new Car(1000,800,5);
c.specification();

}
}
