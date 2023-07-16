package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.6RB  reason: invalid class name */
public final class AnonymousClass6RB {
    public static final String A00(AnonymousClass5M9 r4) {
        if (r4 != null) {
            try {
                StringWriter A0d = C18230wP.A0d();
                MMp A04 = C18987Aon.A00.A04(A0d);
                AnonymousClass708.A00(A04, r4);
                A04.close();
                return A0d.toString();
            } catch (IOException e) {
                C10450iM.A06(AnonymousClass000.A00(254), "Failed to serialize ClipsTemplateInfo from ClipsDraft", e);
            }
        }
        return null;
    }
}
