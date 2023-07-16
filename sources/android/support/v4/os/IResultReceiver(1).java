package android.support.v4.os;

import X.C14030oh;
import X.C86114wI;
import X.C86164wN;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IResultReceiver extends IInterface {
    public static final String A00 = "android$support$v4$os$IResultReceiver".replace('$', '.');

    public abstract class Stub extends Binder implements IResultReceiver {

        public final class Proxy implements IResultReceiver {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(-719786202);
                this.A00 = iBinder;
                C14030oh.A0A(-735258490, A03);
            }

            public final void Cgu(int i, Bundle bundle) {
                int A03 = C14030oh.A03(-128159714);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IResultReceiver.A00);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        C86114wI.A12(obtain, bundle, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    C86164wN.A18(this.A00, obtain);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(-1123239563, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(-72646489);
                IBinder iBinder = this.A00;
                C14030oh.A0A(-139497637, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(44809228);
            attachInterface(this, IResultReceiver.A00);
            C14030oh.A0A(-331523751, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(2117509100, C14030oh.A03(897597318));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C14030oh.A03(-250147080);
            String str = IResultReceiver.A00;
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(str);
                    if (i == 1) {
                        Cgu(parcel.readInt(), (Bundle) C86114wI.A0d(parcel, Bundle.CREATOR));
                        i3 = 151958997;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(str);
                    i3 = 1297152264;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(-798119436, A03);
            return onTransact;
        }
    }

    void Cgu(int i, Bundle bundle);
}
