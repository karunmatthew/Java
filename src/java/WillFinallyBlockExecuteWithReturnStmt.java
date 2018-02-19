package java;

public class WillFinallyBlockExecuteWithReturnStmt {

	public static void main(String args[])
	{
		WillFinallyBlockExecuteWithReturnStmt obj = new WillFinallyBlockExecuteWithReturnStmt();
		obj.doIt();
	}
	
	public void doIt()
	{
		try{
			
			System.out.println("In Try");
			System.exit(0);
			return;
		}
		catch(Exception e)
		{
			System.out.println("In Catch");
		}
		finally{
			System.out.println("In Finally");
		}
	}
}
