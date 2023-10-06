class kgm{

public static void main(String args[]){

int i,j;

System.out.println("Divided by 3:");
System.out.println("");


for(i=1;i<100;i++){
	if(i%3 == 0){
	System.out.print(i + ", ");
	}

	

}
System.out.println("");
System.out.println("Divided by 5:");
System.out.println("");

for(i=1;i<100;i++){
	if(i%5 == 0){
	System.out.print(i + ", ");
	}
	

}
System.out.println("");
System.out.println("Divided by 3 & 5:");
System.out.println("");

for(i=1;i<100;i++){
	if((i%3 == 0) && (i%5 == 0)){
	System.out.print(i + ", ");
	}

}
}
}