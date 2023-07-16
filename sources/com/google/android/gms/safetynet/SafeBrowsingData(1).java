package com.google.android.gms.safetynet;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(35);
    public long A00;
    public ParcelFileDescriptor A01;
    public DataHolder A02;
    public String A03;
    public byte[] A04;

    public SafeBrowsingData() {
        this((ParcelFileDescriptor) null, (DataHolder) null, (String) null, (byte[]) null, 0);
    }

    public SafeBrowsingData(ParcelFileDescriptor parcelFileDescriptor, DataHolder dataHolder, String str, byte[] bArr, long j) {
        this.A03 = str;
        this.A02 = dataHolder;
        this.A01 = parcelFileDescriptor;
        this.A00 = j;
        this.A04 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0S = C122167Ky.A0S(parcel, this.A03);
        C122167Ky.A0D(parcel, this.A02, 3, i, A0S);
        C122167Ky.A0D(parcel, this.A01, 4, i, A0S);
        C122167Ky.A09(parcel, 5, this.A00);
        C122167Ky.A0L(parcel, this.A04, 6, A0S);
        C122167Ky.A05(parcel, A002);
        this.A01 = null;
    }
}
