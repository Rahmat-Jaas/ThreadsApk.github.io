package X;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0411000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;

/* renamed from: X.7Az  reason: invalid class name and case insensitive filesystem */
public final class C120467Az {
    public static final C84714tk A02(C41259M6w m6w, Callable callable, String[] strArr) {
        C04220Ms.A0B(m6w, 0);
        return new C1372486y(new KtSLambdaShape1S0411000_I2(callable, strArr, m6w, (C146958n9) null, 0, false));
    }

    public static final Object A00(CancellationSignal cancellationSignal, C41259M6w m6w, Callable callable, C146958n9 r9) {
        C27952Ew2 A00;
        if (m6w.isOpenInternal() && m6w.inTransaction()) {
            return callable.call();
        }
        AnonymousClass85x r0 = (AnonymousClass85x) r9.getContext().AOA(AnonymousClass85x.A02);
        if (r0 != null) {
            A00 = r0.A01;
        } else {
            A00 = C116096wQ.A00(m6w);
        }
        C27420EnC A17 = C86104wH.A17(r9);
        A17.BQt(C86164wN.A11(C25237DiI.A00((Integer) null, A00, new KtSLambdaShape5S0200000_I2((Object) A17, (Object) callable, (C146958n9) null, 7), C73874Uq.A00, 2), cancellationSignal, 33));
        return A17.A0B();
    }

    public static final Object A01(C41259M6w m6w, Callable callable, C146958n9 r5) {
        C27952Ew2 A01;
        if (m6w.isOpenInternal() && m6w.inTransaction()) {
            return callable.call();
        }
        AnonymousClass85x r0 = (AnonymousClass85x) r5.getContext().AOA(AnonymousClass85x.A02);
        if (r0 != null) {
            A01 = r0.A01;
        } else {
            A01 = C116096wQ.A01(m6w);
        }
        return C25599DoZ.A00(r5, A01, new KtSLambdaShape11S0100000_I2(callable, (C146958n9) null, 16));
    }
}
