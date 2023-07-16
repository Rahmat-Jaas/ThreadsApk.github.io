package X;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6rM  reason: invalid class name and case insensitive filesystem */
public abstract class C113416rM {
    public final int A00;

    public C113416rM(int i) {
        this.A00 = i;
    }

    public final void A00(Status status) {
        C113426rN r1;
        Exception r0;
        if (this instanceof C93465le) {
            r1 = ((C93465le) this).A01;
            r0 = new C32102Af(status);
        } else if (this instanceof C93475lf) {
            r1 = ((C93475lf) this).A01;
            if (status.A02 != null) {
                r0 = new C93185l9(status);
            } else {
                r0 = new C32102Af(status);
            }
        } else {
            try {
                ((C93495lh) this).A00.A0A(status);
                return;
            } catch (IllegalStateException e) {
                Log.w("ApiCallRunner", "Exception reporting failure", e);
                return;
            }
        }
        r1.A00(r0);
    }

    public final void A01(Exception exc) {
        C113426rN r0;
        if (this instanceof C93465le) {
            r0 = ((C93465le) this).A01;
        } else if (this instanceof C93475lf) {
            r0 = ((C93475lf) this).A01;
        } else {
            C93495lh r4 = (C93495lh) this;
            String A0e = C18210wN.A0e(exc);
            String localizedMessage = exc.getLocalizedMessage();
            StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(A0e) + 2 + C86104wH.A0A(localizedMessage));
            A0s.append(A0e);
            A0s.append(": ");
            try {
                r4.A00.A0A(new Status(10, C18180wK.A0i(localizedMessage, A0s)));
                return;
            } catch (IllegalStateException e) {
                Log.w("ApiCallRunner", "Exception reporting failure", e);
                return;
            }
        }
        r0.A00(exc);
    }
}
