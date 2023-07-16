package com.google.android.gms.location.places;

import X.C113596rm;
import X.C117046y2;
import X.C122167Ky;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(9);
    public final String A00;
    public final String A01;
    public final int A02;
    public final String A03;

    public PlaceReport(int i, String str, String str2, String str3) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        if (!C117046y2.A01(this.A01, placeReport.A01) || !C117046y2.A01(this.A00, placeReport.A00)) {
            return false;
        }
        return C117046y2.A00(this.A03, placeReport.A03);
    }

    public final int hashCode() {
        return C86124wJ.A0I(this.A01, this.A00, this.A03);
    }

    public final String toString() {
        C113596rm r2 = new C113596rm(this);
        r2.A00(this.A01, "placeId");
        r2.A00(this.A00, "tag");
        String str = this.A03;
        if (!"unknown".equals(str)) {
            r2.A00(str, "source");
        }
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A02);
        boolean A0S = C122167Ky.A0S(parcel, this.A01);
        C122167Ky.A0H(parcel, this.A00, 3, A0S);
        C122167Ky.A0G(parcel, this.A03, A002, A0S);
    }
}
