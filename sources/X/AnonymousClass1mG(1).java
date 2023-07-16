package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.1mG  reason: invalid class name */
public final class AnonymousClass1mG extends AnonymousClass0gG {
    public final /* synthetic */ C10300i6 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mG(C10300i6 r5) {
        super(1073701796, 4, false, true);
        this.A00 = r5;
    }

    public final void run() {
        String str;
        C10300i6 r2 = this.A00;
        String A0r = C18230wP.A0r(r2);
        if (C63693i8.A08(r2) || (str = AnonymousClass47l.A02) == null || str.length() == 0) {
            Context context = C10600ic.A00;
            C04220Ms.A06(context);
            List A04 = C63693i8.A04(context, r2, "ig_android_access_library_fx_fetch_active_msgr_token", A0r);
            String str2 = null;
            if (AnonymousClass00J.A0D(A04) != null) {
                AnonymousClass3VA r1 = ((AnonymousClass3H2) AnonymousClass00J.A0C(A04)).A01;
                AnonymousClass47l.A02 = r1.A00;
                AnonymousClass3VD r12 = r1.A01;
                AnonymousClass47l.A00 = r12.A02;
                str2 = r12.A00;
            } else {
                AnonymousClass47l.A02 = A0r;
                AnonymousClass47l.A00 = A0r;
            }
            AnonymousClass47l.A01 = str2;
        }
    }
}
