package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4x4  reason: invalid class name */
public final class AnonymousClass4x4 extends BroadcastReceiver {
    public static AtomicReference A01 = new AtomicReference();
    public final Context A00;

    public AnonymousClass4x4(Context context) {
        this.A00 = context;
    }

    public final void onReceive(Context context, Intent intent) {
        int A012 = C14030oh.A01(-1811081252);
        synchronized (C121787Id.A09) {
            try {
                Iterator A14 = C86104wH.A14(C121787Id.A0A);
                while (A14.hasNext()) {
                    C121787Id.A02((C121787Id) A14.next());
                }
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0E(1512885565, A012, intent);
                    throw th;
                }
            }
        }
        this.A00.unregisterReceiver(this);
        C14030oh.A0E(1567831290, A012, intent);
    }
}
