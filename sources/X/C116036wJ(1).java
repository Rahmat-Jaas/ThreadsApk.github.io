package X;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner$attach$1;

/* renamed from: X.6wJ  reason: invalid class name and case insensitive filesystem */
public final class C116036wJ {
    public static final AnonymousClass066 A00() {
        return C123907Zw.A08;
    }

    public static final void A01(Context context) {
        C123907Zw r2 = C123907Zw.A08;
        r2.A02 = new Handler();
        r2.A05.A09(AnonymousClass060.ON_CREATE);
        ((Application) C86154wM.A09(context)).registerActivityLifecycleCallbacks(new ProcessLifecycleOwner$attach$1(r2));
    }
}
