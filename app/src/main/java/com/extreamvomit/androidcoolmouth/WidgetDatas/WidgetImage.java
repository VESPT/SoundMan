package com.extreamvomit.androidcoolmouth.WidgetDatas;

import android.support.v7.internal.view.menu.MenuView;
import android.util.Log;
import android.widget.ToggleButton;

import com.extreamvomit.androidcoolmouth.R;

import java.io.Serializable;

import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_01;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_02;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_03;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_04;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_05;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_06;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_07;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_08;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_09;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_10;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_11;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_12;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_13;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_14;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_15;
import static com.extreamvomit.androidcoolmouth.TypeDefine.TYPE_16;

/**
 * Created by vesp on 16/01/04.
 * WidgetImage構造体
 */
public class WidgetImage implements Serializable {
    private static final long serialVersionUID = 2L; //シリアルバージョンID

    public int nImageID; // 通常時のアイコン画像
    public int cImageID; // クリック時のアイコン画像
    public WidgetImage(int d_type){
        SearchWidgetImage(d_type);
    }

    public void SearchWidgetImage(int d_type){
        switch(d_type){
            case TYPE_01:
                //画像セット
                nImageID = R.drawable.sm_jankenpon;
                cImageID = R.drawable.sm_jankenpon;
                break;
            case TYPE_02:
                nImageID = R.drawable.sm_aiko;
                cImageID = R.drawable.sm_aiko;
                break;
            case TYPE_03:
                nImageID = R.drawable.sm_yahoo;
                cImageID = R.drawable.sm_yahoo;
                break;
            case TYPE_04:
                nImageID = R.drawable.sm_arigatou;
                cImageID = R.drawable.sm_arigatou;
                break;
            case TYPE_05:
                nImageID = R.drawable.sm_gomennasai;
                cImageID = R.drawable.sm_gomennasai;
                break;
            case TYPE_06:
                nImageID = R.drawable.sm_kyaa;
                cImageID = R.drawable.sm_kyaa;
                break;
            case TYPE_07:
                nImageID = R.drawable.sm_true;
                cImageID = R.drawable.sm_true;
                break;
            case TYPE_08:
                nImageID = R.drawable.sm_false;
                cImageID = R.drawable.sm_false;
                break;
            case TYPE_09:
                nImageID = R.drawable.sm_takara1;
                cImageID = R.drawable.sm_takara2;
                break;
            case TYPE_10:
                nImageID = R.drawable.sm_force;
                cImageID = R.drawable.sm_force;
                break;
            case TYPE_11:
                nImageID = R.drawable.sm_jump;
                cImageID = R.drawable.sm_jump;
                break;
            case TYPE_12:
                nImageID = R.drawable.sm_slime;
                cImageID = R.drawable.sm_slime;
                break;
            case TYPE_13:
                nImageID = R.drawable.sm_eeee_oozei;
                cImageID = R.drawable.sm_eeee_oozei;
                break;
            case TYPE_14:
                nImageID = R.drawable.sm_horror;
                cImageID = R.drawable.sm_horror;
                break;
            case TYPE_15:
                nImageID = R.drawable.sm_ikemen;
                cImageID = R.drawable.sm_ikemen;
                break;
            case TYPE_16:
                nImageID = R.drawable.sm_waaa_oozei;
                cImageID = R.drawable.sm_waaa_oozei;
                break;
            default:
                nImageID = -1;
                cImageID = -1;
                Log.d("WidgetImage", "WidgetImageのtypeが変です");
                break;
        }
    }
}
