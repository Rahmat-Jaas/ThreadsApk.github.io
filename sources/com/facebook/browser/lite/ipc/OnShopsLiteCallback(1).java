package com.facebook.browser.lite.ipc;

import X.C14030oh;
import X.C86114wI;
import X.C86154wM;
import X.C86164wN;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface OnShopsLiteCallback extends IInterface {

    public abstract class Stub extends Binder implements OnShopsLiteCallback {

        public final class Proxy implements OnShopsLiteCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(-895528790);
                this.A00 = iBinder;
                C14030oh.A0A(1650200906, A03);
            }

            public final void Btr(int i) {
                int A03 = C14030oh.A03(-1464713206);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
                    obtain.writeInt(i);
                    C86164wN.A18(this.A00, obtain);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(-1082311057, A03);
                }
            }

            public final void C7R(Bundle bundle) {
                int A03 = C14030oh.A03(-527650080);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
                    if (bundle != null) {
                        C86114wI.A12(obtain, bundle, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    C86154wM.A1F(this.A00, obtain, 2);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(-1858213395, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(-628686181);
                IBinder iBinder = this.A00;
                C14030oh.A0A(646421585, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(-181620933);
            attachInterface(this, "com.facebook.browser.lite.ipc.OnShopsLiteCallback");
            C14030oh.A0A(-242922876, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(843513430, C14030oh.A03(1248177477));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C14030oh.A03(-324329794);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
                    if (i == 1) {
                        Btr(parcel.readInt());
                    } else if (i == 2) {
                        C7R((Bundle) C86114wI.A0d(parcel, Bundle.CREATOR));
                    }
                    i3 = 298094374;
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
                    i3 = -940265504;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(-1179578537, A03);
            return onTransact;
        }
    }

    void Btr(int i);

    void C7R(Bundle bundle);
}
