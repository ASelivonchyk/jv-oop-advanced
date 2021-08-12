package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upSide;
    private double downSide;
    private double backSide;

    public IsoscelesTrapezoid(String name, String color, double upSide,
                              double downSide, double backSide) {
        super(name, color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.backSide = backSide;
    }

    public double getUpSide() {
        return upSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public double getBackSide() {
        return backSide;
    }

    public double obtainArea() {
        return Math.ceil(((upSide + downSide) / 2) * (Math.sqrt(Math.pow(backSide, 2)
                            - (Math.pow((downSide - upSide), 2) / 4))));
    }

    public void draw() {
        System.out.println("Figure: " + IsoscelesTrapezoid.this.getName() + ", "
                + "color: " + IsoscelesTrapezoid.this.getColor() + ", "
                + "up-side: " + IsoscelesTrapezoid.this.getUpSide() + " " + "units, "
                + "down-side: " + IsoscelesTrapezoid.this.getDownSide() + " " + "units, "
                + "back-side: " + IsoscelesTrapezoid.this.getBackSide() + " " + "units, "
                + "area: " + obtainArea() + " " + "sq.units");
    }
}
