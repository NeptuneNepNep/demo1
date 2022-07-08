package sample.com.atguigu;

import java.util.List;
import java.util.Map;

public class Stu {
    //注入list形
    private String[] course;
    //数组
    private List<Course> list;
    //map
    private Map<String,String> map;

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    private Course courses;
    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    public void test() {
        System.out.println(map.toString());
        System.out.println(list.toString());
        System.out.println(course.toString());

    }
}
