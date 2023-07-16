package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.7uk  reason: invalid class name and case insensitive filesystem */
public final class C132937uk implements C33655Hs1 {
    public final Integer BIz() {
        return AnonymousClass006.A00;
    }

    public final String toJson() {
        try {
            StringWriter A0d = C18230wP.A0d();
            return C18180wK.A0h(C18180wK.A0K(A0d), A0d);
        } catch (IOException unused) {
            return null;
        }
    }
}
