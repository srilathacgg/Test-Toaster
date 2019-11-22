package in.gov.cgg.testtoaster;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class CustomDialogClass extends Dialog {

    public Activity c;
    public Dialog d;

    public static void showExitFromAppAlert(final Activity _activity) {
        Button BtnYes, BtnNo;
        final AlertDialog.Builder builder = new AlertDialog.Builder(_activity);
        LayoutInflater inflater = _activity.getLayoutInflater();
        final AlertDialog alertDialog = builder.create();
        final View dialogLayout = inflater.inflate(R.layout.exit_alert, null);
        BtnNo=dialogLayout.findViewById(R.id.BtnNo);
        BtnYes=dialogLayout.findViewById(R.id.BtnYes);
        BtnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _activity.moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
        BtnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation exitAnim = AnimationUtils.loadAnimation(_activity, R.anim.scale_down);//customer animation appearance
                dialogLayout.setAnimation( exitAnim );
                dialogLayout.startAnimation( exitAnim );
                alertDialog.dismiss();
            }
        });
        builder.setView(dialogLayout);
        //load animation
        //Animation transition_in_view = AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in);// system animation appearance
        Animation enterAnim = AnimationUtils.loadAnimation(_activity, R.anim.scale_up);//customer animation appearance
        dialogLayout.setAnimation( enterAnim );
        dialogLayout.startAnimation( enterAnim );
        builder.show();

    }

    public CustomDialogClass(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }


   /* used to show custom dialog
    can use R.layout.error_dialog or your custom view
    as input for parameter view .*/

    public static void showCustomAlertDialog(final Activity _activity, int view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(_activity);
        alert.setCancelable(false);
        alert.setView(view);
        alert.show();

    }
}