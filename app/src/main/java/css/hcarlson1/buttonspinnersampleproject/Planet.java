package css.hcarlson1.buttonspinnersampleproject;

/**
 * Created by hcarlson1 on 2/15/2017.
 */

public class Planet {
    private String name;
    private Double distanceFromSun;
    private Double diameter;

    public Planet(String name, Double distanceFromSun, Double diameter) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.diameter = diameter;
    }


    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(Double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceFromSun=" + distanceFromSun +
                ", diameter=" + diameter +
                '}';
    }
}
