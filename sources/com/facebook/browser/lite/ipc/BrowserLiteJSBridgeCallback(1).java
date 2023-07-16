package com.facebook.browser.lite.ipc;

import X.C14030oh;
import X.C86114wI;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface BrowserLiteJSBridgeCallback extends IInterface {

    public abstract class Stub extends Binder implements BrowserLiteJSBridgeCallback {

        public final class Proxy implements BrowserLiteJSBridgeCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(1706335356);
                this.A00 = iBinder;
                C14030oh.A0A(2128347639, A03);
            }

            public final void BnW(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, int i, Bundle bundle) {
                int A03 = C14030oh.A03(325235748);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
                    if (browserLiteJSBridgeCall != null) {
                        C86114wI.A12(obtain, browserLiteJSBridgeCall, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (bundle != null) {
                        C86114wI.A12(obtain, bundle, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(115605958, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(-1923025637);
                IBinder iBinder = this.A00;
                C14030oh.A0A(-541048375, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(599535604);
            attachInterface(this, "com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
            C14030oh.A0A(1238850474, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(1732348154, C14030oh.A03(413663211));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C14030oh.A03(-1509431087);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
                    if (i == 1) {
                        BnW((BrowserLiteJSBridgeCall) C86114wI.A0d(parcel, BrowserLiteJSBridgeCall.CREATOR), parcel.readInt(), (Bundle) C86114wI.A0d(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        i3 = 384085702;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
                    i3 = -71467715;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(1267340153, A03);
            return onTransact;
        }
    }

    void BnW(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, int i, Bundle bundle);
}
