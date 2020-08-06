package com.oracle.intelagr.service;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*有如下List
        List list = new ArrayList();
        list.add(new Student("Tom", 18, 100, "class05"));
        list.add(new Student("Jerry", 22, 70, "class04"));
        list.add(new Student("Owen", 25, 90, "class05"));
        list.add(new Student("Jim", 30,80 , "class05"));
        list.add(new Student("Steve", 28, 66, "class06"));
        list.add(new Student("Kevin", 24, 100, "class04"));
        在这个list 的基础上，完成下列要求：
        1） 计算各个班级的平均分
        class05:3个学生，总分：，平均分：
        class04:3个学生，总分：，平均分：
        class06:3个学生，总分：，平均分：
        2）在控制台按班级显示学生：例如：
        class05
                Tom
        Owen
                Jim
        class04
                Jerry
        Kevin
                class06
        Steve*/
        List<Student> list = new ArrayList();
        list.add(new Test().new Student("Tom", 18, 100, "class05"));
        list.add(new Test().new Student("Jerry", 22, 70, "class04"));
        list.add(new Test().new Student("Owen", 25, 90, "class05"));
        list.add(new Test().new Student("Jim", 30,80 , "class05"));
        list.add(new Test().new Student("Steve", 28, 66, "class06"));
        list.add(new Test().new Student("Kevin", 24, 100, "class04"));
        List<Map> resultList = new ArrayList<Map>();
        Map classMap = new HashMap();
        for(Student s:list){
            if(classMap.get(s.clsName)==null){
                List studentList = new ArrayList();
                studentList.add(s);
                classMap.put(s.clsName,studentList);
                Map m = new HashMap();
                m.put("parent",s.clsName);
                m.put("child",studentList);
                resultList.add(m);
            }else{
                List studentList = (List)classMap.get(s.clsName);
                studentList.add(s);
            }
        }
        System.out.println(resultList);
        /*Set<String> set = new HashSet<String>();
        for(Student s:list){
            set.add(s.clsName);
        }
        for(String clsName:set){
            System.out.println(clsName+":");
            for(Student s:list){
                if(clsName.equals(s.clsName)){
                    System.out.println("\t"+s.name);
                }
            }
        }*/




    }
    public class Student{
        String name;
        int age;
        int score;
        String clsName;

        public Student(String name, int age, int score, String clsName) {
            this.name = name;
            this.age = age;
            this.score = score;
            this.clsName = clsName;
        }

        @Override
        public String toString() {
            return name+"-"+age+"-"+score+"-"+clsName;
        }
    }
}
