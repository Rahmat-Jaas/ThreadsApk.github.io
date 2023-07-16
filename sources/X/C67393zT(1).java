package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.3zT  reason: invalid class name and case insensitive filesystem */
public final class C67393zT implements C143278gS {
    public final IBinder A00;

    public C67393zT(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final void Ba8(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            obtain.writeInt(i);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
