package X;

import android.os.Bundle;
import java.util.Collections;

/* renamed from: X.7k5  reason: invalid class name and case insensitive filesystem */
public final class C128687k5 implements C143598h0 {
    public final C121157Ek A00;

    public final M5J Cuw(Bundle bundle, C145338kL r9, C120967Dk r10) {
        C121157Ek r6 = this.A00;
        String string = bundle.getString("PAYMENT_TYPE");
        return C86114wI.A0H(C121157Ek.A00(r6, r6.A01, C120977Dl.A01(AnonymousClass76O.A00(), new C99136Ig(), "DISABLE_FBPAY_PIN", C121257Ff.A00(bundle), Collections.singleton(r10)), string, 12), this, 9);
    }

    public C128687k5(C121157Ek r1) {
        this.A00 = r1;
    }
}
