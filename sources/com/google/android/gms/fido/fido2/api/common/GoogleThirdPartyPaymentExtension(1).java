package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(35);
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GoogleThirdPartyPaymentExtension) || this.A00 != ((GoogleThirdPartyPaymentExtension) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0F(Boolean.valueOf(this.A00));
    }

    public GoogleThirdPartyPaymentExtension(boolean z) {
        this.A00 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0A(parcel, C122167Ky.A00(parcel), this.A00);
    }
}
