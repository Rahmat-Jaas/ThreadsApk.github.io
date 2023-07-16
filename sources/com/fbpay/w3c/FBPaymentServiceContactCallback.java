package com.fbpay.w3c;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C86104wH;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public interface FBPaymentServiceContactCallback extends IInterface {

    public abstract class Stub extends Binder implements FBPaymentServiceContactCallback {

        public final class Proxy implements FBPaymentServiceContactCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(1476412140);
                this.A00 = iBinder;
                C14030oh.A0A(2134730871, A03);
            }

            public final void CRf(List list) {
                int A03 = C14030oh.A03(-1950318686);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceContactCallback");
                    C86104wH.A19(this.A00, obtain, obtain2, 1);
                    obtain2.readTypedList(list, Contact.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(917998291, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(-1135069581);
                IBinder iBinder = this.A00;
                C14030oh.A0A(922465389, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(602980648);
            attachInterface(this, "com.fbpay.w3c.FBPaymentServiceContactCallback");
            C14030oh.A0A(-1213135367, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(608498638, C14030oh.A03(1870010473));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C14030oh.A03(-1485413108);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.fbpay.w3c.FBPaymentServiceContactCallback");
                    if (i == 1) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        CRf(A0v);
                        parcel2.writeNoException();
                        parcel2.writeTypedList(A0v);
                        i3 = -1835301998;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.fbpay.w3c.FBPaymentServiceContactCallback");
                    i3 = 260151072;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(-1586883804, A03);
            return onTransact;
        }
    }

    void CRf(List list);
}
