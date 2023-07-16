package com.google.vr.dynamite.client;

import X.C14030oh;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.ar.core.dependencies.d;

public final class a extends d implements ILoadedInstanceCreator {
    public a(IBinder iBinder) {
        super("com.google.vr.dynamite.client.ILoadedInstanceCreator", iBinder);
        C14030oh.A0A(1993359244, C14030oh.A03(578768120));
    }

    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        IBinder asBinder;
        IBinder asBinder2;
        INativeLibraryLoader bVar;
        int A03 = C14030oh.A03(1396916038);
        Parcel A00 = A00();
        if (iObjectWrapper == null) {
            asBinder = null;
        } else {
            asBinder = iObjectWrapper.asBinder();
        }
        A00.writeStrongBinder(asBinder);
        if (iObjectWrapper2 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = iObjectWrapper2.asBinder();
        }
        A00.writeStrongBinder(asBinder2);
        Parcel A01 = A01(A00, 1);
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            if (queryLocalInterface instanceof INativeLibraryLoader) {
                bVar = (INativeLibraryLoader) queryLocalInterface;
            } else {
                bVar = new b(readStrongBinder);
            }
        }
        A01.recycle();
        C14030oh.A0A(-2015230473, A03);
        return bVar;
    }
}
