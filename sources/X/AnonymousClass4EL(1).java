package X;

import android.app.PendingIntent;
import android.os.SystemClock;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70;

/* renamed from: X.4EL  reason: invalid class name */
public final class AnonymousClass4EL implements C82714q9 {
    public final /* synthetic */ AnonymousClass49F A00;

    public final void BrB(String str) {
        C04220Ms.A0B(str, 0);
        AnonymousClass49F r3 = this.A00;
        UserSession userSession = r3.A04;
        C04220Ms.A0B(userSession, 0);
        C18180wK.A0v(((AnonymousClass35L) userSession.A01(AnonymousClass35L.class, new KtLambdaShape90S0100000_I2_70(userSession, 18))).A00.edit(), "UNSEEN_LIKES", str);
        PendingIntent A002 = AnonymousClass49F.A00(r3);
        if (A002 != null) {
            r3.A01.set(2, SystemClock.elapsedRealtime() + 86400000, A002);
        }
    }

    public AnonymousClass4EL(AnonymousClass49F r1) {
        this.A00 = r1;
    }
}
