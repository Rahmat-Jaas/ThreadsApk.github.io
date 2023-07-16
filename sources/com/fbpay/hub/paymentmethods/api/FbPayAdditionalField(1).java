package com.fbpay.hub.paymentmethods.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.AnonymousClass66J;
import X.C1366783w;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class FbPayAdditionalField implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(0);
    public final ImmutableList A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayAdditionalField) {
                FbPayAdditionalField fbPayAdditionalField = (FbPayAdditionalField) obj;
                if (!AnonymousClass3ZT.A03(this.A01, fbPayAdditionalField.A01) || !AnonymousClass3ZT.A03(this.A00, fbPayAdditionalField.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C86124wJ.A0E(this.A01) * 31) + AnonymousClass0wJ.A03(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        C1366783w A0U = C86134wK.A0U(parcel, this.A00);
        while (A0U.hasNext()) {
            parcel.writeInt(((AnonymousClass66J) A0U.next()).ordinal());
        }
    }

    public FbPayAdditionalField(Parcel parcel) {
        getClass().getClassLoader();
        this.A01 = parcel.readString();
        int readInt = parcel.readInt();
        AnonymousClass66J[] r3 = new AnonymousClass66J[readInt];
        for (int i = 0; i < readInt; i++) {
            r3[i] = AnonymousClass66J.values()[parcel.readInt()];
        }
        this.A00 = ImmutableList.copyOf((Object[]) r3);
    }
}
