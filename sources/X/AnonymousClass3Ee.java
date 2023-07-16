package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Ee  reason: invalid class name */
public final class AnonymousClass3Ee {
    public final SharedPreferences A00;

    public AnonymousClass3Ee(D2R d2r, UserSession userSession) {
        C04220Ms.A0B(d2r, 2);
        this.A00 = AnonymousClass3Zs.A03(userSession).A02(d2r, AnonymousClass3Ee.class);
    }

    public final void A00(Map map) {
        C04220Ms.A0B(map, 0);
        if (!map.isEmpty()) {
            SharedPreferences.Editor edit = this.A00.edit();
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                edit.putString(A0o.getKey().toString(), AnonymousClass3P4.A00((C207916c) A0o.getValue()));
            }
            edit.putBoolean("has_synced_notice_states", true);
            edit.apply();
        }
    }
}
