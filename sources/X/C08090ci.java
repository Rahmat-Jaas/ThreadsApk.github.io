package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.0ci  reason: invalid class name and case insensitive filesystem */
public final class C08090ci extends AnonymousClass0gG {
    public final /* synthetic */ Context A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08090ci(Context context) {
        super(309, 3, false, true);
        this.A00 = context;
    }

    public final void run() {
        AnonymousClass0RV r1 = new AnonymousClass0RV();
        Context context = this.A00;
        if (!r1.A01) {
            AnonymousClass0RV.A00(context, r1);
            r1.A01 = true;
        }
        AnonymousClass0RW r4 = r1.A00;
        if (r4 != null) {
            boolean z = false;
            if (C08360dF.A00().A00.getString("current", (String) null) != null) {
                z = true;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "app_did_startup");
            hashMap.put("user_is_logged_in", Boolean.valueOf(z));
            hashMap.put("detection_threshold_count", Integer.valueOf(C05210Rw.A00));
            hashMap.put("detection_threshold_interval_ms", Integer.valueOf(C05210Rw.A01));
            C05210Rw.A00(context, r4, hashMap);
        }
    }
}
