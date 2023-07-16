package com.instagram.direct.stella.api;

import X.C14030oh;
import X.C86104wH;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;

public interface IStellaDirectMessagingService extends IInterface {

    public abstract class Stub extends Binder implements IStellaDirectMessagingService {

        public final class Proxy implements IStellaDirectMessagingService {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(1470581340);
                this.A00 = iBinder;
                C14030oh.A0A(-604873084, A03);
            }

            public final void CZr(ISendDirectMessageCallback iSendDirectMessageCallback) {
                int A03 = C14030oh.A03(860595062);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.instagram.direct.stella.api.IStellaDirectMessagingService");
                    obtain.writeStrongInterface(iSendDirectMessageCallback);
                    C86104wH.A19(this.A00, obtain, obtain2, 1);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-2084238884, A03);
                }
            }

            public final String Ce2(String str) {
                int A03 = C14030oh.A03(106142123);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.instagram.direct.stella.api.IStellaDirectMessagingService");
                    obtain.writeString(str);
                    C86104wH.A19(this.A00, obtain, obtain2, 2);
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1408912335, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(1029052551);
                IBinder iBinder = this.A00;
                C14030oh.A0A(806264136, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(-1284992723);
            attachInterface(this, "com.instagram.direct.stella.api.IStellaDirectMessagingService");
            C14030oh.A0A(-718171360, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(-1384374591, C14030oh.A03(833994989));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            ISendDirectMessageCallback proxy;
            int A03 = C14030oh.A03(1236982173);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.instagram.direct.stella.api.IStellaDirectMessagingService");
                    if (i == 1) {
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder == null) {
                            proxy = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.instagram.direct.stella.api.ISendDirectMessageCallback");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISendDirectMessageCallback)) {
                                proxy = new ISendDirectMessageCallback.Stub.Proxy(readStrongBinder);
                            } else {
                                proxy = (ISendDirectMessageCallback) queryLocalInterface;
                            }
                        }
                        CZr(proxy);
                        parcel2.writeNoException();
                    } else if (i == 2) {
                        String Ce2 = Ce2(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(Ce2);
                    }
                    i3 = 1749529690;
                } else if (i == 1598968902) {
                    parcel2.writeString("com.instagram.direct.stella.api.IStellaDirectMessagingService");
                    i3 = -2122839959;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(141195160, A03);
            return onTransact;
        }
    }

    void CZr(ISendDirectMessageCallback iSendDirectMessageCallback);

    String Ce2(String str);
}
