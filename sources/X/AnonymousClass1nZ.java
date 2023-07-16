package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1nZ  reason: invalid class name */
public final class AnonymousClass1nZ extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nZ(C697249u r3) {
        super("initCasdDetector", 1606061422);
        this.A00 = r3;
    }

    public final void loggedRun() {
        int i;
        AnonymousClass0UB[] r7;
        int i2;
        UserSession userSession = this.A00.A06;
        AnonymousClass0TJ A0J = C18180wK.A0J(userSession);
        if (C63803iN.A0E(A0J, userSession, 36318359419162970L)) {
            i = C63803iN.A01(A0J, userSession, 36599834395806999L);
        } else {
            i = 0;
        }
        AnonymousClass40F r9 = new AnonymousClass40F(C10770iu.A00());
        AnonymousClass0UA r8 = new AnonymousClass0UA(r9, i);
        synchronized (AnonymousClass0UD.class) {
            AnonymousClass0UD.A01 = r8;
            r7 = AnonymousClass0UD.A02;
            i2 = AnonymousClass0UD.A00;
            AnonymousClass0UD.A02 = null;
        }
        if (i > 0 && r7 != null) {
            int length = r7.length;
            int min = Math.min(i2, length);
            for (int i3 = 0; i3 < min; i3++) {
                AnonymousClass0UB r0 = r7[i3];
                r8.A00(r0.A02, r0.A00, r0.A01);
            }
            if (min < i2) {
                C14100oo ABJ = r9.A00.ABJ("content_resolver_dropped", 817892585);
                ABJ.A8S("early_calls_count", i2);
                ABJ.A8S("buffer_size", length);
                ABJ.report();
            }
        }
    }
}
