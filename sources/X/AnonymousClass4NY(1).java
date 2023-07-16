package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4NY  reason: invalid class name */
public final class AnonymousClass4NY implements C83964sH {
    public final /* synthetic */ BKH A00;
    public final /* synthetic */ C62703aY A01;

    public final void onAuthorizeFail() {
    }

    public AnonymousClass4NY(BKH bkh, C62703aY r2) {
        this.A01 = r2;
        this.A00 = bkh;
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        C62703aY r5 = this.A01;
        BKH bkh = this.A00;
        r5.A00 = true;
        UserSession userSession = r5.A06;
        if (C63803iN.A0F(userSession)) {
            C49222r2.A00(userSession).A04(new C71814Kj(bkh, r5), "story_viewer", "STORY");
        } else {
            AnonymousClass0wJ.A0F().postDelayed(new C73284Ru(bkh, r5), 500);
        }
    }
}
