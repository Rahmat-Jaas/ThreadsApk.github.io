package X;

import android.os.Bundle;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.42w  reason: invalid class name */
public final class AnonymousClass42w implements C82294pO {
    public final /* synthetic */ BusinessConversionActivity A00;

    public final void CNh(C304821m r4) {
        C04220Ms.A0B(r4, 0);
        if (r4 == C304821m.STATUS_SUCCESS) {
            this.A00.Bel((Bundle) null);
        } else if (r4 == C304821m.STATUS_USER_SKIPPED_OR_ALREADY_LINKED) {
            this.A00.A0J((Bundle) null, true);
        }
    }

    public AnonymousClass42w(BusinessConversionActivity businessConversionActivity) {
        this.A00 = businessConversionActivity;
    }
}
