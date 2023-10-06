class St7{
	int id;
    String name;
    St7(int i, String n){
    id = i;
    name = n;
    }
    St7(){}
    void display(){System.out.println(id+" "+name);}
    public static void main(String args[]){
    	St7 obj = new St7(100,"Aravinth");
        St7 obj1 = new St7();
        obj1.id = obj.id;
        obj1.name = obj.name;
        obj.display();
        obj1.display();
}
}