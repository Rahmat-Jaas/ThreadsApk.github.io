package X;

import com.facebook.forker.Process;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.api.CLNoticeApi;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.share.facebook.upsell.api.CLNoticeApi", f = "CLNoticeApi.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {85, 105}, m = "fetchCXPNoticesWithLogging", n = {"this", "userSession", "entrypoints", "noticeEligibilityMetaData", "performanceLogger", "memoryCacheStateKey", "useEligibilityCache", "diskCacheLimitMs", "entrypoints", "performanceLogger", "memoryCacheStateKey", "eligibilityCache", "result", "useEligibilityCache"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
/* renamed from: X.4WS  reason: invalid class name */
public final class AnonymousClass4WS extends C27236EjA {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ CLNoticeApi A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4WS(CLNoticeApi cLNoticeApi, C146958n9 r2) {
        super(r2);
        this.A0A = cLNoticeApi;
    }

    public final Object invokeSuspend(Object obj) {
        this.A09 = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return this.A0A.A01((GQLCallInputCInputShape0S0000000) null, (KtCSuperShape0S0060000_I2) null, (ImmutableList) null, (UserSession) null, (AnonymousClass3VY) null, (CXPNoticeStateRepository) null, this, 0, false);
    }
}
