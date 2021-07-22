package binus.app.castlevscastle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import binus.app.castlevscastle.gameplay.BattleWorker;
import binus.app.castlevscastle.gameplay.Castle;
import binus.app.castlevscastle.gameplay.HorseCastle;
import binus.app.castlevscastle.gameplay.SteelCastle;
import binus.app.castlevscastle.gameplay.StoneCastle;
import binus.app.castlevscastle.gameplay.WoodCastle;

import  java.lang.Thread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Activity myActivity = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        HorseCastle c1 = new HorseCastle();
        SteelCastle c2 = new SteelCastle();
        StoneCastle c3 = new StoneCastle();
        WoodCastle c4 = new WoodCastle();






        Castle fightingCastles[] = new Castle[2];
        fightingCastles[0] = c2;
        fightingCastles[1] = c1;
        fightingCastles[2] = c3;
        fightingCastles[3] = c4;

        initCastleImageBattle(fightingCastles);

        final Button btn = findViewById(R.id.fightNowBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                BattleWorker bw = new BattleWorker(myActivity, c2, c3);
                new Thread(bw).run();


            }
        });
    }


    private void initCastleImageBattle(Castle[] castles) {
        //assume castles has 2 armies

        Castle left = castles[0];
        Castle right = castles[1];

        loadCastleImage(findViewById(R.id.castleLeft),left);
        loadCastleImage(findViewById(R.id.castleRight),right);

    }

    private void loadCastleImage (ImageView iView, Castle ct) {
        if (ct instanceof WoodCastle) {
            iView.setBackgroundResource(R.drawable.archer);
        }else if (ct instanceof SteelCastle) {
            iView.setBackgroundResource(R.drawable.infantry);
        }else  {
            iView.setBackgroundResource(R.drawable.cavalry);
        }
    }



}