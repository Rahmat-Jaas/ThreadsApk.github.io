package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.os.PowerManager;
import java.util.List;

/* renamed from: X.0CN  reason: invalid class name */
public final class AnonymousClass0CN {
    public static List A09;
    public PowerManager.WakeLock A00;
    public AnonymousClass0C0 A01;
    public final int A02;
    public final Context A03;
    public final Bundle A04;
    public final Messenger A05;
    public final C02570By A06;
    public final AnonymousClass0CJ A07;
    public final String A08;

    public static AnonymousClass0CN A00(Context context, Bundle bundle) {
        AnonymousClass0CJ r8;
        Bundle bundle2 = bundle;
        Messenger messenger = (Messenger) bundle2.getParcelable("_messenger");
        Bundle bundle3 = bundle2.getBundle("_extras");
        String string = bundle2.getString("_hack_action");
        int i = bundle2.getInt("_job_id", -1);
        if (i != -1) {
            Bundle bundle4 = bundle2.getBundle("_fallback_config");
            C02570By r7 = new C02570By(new C03060Ee(bundle2.getBundle("_upload_job_config")));
            if (bundle4 != null) {
                r8 = new AnonymousClass0CJ(bundle4.getLong("min_delay_ms", -1), bundle4.getLong("max_delay_ms", -1), bundle4.getString("action"));
            } else {
                r8 = null;
            }
            return new AnonymousClass0CN(context, bundle3, messenger, r7, r8, string, i);
        }
        StringBuilder sb = new StringBuilder("_job_id is ");
        sb.append(bundle2.get("_job_id"));
        throw new AnonymousClass0BI(sb.toString());
    }

    public final Bundle A01() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("_messenger", this.A05);
        bundle.putBundle("_extras", this.A04);
        bundle.putString("_hack_action", this.A08);
        bundle.putBundle("_upload_job_config", new Bundle((Bundle) this.A06.A00(new C03060Ee(new Bundle()))));
        bundle.putInt("_job_id", this.A02);
        AnonymousClass0CJ r4 = this.A07;
        if (r4 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("min_delay_ms", r4.A01);
            bundle2.putLong("max_delay_ms", r4.A00);
            bundle2.putString("action", r4.A02);
            bundle2.putInt("__VERSION_CODE", AnonymousClass0FX.A01());
            bundle.putBundle("_fallback_config", bundle2);
        }
        return bundle;
    }

    public AnonymousClass0CN(Context context, Bundle bundle, Messenger messenger, C02570By r4, AnonymousClass0CJ r5, String str, int i) {
        this.A05 = messenger;
        this.A04 = bundle;
        this.A08 = str;
        this.A06 = r4;
        this.A02 = i;
        this.A03 = context;
        this.A07 = r5;
    }
}
