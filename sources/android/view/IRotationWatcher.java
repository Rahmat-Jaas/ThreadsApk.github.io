package android.view;

import X.C14030oh;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IRotationWatcher extends IInterface {

    public abstract class Stub extends Binder implements IRotationWatcher {
        public static IRotationWatcher asInterface(IBinder iBinder) {
            return null;
        }

        public class Proxy implements IRotationWatcher {
            public Proxy(IBinder iBinder) {
                C14030oh.A0A(875279929, C14030oh.A03(851862653));
            }

            public IBinder asBinder() {
                C14030oh.A0A(1166090037, C14030oh.A03(2136751874));
                return null;
            }

            public String getInterfaceDescriptor() {
                C14030oh.A0A(1597013778, C14030oh.A03(540220819));
                return null;
            }

            public void onRotationChanged(int i) {
                C14030oh.A0A(-1896582477, C14030oh.A03(1888122664));
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(-835248957);
            attachInterface(this, "android.view.IRotationWatcher");
            C14030oh.A0A(516797885, A03);
        }

        public IBinder asBinder() {
            C14030oh.A0A(-492291844, C14030oh.A03(1469562091));
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            C14030oh.A0A(1683251098, C14030oh.A03(106357008));
            return false;
        }
    }

    void onRotationChanged(int i);
}
