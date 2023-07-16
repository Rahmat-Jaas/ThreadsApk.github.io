package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass6C0;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public enum zzat implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = C86124wJ.A0Z(49);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    /* access modifiers changed from: public */
    zzat(String str) {
        this.A00 = str;
    }

    public static zzat A00(String str) {
        for (zzat zzat : values()) {
            if (str.equals(zzat.A00)) {
                return zzat;
            }
        }
        throw new AnonymousClass6C0(str);
    }
}
