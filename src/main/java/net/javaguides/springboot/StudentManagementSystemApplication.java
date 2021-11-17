package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.entity.Student;
import net.javaguides.springboot.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	public void run(String... args) throws Exception {
		Student student1 = new Student("Joshua", "Bohlen", "joshua@email.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Claire", "Thompson", "claire@email.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Ned", "Stark", "starky@email.com");
		studentRepository.save(student3);
	}
}
