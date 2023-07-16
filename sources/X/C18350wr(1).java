package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.0wr  reason: invalid class name and case insensitive filesystem */
public abstract class C18350wr extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C14030oh.A01(-790395757);
        AnonymousClass3FH A02 = C11190jg.A00(C10600ic.A00).A02((C10300i6) null);
        if (!"com.facebook.GET_PHONE_ID".equals(intent.getAction()) || A02 == null) {
            i = 593798351;
        } else {
            PendingIntent pendingIntent = (PendingIntent) getResultExtras(true).getParcelable("auth");
            if (pendingIntent != null && AnonymousClass3XE.A00(context, pendingIntent.getCreatorPackage())) {
                Bundle A06 = C18180wK.A06();
                A06.putLong("timestamp", A02.A00);
                A06.putString("origin", A02.A02);
                setResult(-1, A02.A01, A06);
            }
            i = 1968525047;
        }
        C14030oh.A0E(i, A01, intent);
    }
}
