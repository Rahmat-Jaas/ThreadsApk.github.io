package com.google.android.gms.location;

import X.C122167Ky;
import X.C86134wK;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(19);
    public final PendingIntent A00;
    public final String A01;
    public final List A02;

    public zzbe(PendingIntent pendingIntent, String str, List list) {
        List unmodifiableList;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A00 = pendingIntent;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0I(parcel, this.A02, 1);
        C122167Ky.A0D(parcel, this.A00, 2, i, false);
        C122167Ky.A0F(parcel, this.A01, A002, false);
    }
}
