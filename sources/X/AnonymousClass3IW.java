package X;

import java.util.HashMap;
import kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7;

/* renamed from: X.3IW  reason: invalid class name */
public final class AnonymousClass3IW {
    public final AnonymousClass3II A00;
    public final C83224qz A01;

    public final AnonymousClass3HM A01(C83654rl r4) {
        C04220Ms.A0B(r4, 0);
        return new AnonymousClass3HM(r4, this.A00, this.A01);
    }

    public final void A02(C83654rl r2) {
        C04220Ms.A0B(r2, 0);
        this.A00.A02(r2);
    }

    public final C684944a A00() {
        Object obj = AnonymousClass31B.A00.get(C684944a.class);
        if (obj != null) {
            return (C684944a) obj;
        }
        throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingAnalyticsLogger");
    }

    public final void A03(C83654rl r6) {
        AnonymousClass3II r4 = this.A00;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape21S0201000_I2_7((Object) r4, (Object) r6, (C146958n9) null, 27), r4.A06, 3);
    }

    public AnonymousClass3IW() {
        HashMap hashMap = AnonymousClass31B.A00;
        Object obj = hashMap.get(C83224qz.class);
        if (obj != null) {
            this.A01 = (C83224qz) obj;
            Object obj2 = hashMap.get(AnonymousClass3II.class);
            if (obj2 != null) {
                this.A00 = (AnonymousClass3II) obj2;
                return;
            }
            throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.repository.BadgingRepository");
        }
        throw C18210wN.A0W("null cannot be cast to non-null type kotlinx.coroutines.CoroutineScope");
    }
}
