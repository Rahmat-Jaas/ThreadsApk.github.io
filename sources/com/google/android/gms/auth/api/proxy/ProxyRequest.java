package com.google.android.gms.auth.api.proxy;

import X.C122167Ky;
import X.C18180wK;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(82);
    public Bundle A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final byte[] A04;
    public final int A05;

    public final String toString() {
        String str = this.A03;
        int i = this.A01;
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str) + 42);
        A0s.append("ProxyRequest[ url: ");
        A0s.append(str);
        A0s.append(", method: ");
        A0s.append(i);
        return C18180wK.A0i(" ]", A0s);
    }

    public ProxyRequest(Bundle bundle, String str, byte[] bArr, int i, int i2, long j) {
        this.A05 = i;
        this.A03 = str;
        this.A01 = i2;
        this.A02 = j;
        this.A04 = bArr;
        this.A00 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0R = C122167Ky.A0R(parcel, this.A03);
        C122167Ky.A08(parcel, 2, this.A01);
        C122167Ky.A09(parcel, 3, this.A02);
        C122167Ky.A0L(parcel, this.A04, 4, A0R);
        C122167Ky.A02(this.A00, parcel, 5);
        C122167Ky.A07(parcel, this.A05, A002);
    }
}
