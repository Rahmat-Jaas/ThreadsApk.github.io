package com.facebookpay.form.cell.text.formatter;

import X.AnonymousClass69W;
import X.C04220Ms;
import X.C86124wJ;
import X.C87144zu;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

public final class CreditCardFormatter implements TextFormatter {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(59);
    public int A00;
    public int A01;
    public boolean A02;

    public final void afterTextChanged(Editable editable) {
        int[] iArr;
        C04220Ms.A0B(editable, 0);
        if (!this.A02) {
            this.A02 = true;
            C87144zu[] r3 = (C87144zu[]) editable.getSpans(0, editable.length(), C87144zu.class);
            C04220Ms.A04(r3);
            for (C87144zu removeSpan : r3) {
                editable.removeSpan(removeSpan);
            }
            AnonymousClass69W A002 = AnonymousClass69W.A00(editable.toString());
            C04220Ms.A06(A002);
            if (editable.length() > A002.A00) {
                int i = this.A01;
                editable.delete(i, this.A00 + i);
            }
            if (A002 == AnonymousClass69W.AMERICAN_EXPRESS) {
                iArr = AnonymousClass69W.A06;
            } else {
                iArr = AnonymousClass69W.A07;
            }
            int length = editable.length();
            for (int i2 : iArr) {
                if (i2 <= length) {
                    editable.setSpan(new C87144zu(" "), i2 - 1, i2, 33);
                }
            }
            this.A02 = false;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i3;
    }

    public CreditCardFormatter(Parcel parcel) {
    }

    public CreditCardFormatter() {
    }
}
