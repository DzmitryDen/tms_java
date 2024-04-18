package users;

public enum Profession {

    DIRECTOR(2.0, 1000.0),
    WORKER(1.0, 200.0),
    HR(1.5, 500.0);

    private Double coefficient;
    private Double bonus;


    Profession(Double coefficient, Double bonus) {
        this.coefficient = coefficient;
        this.bonus = bonus;
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public Double getBonus() {
        return bonus;
    }
}