package study.eddie.day1.pattern.factory.abstactfactory;

/**
 * @author eddie
 * @version 1.0
 * @date 2020/11/6 22:52
 * @description
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.createCourse();
        courseFactory.createNote();
        courseFactory.createVideo();
        System.out.println(courseFactory);
    }
}
