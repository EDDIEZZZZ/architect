package study.eddie.day1.pattern.factory.factorymethod;

import study.eddie.day1.pattern.factory.ICourse;
import study.eddie.day1.pattern.factory.JavaCourse;

/**
 * @author eddie
 * @version 1.0
 * @date 2020/11/2 14:14
 * @description
 */
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
