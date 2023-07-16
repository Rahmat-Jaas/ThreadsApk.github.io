package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4LB  reason: invalid class name */
public final class AnonymousClass4LB implements C83004qd {
    public final /* synthetic */ C34640IcN A00;
    public final /* synthetic */ BKH A01;
    public final /* synthetic */ C62703aY A02;

    public AnonymousClass4LB(C34640IcN icN, BKH bkh, C62703aY r3) {
        this.A02 = r3;
        this.A01 = bkh;
        this.A00 = icN;
    }

    public final void afterSelection(boolean z) {
        AnonymousClass2AC r4;
        if (z) {
            String A0n = C18190wL.A0n(C03480Iw.A00());
            C62703aY r42 = this.A02;
            UserSession userSession = r42.A06;
            AnonymousClass2SK.A00(userSession, "primary_click", "self_story", C25567Do3.A02(userSession).A0K, A0n);
            r42.A04.CKL(this.A01, A0n);
            C34640IcN icN = this.A00;
            if (r42.A00) {
                AnonymousClass3ZC.A01(icN.requireContext(), AnonymousClass006.A0N);
                return;
            }
            return;
        }
        Activity rootActivity = this.A00.getRootActivity();
        C62703aY r1 = this.A02;
        BKH bkh = this.A01;
        UserSession userSession2 = r1.A06;
        if (r1.A00) {
            r4 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON;
        } else {
            r4 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK;
        }
        C19772B9s.A04(rootActivity, r1.A02, r4, AnonymousClass2AD.A02, bkh, r1.A03, r1.A04, userSession2);
    }
}
