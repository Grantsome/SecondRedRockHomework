class Human{
	String Name;
	String Sex;
	int Age = 18;
	
	public String getName(){
		return Name;
	}
	
	public void setName(){
		this.Name = Name;
	}
	
	public String getSex(){
		return Sex;
	}
	
	public void setSex(){
		this.Sex = Sex;
	}
	
	public int getAge(){
		return Age;
	}
	
	public void setAge(){
		this.Age = Age;
	}
	
	public void introduce(){
		System.out.println("我的名字是" + Name + ",我的年龄是" + Age +",我的性别是" + Sex);
	}
}
