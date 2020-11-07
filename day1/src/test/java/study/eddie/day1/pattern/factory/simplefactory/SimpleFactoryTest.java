package study.eddie.day1.pattern.factory.simplefactory;

import study.eddie.day1.pattern.factory.CourseFactory;
import study.eddie.day1.pattern.factory.ICourse;
import study.eddie.day1.pattern.factory.JavaCourse;

/**
 * @author eddie
 * @version 1.0
 * @date 2020/11/2 14:14
 * @description
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
//        ICourse course = new JavaCourse();
//        course.record();

//        CourseFactory courseFactory = new CourseFactory();
//        ICourse course = courseFactory.create("java");
//        course.record();

        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.course(JavaCourse.class);
        course.record();

    }
}
