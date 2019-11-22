package in.gov.cgg.testtoaster;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class CustomDialogClass extends Dialog
{

    public Activity c;
    public Dialog d;
    public Button yes, no;

    public static void showExitFromAppAlert(final Activity _activity) {
        AlertDialog.Builder alert = new AlertDialog.Builder(_activity);
        alert.setTitle("Confirm Exit");
        alert.setCancelable(false);
        alert.setMessage("Are you sure,you want to exit App");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                _activity.moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

            }
        });
        alert.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alert.show();
    }

    public CustomDialogClass(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }


   /* used to show error dialog
    can use R.layout.error_dialog or your custom view
    as input for parameter view .*/

    public void showCustomAlertDialog(final Activity _activity,
                                String title, String alertMsg,View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(_activity);
        alert.setTitle(title);
        alert.setCancelable(false);
        alert.setMessage(alertMsg);
        alert.setView(view);

        alert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alert.show();

    }


}