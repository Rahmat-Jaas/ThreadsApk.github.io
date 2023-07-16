package com.google.android.gms.internal.location;

import X.C122167Ky;
import X.C18190wL;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(97);
    public final String A00;
    public final double A01;
    public final double A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final short A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof zzbg)) {
                zzbg zzbg = (zzbg) obj;
                if (!(this.A03 == zzbg.A03 && this.A01 == zzbg.A01 && this.A02 == zzbg.A02 && this.A08 == zzbg.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A01);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        return ((C86104wH.A05(C86104wH.A06(i * 31, Double.doubleToLongBits(this.A02)), this.A03) + this.A08) * 31) + this.A04;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        if (this.A08 != 1) {
            str = null;
        } else {
            str = "CIRCLE";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[]{str, this.A00.replaceAll("\\p{C}", "?"), Integer.valueOf(this.A04), Double.valueOf(this.A01), Double.valueOf(this.A02), Float.valueOf(this.A03), Integer.valueOf(this.A05 / 1000), Integer.valueOf(this.A06), Long.valueOf(this.A07)});
    }

    public zzbg(String str, double d, double d2, float f, int i, int i2, int i3, long j, short s) {
        if (str == null || str.length() > 100) {
            throw C18190wL.A0a(C86104wH.A0w(str, "requestId is null or too long: "));
        } else if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            StringBuilder A0s = C86114wI.A0s(31);
            A0s.append("invalid radius: ");
            A0s.append(f);
            throw C18190wL.A0a(A0s.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder A0s2 = C86114wI.A0s(42);
            A0s2.append("invalid latitude: ");
            A0s2.append(d);
            throw C18190wL.A0a(A0s2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder A0s3 = C86114wI.A0s(43);
            A0s3.append("invalid longitude: ");
            A0s3.append(d2);
            throw C18190wL.A0a(A0s3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.A08 = s;
                this.A00 = str;
                this.A01 = d;
                this.A02 = d2;
                this.A03 = f;
                this.A07 = j;
                this.A04 = i4;
                this.A05 = i2;
                this.A06 = i3;
                return;
            }
            throw C18190wL.A0a(C86104wH.A10("No supported transition specified: ", C86114wI.A0s(46), i));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0H(parcel, this.A00, 1, false);
        C122167Ky.A09(parcel, 2, this.A07);
        short s = this.A08;
        parcel.writeInt(262147);
        parcel.writeInt(s);
        double d = this.A01;
        parcel.writeInt(524292);
        parcel.writeDouble(d);
        double d2 = this.A02;
        parcel.writeInt(524293);
        parcel.writeDouble(d2);
        C122167Ky.A04(parcel, this.A03, 6);
        C122167Ky.A08(parcel, 7, this.A04);
        C122167Ky.A08(parcel, 8, this.A05);
        C122167Ky.A08(parcel, 9, this.A06);
        C122167Ky.A05(parcel, A002);
    }
}
