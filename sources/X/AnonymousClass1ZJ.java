package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ZJ  reason: invalid class name */
public final class AnonymousClass1ZJ extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "QuickPromotionDebugPreviewFloatingBannerFragment";
    public C28291u0 A00;
    public C131497s9 A01;
    public QuickPromotionSlot A02;
    public final C04530Oa A03 = C80644m9.A00(this);

    public final String getModuleName() {
        return "qp_debug_floating_banner_preview";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A05(r2);
        AnonymousClass4u2.A02(this, r2, 2131825609);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = C14030oh.A02(-774048738);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("QP_SLOT");
        } else {
            i = 0;
        }
        this.A02 = QuickPromotionSlot.values()[i];
        C14030oh.A09(-1167936093, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String str;
        int A022 = C14030oh.A02(708382353);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_preview_floating_banner_fragment, viewGroup, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        C28291u0 r3 = this.A00;
        if (r3 == null) {
            i = -585075455;
        } else {
            C36622Sa.A00();
            this.A01 = new C131497s9();
            UserSession A0X = AnonymousClass0wJ.A0X(this.A03);
            QuickPromotionSlot quickPromotionSlot = this.A02;
            if (quickPromotionSlot == null) {
                str = "slot";
            } else {
                C28191tp r1 = new C28191tp(this, quickPromotionSlot, A0X);
                C131497s9 r0 = this.A01;
                if (r0 == null) {
                    str = "controller";
                } else {
                    r0.A01(viewGroup2, r3, r1);
                    i = -1417166429;
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        C14030oh.A09(i, A022);
        return viewGroup2;
    }
}
