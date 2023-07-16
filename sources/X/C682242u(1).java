package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.42u  reason: invalid class name and case insensitive filesystem */
public final class C682242u implements C39764KzY {
    public final /* synthetic */ BaseFragmentActivity A00;
    public final /* synthetic */ AnonymousClass1ai A01;

    public C682242u(BaseFragmentActivity baseFragmentActivity, AnonymousClass1ai r2) {
        this.A01 = r2;
        this.A00 = baseFragmentActivity;
    }

    public final void CRL() {
        C35394Iu2 iu2 = C35394Iu2.A0b;
        AnonymousClass1ai r2 = this.A01;
        AnonymousClass3X0.A00(iu2, AnonymousClass1ai.A01(r2), "promote_no_permissions");
        C63813iO.A06(r2.getActivity());
    }

    public final void CXi(String str) {
        AnonymousClass1ai r4 = this.A01;
        C37741K2b.A0B(C37741K2b.A01(AnonymousClass1ai.A01(r4)), "promote_no_permissions", C35394Iu2.A0b.toString(), (String) null);
        AnonymousClass3LB.A01(this.A00, AnonymousClass1ai.A01(r4), "promote_no_permissions");
    }

    public final void CXj() {
        BaseFragmentActivity baseFragmentActivity = this.A00;
        C35394Iu2 iu2 = C35394Iu2.A0b;
        UserSession A012 = AnonymousClass1ai.A01(this.A01);
        C04220Ms.A0B(baseFragmentActivity, 0);
        AnonymousClass0wJ.A1Q(iu2, A012);
        C37367JqP.A00(baseFragmentActivity, AnonymousClass06E.A00(baseFragmentActivity), new C682342v(baseFragmentActivity, iu2, A012, "promote_no_permissions"), A012);
    }
}
