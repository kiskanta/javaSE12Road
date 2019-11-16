package ksh.dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import ksh.pojo.Student;
import ksh.pojo.StudentDestination;
import ksh.pojo.StudentSource;

public class DozerAnnotationDSL {
	public static void main(String[] args) {
		StudentSource ss = new StudentSource();
		 ss.setName("Sajal");
	     ss.setAddress("India");
	 
	     ss.getStudents().add(new Student("S1", "C1", "diffField1"));
	     ss.getStudents().add(new Student("S2", "C2", "diffField2"));
	     ss.getStudents().add(new Student("S3", "C3", "diffField3"));
	     
	     Mapper mapper = DozerBeanMapperBuilder.buildDefault();
	     StudentDestination sd = mapper.map(ss, StudentDestination.class);
	     System.out.println(sd);
	}
}
