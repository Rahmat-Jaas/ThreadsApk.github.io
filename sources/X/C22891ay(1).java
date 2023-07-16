package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* renamed from: X.1ay  reason: invalid class name and case insensitive filesystem */
public final class C22891ay extends C34640IcN implements C11630kW, C82424pb, L56 {
    public static final String __redex_internal_original_name = "OneTapOptInFragment";
    public TextView A00;
    public TextView A01;
    public C84654td A02;
    public C67083yq A03;
    public UserSession A04;
    public ProgressButton A05;
    public User A06;
    public C690346m A07;
    public final View.OnClickListener A08 = new IDxCListenerShape202S0100000_1_I2_1(this, 19);

    public final boolean BR2() {
        return true;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.CtO(false);
    }

    public final String getModuleName() {
        return "one_tap_upsell_nux";
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        C62223Xv.A00.A01(this.A04, "nux_one_tap_upsell");
        C84654td r0 = this.A02;
        if (r0 == null) {
            return false;
        }
        if (r0.CWQ() == null) {
            return true;
        }
        C18230wP.A1Q(this.A02);
        return true;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A02 = C67293zJ.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1896596510);
        super.onCreate(bundle);
        UserSession A0W = AnonymousClass0wJ.A0W(this);
        this.A04 = A0W;
        this.A03 = new C67083yq(this, this, A0W);
        C14030oh.A09(-2106445980, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-2036209396);
        this.A06 = AnonymousClass0wJ.A0Y(this.A04);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.nux_onetap_opt_in_redesign);
        this.A01 = AnonymousClass0wJ.A0L(A0H, R.id.field_title);
        this.A00 = AnonymousClass0wJ.A0L(A0H, R.id.field_detail);
        this.A05 = (ProgressButton) A0H.requireViewById(R.id.progress_button_text);
        View requireViewById = A0H.requireViewById(R.id.skip_button);
        C18200wM.A1D(A0H, R.id.nux_one_tap_lock);
        ImageView A0J = C18200wM.A0J(A0H, R.id.ig_logo);
        Context context = getContext();
        if (context != null) {
            C63163fI.A00(context, A0J);
        }
        IgImageView A0M = C18250wR.A0M(A0H, R.id.profile_image_view);
        this.A06.B4M();
        C18220wO.A1L(this, A0M, this.A06);
        AnonymousClass0wJ.A0L(A0H, R.id.username).setText(this.A06.BK7());
        this.A01.setText(2131831940);
        this.A00.setText(2131831938);
        this.A05.setText(2131831939);
        this.A05.setOnClickListener(this.A08);
        requireViewById.setOnClickListener(new IDxCListenerShape202S0100000_1_I2_1(this, 18));
        AnonymousClass3YT.A00.A02(this.A04, "nux_one_tap_upsell");
        C690346m r0 = new C690346m(this.A04);
        this.A07 = r0;
        C38040KHr.A01.A03(r0, AnonymousClass45Q.class);
        C14030oh.A09(-1853645408, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-459777844);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A05 = null;
        C690346m r2 = this.A07;
        if (r2 != null) {
            C38040KHr.A01.A04(r2, AnonymousClass45Q.class);
            this.A07 = null;
        }
        C14030oh.A09(-1646547496, A022);
    }
}
