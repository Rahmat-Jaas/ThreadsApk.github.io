package com.google.android.gms.fido.fido2.api.common;

import X.C86124wJ;
import X.C97576Bx;
import android.os.Parcel;
import android.os.Parcelable;

public enum PublicKeyCredentialType implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "public-key";
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = C86124wJ.A0Z(43);
    }

    /* access modifiers changed from: public */
    PublicKeyCredentialType() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }

    public static PublicKeyCredentialType A00(String str) {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals("public-key")) {
                return publicKeyCredentialType;
            }
        }
        throw new C97576Bx(String.format("PublicKeyCredentialType %s not supported", new Object[]{str}));
    }
}
