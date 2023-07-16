package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import X.C97596Bz;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class TokenBinding extends AbstractSafeParcelable {
    public static final TokenBinding A02 = new TokenBinding(TokenBindingStatus.A02.toString(), (String) null);
    public static final TokenBinding A03 = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), (String) null);
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(47);
    public final TokenBindingStatus A00;
    public final String A01;

    public enum TokenBindingStatus implements Parcelable {
        SUPPORTED("supported"),
        A02("not-supported");
        
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
            CREATOR = C86124wJ.A0Z(46);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A00);
        }

        /* access modifiers changed from: public */
        TokenBindingStatus(String str) {
            this.A00 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        TokenBindingStatus tokenBindingStatus = this.A00;
        TokenBindingStatus tokenBindingStatus2 = tokenBinding.A00;
        if (tokenBindingStatus != tokenBindingStatus2 && (tokenBindingStatus == null || !tokenBindingStatus.equals(tokenBindingStatus2))) {
            return false;
        }
        String str = this.A01;
        String str2 = tokenBinding.A01;
        if (str == str2 || (str != null && str.equals(str2))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A00, this.A01);
    }

    public TokenBinding(String str, String str2) {
        C13320nQ.A01(str);
        try {
            for (TokenBindingStatus tokenBindingStatus : TokenBindingStatus.values()) {
                if (str.equals(tokenBindingStatus.A00)) {
                    this.A00 = tokenBindingStatus;
                    this.A01 = str2;
                    return;
                }
            }
            throw new C97596Bz(str);
        } catch (C97596Bz e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0F(parcel, this.A01, C122167Ky.A00(parcel), C122167Ky.A0S(parcel, this.A00.toString()));
    }
}
