package study.eddie.day1.pattern.factory.factorymethod;

import study.eddie.day1.pattern.factory.ICourse;

/**
 * @author eddie
 * @version 1.0
 * @date 2020/11/3 15:09
 * @description
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new PythonCourseFactory();
        ICourse course = courseFactory.create();
        course.record();
    }
}
