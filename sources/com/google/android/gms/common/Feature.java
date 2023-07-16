package com.google.android.gms.common;

import X.C113596rm;
import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(28);
    public final int A00;
    public final long A01;
    public final String A02;

    public Feature(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public Feature(String str, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.A02;
            String str2 = feature.A02;
            if (str == null ? str2 == null : str.equals(str2)) {
                long j = this.A01;
                if (j == -1) {
                    j = (long) this.A00;
                }
                long j2 = feature.A01;
                if (j2 == -1) {
                    j2 = (long) feature.A00;
                }
                if (j == j2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.A02;
        long j = this.A01;
        if (j == -1) {
            j = (long) this.A00;
        }
        return C86124wJ.A0H(str, Long.valueOf(j));
    }

    public final String toString() {
        C113596rm r5 = new C113596rm(this);
        r5.A00(this.A02, FXPFAccessLibraryDebugFragment.NAME);
        long j = this.A01;
        if (j == -1) {
            j = (long) this.A00;
        }
        r5.A00(Long.valueOf(j), ClientCookie.VERSION_ATTR);
        return r5.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0H(parcel, this.A02, 1, false);
        int i2 = this.A00;
        C122167Ky.A08(parcel, 2, i2);
        long j = this.A01;
        if (j == -1) {
            j = (long) i2;
        }
        C122167Ky.A09(parcel, 3, j);
        C122167Ky.A05(parcel, A002);
    }
}
