class Student{

	int id;
	String name;
	String mobile_no;
	
	public Student(int id,String name,String mobile_no){
	
		this.id=id;
		this.name=name;
		this.mobile_no=mobile_no;
		}
		 @Override
    public String toString() {
        return name;
    }
	}
