package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4NT  reason: invalid class name */
public final class AnonymousClass4NT implements C83954sG {
    public final /* synthetic */ C29681z6 A00;
    public final /* synthetic */ AnonymousClass1nQ A01;

    public final void onFailure() {
    }

    public AnonymousClass4NT(C29681z6 r1, AnonymousClass1nQ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onSuccess() {
        UserSession userSession = this.A01.A00.A06;
        AnonymousClass3NS.A01(userSession).A03(AnonymousClass2AP.A0Q);
        if (C04660Oo.A00(userSession) != null) {
            CallerContext callerContext = C697249u.A07;
            String A02 = C62963bD.A02(callerContext, userSession, "app_start_sdk_token");
            if (!AnonymousClass0hA.A08(A02)) {
                C29681z6 r2 = this.A00;
                if (!r2.A05(callerContext, FXPFLinkageCacheDebugFragment.callerName) || !A02.equals(r2.A02(callerContext, FXPFLinkageCacheDebugFragment.callerName))) {
                    AnonymousClass3z4.A00(new AnonymousClass3z4(userSession), 6, true, false);
                }
            }
        }
    }
}
