package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableMap;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.2SE  reason: invalid class name */
public final class AnonymousClass2SE {
    public static final ImmutableMap A00(Throwable th) {
        Throwable th2;
        if (th == null) {
            return null;
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("type", C18220wO.A0q(th));
        StringWriter A0d = C18230wP.A0d();
        th.printStackTrace(new PrintWriter(A0d));
        builder.put("trace", A0d.toString());
        String message = th.getMessage();
        if (message != null) {
            builder.put(DialogModule.KEY_MESSAGE, message);
        }
        try {
            th2 = AnonymousClass7J2.A00(th);
        } catch (IllegalArgumentException unused) {
            th2 = th.getCause();
        }
        if (!(th2 == null || th2 == th)) {
            builder.put("cause_type", C18220wO.A0q(th2));
            String message2 = th2.getMessage();
            if (message2 != null) {
                builder.put("cause_message", message2);
            }
        }
        return builder.build();
    }
}
