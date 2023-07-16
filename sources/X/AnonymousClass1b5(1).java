package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.Map;

/* renamed from: X.1b5  reason: invalid class name */
public final class AnonymousClass1b5 extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "SignUpWithBizOptionFragment";
    public TextView A00;
    public C10300i6 A01;
    public CircularImageView A02;
    public AnonymousClass3HN A03;
    public String A04 = "suma";
    public String A05;
    public String A06;
    public BusinessFlowAnalyticsLogger A07;
    public final C63873iU A08 = C63873iU.A06(this, 114);

    public final String getModuleName() {
        return "sign_up_with_biz_option";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        C62223Xv.A00.A01(this.A01, "sign_up_with_biz_option");
        C10300i6 r4 = this.A01;
        String str = this.A04;
        C15730rn A002 = C34512Jv.A00(AnonymousClass006.A00);
        C18250wR.A19(A002, "sign_up_with_biz_option");
        A002.A0D("entry_point", str);
        A002.A0D("fb_user_id", (String) null);
        if (r4 != null) {
            C18180wK.A1K(A002, r4);
            return false;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1095703127);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = C18190wL.A0S(requireArguments);
        this.A05 = AnonymousClass2S3.A00(this.mArguments);
        if (requireArguments.containsKey("entry_point")) {
            this.A04 = StringFormatUtil.formatStrLocaleSafe("%s_%s", "suma", requireArguments.getString("entry_point"));
        }
        AnonymousClass3HN r0 = new AnonymousClass3HN(this, this.A01);
        this.A03 = r0;
        r0.A00();
        C34502Ju.A00();
        BusinessFlowAnalyticsLogger A002 = C37076Jk8.A00(C311924p.BUSINESS_SIGNUP_FLOW, this, this.A01, C18180wK.A0e());
        this.A07 = A002;
        if (A002 != null) {
            A002.Bdt(new C37408JrQ("sign_up_with_biz_option", this.A04, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        C14030oh.A09(868138010, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-803739848);
        LayoutInflater layoutInflater2 = layoutInflater;
        View A0H = AnonymousClass0wJ.A0H(layoutInflater2, viewGroup, R.layout.reg_container);
        layoutInflater2.inflate(R.layout.signup_with_biz_option_fragment_layout, C18190wL.A0E(A0H), true);
        TextView A0L = AnonymousClass0wJ.A0L(A0H, R.id.personal_sign_up_button);
        AnonymousClass0wJ.A17(A0L, 24, this);
        TextView A0L2 = AnonymousClass0wJ.A0L(A0H, R.id.business_sign_up_button);
        AnonymousClass0wJ.A17(A0L2, 25, this);
        this.A00 = AnonymousClass0wJ.A0L(A0H, R.id.create_ig_biz_text);
        C63553hn.A05(A0H, this, this.A01, C313625r.NONE, AnonymousClass265.A1O, false);
        AnonymousClass3X6.A00(C18180wK.A0G(A0H, R.id.log_in_button));
        Object A023 = C08960ea.A00(18299635877676825L).A02();
        C04220Ms.A06(A023);
        if (AnonymousClass0wJ.A1X(A023)) {
            C18190wL.A18(A0H, R.id.profile_container, 8);
            C18190wL.A18(A0H, R.id.generic_icon_view, 0);
        } else {
            this.A02 = (CircularImageView) A0H.findViewById(R.id.profile_image_view);
            Context context = getContext();
            AnonymousClass06E A002 = AnonymousClass06E.A00(this);
            String str = this.A05;
            C63873iU r2 = this.A08;
            C26291qM r9 = new C26291qM(StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\"}", "0", str));
            C31082GfJ gfJ = new C31082GfJ(C18180wK.A0j("%s|%s", new Object[]{AnonymousClass000.A00(91), C28174Ezk.A00(78)}));
            gfJ.A07(r9);
            C32165H8c A032 = gfJ.A03();
            A032.A00 = r2;
            C31155GhB.A01(context, A002, A032);
        }
        Object A024 = C08960ea.A00(18299635877611288L).A02();
        C04220Ms.A06(A024);
        if (AnonymousClass0wJ.A1X(A024)) {
            C18190wL.A18(A0H, R.id.grow_ig_biz_title, 0);
            A0L2.setText(2131824515);
            A0L.setText(2131824518);
            this.A00.setText(2131824536);
            C18190wL.A18(A0H, R.id.facebook_badge, 8);
        }
        C14030oh.A09(-1699192453, A022);
        return A0H;
    }
}
