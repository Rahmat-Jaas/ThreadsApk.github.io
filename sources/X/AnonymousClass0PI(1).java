package X;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0PI  reason: invalid class name */
public final class AnonymousClass0PI {
    public static AnonymousClass0PI A04;
    public static final boolean A05;
    public final C03460Im A00;
    public final AnonymousClass0Q4 A01;
    public final Map A02 = new HashMap();
    public final C020509n A03;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        }
        A05 = z;
    }

    public AnonymousClass0PI(Context context, AnonymousClass0Q4 r5) {
        C03840La r2 = new C03840La(this);
        this.A03 = r2;
        Context applicationContext = context.getApplicationContext();
        if (C03460Im.A02 == null) {
            C03460Im.A02 = new C03460Im(applicationContext);
            C03460Im.A03 = C03470In.A00();
        }
        this.A00 = C03460Im.A02;
        this.A01 = r5;
        AnonymousClass0J4.A02(context, "activity");
        AnonymousClass0J4.A03(r2);
    }
}
