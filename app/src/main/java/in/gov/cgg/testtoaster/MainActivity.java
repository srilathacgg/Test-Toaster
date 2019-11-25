package in.gov.cgg.testtoaster;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean flag = validateMobileNumber("6877656556");
        if (flag)
            Toast.makeText(this, "valid", Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    }

    public static boolean validateMobileNumber(String mobilenumber) {
        boolean flag = true;
        if (mobilenumber != null) {
            if (!(
                    (mobilenumber.length() == 10)
                            && (
                            (mobilenumber.startsWith("9"))
                                    || (mobilenumber.startsWith("8"))
                                    || (mobilenumber.startsWith("7"))
                                    || (mobilenumber.startsWith("6")))
            )) {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }
}
