package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: X.40v  reason: invalid class name and case insensitive filesystem */
public final class C678640v implements C16190sd {
    public final Activity A00;

    public final void CEI(Context context, Intent intent, C16200se r4) {
        AnonymousClass0wJ.A1M(context, 0, r4);
        this.A00.onBackPressed();
        context.unregisterReceiver((BroadcastReceiver) r4);
    }

    public C678640v(Activity activity) {
        this.A00 = activity;
    }

    public final ArrayList ApV() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(new IntentFilter("CLOSE_CLIPS_RIGHT_PANEL_FRAGMENT"));
        return A0v;
    }
}
