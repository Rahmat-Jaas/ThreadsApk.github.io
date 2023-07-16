package com.google.vr.dynamite.client;

import X.C14030oh;
import android.os.IBinder;
import android.os.Parcel;
import com.google.ar.core.dependencies.d;

public final class b extends d implements INativeLibraryLoader {
    public b(IBinder iBinder) {
        super("com.google.vr.dynamite.client.INativeLibraryLoader", iBinder);
        C14030oh.A0A(-414131614, C14030oh.A03(-2131490757));
    }

    public final int checkVersion(String str) {
        int A03 = C14030oh.A03(1415172034);
        Parcel A00 = A00();
        A00.writeString(str);
        Parcel A01 = A01(A00, 2);
        int readInt = A01.readInt();
        A01.recycle();
        C14030oh.A0A(-1664313816, A03);
        return readInt;
    }

    public final long initializeAndLoadNativeLibrary(String str) {
        int A03 = C14030oh.A03(-952629516);
        Parcel A00 = A00();
        A00.writeString(str);
        Parcel A01 = A01(A00, 1);
        long readLong = A01.readLong();
        A01.recycle();
        C14030oh.A0A(515652715, A03);
        return readLong;
    }
}
