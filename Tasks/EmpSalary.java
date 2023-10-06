class EmpSalary{
	int eid;
	String ename;
	long phno;
	static String mgr;
EmpSalary(int eid,String ename,long phno,String mgr)
{
	this.eid = eid;
	this.ename = ename;
	this.phno = phno;
	this.mgr = mgr;
}
	void display(){
	System.out.println("id:" + eid +  "  ename:" + ename +  "  phno:" + phno +  "  mgr:"+mgr);}
	public static void main(String args[]){

	EmpSalary Ammu = new EmpSalary(501,"Ammu",9876543210l,"Bhanu");
	EmpSalary Shailu = new EmpSalary(502,"Shailu",9876543201l,"Bhanu");
	EmpSalary Paaru = new EmpSalary(503,"Paaru",9876542310l,"Bhanu");
	Ammu.display();
	Shailu.display();
	Paaru.display();

}
}