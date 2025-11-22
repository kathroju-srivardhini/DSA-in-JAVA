interface Printable{
    void print();
}
interface Scannable{
    void scan();
}
class PrinterScanner implements Printable, Scannable
//This class inherits from the two classes. It is a Multiple Inheritance.
//It can be implemented using interface concept only.
{
    public void print(){
        System.out.println("Printing the document..");
    }
    public void scan(){
        System.out.println("Scanning the document..");
    }
}
class MultipleInterfacesEg{
     public static void main(String[] args){
        PrinterScanner ps=new PrinterScanner();
        ps.print();
        ps.scan();
     }
}