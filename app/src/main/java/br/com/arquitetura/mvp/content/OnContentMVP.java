package br.com.arquitetura.mvp.content;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;

/**
 * Created by enzo.teles on 25/07/2017.
 */

public interface OnContentMVP {

    //view
    interface OnContentView{
    }

    //presenter
    interface OnContentPresenter{
    }

    //interactor
    interface OnContentInteractor{
    }
    //callback
    interface OnContentCallback{
    }
}
