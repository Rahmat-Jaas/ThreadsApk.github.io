package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(63);
    public final long A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zzn = (zzn) obj;
        if (this.A00 != zzn.A00 || !Arrays.equals(this.A01, zzn.A01) || !Arrays.equals(this.A02, zzn.A02) || !Arrays.equals(this.A03, zzn.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A01, this.A02, this.A03});
    }

    public zzn(byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        this.A00 = j;
        C13320nQ.A01(bArr);
        this.A01 = bArr;
        C13320nQ.A01(bArr2);
        this.A02 = bArr2;
        C13320nQ.A01(bArr3);
        this.A03 = bArr3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A09(parcel, 1, this.A00);
        boolean A0T = C122167Ky.A0T(parcel, this.A01);
        C122167Ky.A0L(parcel, this.A02, 3, A0T);
        C122167Ky.A0L(parcel, this.A03, 4, A0T);
        C122167Ky.A05(parcel, A002);
    }
}
