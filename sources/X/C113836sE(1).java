package X;

import android.os.Bundle;
import android.util.Log;

/* renamed from: X.6sE  reason: invalid class name and case insensitive filesystem */
public abstract class C113836sE {
    public final int A00;
    public final int A01;
    public final Bundle A02;
    public final C113426rN A03 = new C113426rN();

    public final void A00(AnonymousClass6CH r3) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(r3);
            String.valueOf(valueOf);
            String.valueOf(valueOf2);
        }
        this.A03.A00.A0A(r3);
    }

    public final String toString() {
        boolean z;
        int i = this.A00;
        int i2 = this.A01;
        if (this instanceof C93885rw) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder A0s = C86114wI.A0s(55);
        A0s.append("Request { what=");
        A0s.append(i);
        A0s.append(" id=");
        A0s.append(i2);
        A0s.append(" oneWay=");
        A0s.append(z);
        return C18180wK.A0i("}", A0s);
    }

    public C113836sE(Bundle bundle, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bundle;
    }
}
