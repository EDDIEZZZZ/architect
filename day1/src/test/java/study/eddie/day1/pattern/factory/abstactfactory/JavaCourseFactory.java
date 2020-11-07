package study.eddie.day1.pattern.factory.abstactfactory;

import study.eddie.day1.pattern.factory.ICourse;
import study.eddie.day1.pattern.factory.JavaCourse;

/**
 * @author eddie
 * @version 1.0
 * @date 2020/11/6 22:46
 * @description
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
