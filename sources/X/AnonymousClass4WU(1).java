package X;

import android.content.Context;
import com.facebook.forker.Process;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.quickpromotion.sdk.InstagramQpSdkModule", f = "InstagramQPSdkModule.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {252}, m = "choosePromotions", n = {"this", "userSession", "context", "triggerContext", "callback", "schedulerHelper", "qpUserFlowLogger", "fetchScope", "$this$choosePromotions_u24lambda_u241", "controllerManager", "destination$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10"})
/* renamed from: X.4WU  reason: invalid class name */
public final class AnonymousClass4WU extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public /* synthetic */ Object A0E;
    public final /* synthetic */ InstagramQpSdkModule A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4WU(InstagramQpSdkModule instagramQpSdkModule, C146958n9 r2) {
        super(r2);
        this.A0F = instagramQpSdkModule;
    }

    public final Object invokeSuspend(Object obj) {
        this.A0E = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return InstagramQpSdkModule.A00((Context) null, (C84574tR) null, (AnonymousClass3UU) null, (C57213Ae) null, (AnonymousClass3RD) null, this.A0F, (UserSession) null, (Map) null, this, (C83224qz) null);
    }
}
