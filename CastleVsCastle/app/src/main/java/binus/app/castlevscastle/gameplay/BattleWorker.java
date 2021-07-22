package binus.app.castlevscastle.gameplay;

import android.app.Activity;
import android.widget.Toast;

public class BattleWorker implements Runnable{

    private Castle c1, c2,c3,c4;
    private Activity a;
    public Castle winner;



    public BattleWorker(Activity ac, Castle c2, Castle c3) {
        this.a = ac;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;


        this.winner = null;
    }

    @Override
    public void run() {

        winner = c2.battleTo(c3);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Castle winner = c4.battleTo(c3);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (winner.equals(this)) {
            Toast.makeText(a.getApplicationContext(),"Winner is " + c2.CastleType,Toast. LENGTH_SHORT ).show();
        }else {
            Toast.makeText(a.getApplicationContext(),"Winner is " + c3.CastleType,Toast. LENGTH_SHORT ).show();

        }


    }

    public Castle getWinner() {

        return this.winner;

    }
}
