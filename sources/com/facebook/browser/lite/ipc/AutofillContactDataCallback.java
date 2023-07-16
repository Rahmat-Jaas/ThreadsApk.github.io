package com.facebook.browser.lite.ipc;

import X.C14030oh;
import X.C86164wN;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public interface AutofillContactDataCallback extends IInterface {

    public abstract class Stub extends Binder implements AutofillContactDataCallback {

        public final class Proxy implements AutofillContactDataCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(-846231890);
                this.A00 = iBinder;
                C14030oh.A0A(-1543772660, A03);
            }

            public final void BnY(List list) {
                int A03 = C14030oh.A03(217903108);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.AutofillContactDataCallback");
                    obtain.writeStringList(list);
                    C86164wN.A18(this.A00, obtain);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(955285902, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(2097453670);
                IBinder iBinder = this.A00;
                C14030oh.A0A(956006122, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(277936071);
            attachInterface(this, "com.facebook.browser.lite.ipc.AutofillContactDataCallback");
            C14030oh.A0A(1177855588, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(595727461, C14030oh.A03(340444089));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C14030oh.A03(1068407367);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.AutofillContactDataCallback");
                    if (i == 1) {
                        BnY(parcel.createStringArrayList());
                        i3 = 1681541556;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.AutofillContactDataCallback");
                    i3 = -1746015955;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(-812655039, A03);
            return onTransact;
        }
    }

    void BnY(List list);
}
