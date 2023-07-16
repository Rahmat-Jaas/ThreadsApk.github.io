package X;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.6y0  reason: invalid class name and case insensitive filesystem */
public final class C117026y0 {
    public static final int A00(Throwable th) {
        if (th instanceof C1373788i) {
            return ((C1373788i) th).A00;
        }
        if (th instanceof C92875kA) {
            return ((C92875kA) th).A00;
        }
        return 0;
    }

    public static final String A01(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter A0d = C18230wP.A0d();
        PrintWriter printWriter = new PrintWriter(A0d);
        try {
            th.printStackTrace(printWriter);
            return C18190wL.A0n(A0d.getBuffer());
        } finally {
            try {
                A0d.close();
                printWriter.close();
            } catch (IOException unused) {
            }
        }
    }
}
