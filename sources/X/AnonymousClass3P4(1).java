package X;

import java.io.StringWriter;

/* renamed from: X.3P4  reason: invalid class name */
public final class AnonymousClass3P4 {
    public static C207916c parseFromJson(MMo mMo) {
        return (C207916c) AnonymousClass0wJ.A0h(mMo, 192);
    }

    public static String A00(C207916c r4) {
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        A0K.A0b("sequence_number", r4.A01);
        A0K.A0b("impression_count", r4.A00);
        A0K.A0e("has_synced_with_server", r4.A03);
        A0K.A0b("last_impression_time_sec", r4.A02);
        return C18180wK.A0h(A0K, A0d);
    }
}
