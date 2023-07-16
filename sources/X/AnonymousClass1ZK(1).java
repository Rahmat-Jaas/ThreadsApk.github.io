package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ZK  reason: invalid class name */
public final class AnonymousClass1ZK extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "QuickPromotionDebugPreviewMegaphoneFragment";
    public View A00;
    public C81644o8 A01;
    public QuickPromotionSlot A02;
    public UserSession A03;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.CtT(true);
        AnonymousClass4u2.A02(this, r2, 2131825610);
    }

    public final String getModuleName() {
        return "qp_debug_megaphone_preview";
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1261677913);
        super.onCreate(bundle);
        this.A03 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(-338261059, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A1V;
        C95255zj r0;
        int A022 = C14030oh.A02(541886921);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.quick_promotion_preview_megaphone_fragment);
        Context context = getContext();
        C61833Vz A002 = C36622Sa.A00();
        UserSession userSession = this.A03;
        C24101gt A06 = A002.A06(context, this, new C28201tq(this, this, this, this.A02, userSession), userSession);
        C28291u0 r3 = (C28291u0) this.A01;
        String str = r3.A09.A00;
        C559735h r02 = r3.A08.A04;
        if (r02 == null || (r0 = r02.A00) == null) {
            A1V = C18180wK.A1V("condensed_megaphone".equals(str) ? 1 : 0);
        } else {
            r0.A01();
            A1V = 3;
        }
        View view = A06.getView(A1V, (View) null, viewGroup2, this.A01, (Object) null);
        this.A00 = view;
        viewGroup2.addView(view);
        C14030oh.A09(331952951, A022);
        return viewGroup2;
    }
}
