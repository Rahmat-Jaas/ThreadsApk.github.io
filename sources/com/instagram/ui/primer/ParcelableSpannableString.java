package com.instagram.ui.primer;

import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public final class ParcelableSpannableString extends SpannableString implements Parcelable {
    public static final PCreatorCreatorShape17S0000000_I2_17 CREATOR = new PCreatorCreatorShape17S0000000_I2_17(47);
    public SpannableString A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        TextUtils.writeToParcel(this.A00, parcel, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ParcelableSpannableString(android.os.Parcel r3) {
        /*
            r2 = this;
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r1 = r0.createFromParcel(r3)
            java.lang.String r0 = "null cannot be cast to non-null type android.text.SpannableString"
            X.C04220Ms.A0C(r1, r0)
            android.text.SpannableString r1 = (android.text.SpannableString) r1
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            r2.<init>(r1)
            r2.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.primer.ParcelableSpannableString.<init>(android.os.Parcel):void");
    }
}
