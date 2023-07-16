package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.errorreporting.lacrima.detector.broadcast.SecureShutdownBootBroadcastReceiver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.0al  reason: invalid class name and case insensitive filesystem */
public final class C07020al implements C16190sd {
    public final ArrayList ApV() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
        arrayList.add(new IntentFilter("com.facebook.android.intent.action.ACTION_SHUTDOWN"));
        return arrayList;
    }

    public final void CEI(Context context, Intent intent, C16200se r9) {
        AnonymousClass0Y1.A00(context).A01("last_device_shutdown_s", Long.toString(System.currentTimeMillis() / 1000));
        File file = SecureShutdownBootBroadcastReceiver.A00;
        if (file != null) {
            try {
                new File(file, "shut_down").createNewFile();
            } catch (IOException e) {
                C04790Pd.A00();
                AnonymousClass0LU.A0G("lacrima", "Could not create is_shutting_down marker file", e);
            }
        }
    }
}
