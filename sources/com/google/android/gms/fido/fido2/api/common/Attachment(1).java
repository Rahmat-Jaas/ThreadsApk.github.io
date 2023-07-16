package com.google.android.gms.fido.fido2.api.common;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public enum Attachment implements Parcelable {
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
        CREATOR = C86124wJ.A0Z(33);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    /* access modifiers changed from: public */
    Attachment(String str) {
        this.A00 = str;
    }
}
