package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0EM  reason: invalid class name */
public final class AnonymousClass0EM extends C16980u6 {
    public final Intent A09(Context context, Intent intent, String str) {
        return intent;
    }

    public final Intent A08(Context context, Intent intent, String str) {
        this.A02.Ccw("AnyIntentScope", AnonymousClass00U.A0L("Any_UNSAFE scope used for launching activity: ", C16980u6.A03(intent)), (Throwable) null);
        return intent;
    }

    public final Intent A0A(Context context, Intent intent, String str) {
        this.A02.Ccw("AnyIntentScope", AnonymousClass00U.A0L("Any_UNSAFE scope used for launching service: ", C16980u6.A03(intent)), (Throwable) null);
        return intent;
    }

    public final List A0D(Context context, Intent intent, String str) {
        this.A02.Ccw("AnyIntentScope", AnonymousClass00U.A0L("Any_UNSAFE scope used for sending a broadcast: ", C16980u6.A03(intent)), (Throwable) null);
        return Collections.singletonList(intent);
    }

    public final boolean A0G(Context context, PackageInfo packageInfo) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass0EM(C16350su r1, C16250sj r2, C16240si r3) {
        super(r1, r2, r3);
    }

    public final Integer A0B() {
        return AnonymousClass006.A15;
    }
}
