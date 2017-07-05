package cs115;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by icyhot on 7/3/2017.
 */
public class Courses {

    private ArrayList<CourseOffering> courseList;

    public Courses() {
        courseList = new ArrayList<>();
    }

    public CourseOffering searchByName(String name) {

        return null;
    }

    public CourseOffering searchByNumber(int number) {
        int lower = 0;
        int upper = courseList.size() - 1;
        int middle;

        while(true) {
            middle = (upper - lower) / 2 + lower;

            if(courseList.get(middle).getCourseNumber() == number) {
                return courseList.get(middle);
            } else if (number > middle && number <= upper) {
                lower = middle;
            } else if (number < middle && number >= lower){
                upper = middle;
            }
        }
    }

    public void add(CourseOffering courseOffering) {
        courseList.add(courseOffering);
    }

    public ArrayList<CourseOffering> getCourseList() {
        return courseList;
    }

    public CourseOffering binarySearch(int number) {
        return null;
    }

    public CourseOffering binarySearch(String course) {

        return null;
    }
}
