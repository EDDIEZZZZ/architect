package study.eddie.day1.pattern.factory;

/**
 * @author eddie
 * @version 1.0
 * @date 2020/11/2 14:14
 * @description
 */
public class CourseFactory {

    /**
     * 工厂创建方法
     *
     * @param name
     * @return JavaCourse对象
     */
    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else {
            return null;
        }
    }

    public ICourse course(Class clazz) {
        try {
            if (null != clazz) {
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
