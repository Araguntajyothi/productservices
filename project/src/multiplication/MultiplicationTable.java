package multiplication;

//changing the structure of the code without changing it's functionality is refactoring.
public class MultiplicationTable {
	void print()
	{
		print(5);
		// or we can write
		// print(5,1,10);//this is to avoid duplication
		// for(int i=1;i<=10;i++) {
			
		// System.out.printf("%d*%d=%d",5,i,5*i).println();
		// }
	}
		void print(int table)
		{
		print(table, 1, 10);// to avoid duplication
		// for(int i=1;i<=10;i++) {

		// System.out.printf("%d*%d=%d",5,i,5*i).println();
		// }
		
	}
		void print(int table,int from,int to)
		{
			for(int i=from;i<=to;i++) {
				
			System.out.printf("%d*%d=%d",table,i,table*i).println();
			}

}
}
