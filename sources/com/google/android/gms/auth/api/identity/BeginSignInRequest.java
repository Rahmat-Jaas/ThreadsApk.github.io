package com.google.android.gms.auth.api.identity;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C18200wM;
import X.C86124wJ;
import X.C86154wM;
import X.C86164wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(69);
    public final GoogleIdTokenRequestOptions A00;
    public final PasskeysRequestOptions A01;
    public final PasswordRequestOptions A02;
    public final boolean A03;
    public final int A04;
    public final String A05;

    public final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(73);
        public final String A00;
        public final String A01;
        public final String A02;
        public final List A03;
        public final boolean A04;
        public final boolean A05;
        public final boolean A06;

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.A04 != googleIdTokenRequestOptions.A04 || !C117046y2.A01(this.A00, googleIdTokenRequestOptions.A00) || !C117046y2.A01(this.A01, googleIdTokenRequestOptions.A01) || this.A05 != googleIdTokenRequestOptions.A05 || !C117046y2.A01(this.A02, googleIdTokenRequestOptions.A02) || !C117046y2.A01(this.A03, googleIdTokenRequestOptions.A03) || this.A06 != googleIdTokenRequestOptions.A06) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), this.A00, this.A01, Boolean.valueOf(this.A05), this.A02, this.A03, Boolean.valueOf(this.A06)});
        }

        public GoogleIdTokenRequestOptions(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            C13320nQ.A06(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.A04 = z;
            if (z) {
                C13320nQ.A02(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.A00 = str;
            this.A01 = str2;
            this.A05 = z2;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = C18200wM.A0s(list);
                Collections.sort(arrayList);
            }
            this.A03 = arrayList;
            this.A02 = str3;
            this.A06 = z3;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            C122167Ky.A0B(parcel, 1, this.A04);
            boolean A0S = C122167Ky.A0S(parcel, this.A00);
            C122167Ky.A0H(parcel, this.A01, 3, A0S);
            C122167Ky.A0B(parcel, 4, this.A05);
            C122167Ky.A0H(parcel, this.A02, 5, A0S);
            C122167Ky.A0I(parcel, this.A03, 6);
            C122167Ky.A0B(parcel, 7, this.A06);
            C122167Ky.A05(parcel, A002);
        }
    }

    public final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(74);
        public final String A00;
        public final boolean A01;
        public final byte[] A02;

        public final boolean equals(Object obj) {
            String str;
            String str2;
            if (this != obj) {
                if (obj instanceof PasskeysRequestOptions) {
                    PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
                    if (this.A01 != passkeysRequestOptions.A01 || !Arrays.equals(this.A02, passkeysRequestOptions.A02) || ((str = this.A00) != (str2 = passkeysRequestOptions.A00) && (str == null || !str.equals(str2)))) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C86164wN.A07(this.A02, C86124wJ.A0H(Boolean.valueOf(this.A01), this.A00) * 31);
        }

        public PasskeysRequestOptions(String str, byte[] bArr, boolean z) {
            if (z) {
                C13320nQ.A01(bArr);
                C13320nQ.A01(str);
            }
            this.A01 = z;
            this.A02 = bArr;
            this.A00 = str;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            C122167Ky.A0B(parcel, 1, this.A01);
            C122167Ky.A0F(parcel, this.A00, A002, C122167Ky.A0T(parcel, this.A02));
        }
    }

    public final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(75);
        public final boolean A00;

        public final boolean equals(Object obj) {
            if (!(obj instanceof PasswordRequestOptions) || this.A00 != ((PasswordRequestOptions) obj).A00) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C86124wJ.A0F(Boolean.valueOf(this.A00));
        }

        public PasswordRequestOptions(boolean z) {
            this.A00 = z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C122167Ky.A0A(parcel, C122167Ky.A00(parcel), this.A00);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!C117046y2.A01(this.A02, beginSignInRequest.A02) || !C117046y2.A01(this.A00, beginSignInRequest.A00) || !C117046y2.A01(this.A01, beginSignInRequest.A01) || !C117046y2.A01(this.A05, beginSignInRequest.A05) || this.A03 != beginSignInRequest.A03 || this.A04 != beginSignInRequest.A04) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86154wM.A05(this.A02, this.A00, this.A01, this.A05, Boolean.valueOf(this.A03));
    }

    public BeginSignInRequest(GoogleIdTokenRequestOptions googleIdTokenRequestOptions, PasskeysRequestOptions passkeysRequestOptions, PasswordRequestOptions passwordRequestOptions, String str, int i, boolean z) {
        C13320nQ.A01(passwordRequestOptions);
        this.A02 = passwordRequestOptions;
        C13320nQ.A01(googleIdTokenRequestOptions);
        this.A00 = googleIdTokenRequestOptions;
        this.A05 = str;
        this.A03 = z;
        this.A04 = i;
        this.A01 = passkeysRequestOptions == null ? new PasskeysRequestOptions((String) null, (byte[]) null, false) : passkeysRequestOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0P = C122167Ky.A0P(parcel, this.A02, i);
        C122167Ky.A0D(parcel, this.A00, 2, i, A0P);
        C122167Ky.A0H(parcel, this.A05, 3, A0P);
        C122167Ky.A0B(parcel, 4, this.A03);
        C122167Ky.A08(parcel, 5, this.A04);
        C122167Ky.A0D(parcel, this.A01, 6, i, A0P);
        C122167Ky.A05(parcel, A002);
    }
}
