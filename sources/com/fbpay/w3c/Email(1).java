package com.fbpay.w3c;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class Email implements Parcelable, EmailSpec {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(20);
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public Email(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bool;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Email) {
                Email email = (Email) obj;
                if (!AnonymousClass3ZT.A03(this.A01, email.A01) || !AnonymousClass3ZT.A03(this.A02, email.A02) || !AnonymousClass3ZT.A03(this.A00, email.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((C86124wJ.A0E(this.A01) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A16(parcel, this.A01, 0, 1);
        C18190wL.A16(parcel, this.A02, 0, 1);
        C18190wL.A14(parcel, this.A00);
    }

    public Email(Parcel parcel) {
        Boolean bool = null;
        if (C86114wI.A08(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(C86114wI.A1V(parcel)) : bool;
    }
}
