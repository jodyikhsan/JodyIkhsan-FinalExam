package binus.app.castlevscastle.gameplay;

public abstract class Castle {
    public static final String Infantry = "INFANTRY";
    public static final String Cavalry = "CAVALRY";
    public static final String Archer = "ARCHER";
    public static final String Catalpult = "CATALPULT";

    public String CastleType;
    public Heroes[] Heroes;
    public Army[] Armies;

    public Army[] ArmiesToBattle;


    public String getCastleType() {
        return this.CastleType;
    }

    public abstract double calculatePower();

    public abstract Castle battleTo(Castle ct2);

    public abstract void setArmy(Army[] Armies);




}
