package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import java.util.List;

/* renamed from: X.3EB  reason: invalid class name */
public class AnonymousClass3EB {
    public final List A00;

    public final AnonymousClass3DC A00(AnonymousClass3DQ r21, C81224nO r22) {
        C81224nO r6 = r22;
        C04220Ms.A0B(r6, 0);
        AnonymousClass3DQ r8 = r21;
        C58413Fm r5 = r8.A03;
        try {
            for (C83324rC r0 : this.A00) {
                String DB3 = r0.DB3();
                AnonymousClass3DC A8q = r0.A8q(r8, r6);
                if (A8q.A08) {
                    if (DB3 != null) {
                        r5.A00(A8q.A00, AnonymousClass1j3.A02(r6), DB3, true);
                    }
                    if (A8q.A07) {
                        return A8q;
                    }
                } else if (DB3 == null) {
                    return A8q;
                } else {
                    r5.A00(A8q.A00, AnonymousClass1j3.A02(r6), DB3, false);
                    return A8q;
                }
            }
            return AnonymousClass3W5.A00();
        } catch (Exception e) {
            if (0 != 0) {
                String A02 = AnonymousClass1j3.A02(r6);
                String message = e.getMessage();
                if (message == null) {
                    message = "[null]";
                }
                r5.A00(new AnonymousClass40V(message), A02, (String) null, false);
            }
            return new AnonymousClass3DC((C81984oq) null, (C57233Ag) null, (C57243Ah) null, (Integer) null, e.getMessage(), e, HttpStatus.SC_GATEWAY_TIMEOUT, false, false, false);
        }
    }

    public AnonymousClass3EB(List list) {
        this.A00 = list;
    }
}
