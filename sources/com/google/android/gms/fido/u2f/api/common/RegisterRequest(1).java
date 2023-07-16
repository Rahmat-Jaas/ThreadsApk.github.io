package com.google.android.gms.fido.u2f.api.common;

import X.AnonymousClass0wJ;
import X.AnonymousClass6C2;
import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(79);
    public final int A00;
    public final String A01;
    public final byte[] A02;
    public final ProtocolVersion A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RegisterRequest) {
                RegisterRequest registerRequest = (RegisterRequest) obj;
                if (Arrays.equals(this.A02, registerRequest.A02) && this.A03 == registerRequest.A03) {
                    String str = this.A01;
                    String str2 = registerRequest.A01;
                    if (str == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((Arrays.hashCode(this.A02) + 31) * 31) + this.A03.hashCode();
        return (hashCode * 31) + AnonymousClass0wJ.A06(this.A01);
    }

    public RegisterRequest(String str, String str2, byte[] bArr, int i) {
        this.A00 = i;
        try {
            this.A03 = ProtocolVersion.A00(str);
            this.A02 = bArr;
            this.A01 = str2;
        } catch (AnonymousClass6C2 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        boolean A0S = C122167Ky.A0S(parcel, this.A03.toString());
        C122167Ky.A0L(parcel, this.A02, 3, A0S);
        C122167Ky.A0G(parcel, this.A01, A002, A0S);
    }
}
