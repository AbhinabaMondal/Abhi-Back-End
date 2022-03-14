class Test{
	int id;
	String name;
	boolean flag;
	static String org_Name;
	public static void main(String[] args){
		Demo d = new Demo();
		System.out.println(d.id);  // 0
		System.out.println(d.name);//null
		System.out.println(d.flag);//false
		System.out.println(org_Name);//null
		
	}

}