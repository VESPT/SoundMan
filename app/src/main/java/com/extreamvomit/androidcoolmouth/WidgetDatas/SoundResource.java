package com.extreamvomit.androidcoolmouth.WidgetDatas;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.extreamvomit.androidcoolmouth.R;

import java.util.ArrayList;

/**
 * Created by vesp on 16/01/09.
 */
public class SoundResource {
    private ArrayList<Integer> sRArray = new ArrayList<Integer>();
    private Context context;

    public SoundResource(Context d_context){
        context =  d_context;
        SetResource();
    }

    private void SetResource() {

        sRArray.add(R.raw.se_jankenpon);    //01
        sRArray.add(R.raw.se_aiko);    //02
        sRArray.add(R.raw.se_yahoo);    //03
        sRArray.add(R.raw.se_arigatou);    //04
        sRArray.add(R.raw.se_gomennasai);    //05
        sRArray.add(R.raw.se_kyaa);      //06
        sRArray.add(R.raw.se_true);      //07
        sRArray.add(R.raw.se_false);    //08
        sRArray.add(R.raw.takara2);     //9
        sRArray.add(R.raw.se_force);     //10
        sRArray.add(R.raw.se_coin);     //11
        sRArray.add(R.raw.se_slime);    //12
        sRArray.add(R.raw.se_eeee_oozei);   //13
        sRArray.add(R.raw.se_horror);      //14
        sRArray.add(R.raw.se_ikemen);      //15
        sRArray.add(R.raw.se_waaa_oozei);    //16

        //sRArray.add(R.raw.gundam01);    //01
        //sRArray.add(R.raw.gundam02);    //02
        //sRArray.add(R.raw.gundam03);    //03
        //sRArray.add(R.raw.gundam04);    //04
        //sRArray.add(R.raw.gundam05);    //05
        //sRArray.add(R.raw.zaku01);      //06
        //sRArray.add(R.raw.zaku02);      //07
        //sRArray.add(R.raw.se_maoudamashii_system46);    //08
        //sRArray.add(R.raw.kirameki01);     //9
        //sRArray.add(R.raw.takara2);     //10
        //sRArray.add(R.raw.z_ohayo);     //11
        //sRArray.add(R.raw.z_onakasuitayo);    //12
        //sRArray.add(R.raw.z_tetsuya);   //13
        //sRArray.add(R.raw.kirameki02);      //14
        //sRArray.add(R.raw.kirameki03);      //15
        //sRArray.add(R.raw.z_katsuo);    //16
    }

    public int getSoundResource(int i){
        if(sRArray.isEmpty()){
            Toast.makeText(context, "配列が生成されていません", Toast.LENGTH_SHORT).show();
            return -1;
        }
        else if(i>= sRArray.size()){
            Toast.makeText(context, "配列サイズを超える番号です", Toast.LENGTH_SHORT).show();
            return -1;
        }
        return sRArray.get(i);
    }

    public int getSoundSize(){
        return sRArray.size();
    }

    public boolean isEmpty(){
        return sRArray.isEmpty();
    }
}
