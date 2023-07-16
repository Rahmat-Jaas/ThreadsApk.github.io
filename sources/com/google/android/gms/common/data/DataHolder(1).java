package com.google.android.gms.common.data;

import X.AnonymousClass39W;
import X.C122167Ky;
import X.C18180wK;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;

@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final AnonymousClass39W A08 = new AnonymousClass39W(new String[0]);
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(3);
    public Bundle A00;
    public boolean A01 = false;
    public int[] A02;
    public final int A03;
    public final int A04;
    public final Bundle A05;
    public final CursorWindow[] A06;
    public final String[] A07;

    public final void close() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.A06;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        try {
            if (this.A06.length > 0) {
                synchronized (this) {
                    z = this.A01;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(obj) + 178);
                    A0s.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    A0s.append(obj);
                    Log.e("DataBuffer", C18180wK.A0i(")", A0s));
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public DataHolder(Bundle bundle, CursorWindow[] cursorWindowArr, String[] strArr, int i, int i2) {
        this.A03 = i;
        this.A07 = strArr;
        this.A06 = cursorWindowArr;
        this.A04 = i2;
        this.A05 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0N(parcel, this.A07, 1);
        C122167Ky.A0M(parcel, this.A06, 2, i);
        C122167Ky.A08(parcel, 3, this.A04);
        C122167Ky.A02(this.A05, parcel, 4);
        C122167Ky.A07(parcel, this.A03, A002);
        if ((i & 1) != 0) {
            close();
        }
    }
}
