package com.hiro11.sms;

import com.hiro11.sms.entity.Student;
import com.hiro11.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentsManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... arg) throws Exception{
		/*Student	student1 = new Student("Paisan", "Pompadech", "hiro1234@test.com");
		studentRepository.save(student1);

		Student	student2 = new Student("Kunimi", "Hiro", "hiro6789@test.com");
		studentRepository.save(student2);

		Student	student3 = new Student("Kira", "Yamato", "yamato6789@test.com");
		studentRepository.save(student3);*/
	}

}
