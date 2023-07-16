package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape2S0110000_1_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.1bI  reason: invalid class name */
public final class AnonymousClass1bI extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "ProfessionalAccountSelectionFragment";
    public Activity A00;
    public C84654td A01;
    public C19370zl A02;
    public UserSession A03;

    public final String getModuleName() {
        return "professional_account_selection";
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final boolean onBackPressed() {
        C19370zl r1 = this.A02;
        r1.A00.BbZ(new C37408JrQ("personal_or_professional_account_selection", r1.A01, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        ((BusinessConversionActivity) this.A01).CfG((Bundle) null);
        return true;
    }

    private void A00(Drawable drawable, LayoutInflater layoutInflater, ViewGroup viewGroup, String str, String str2, boolean z) {
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.account_type_card);
        viewGroup.addView(A0H);
        TextView A0L = AnonymousClass0wJ.A0L(A0H, R.id.card_title);
        TextView A0L2 = AnonymousClass0wJ.A0L(A0H, R.id.card_subtitle);
        ImageView A0J = C18200wM.A0J(A0H, R.id.card_icon);
        TextView A0L3 = AnonymousClass0wJ.A0L(A0H, R.id.card_cta);
        A0L.setText(str);
        A0L2.setText(str2);
        A0J.setImageDrawable(drawable);
        A0H.setOnClickListener(new IDxCListenerShape2S0110000_1_I2(1, this, z));
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(str);
        A0r.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A0r.append(str2);
        A0r.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A0H.setContentDescription(C18200wM.A0m(A0L3.getText(), A0r));
        C18210wN.A0y(A0H);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        C84654td A012 = C67293zJ.A01(this);
        A012.getClass();
        this.A01 = A012;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-676310747);
        super.onCreate(bundle);
        this.A00 = getActivity();
        this.A03 = AnonymousClass0wJ.A0W(this);
        String A0k = C18190wL.A0k(this);
        this.A02 = (C19370zl) new AnonymousClass7IU((C147138nS) new C66413xZ(this.A01, this.A03, A0k), (AnonymousClass06C) this).A01(C19370zl.class);
        C14030oh.A09(-16143230, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(2035307516);
        LayoutInflater layoutInflater2 = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.account_type_selection_fragment, viewGroup, false);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.title);
        A0L.setText(2131823294);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A0L.getLayoutParams();
        marginLayoutParams.bottomMargin = AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height);
        A0L.setLayoutParams(marginLayoutParams);
        ViewGroup A0G = C18240wQ.A0G(inflate, R.id.cards_container);
        A00(getContext().getDrawable(R.drawable.instagram_media_account_pano_outline_24), layoutInflater2, A0G, getString(2131820891), getString(2131820890), true);
        A00(getContext().getDrawable(R.drawable.instagram_user_pano_outline_24), layoutInflater2, A0G, getString(2131820889), getString(2131820888), false);
        View findViewById = inflate.findViewById(R.id.cross_button);
        getContext();
        AnonymousClass0wJ.A16(findViewById, 161, this);
        C14030oh.A09(65905087, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19370zl r1 = this.A02;
        r1.A00.Bdt(new C37408JrQ("personal_or_professional_account_selection", r1.A01, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
    }
}
