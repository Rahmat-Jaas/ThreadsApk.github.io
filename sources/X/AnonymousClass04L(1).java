package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;

/* renamed from: X.04L  reason: invalid class name */
public final class AnonymousClass04L extends AnonymousClass0EL {
    public final C15780rs A00;

    public final boolean A0H(Context context, ComponentInfo componentInfo) {
        ApplicationInfo applicationInfo = componentInfo.applicationInfo;
        if (applicationInfo == null) {
            this.A02.Ccw("ThirdPartyIntentScope", "Null application info.", (Throwable) null);
            return false;
        }
        try {
            return !this.A00.A06(C15780rs.A00(context, applicationInfo.uid), C15980sH.A04(context));
        } catch (SecurityException e) {
            this.A02.Ccw("ThirdPartyIntentScope", AnonymousClass00U.A0L("Unexpected exception in checking trusted app for ", componentInfo.packageName), e);
            return !A0E();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass04L(C16350su r2, C16250sj r3, C16240si r4) {
        super(r2, r3, r4);
        C15780rs A002 = C15760rq.A00();
        this.A00 = A002;
    }

    public final Integer A0B() {
        return AnonymousClass006.A0u;
    }
}
