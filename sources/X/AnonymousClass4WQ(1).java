package X;

import com.facebook.forker.Process;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.sdk.IGOnDemandFetcher;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.quickpromotion.sdk.IGOnDemandFetcher", f = "IGOnDemandFetcher.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {89, 117}, m = "fetchPromotions", n = {"key", "serverTriggerContext", "coroutineContext", "quickPromotionSurface", "IGqpSDKLogProducer", "slotFetcher", "devModeEnabled", "this", "key"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1"})
/* renamed from: X.4WQ  reason: invalid class name */
public final class AnonymousClass4WQ extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ IGOnDemandFetcher A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4WQ(IGOnDemandFetcher iGOnDemandFetcher, C146958n9 r2) {
        super(r2);
        this.A08 = iGOnDemandFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return IGOnDemandFetcher.A00((KtCSuperShape0S2100000_I2) null, (AnonymousClass32X) null, (QuickPromotionSurface) null, this.A08, (C568338s) null, (UserSession) null, this, (AnonymousClass0YY) null, false);
    }
}
