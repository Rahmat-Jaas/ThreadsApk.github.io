package com.fbpay.w3c;

import X.C14030oh;
import X.C86104wH;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface FBPaymentServiceAddCardCallback extends IInterface {

    public abstract class Stub extends Binder implements FBPaymentServiceAddCardCallback {

        public final class Proxy implements FBPaymentServiceAddCardCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(1497279535);
                this.A00 = iBinder;
                C14030oh.A0A(-1950464145, A03);
            }

            public final void CI0(String str) {
                int A03 = C14030oh.A03(1864499208);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceAddCardCallback");
                    obtain.writeString(str);
                    C86104wH.A19(this.A00, obtain, obtain2, 1);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(1121706190, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(-1811929652);
                IBinder iBinder = this.A00;
                C14030oh.A0A(790638230, A03);
                return iBinder;
            }

            public final void onError(String str) {
                int A03 = C14030oh.A03(1562235628);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceAddCardCallback");
                    obtain.writeString(str);
                    C86104wH.A19(this.A00, obtain, obtain2, 2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-753278879, A03);
                }
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(1367463107);
            attachInterface(this, "com.fbpay.w3c.FBPaymentServiceAddCardCallback");
            C14030oh.A0A(-1096754480, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(1854622382, C14030oh.A03(-1531229076));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C14030oh.A03(-679827041);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.fbpay.w3c.FBPaymentServiceAddCardCallback");
                    if (i == 1) {
                        CI0(parcel.readString());
                    } else if (i == 2) {
                        onError(parcel.readString());
                    }
                    parcel2.writeNoException();
                    i3 = -1002513679;
                } else if (i == 1598968902) {
                    parcel2.writeString("com.fbpay.w3c.FBPaymentServiceAddCardCallback");
                    i3 = 938709291;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(-464843938, A03);
            return onTransact;
        }
    }

    void CI0(String str);

    void onError(String str);
}
