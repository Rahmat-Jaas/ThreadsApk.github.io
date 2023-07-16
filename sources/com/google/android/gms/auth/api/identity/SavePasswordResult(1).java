package com.google.android.gms.auth.api.identity;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(79);
    public final PendingIntent A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordResult)) {
            return false;
        }
        return C117046y2.A01(this.A00, ((SavePasswordResult) obj).A00);
    }

    public final int hashCode() {
        return C86124wJ.A0F(this.A00);
    }

    public SavePasswordResult(PendingIntent pendingIntent) {
        C13320nQ.A01(pendingIntent);
        this.A00 = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0C(parcel, this.A00, 1, i, C122167Ky.A00(parcel));
    }
}
