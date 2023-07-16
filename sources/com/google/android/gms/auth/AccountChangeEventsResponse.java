package com.google.android.gms.auth;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(96);
    public final int A00;
    public final List A01;

    public AccountChangeEventsResponse(List list, int i) {
        this.A00 = i;
        C13320nQ.A01(list);
        this.A01 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A0J(parcel, this.A01, 2, A002);
    }
}
