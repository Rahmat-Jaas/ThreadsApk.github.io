package com.facebookpay.form.cell.text.formatter;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

public class NameFormatter implements TextFormatter {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(61);
    public boolean A00;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final int describeContents() {
        return 0;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.A00) {
            this.A00 = true;
            if (editable.length() >= 1 && editable.toString().trim().isEmpty()) {
                editable.clear();
            }
            this.A00 = false;
        }
    }

    public NameFormatter(Parcel parcel) {
    }

    public NameFormatter() {
    }
}
