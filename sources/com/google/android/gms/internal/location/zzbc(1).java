package com.google.android.gms.internal.location;

import X.C117046y2;
import X.C122167Ky;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzbc extends AbstractSafeParcelable {
    public static final List A0B = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(95);
    public long A00;
    public LocationRequest A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbc = (zzbc) obj;
        if (C117046y2.A01(this.A01, zzbc.A01) && C117046y2.A01(this.A05, zzbc.A05) && C117046y2.A01(this.A02, zzbc.A02) && this.A06 == zzbc.A06 && this.A07 == zzbc.A07 && this.A08 == zzbc.A08 && C117046y2.A01(this.A03, zzbc.A03) && this.A09 == zzbc.A09 && this.A0A == zzbc.A0A) {
            return C117046y2.A00(this.A04, zzbc.A04);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public zzbc(LocationRequest locationRequest, String str, String str2, String str3, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = locationRequest;
        this.A05 = list;
        this.A02 = str;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A03 = str2;
        this.A09 = z4;
        this.A0A = z5;
        this.A04 = str3;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A01);
        String str = this.A02;
        if (str != null) {
            A0r.append(" tag=");
            A0r.append(str);
        }
        String str2 = this.A03;
        if (str2 != null) {
            A0r.append(" moduleId=");
            A0r.append(str2);
        }
        String str3 = this.A04;
        if (str3 != null) {
            A0r.append(" contextAttributionTag=");
            A0r.append(str3);
        }
        A0r.append(" hideAppOps=");
        A0r.append(this.A06);
        A0r.append(" clients=");
        A0r.append(this.A05);
        A0r.append(" forceCoarseLocation=");
        A0r.append(this.A07);
        if (this.A08) {
            A0r.append(" exemptFromBackgroundThrottle");
        }
        if (this.A09) {
            A0r.append(" locationSettingsIgnored");
        }
        if (this.A0A) {
            A0r.append(" inaccurateLocationsDelayed");
        }
        return A0r.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0P = C122167Ky.A0P(parcel, this.A01, i);
        C122167Ky.A0K(parcel, this.A05, 5, A0P);
        C122167Ky.A0H(parcel, this.A02, 6, A0P);
        C122167Ky.A0B(parcel, 7, this.A06);
        C122167Ky.A0B(parcel, 8, this.A07);
        C122167Ky.A0B(parcel, 9, this.A08);
        C122167Ky.A0H(parcel, this.A03, 10, A0P);
        C122167Ky.A0B(parcel, 11, this.A09);
        C122167Ky.A0B(parcel, 12, this.A0A);
        C122167Ky.A0H(parcel, this.A04, 13, A0P);
        C122167Ky.A09(parcel, 14, this.A00);
        C122167Ky.A05(parcel, A002);
    }
}
