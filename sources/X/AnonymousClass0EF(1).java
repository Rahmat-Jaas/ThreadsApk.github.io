package X;

import android.content.IntentFilter;
import com.instagram.realtimeclient.InAppNotificationDestinations;

/* renamed from: X.0EF  reason: invalid class name */
public class AnonymousClass0EF extends AnonymousClass0RC {
    public IntentFilter A00;
    public final C002000x A01;

    public AnonymousClass0EF(C16210sf r3, String str) {
        C002000x r0 = new C002000x(1);
        this.A01 = r0;
        if (str != null) {
            r0.put(str, r3);
            return;
        }
        throw new NullPointerException("Object is null!");
    }

    public AnonymousClass0EF(C16210sf r5, C16210sf r6) {
        C002000x r0 = new C002000x(2);
        this.A01 = r0;
        r0.put("android.intent.action.SCREEN_ON", r5);
        r0.put("android.intent.action.SCREEN_OFF", r6);
    }

    public AnonymousClass0EF(C16210sf r8, C16210sf r9, C16210sf r10, C16210sf r11, C16210sf r12) {
        C002000x r0 = new C002000x(5);
        this.A01 = r0;
        r0.put("android.appwidget.action.APPWIDGET_UPDATE", r8);
        r0.put("thread_update_event", r9);
        r0.put("active_session_change_event", r10);
        r0.put(InAppNotificationDestinations.DIRECT_ACTION, r11);
        r0.put("direct-inbox", r12);
    }
}
