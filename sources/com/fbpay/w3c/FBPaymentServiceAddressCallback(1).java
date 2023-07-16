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

public interface FBPaymentServiceAddressCallback extends IInterface {

    public abstract class Stub extends Binder implements FBPaymentServiceAddressCallback {

        public final class Proxy implements FBPaymentServiceAddressCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(79526997);
                this.A00 = iBinder;
                C14030oh.A0A(1572529194, A03);
            }

            public final void CRf(List list) {
                int A03 = C14030oh.A03(1880098880);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentServiceAddressCallback");
                    C86104wH.A19(this.A00, obtain, obtain2, 1);
                    obtain2.readTypedList(list, Address.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(2034643464, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(-1232462984);
                IBinder iBinder = this.A00;
                C14030oh.A0A(-1356085874, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(-2017030353);
            attachInterface(this, "com.fbpay.w3c.FBPaymentServiceAddressCallback");
            C14030oh.A0A(-881169151, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(-200468075, C14030oh.A03(1894100389));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C14030oh.A03(794397122);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.fbpay.w3c.FBPaymentServiceAddressCallback");
                    if (i == 1) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        CRf(A0v);
                        parcel2.writeNoException();
                        parcel2.writeTypedList(A0v);
                        i3 = 2142510894;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.fbpay.w3c.FBPaymentServiceAddressCallback");
                    i3 = 2146588876;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(-732583812, A03);
            return onTransact;
        }
    }

    void CRf(List list);
}
