package X;

import android.app.NotificationChannel;
import android.content.Context;
import com.facebook.redex.IDxDListenerShape441S0100000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape8S0300000_I2_3;

/* renamed from: X.1nV  reason: invalid class name */
public final class AnonymousClass1nV extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nV(C697249u r7) {
        super("setupLocalNotifications", 416812969, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        NotificationChannel A002;
        C697249u r0 = this.A00;
        Context context = r0.A05;
        AnonymousClass3ES r3 = new AnonymousClass3ES(context);
        UserSession userSession = r0.A06;
        AnonymousClass0wJ.A1N(context, userSession);
        AnonymousClass49F r2 = (AnonymousClass49F) userSession.A01(AnonymousClass49F.class, new KtLambdaShape8S0300000_I2_3(3, context, r3, userSession));
        if (C18190wL.A04(C28161tl.A04(r2.A04), "notification_settings") == 1 && (A002 = AnonymousClass3Zd.A00(r2.A02, "ig_likes")) != null && A002.getImportance() != 0) {
            IDxDListenerShape441S0100000_1_I2 iDxDListenerShape441S0100000_1_I2 = new IDxDListenerShape441S0100000_1_I2(r2, 0);
            r2.A00 = iDxDListenerShape441S0100000_1_I2;
            C691847d.A02(iDxDListenerShape441S0100000_1_I2);
        }
    }
}
