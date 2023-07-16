package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4LR  reason: invalid class name */
public final class AnonymousClass4LR implements C83014qe {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C34640IcN A01;
    public final /* synthetic */ BKH A02;
    public final /* synthetic */ C62703aY A03;

    public AnonymousClass4LR(FragmentActivity fragmentActivity, C34640IcN icN, BKH bkh, C62703aY r4) {
        this.A00 = fragmentActivity;
        this.A03 = r4;
        this.A01 = icN;
        this.A02 = bkh;
    }

    public final void CGw(boolean z) {
        AnonymousClass2AC r5;
        if (!z) {
            FragmentActivity fragmentActivity = this.A00;
            C62703aY r2 = this.A03;
            UserSession userSession = r2.A06;
            if (r2.A00) {
                r5 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON;
            } else {
                r5 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK;
            }
            C34640IcN icN = this.A01;
            Context context = icN.getContext();
            BKH bkh = this.A02;
            if (!C60423Oz.A01(fragmentActivity, context, r5, userSession, new AnonymousClass4LB(icN, bkh, r2), 64, true)) {
                C62703aY.A01(bkh, r2);
            }
        }
    }
}
