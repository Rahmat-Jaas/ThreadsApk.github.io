package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: X.0ak  reason: invalid class name and case insensitive filesystem */
public final class C07010ak implements C16190sd {
    public final ArrayList ApV() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IntentFilter("android.intent.action.BOOT_COMPLETED"));
        arrayList.add(new IntentFilter("com.facebook.android.intent.action.BOOT_COMPLETED"));
        return arrayList;
    }

    public final void CEI(Context context, Intent intent, C16200se r8) {
        AnonymousClass0Y1.A00(context).A01("last_boot_completed_s", Long.toString(System.currentTimeMillis() / 1000));
    }
}
