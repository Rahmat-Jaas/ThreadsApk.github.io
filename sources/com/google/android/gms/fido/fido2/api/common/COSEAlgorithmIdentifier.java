package com.google.android.gms.fido.fido2.api.common;

import X.C13320nQ;
import X.C143848hP;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(62);
    public C143848hP A00;

    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.6BT[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.6BT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.6BU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.6BU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.6BU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.6BU} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier A00(int r6) {
        /*
            r0 = -262(0xfffffffffffffefa, float:NaN)
            if (r6 != r0) goto L_0x000c
            X.6BU r3 = X.AnonymousClass6BU.RS1
        L_0x0006:
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r0 = new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier
            r0.<init>(r3)
            return r0
        L_0x000c:
            X.6BU[] r5 = X.AnonymousClass6BU.values()
            int r2 = r5.length
            r4 = 0
            r1 = 0
        L_0x0013:
            if (r1 >= r2) goto L_0x001e
            r3 = r5[r1]
            int r0 = r3.A00
            if (r0 == r6) goto L_0x0006
            int r1 = r1 + 1
            goto L_0x0013
        L_0x001e:
            X.6BT[] r2 = X.AnonymousClass6BT.values()
            int r1 = r2.length
        L_0x0023:
            if (r4 >= r1) goto L_0x002e
            r3 = r2[r4]
            int r0 = r3.A00
            if (r0 == r6) goto L_0x0006
            int r4 = r4 + 1
            goto L_0x0023
        L_0x002e:
            X.6Bv r0 = new X.6Bv
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.A00(int):com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof COSEAlgorithmIdentifier) || this.A00.AQ5() != ((COSEAlgorithmIdentifier) obj).A00.AQ5()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0F(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.AQ5());
    }

    public COSEAlgorithmIdentifier(C143848hP r1) {
        C13320nQ.A01(r1);
        this.A00 = r1;
    }
}
