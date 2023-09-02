

package ConstructorPerson;

import java.util.Objects;

public class Worked extends Person implements AbleToCalculatePension{
    private int minSalary;
    private int maxSalary;

    public Worked(String name, int age, double height, double weight, int money, int minSalary, int maxSalary) {
        super(name, age, height, weight, money);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }
    public int getMinSalary() {
        return minSalary;

    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }
    public int getMaxSalary() {
        return maxSalary;

    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }


    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии.");
    }


    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + " лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worked worked = (Worked) o;
        return minSalary == worked.minSalary && maxSalary == worked.maxSalary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minSalary, maxSalary);
    }

    @Override
    public String toString() {
        return "Worked{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }

    @Override
    public double calculatePension() {
        double averageSalary = CalculatorUtils.calculateAverage(maxSalary, minSalary);
        double pension = 0.25 * averageSalary;
        return pension;

    }
}



