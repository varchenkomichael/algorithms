package com.varchenko.collections.basic;

import java.util.Objects;

public class User implements Comparable<User> {
    private final int age;
    private final String name;
    private final String gender;

    public User(int age, String name, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == (user.age) && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "name = " + name + "; " + "gender = " + gender + "; " + "age = " + age;
    }

    @Override
    public int compareTo(User o) {
        int ageCompare = this.age - o.age;
        if (ageCompare == 0) {
            return this.name.compareTo(o.name);
        }
        return ageCompare;
    }
}
