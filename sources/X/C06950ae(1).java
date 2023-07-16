package X;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* renamed from: X.0ae  reason: invalid class name and case insensitive filesystem */
public final class C06950ae implements C16210sf {
    public final void CEI(Context context, Intent intent, C16200se r9) {
        AnonymousClass0PC r1;
        C04100Mg r0 = C016607w.A01;
        Class<C07270bF> cls = C07270bF.class;
        AnonymousClass0PD r4 = AnonymousClass0PD.PERIODIC_BATTERY;
        synchronized (r0.A03) {
            Iterator it = r0.A07.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r1 = null;
                    break;
                }
                r1 = (AnonymousClass0PC) it.next();
                if (cls.isInstance(r1) && r1.Awx() == r4) {
                    break;
                }
            }
        }
        C07270bF r12 = (C07270bF) r1;
        if (r12 != null) {
            r12.A00();
        }
    }
}
