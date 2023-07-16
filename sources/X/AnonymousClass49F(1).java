package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.instagram.notifications.local.LocalNotificationAlarmReceiver;
import com.instagram.service.session.UserSession;

/* renamed from: X.49F  reason: invalid class name */
public final class AnonymousClass49F implements AnonymousClass0i4 {
    public C10390iG A00;
    public final AlarmManager A01;
    public final Context A02;
    public final AnonymousClass3ES A03;
    public final UserSession A04;

    public static final PendingIntent A00(AnonymousClass49F r4) {
        Context context = r4.A02;
        Intent A042 = C18250wR.A04(context, LocalNotificationAlarmReceiver.class);
        A042.setAction("com.instagram.android.LOCAL_NOTIFICATION_EVENT");
        A042.putExtra("local_notification_type", "UNSEEN_LIKES");
        C18230wP.A12(A042, r4.A04);
        return C18210wN.A0I(context, A042).A02(context, 0, 134217728);
    }

    public AnonymousClass49F(Context context, AnonymousClass3ES r4, UserSession userSession) {
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = r4;
        Object systemService = context.getSystemService("alarm");
        C04220Ms.A0C(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.A01 = (AlarmManager) systemService;
    }

    public final void onSessionWillEnd() {
        PendingIntent A002 = A00(this);
        if (A002 != null) {
            this.A01.cancel(A002);
        }
        C10390iG r0 = this.A00;
        if (r0 != null) {
            C691847d.A03(r0);
        }
    }
}
