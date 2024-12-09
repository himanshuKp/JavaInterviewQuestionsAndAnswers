package com.in28minutes.java.nullChecks;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalNullCheck {
    public static <T> T getOrDefault(Supplier<T> supplier, T defaultValue) {
        try {
            return supplier.get();
        } catch (NullPointerException e) {
            return defaultValue;
        }
    }

    public static void main(String[] args) {
        InstructorDetail instructorDetail = new InstructorDetail(null, "chandigarh", "99999999999");
        Instructor instructor = new Instructor("himanshu", 23);
        instructor.setInstructorDetail(instructorDetail);
        System.out.println(getNestedValue(instructor));
    }

    private static String getNestedValue(Instructor himanshu) {
        return Optional.ofNullable(himanshu.getInstructorDetail()).map((obj)->
                Optional.ofNullable(obj.getName()).orElse(obj.getAddress()))
                .orElse(null);
    }
}
