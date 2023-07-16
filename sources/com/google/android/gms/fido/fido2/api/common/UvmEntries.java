package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;

public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(50);
    public final List A00;

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.fido.fido2.api.common.UvmEntries
            r3 = 0
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.fido.fido2.api.common.UvmEntries r5 = (com.google.android.gms.fido.fido2.api.common.UvmEntries) r5
            java.util.List r2 = r4.A00
            java.util.List r1 = r5.A00
            if (r2 != 0) goto L_0x0010
            if (r1 == 0) goto L_0x001e
        L_0x000f:
            return r3
        L_0x0010:
            if (r1 == 0) goto L_0x000f
            boolean r0 = r2.containsAll(r1)
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.containsAll(r2)
            if (r0 == 0) goto L_0x000f
        L_0x001e:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.UvmEntries.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return C86124wJ.A0F(new HashSet(this.A00));
    }

    public UvmEntries(List list) {
        this.A00 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0J(parcel, this.A00, 1, C122167Ky.A00(parcel));
    }
}
