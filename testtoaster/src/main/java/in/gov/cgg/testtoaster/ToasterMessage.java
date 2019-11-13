package in.gov.cgg.testtoaster;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.webkit.PermissionRequest;
import android.widget.Toast;

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
}