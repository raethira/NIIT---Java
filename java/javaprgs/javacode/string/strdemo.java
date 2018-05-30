class strdemo 
{
	public static void main(String[] args) 
	{
		String ka="kathir";
		String str="kathir";
		String str1="     Kathir    ";
		String str2="welcome to all";
		char ch[]={'k','a','t','h','i','r'};
		String str3=new String(ch);
		//String length()
		//System.out.println(str.length());
		//character extraction
		//System.out.println(str2.charAt(3));
		//str2.getChars(3,4,ch,0);
		//String comaparision
		//System.out.println(str1.equals(str));
		//System.out.println(str.equals(ka));
		//System.out.println(str.equalsIgnoreCase(str1));
		//System.out.println(str==str3);
		//System.out.println(str2.startsWith("W",1));
		//System.out.println(str2.endsWith("l"));
		//Seaching Technique
		//System.out.println(str2.indexOf(4));
		//System.out.println(str2.lastIndexOf(3));
		//Modifing String
		//System.out.println(str2.substring(4));
		//System.out.println(str2.concat(str3));
		//System.out.println(str2.replace('w','W'));
		//System.out.println(str1.trim());
		//System.out.println(str2.valueOf("kathr"));
		//System.out.println(str.valueOf(3));
		//String Buffer
		StringBuffer sb=new StringBuffer("csccomputereducatuion");
		//System.out.println(sb);
		//extra
		//System.out.println(sb.length());
		//System.out.println(sb.capacity());
		//System.out.println(sb.append("aaaa"));
		//System.out.println(sb.insert(7,"kathir"));
		//System.out.println(sb.delete(7,15));
		System.out.println(sb.replace(7,14,"javaj2ee"));
		System.out.println(str2.hashCode());
		System.out.println(str1.toUpperCase());
		System.out.println(sb.reverse());
	}
}
