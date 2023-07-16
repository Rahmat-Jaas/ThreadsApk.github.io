package com.facebook.location.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;

public class ParcelableCoordinates implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(90);
    public final double A00;
    public final double A01;
    public final Float A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r6 == null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ParcelableCoordinates(android.os.Parcel r8) {
        /*
            r7 = this;
            r1 = 0
            double r4 = r8.readDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            double r2 = r8.readDouble()
            java.lang.Double r6 = java.lang.Double.valueOf(r2)
            java.lang.Object r1 = r8.readValue(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            r7.<init>()
            if (r0 == 0) goto L_0x001f
            r0 = 1
            if (r6 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            X.AnonymousClass7Ko.A0B(r0)
            r7.A00 = r4
            r7.A01 = r2
            r7.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.parcelable.ParcelableCoordinates.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeValue(this.A02);
    }
}
