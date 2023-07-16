package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.42v  reason: invalid class name and case insensitive filesystem */
public final class C682342v implements C39764KzY {
    public final /* synthetic */ BaseFragmentActivity A00;
    public final /* synthetic */ C35394Iu2 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public C682342v(BaseFragmentActivity baseFragmentActivity, C35394Iu2 iu2, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = iu2;
        this.A00 = baseFragmentActivity;
    }

    public final void CRL() {
        AnonymousClass3X0.A00(this.A01, this.A02, this.A03);
        C63813iO.A06(this.A00);
    }

    public final void CXi(String str) {
        UserSession userSession = this.A02;
        C37741K2b A012 = C37741K2b.A01(userSession);
        String str2 = this.A03;
        C37741K2b.A0B(A012, str2, this.A01.toString(), (String) null);
        BaseFragmentActivity baseFragmentActivity = this.A00;
        C04220Ms.A0B(str2, 1);
        AnonymousClass3LB.A01(baseFragmentActivity, userSession, str2);
    }

    public final void CXj() {
        AnonymousClass3LB.A00(this.A00, this.A01, this.A02, this.A03);
    }
}
