package com.google.android.gms.fido.sourcedevice;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class SourceStartDirectTransferOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(72);
    public int A00;
    public String A01;
    public List A02;
    public boolean A03;
    public boolean A04;

    public SourceStartDirectTransferOptions(String str, List list, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A02 = list;
        this.A04 = z2;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A0B(parcel, 2, this.A03);
        C122167Ky.A0K(parcel, this.A02, 3, false);
        C122167Ky.A0B(parcel, 4, this.A04);
        C122167Ky.A0H(parcel, this.A01, 5, false);
        C122167Ky.A05(parcel, A002);
    }
}
