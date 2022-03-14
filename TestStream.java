import java.util.*;  
import java.util.stream.Collectors;
public class TestStream{

	public static void main(String[] args){
	
	List<Student> studentList=new ArrayList<Student>();
	
	studentList.add(new Student(101,"aman","8482850810"));
	studentList.add(new Student(202,"oman","9595093333"));
	studentList.add(new Student(303,"Aman","8983160303"));
	studentList.add(new Student(404,"Chaman","7888086370"));
	studentList.add(new Student(505,"Kaman","9595447388"));
	studentList.add(new Student(606,"Vaman","8530544811"));
	studentList.add(new Student(707,"Raman","8888888888"));
	studentList.add(new Student(808,"aman","9373033333"));
	studentList.add(new Student(909,"akash","9595454509"));
	studentList.add(new Student(1010,"ajinkya","8983460445"));
	studentList.add(new Student(1111,"ansh","9637685807"));
	//Task 1
	System.out.println();
	long result1=studentList.stream().
			     filter(sname->sname.name.startsWith("a")).
			     count();
	System.out.println("======= Task 1 =======");		     
	System.out.println("the number of String that starts with a is : "+result1);
		
	//Task 2
	System.out.println();
	String result2=studentList.stream().
		       map(sname->sname.name.toUpperCase()).
		       collect(Collectors.joining(","));
	System.out.println("======= Task 2 =======");	
	System.out.println("Name in uppercase and Join them with coma : "+result2);
	
	//Task 3
	
	System.out.println();
	String result3=studentList.stream().
		       map(sname->sname.name).
		       collect(Collectors.joining(","));
	System.out.println("======= Task 3 =======");
	System.out.println("List<Student> to List<String> of student name : "+result3);
	
	//Task 4
	System.out.println();
	List result4=studentList.stream().
   		     filter(i->i.mobile_no.contains("3333")).
   		     collect(Collectors.toList());
	System.out.println("======= Task 4 =======");
      System.out.println("All students having mobile numbers 3333 : "+result4.toString());
      
      //Task 5
	System.out.println("======= Task 4 =======");
      List result5=studentList.stream().sorted().collect(Collectors.toList());

		}	     	
	}
