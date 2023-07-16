package com.google.android.gms.fido.u2f.api.common;

import X.AnonymousClass6C2;
import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(77);
    public final int A00;
    public final ProtocolVersion A01;
    public final List A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KeyHandle) {
                KeyHandle keyHandle = (KeyHandle) obj;
                if (Arrays.equals(this.A03, keyHandle.A03) && this.A01.equals(keyHandle.A01)) {
                    List list = this.A02;
                    List list2 = keyHandle.A02;
                    if (list != null ? list2 == null || !list.containsAll(list2) || !list2.containsAll(list) : list2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0I(C86124wJ.A0i(this.A03), this.A01, this.A02);
    }

    public final String toString() {
        String obj;
        String encodeToString;
        List list = this.A02;
        if (list == null) {
            obj = "null";
        } else {
            obj = list.toString();
        }
        byte[] bArr = this.A03;
        if (bArr == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bArr, 0);
        }
        return String.format("{keyHandle: %s, version: %s, transports: %s}", new Object[]{encodeToString, this.A01, obj});
    }

    public KeyHandle(String str, List list, byte[] bArr, int i) {
        this.A00 = i;
        this.A03 = bArr;
        try {
            this.A01 = ProtocolVersion.A00(str);
            this.A02 = list;
        } catch (AnonymousClass6C2 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        boolean A0T = C122167Ky.A0T(parcel, this.A03);
        C122167Ky.A0H(parcel, this.A01.toString(), 3, A0T);
        C122167Ky.A0K(parcel, this.A02, 4, A0T);
        C122167Ky.A05(parcel, A002);
    }
}
