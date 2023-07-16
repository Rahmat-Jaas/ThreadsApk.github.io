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

public interface FBPaymentServiceCardDetailsCallback extends IInterface {

    public abstract class Stub extends Binder implements FBPaymentServiceCardDetailsCallback {

        public final class Proxy implements FBPaymentServiceCardDetailsCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(1278052936);
                this.A00 = iBinder;
                C14030oh.A0A(-1947040576, A03);
            }

            public final void CRf(List list) {
                int A03 = C14030oh.A03(860508626);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
                    C86104wH.A19(this.A00, obtain, obtain2, 1);
                    obtain2.readTypedList(list, CardDetails.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1268753590, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(1973448199);
                IBinder iBinder = this.A00;
                C14030oh.A0A(248855082, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(629012965);
            attachInterface(this, "com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
            C14030oh.A0A(-1131318937, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(1730063349, C14030oh.A03(1804295469));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C14030oh.A03(-2085153601);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
                    if (i == 1) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        CRf(A0v);
                        parcel2.writeNoException();
                        parcel2.writeTypedList(A0v);
                        i3 = 1746836669;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
                    i3 = 350388303;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(1423870877, A03);
            return onTransact;
        }
    }

    void CRf(List list);
}
