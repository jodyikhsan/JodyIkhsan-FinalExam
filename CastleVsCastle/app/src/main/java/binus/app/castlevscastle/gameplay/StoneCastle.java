package binus.app.castlevscastle.gameplay;

public class StoneCastle extends Castle {


    public StoneCastle() {
        this.CastleType = Castle.Catalpult;
    }

    @Override
    public double calculatePower() {
        /**
         * Calculate power based on Armies formation and number, including heroes
         * Stone castle boost Catalpult Army by 20%
         */

        double power = 0;
        for (Army arm: this.ArmiesToBattle) {
            if (arm.ArmyType.equals(Army.Catalpult)) {
                power += arm.numbers + arm.numbers * Army.CATALPULT_BOOST;
            }else {
                power += arm.numbers;
            }
        }


        return power;
    }

    @Override
    public Castle battleTo(Castle ct2) {

        double myPower = this.calculatePower();
        double enemyPower = ct2.calculatePower();

        if (myPower >= enemyPower)
            return this;
        else
            return ct2;


    }

    @Override
    public void setArmy(Army[] Armies) {

    }
}
