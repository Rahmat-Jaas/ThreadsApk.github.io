package X;

import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;

/* renamed from: X.6Fv  reason: invalid class name and case insensitive filesystem */
public final class C98516Fv {
    public static final Object A00(C41259M6w m6w, C146958n9 r6, AnonymousClass0YY r7) {
        KtSLambdaShape8S0301000_I2 ktSLambdaShape8S0301000_I2 = new KtSLambdaShape8S0301000_I2((Object) r7, (Object) m6w, (C146958n9) null, 39);
        AnonymousClass85x r0 = (AnonymousClass85x) r6.getContext().AOA(AnonymousClass85x.A02);
        if (r0 != null) {
            return C25599DoZ.A00(r6, r0.A01, ktSLambdaShape8S0301000_I2);
        }
        C27952Ew2 context = r6.getContext();
        C27420EnC A17 = C86104wH.A17(r6);
        try {
            m6w.getTransactionExecutor().execute(new C1363282h(m6w, context, ktSLambdaShape8S0301000_I2, A17));
        } catch (RejectedExecutionException e) {
            A17.AC9(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        return A17.A0B();
    }
}
