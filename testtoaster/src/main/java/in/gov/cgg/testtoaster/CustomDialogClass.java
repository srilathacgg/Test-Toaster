package in.gov.cgg.testtoaster;

import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class CustomDialogClass extends Dialog {

    public Activity c;
    public Dialog d;

    public static void showSuccessDialog(final Activity _activity, String message) {
        LayoutInflater factory = LayoutInflater.from(_activity);
        final View view = factory.inflate(R.layout.success_dialog, null);
        final android.app.AlertDialog.Builder builder1 = new android.app.AlertDialog.Builder(_activity);
        builder1.setView(view);
        final android.app.AlertDialog alert11 = builder1.create();
        alert11.show();
        TextView BtnOk;
        TextView tv_errorMsg;
        BtnOk=view.findViewById(R.id.BtnOk);
        tv_errorMsg=view.findViewById(R.id.tv_errorMsg);
        tv_errorMsg.setText(message);
        BtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert11.dismiss();
            }
        });
    }

    public static void showErrorDialog(final Activity _activity, String message) {
        LayoutInflater factory = LayoutInflater.from(_activity);
        final View view = factory.inflate(R.layout.error_dialog, null);
        final android.app.AlertDialog.Builder builder1 = new android.app.AlertDialog.Builder(_activity);
        builder1.setView(view);
        final android.app.AlertDialog alert11 = builder1.create();
        alert11.show();
        TextView BtnOk;
        TextView tv_errorMsg;
        BtnOk=view.findViewById(R.id.BtnOk);
        tv_errorMsg=view.findViewById(R.id.tv_errorMsg);
        tv_errorMsg.setText(message);
        BtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert11.dismiss();
            }
        });
    }

    public static void showWarningDialog(final Activity _activity, String message) {
        LayoutInflater factory = LayoutInflater.from(_activity);
        final View view = factory.inflate(R.layout.warning_dialog, null);
        final android.app.AlertDialog.Builder builder1 = new android.app.AlertDialog.Builder(_activity);
        builder1.setView(view);
        final android.app.AlertDialog alert11 = builder1.create();
        alert11.show();
        TextView BtnOk;
        TextView tv_errorMsg;
        BtnOk=view.findViewById(R.id.BtnOk);
        tv_errorMsg=view.findViewById(R.id.tv_errorMsg);
        tv_errorMsg.setText(message);
        BtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert11.dismiss();
            }
        });
    }

    public CustomDialogClass(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    /* used to show custom dialog with dismiss action
        'mainview' is the id of layout to be inflated
         'dismissView' is the id of view on click of which the dialog is dismissed.*/
    public static void showCustomDialogWithDismiss(final Activity _activity,int mainview,int dismissActionViewId) {
        LayoutInflater factory = LayoutInflater.from(_activity);
        final View view = factory.inflate(mainview, null);
        final android.app.AlertDialog.Builder builder1 = new android.app.AlertDialog.Builder(_activity);
        builder1.setView(view);
        final android.app.AlertDialog alert11 = builder1.create();
        alert11.show();
        View dismissView=view.findViewById(dismissActionViewId);
        dismissView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert11.dismiss();
            }
        });
    }


   /* used to show custom dialog
    can use your custom view
    as input for parameter "view" .*/

    public static void showCustomAlertDialog(final Activity _activity, View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(_activity);
        alert.setCancelable(false);
        alert.setView(view);
        alert.show();

    }
}