package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S1411000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1;

/* renamed from: X.57d  reason: invalid class name and case insensitive filesystem */
public final class C882057d extends C62793ak {
    public final C880856r A00 = C880856r.A03();
    public final C963464k A01;
    public final UserSession A02;

    public final void A00(Context context, String str) {
        C04220Ms.A0B(str, 1);
        C963464k r4 = this.A01;
        UserSession userSession = this.A02;
        C964164t r6 = C964164t.A00;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1411000_I2(context, r4, userSession, r6, str, (C146958n9) null, 1, false), r4.A01, 3);
    }

    public C882057d(C963464k r5, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r5;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0101000_I2_1(this, (C146958n9) null, 0), AnonymousClass3J5.A00(this), 3);
    }
}
