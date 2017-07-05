package cs115;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by icyhot on 7/3/2017.
 */
public class CoursesTest {
    @org.junit.Test
    public void searchByName() throws Exception {
        Courses courses = new Courses();
        for(int i = 0; i < 100; i++) {
            courses.add(new CourseOffering(i, "Math", "Jones", '3', "102", LocalTime.MIDNIGHT, 3, 25));
        }


    }

    @org.junit.Test
    public void searchByNumber() throws Exception {
        Courses courses = new Courses();
        for(int i = 0; i < 1000000; i++) {
            courses.add(new CourseOffering(i, "Math", "Jones", '3', "102", LocalTime.MIDNIGHT, 3, 25));
        }
        int rand = (int) (Math.random() * courses.getCourseList().size());
        CourseOffering courseOffering = courses.getCourseList().get(rand);

        CourseOffering courseOffering1;
        courseOffering1 = courses.searchByNumber(rand);
        System.out.println(rand);
        System.out.println(courseOffering.getCourseNumber());
        System.out.println(courseOffering1.getCourseNumber());

    }

}