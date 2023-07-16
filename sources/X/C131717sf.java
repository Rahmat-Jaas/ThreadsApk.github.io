package X;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: X.7sf  reason: invalid class name and case insensitive filesystem */
public final class C131717sf implements C144608im {
    public final /* synthetic */ C105526dZ A00;

    public C131717sf(C105526dZ r1) {
        this.A00 = r1;
    }

    public final void CAi(Map map) {
        SharedPreferences.Editor edit;
        String str;
        SharedPreferences.Editor putBoolean;
        boolean z = false;
        C04220Ms.A0B(map, 0);
        Object obj = map.get(AnonymousClass000.A00(50));
        if (obj == C971568d.GRANTED) {
            putBoolean = this.A00.A00.edit().putBoolean("has_notification_permission_granted", true);
        } else {
            C971568d r1 = C971568d.DENIED;
            C105526dZ r0 = this.A00;
            if (obj == r1) {
                edit = r0.A00.edit();
                str = "has_notification_permission_granted";
            } else {
                z = true;
                edit = r0.A00.edit();
                str = "has_notification_permission_dialog_shown";
            }
            putBoolean = edit.putBoolean(str, z);
        }
        putBoolean.apply();
    }
}
