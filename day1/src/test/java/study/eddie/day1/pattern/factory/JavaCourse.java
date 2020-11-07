package study.eddie.day1.pattern.factory;

/**
 * @author eddie
 * @version 1.0
 * @date 2020/11/2 14:14
 * @description
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制java课程");
    }
}
