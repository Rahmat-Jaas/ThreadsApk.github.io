package com.facebookpay.form.cell.text.formatter;

import X.C86124wJ;
import X.C87144zu;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

public class DateFormatter implements TextFormatter {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(60);
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
            try {
                if (editable.length() == 1 && Integer.parseInt(editable.toString()) > 1) {
                    editable.insert(0, "0");
                }
            } catch (NumberFormatException unused) {
            }
            for (Object removeSpan : editable.getSpans(0, editable.length(), C87144zu.class)) {
                editable.removeSpan(removeSpan);
            }
            try {
                if (editable.length() == 2 && Integer.parseInt(editable.toString()) > 12) {
                    editable.insert(0, "0");
                }
            } catch (NumberFormatException unused2) {
            }
            if (2 <= editable.length()) {
                editable.setSpan(new C87144zu("/"), 1, 2, 33);
            }
            this.A00 = false;
        }
    }

    public DateFormatter(Parcel parcel) {
    }

    public DateFormatter() {
    }
}
