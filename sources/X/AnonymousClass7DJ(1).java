package X;

import android.content.Context;

/* renamed from: X.7DJ  reason: invalid class name */
public final class AnonymousClass7DJ {
    public static AnonymousClass7DJ A01 = new AnonymousClass7DJ();
    public C105086cr A00 = null;

    public static C105086cr A00(Context context) {
        C105086cr r0;
        AnonymousClass7DJ r1 = A01;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                r0 = new C105086cr(context);
                r1.A00 = r0;
            }
        }
        return r0;
    }
}
