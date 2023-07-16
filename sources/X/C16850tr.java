package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.0tr  reason: invalid class name and case insensitive filesystem */
public final class C16850tr {
    public final Context A00;
    public final C16860ts A01;

    public static void A00(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("extra_notification_sender");
        String stringExtra2 = intent.getStringExtra("extra_notification_id");
        if (!TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra)) {
            Intent intent2 = new Intent("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK");
            intent2.setPackage(stringExtra);
            intent2.putExtra("extra_notification_id", stringExtra2);
            intent2.putExtra("extra_processor_completed", true);
            C17050uD r0 = new C17050uD();
            r0.A00 = context;
            context.getClass();
            C12710mM r2 = new C12710mM(r0);
            r2.A02(intent2);
            if (stringExtra != null) {
                C12610mC.A00(intent2, r2, stringExtra);
                return;
            }
            for (String A002 : new ArrayList(((C12530m4) C17250ua.A00).A08)) {
                C12610mC.A00(intent2, r2, A002);
            }
        }
    }

    public C16850tr(Context context, C16860ts r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
