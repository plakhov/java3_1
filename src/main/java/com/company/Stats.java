package com.company;

public class Stats {
    private Object[] nums;

    public Stats(Object... nums) {
        this.nums = nums;
    }

    public double average(){
        double sum =0.0;
        for (int i = 0; i < nums.length; i++) {
            Object value = nums[i];
            Number numberValue = null;
            if (value instanceof Number) {
                numberValue = (Number) value;
            }
            sum+=numberValue.doubleValue();
        }
        return sum/ nums.length;
    }

    public boolean sameAverage(Stats another) {
        return Math.abs(this.average() - another.average()) < 0.0001;
    }


}
