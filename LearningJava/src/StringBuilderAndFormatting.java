
public class StringBuilderAndFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The old way of printing a string is inefficient
		String info = "";

		info += "My name is Bob.";
		info += " ";
		info += "I'm a builder.";

		System.out.println(info);
		//it's not an efficient way because here three info are being created

		//StringBuilder will take it as one string
		StringBuilder sb = new StringBuilder();

		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a loin tamer.");
		
		System.out.println(sb.toString());
		
		//you can also chain string using StringBuilder
		//same text above can also be written as
		StringBuilder s = new StringBuilder();
		s.append("My Name is Sue.").append(" ").append("I am a loin tamer");
		System.out.println(s.toString());
		
		
		
		//////////ADVANCED STRING FORMATTING\\\\\\\\\\\\\\\\\\
		System.out.printf("This is a text.\tThat was a tab space.\nThis is a new Line.");
		
		//%d format specifier of int and is used in printf not in println
		
		for(int i=0; i< 20; i++)
		{
			System.out.printf("%2d\n",i);
			
			//%2d means the int is 2 digit long
			//it's just a way of formatting stings
		}
		
		//%s format specifier is used for Strings
		String str = "Hello Mate!";
		System.out.printf("%s", str);
		
		//%f is used for floating point value
		System.out.printf("\n%.2f\n",9.5);
		//.2 means how much decimal places
	}

}
