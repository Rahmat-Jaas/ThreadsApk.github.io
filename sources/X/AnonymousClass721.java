package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.721  reason: invalid class name */
public final class AnonymousClass721 {
    public static final String A00(Throwable th) {
        StringWriter A0d = C18230wP.A0d();
        PrintWriter printWriter = new PrintWriter(A0d);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return C18190wL.A0n(A0d);
    }

    public static final void A01(Throwable th, Throwable th2) {
        AnonymousClass0wJ.A1N(th, th2);
        if (th != th2) {
            AnonymousClass6Z4.A00.A00(th, th2);
        }
    }
}
