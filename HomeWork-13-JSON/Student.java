package main.java;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
        private String name;
        private byte date;
        private char sex;
        private String group;

        public Student(String name, byte date, String group, char sex ) {
            this.name = name;
            this.date = date;
            this.group = group;
            this.sex = sex;

        }
        public Student(){};

        public void setName(String name) {
            this.name = name;
        }


        public void setDate(byte date) {
            this.date = date;
        }

        public void setSex(Character sex) {
            this.sex = sex;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getName() {
            return name;
        }

        public byte getDate() {
            return date;
        }

        public char getSex() {
            return sex;
        }

        public String getGroup() {
            return group;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return date == student.date &&
                sex == student.sex &&
                Objects.equals(name, student.name) &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, sex, group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", sex=" + sex +
                ", group='" + group + '\'' +
                '}';
    }
}


