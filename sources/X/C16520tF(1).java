package X;

import android.app.Notification;
import android.content.Context;

/* renamed from: X.0tF  reason: invalid class name and case insensitive filesystem */
public final class C16520tF {
    public static volatile C16520tF A01;
    public final Notification A00;

    public C16520tF(Context context, Integer num) {
        C30949Gbq gbq = new C30949Gbq(context);
        gbq.A04();
        gbq.A02();
        gbq.A03();
        if (num != null) {
            gbq.A05(num.intValue());
        }
        this.A00 = gbq.A01();
    }
}
