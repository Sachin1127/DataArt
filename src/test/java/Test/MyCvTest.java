package Test;

import org.testng.annotations.*;
import Models.MyCv;
import static org.assertj.core.api.Assertions.*;

public class MyCvTest {

    private MyCv myCv;

    @BeforeClass
    public void setupCv() {
        myCv = MyCv.builder()
                .name("Sachin Ramakrishna")
                .age(26)
                .address("Bangalore, India")
                .email("sachin.ramakrishna@example.com")
                .phone("+91-9876543210")
                .skills("Java, Appium, Selenium, TestNG, Maven")
                .education("B.Tech in Computer Science")
                .build();
    }

    @Test
    public void printCvDetails() {
        System.out.println("*****My CV*****");
        System.out.println("Name       : " + myCv.getName());
        System.out.println("Age        : " + myCv.getAge());
        System.out.println("Address    : " + myCv.getAddress());
        System.out.println("Email      : " + myCv.getEmail());
        System.out.println("Phone      : " + myCv.getPhone());
        System.out.println("Skills     : " + myCv.getSkills());
        System.out.println("Education  : " + myCv.getEducation());
    }

    @AfterClass
    public void validateCvFields() {
        assertThat(myCv.getName()).isNotBlank();
        assertThat(myCv.getAge()).isGreaterThan(0);
        assertThat(myCv.getEmail()).contains("@");
        assertThat(myCv.getSkills()).isNotEmpty();
        assertThat(myCv.getEducation()).isNotBlank();
        System.out.println("All CV fields validated successfully!");
    }
	}

