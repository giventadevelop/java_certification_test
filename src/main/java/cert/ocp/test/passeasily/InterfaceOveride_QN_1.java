package cert.ocp.test.passeasily;

public class InterfaceOveride_QN_1 {
	
	
	
	
	
	public static void main(String[] args) {

	int [] arr={1,2,3,4};
	
	int i=0;
	
	do{
		System.out.print(arr[i]+ "");
		i++;
	}while(i<arr.length-1);
	
	}

}


class Tool implements Exportable {
protected void export () { //laine nl
System. out.println (“Tool: :export”) ;
}
}
class ReportTool extends Tool implements Exportable {
public void export() { //line n2
System.out.println("RTool: :export") ;
}
public static void main(String[] args) {
Tool aTool = new ReportTool () ;
Tool bTool = new Tool();
callExport (aTool) ;
callExport (bTool) ;
}
public static void callExport (Exportable ex) {
ex.export();
}
}
