package com.facebook.push.fbns.ipc;

import X.C14030oh;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface IFbnsAIDLService extends IInterface {

    public abstract class Stub extends Binder implements IFbnsAIDLService {

        public final class Proxy implements IFbnsAIDLService {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(502217712);
                this.A00 = iBinder;
                C14030oh.A0A(1131072382, A03);
            }

            public final FbnsAIDLResult CYb(FbnsAIDLRequest fbnsAIDLRequest) {
                Object obj;
                int A03 = C14030oh.A03(1819998277);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                    if (fbnsAIDLRequest != null) {
                        obtain.writeInt(1);
                        fbnsAIDLRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = FbnsAIDLResult.CREATOR;
                    if (obtain2.readInt() != 0) {
                        obj = creator.createFromParcel(obtain2);
                    } else {
                        obj = null;
                    }
                    return (FbnsAIDLResult) obj;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1651473098, A03);
                }
            }

            public final void D8a(FbnsAIDLRequest fbnsAIDLRequest) {
                int A03 = C14030oh.A03(1204005627);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                    if (fbnsAIDLRequest != null) {
                        obtain.writeInt(1);
                        fbnsAIDLRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(1041951890, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(-335947478);
                IBinder iBinder = this.A00;
                C14030oh.A0A(-1666669739, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(-986241021);
            attachInterface(this, "com.facebook.push.fbns.ipc.IFbnsAIDLService");
            C14030oh.A0A(-1802141584, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(920453875, C14030oh.A03(1307666724));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            Object obj;
            Object obj2;
            int A03 = C14030oh.A03(-761289823);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                    if (i == 1) {
                        Parcelable.Creator creator = FbnsAIDLRequest.CREATOR;
                        if (parcel.readInt() != 0) {
                            obj = creator.createFromParcel(parcel);
                        } else {
                            obj = null;
                        }
                        FbnsAIDLResult CYb = CYb((FbnsAIDLRequest) obj);
                        parcel2.writeNoException();
                        if (CYb != null) {
                            parcel2.writeInt(1);
                            CYb.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                    } else if (i == 2) {
                        Parcelable.Creator creator2 = FbnsAIDLRequest.CREATOR;
                        if (parcel.readInt() != 0) {
                            obj2 = creator2.createFromParcel(parcel);
                        } else {
                            obj2 = null;
                        }
                        D8a((FbnsAIDLRequest) obj2);
                    }
                    i3 = 987443338;
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                    i3 = -1081379517;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(-925902130, A03);
            return onTransact;
        }
    }

    FbnsAIDLResult CYb(FbnsAIDLRequest fbnsAIDLRequest);

    void D8a(FbnsAIDLRequest fbnsAIDLRequest);
}
