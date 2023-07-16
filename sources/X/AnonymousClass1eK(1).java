package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.1eK  reason: invalid class name */
public final class AnonymousClass1eK extends AnonymousClass1eT {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C130667qT A02;
    public final /* synthetic */ C18330wh A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1eK(Context context, C130667qT r3, C18330wh r4, String str) {
        super(false);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = str;
        this.A00 = context;
    }

    public final void A03(AnonymousClass3XX r5) {
        Throwable th = r5.A01;
        if (AnonymousClass0wJ.A1W(th)) {
            C10450iM.A06("MarkFeedPostSensitive", "Unable to fetch bloks action", th);
        } else {
            C10450iM.A03("MarkFeedPostSensitive", "Unable to fetch bloks action");
        }
        String str = this.A01;
        if (str != null) {
            C63813iO.A02(this.A00, str, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, 0);
        }
        this.A03.dismiss();
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C33492Fx.A00(this.A02, (C61323St) obj);
        this.A03.dismiss();
    }
}
