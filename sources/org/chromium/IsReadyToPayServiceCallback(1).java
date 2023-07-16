package org.chromium;

import X.C14030oh;
import X.C18180wK;
import X.C86104wH;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IsReadyToPayServiceCallback extends IInterface {

    public abstract class Stub extends Binder implements IsReadyToPayServiceCallback {

        public final class Proxy implements IsReadyToPayServiceCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(295817915);
                this.A00 = iBinder;
                C14030oh.A0A(1595062059, A03);
            }

            public final void BNM(boolean z) {
                int A03 = C14030oh.A03(-1745657688);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("org.chromium.IsReadyToPayServiceCallback");
                    obtain.writeInt(C18180wK.A1V(z ? 1 : 0) ? 1 : 0);
                    this.A00.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(763459629, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(-2022918848);
                IBinder iBinder = this.A00;
                C14030oh.A0A(184839095, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(283946562);
            attachInterface(this, "org.chromium.IsReadyToPayServiceCallback");
            C14030oh.A0A(1757333620, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(1062875995, C14030oh.A03(1847805771));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C14030oh.A03(595941057);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("org.chromium.IsReadyToPayServiceCallback");
                    if (i == 1) {
                        BNM(C86104wH.A1W(parcel));
                        i3 = 933607406;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("org.chromium.IsReadyToPayServiceCallback");
                    i3 = -71856580;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(-2043261294, A03);
            return onTransact;
        }
    }

    void BNM(boolean z);
}
