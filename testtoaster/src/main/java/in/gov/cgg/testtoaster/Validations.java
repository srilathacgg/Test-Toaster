package in.gov.cgg.testtoaster;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Validations {


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

    public static boolean validateMobileNumber(EditText mobileEditText) {
        String mobilenumber = mobileEditText.getText().toString().trim();
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

    public static boolean validateEditText(EditText editText) {
        boolean flag = true;
        if (editText.getText().toString().trim() != null) {
            if (!((editText.getText().toString().trim().length() > 0))) {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }

    public static boolean validateEditText(String string) {
        boolean flag = true;
        if (string.trim() != null) {
            if (!((string.trim().length() > 0))) {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }

    public static boolean validateSpinner(Spinner spinner) {
        boolean flag = true;
        if (spinner.getSelectedItemPosition() == 0) {
            flag = false;
        } else {
            flag = false;
        }
        return flag;
    }

    public static boolean validateAadhar(String aadharNo) {
        boolean flag = true;
        if ((aadharNo != null)) {
            if (aadharNo.length() != 12 || !aadharNo.matches("[0-9]{12}"))
                flag = false;
        } else {
            flag = false;
        }
        return flag;
    }

    public static boolean validateAadhar(EditText aadharNo) {
        boolean flag = true;
        if (aadharNo!=null && (aadharNo.getText().toString().trim() != null)) {
            if (aadharNo.getText().toString().trim().length() != 12 ||
                    !aadharNo.getText().toString().trim().matches("[0-9]{12}"))
                flag = false;
        } else {
            flag = false;
        }
        return flag;
    }

    public static boolean validatePanNo(String panNo) {
        boolean flag = true;
        if ((panNo != null)) {
            if (panNo.length() != 10 || !panNo.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
                flag = false;
        } else {
            flag = false;
        }
        return flag;
    }

    public static boolean validatePanNo(EditText panNo) {
        boolean flag = true;
        if ((panNo != null) && (panNo.getText().toString().trim() != null)) {
            if (panNo.getText().toString().trim().length() != 10 ||
                    !panNo.getText().toString().trim().matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
                flag = false;
        } else {
            flag = false;
        }
        return flag;
    }
}
