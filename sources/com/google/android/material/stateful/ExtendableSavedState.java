package com.google.android.material.stateful;

import X.C002000x;
import X.C18180wK;
import X.C18190wL;
import X.C86144wL;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.facebook.redex.IDxObjectShape113S0000000_2_I2;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new IDxObjectShape113S0000000_2_I2(3);
    public final C002000x A00;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ExtendableSavedState{");
        A0s.append(C86144wL.A0u(this));
        A0s.append(" states=");
        A0s.append(this.A00);
        return C18180wK.A0i("}", A0s);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.A00 = new C002000x(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A00.put(strArr[i], bundleArr[i]);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.os.Bundle[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r10, int r11) {
        /*
            r9 = this;
            super.writeToParcel(r10, r11)
            X.00x r8 = r9.A00
            int r7 = r8.size()
            r10.writeInt(r7)
            java.lang.String[] r6 = new java.lang.String[r7]
            android.os.Bundle[] r5 = new android.os.Bundle[r7]
            r4 = 0
            r3 = 0
        L_0x0012:
            if (r3 >= r7) goto L_0x0025
            java.lang.Object[] r2 = r8.A02
            int r1 = r3 << 1
            r0 = r2[r1]
            r6[r3] = r0
            int r0 = r1 + 1
            r0 = r2[r0]
            r5[r3] = r0
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0025:
            r10.writeStringArray(r6)
            r10.writeTypedArray(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.stateful.ExtendableSavedState.writeToParcel(android.os.Parcel, int):void");
    }
}
