package study.eddie.day1.pattern.factory.abstactfactory;

import study.eddie.day1.pattern.factory.ICourse;

/**
 * @author eddie
 * @version 1.0
 * @date 2020/11/6 22:41
 * @description 要求所有的子工厂都实现这个工厂（一个品牌的抽象）
 */
public interface ICourseFactory {
    /**
     * 创建课程
     *
     * @return
     */
    ICourse createCourse();

    /**
     * 创建笔记
     *
     * @return
     */
    INote createNote();

    /**
     * 创建视频
     *
     * @return
     */
    IVideo createVideo();
}
