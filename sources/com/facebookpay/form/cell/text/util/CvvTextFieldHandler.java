package com.facebookpay.form.cell.text.util;

import X.AnonymousClass69W;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import com.facebook.redex.PCreatorCreatorShape3S0000000_I2_3;

public final class CvvTextFieldHandler implements TextFieldHandler {
    public static final PCreatorCreatorShape3S0000000_I2_3 CREATOR = C86124wJ.A0X(64);
    public final AnonymousClass69W A00;

    public final boolean BO4(String str, String str2) {
        String str3;
        if (str != null && str2 != null && str2.length() > 0 && !str.equals(str2)) {
            if (this.A00 == AnonymousClass69W.AMERICAN_EXPRESS) {
                str3 = "••••";
            } else {
                str3 = "•••";
            }
            return !str2.equals(str3);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        AnonymousClass69W r0 = this.A00;
        if (r0 != null) {
            str = r0.name();
        } else {
            str = null;
        }
        parcel.writeString(str);
    }

    public CvvTextFieldHandler(AnonymousClass69W r1) {
        this.A00 = r1;
    }
}
