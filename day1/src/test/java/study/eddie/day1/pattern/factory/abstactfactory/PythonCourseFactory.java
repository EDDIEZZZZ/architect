package study.eddie.day1.pattern.factory.abstactfactory;

import study.eddie.day1.pattern.factory.ICourse;

/**
 * @author eddie
 * @version 1.0
 * @date 2020/11/6 22:56
 * @description
 */
public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return null;
    }

    @Override
    public INote createNote() {
        return null;
    }

    @Override
    public IVideo createVideo() {
        return null;
    }
}
