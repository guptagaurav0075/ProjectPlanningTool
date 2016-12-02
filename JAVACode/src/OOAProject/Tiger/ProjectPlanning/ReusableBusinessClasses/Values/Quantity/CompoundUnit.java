package OOAProject.Tiger.ProjectPlanning.ReusableBusinessClasses.Values.Quantity;

/**
 * Created by Abdullah Al-Shehabi on 11/2/2016.
 */
class CompoundUnit extends Unit {
    private Unit unit1;
    private Unit unit2;
    private UnitComposer composer;
    public CompoundUnit(Unit unit1, UnitComposer composer, Unit unit2) {
        super(unit1.toString() + " " + composer + " " + unit2.toString());
        this.unit1 = unit1;
        this.unit2 = unit2;
        this.composer = composer;
    }
    public Unit getUnit1() {
        return unit1;
    }
    public Unit getUnit2() {
        return unit2;
    }
    public UnitComposer getComposer() {
        return composer;
    }
}