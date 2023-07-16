package com.google.android.gms.internal.clearcut;

import X.C117046y2;
import X.C122167Ky;
import X.C18180wK;
import X.C18190wL;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(93);
    public final int A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public zzr(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2) {
        this.A04 = str;
        this.A03 = i;
        this.A00 = i2;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = z;
        this.A01 = str4;
        this.A08 = z2;
        this.A02 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzr) {
                zzr zzr = (zzr) obj;
                if (!(C117046y2.A01(this.A04, zzr.A04) && this.A03 == zzr.A03 && this.A00 == zzr.A00 && C117046y2.A01(this.A01, zzr.A01) && C117046y2.A01(this.A05, zzr.A05) && C117046y2.A01(this.A06, zzr.A06) && this.A07 == zzr.A07 && this.A08 == zzr.A08 && this.A02 == zzr.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, Integer.valueOf(this.A03), Integer.valueOf(this.A00), this.A01, this.A05, this.A06, Boolean.valueOf(this.A07), Boolean.valueOf(this.A08), Integer.valueOf(this.A02)});
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PlayLoggerContext[");
        A0s.append("package=");
        A0s.append(this.A04);
        A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
        A0s.append("packageVersionCode=");
        A0s.append(this.A03);
        A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
        A0s.append("logSource=");
        A0s.append(this.A00);
        A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
        A0s.append("logSourceName=");
        A0s.append(this.A01);
        A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
        A0s.append("uploadAccount=");
        A0s.append(this.A05);
        A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
        A0s.append("loggingId=");
        A0s.append(this.A06);
        A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
        A0s.append("logAndroidId=");
        A0s.append(this.A07);
        A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
        A0s.append("isAnonymous=");
        A0s.append(this.A08);
        A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
        A0s.append("qosTier=");
        A0s.append(this.A02);
        return C18180wK.A0i("]", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0S = C122167Ky.A0S(parcel, this.A04);
        C122167Ky.A08(parcel, 3, this.A03);
        C122167Ky.A08(parcel, 4, this.A00);
        C122167Ky.A0H(parcel, this.A05, 5, A0S);
        C122167Ky.A0H(parcel, this.A06, 6, A0S);
        C122167Ky.A0B(parcel, 7, this.A07);
        C122167Ky.A0H(parcel, this.A01, 8, A0S);
        C122167Ky.A0B(parcel, 9, this.A08);
        C122167Ky.A08(parcel, 10, this.A02);
        C122167Ky.A05(parcel, A002);
    }
}
