package com.google.android.gms.fido.fido2.api.common;

import X.C117046y2;
import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(54);
    public final FidoAppIdExtension A00;
    public final UserVerificationMethodExtension A01;
    public final GoogleThirdPartyPaymentExtension A02;
    public final zzaa A03;
    public final zzad A04;
    public final zzp A05;
    public final zzr A06;
    public final zzw A07;
    public final zzy A08;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        if (!C117046y2.A01(this.A00, authenticationExtensions.A00) || !C117046y2.A01(this.A05, authenticationExtensions.A05) || !C117046y2.A01(this.A01, authenticationExtensions.A01) || !C117046y2.A01(this.A07, authenticationExtensions.A07) || !C117046y2.A01(this.A08, authenticationExtensions.A08) || !C117046y2.A01(this.A03, authenticationExtensions.A03) || !C117046y2.A01(this.A06, authenticationExtensions.A06) || !C117046y2.A01(this.A04, authenticationExtensions.A04)) {
            return false;
        }
        return C117046y2.A00(this.A02, authenticationExtensions.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A05, this.A01, this.A07, this.A08, this.A03, this.A06, this.A04, this.A02});
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, UserVerificationMethodExtension userVerificationMethodExtension, zzaa zzaa, zzad zzad, zzp zzp, zzr zzr, zzw zzw, zzy zzy) {
        this.A00 = fidoAppIdExtension;
        this.A01 = userVerificationMethodExtension;
        this.A05 = zzp;
        this.A07 = zzw;
        this.A08 = zzy;
        this.A03 = zzaa;
        this.A06 = zzr;
        this.A04 = zzad;
        this.A02 = googleThirdPartyPaymentExtension;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0Q = C122167Ky.A0Q(parcel, this.A00, i);
        C122167Ky.A0D(parcel, this.A05, 3, i, A0Q);
        C122167Ky.A0D(parcel, this.A01, 4, i, A0Q);
        C122167Ky.A0D(parcel, this.A07, 5, i, A0Q);
        C122167Ky.A0D(parcel, this.A08, 6, i, A0Q);
        C122167Ky.A0D(parcel, this.A03, 7, i, A0Q);
        C122167Ky.A0D(parcel, this.A06, 8, i, A0Q);
        C122167Ky.A0D(parcel, this.A04, 9, i, A0Q);
        C122167Ky.A0D(parcel, this.A02, 10, i, A0Q);
        C122167Ky.A05(parcel, A002);
    }
}
