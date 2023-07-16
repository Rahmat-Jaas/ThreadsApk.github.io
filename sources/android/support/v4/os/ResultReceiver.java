package android.support.v4.os;

import X.C14030oh;
import X.C86124wJ;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;

public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(10);
    public IResultReceiver A00;

    public final class MyResultReceiver extends IResultReceiver.Stub {
        public MyResultReceiver() {
            C14030oh.A0A(-2120535402, C14030oh.A03(1724869948));
        }

        public final void Cgu(int i, Bundle bundle) {
            C14030oh.A0A(-923662967, C14030oh.A03(-2071555893));
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            IResultReceiver iResultReceiver = this.A00;
            if (iResultReceiver == null) {
                iResultReceiver = new MyResultReceiver();
                this.A00 = iResultReceiver;
            }
            parcel.writeStrongBinder(iResultReceiver.asBinder());
        }
    }

    public ResultReceiver(Parcel parcel) {
        IResultReceiver proxy;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            proxy = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(IResultReceiver.A00);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) {
                proxy = new IResultReceiver.Stub.Proxy(readStrongBinder);
            } else {
                proxy = (IResultReceiver) queryLocalInterface;
            }
        }
        this.A00 = proxy;
    }
}
