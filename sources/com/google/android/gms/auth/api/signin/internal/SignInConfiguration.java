package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass0wJ;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(85);
    public GoogleSignInOptions A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (!this.A01.equals(signInConfiguration.A01)) {
            return false;
        }
        GoogleSignInOptions googleSignInOptions = this.A00;
        GoogleSignInOptions googleSignInOptions2 = signInConfiguration.A00;
        if (googleSignInOptions == null) {
            if (googleSignInOptions2 == null) {
                return true;
            }
            return false;
        } else if (!googleSignInOptions.equals(googleSignInOptions2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A03(this.A01) + 31) * 31) + AnonymousClass0wJ.A03(this.A00);
    }

    public SignInConfiguration(GoogleSignInOptions googleSignInOptions, String str) {
        C13320nQ.A03(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0D(parcel, this.A00, 5, i, C122167Ky.A0S(parcel, this.A01));
        C122167Ky.A05(parcel, A002);
    }
}
