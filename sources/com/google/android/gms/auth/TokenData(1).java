package com.google.android.gms.auth;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(97);
    public final String A00;
    public final int A01;
    public final Long A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.A00, tokenData.A00) || !C117046y2.A01(this.A02, tokenData.A02) || this.A05 != tokenData.A05 || this.A06 != tokenData.A06 || !C117046y2.A01(this.A04, tokenData.A04)) {
            return false;
        }
        return C117046y2.A00(this.A03, tokenData.A03);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), this.A04, this.A03});
    }

    public TokenData(Long l, String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A01 = i;
        C13320nQ.A03(str);
        this.A00 = str;
        this.A02 = l;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list;
        this.A03 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A01);
        boolean A0S = C122167Ky.A0S(parcel, this.A00);
        Long l = this.A02;
        if (l != null) {
            C86134wK.A18(parcel, l, 524291);
        }
        C122167Ky.A0B(parcel, 4, this.A05);
        C122167Ky.A0B(parcel, 5, this.A06);
        C122167Ky.A0I(parcel, this.A04, 6);
        C122167Ky.A0H(parcel, this.A03, 7, A0S);
        C122167Ky.A05(parcel, A002);
    }
}
