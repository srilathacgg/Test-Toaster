package in.gov.cgg.testtoaster;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.view.View;
import android.webkit.PermissionRequest;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ToasterMessage {

    public static void toasterMethod(Context context, String message) {
        Toast.makeText(context, "Toast here..", Toast.LENGTH_SHORT).show();
    }

    /**
     * Check whether the internet connection is present or not. <uses-permission
     * android:name="android.permission.ACCESS_NETWORK_STATE" />
     */
    // To check whether network connection is available on device or not
    public static boolean checkInternetConnection(Activity _activity) {
        ConnectivityManager conMgr = (ConnectivityManager) _activity
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (conMgr.getActiveNetworkInfo() != null
                && conMgr.getActiveNetworkInfo().isAvailable()
                && conMgr.getActiveNetworkInfo().isConnected())
            return true;
        else
            return false;
    }
    public static void showExitFromAppAlert(final Activity _activity,
                                         String title, String alertMsg) {
        AlertDialog.Builder alert = new AlertDialog.Builder(_activity);
        alert.setTitle(title);
        alert.setCancelable(false);
        alert.setMessage(alertMsg);
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


    public static void setGradientAnimationBackground(AnimationDrawable animationDrawable,
                                                      View view, int enterDuration,int exitAnimation) {
        //add the following background to passed view in .xml file
        //android:background="@drawable/drawable_gradient_animation_list"

        animationDrawable = (AnimationDrawable) view.getBackground();

        // setting enter fade animation duration to 5 seconds
        animationDrawable.setEnterFadeDuration(enterDuration);

        // setting exit fade animation duration to 2 seconds
        animationDrawable.setExitFadeDuration(exitAnimation);
    }
}