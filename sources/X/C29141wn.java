package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1wn  reason: invalid class name and case insensitive filesystem */
public final class C29141wn extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "CaptionOptionsFragment";
    public AnonymousClass3C7 A00;
    public UserSession A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public final int getBottomPadding() {
        return 0;
    }

    public final String getModuleName() {
        return "caption_options";
    }

    public final int getTopPadding() {
        return 0;
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public static C29141wn A0B(UserSession userSession, String str, boolean z, boolean z2, boolean z3) {
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putBoolean("should_show_remove_captions", z);
        A0E.putBoolean("should_show_captions_toggle_description", z2);
        A0E.putBoolean("is_surface_elevated", z3);
        A0E.putString("entrypoint", str);
        C29141wn r0 = new C29141wn();
        r0.setArguments(A0E);
        return r0;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131835532);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1638379019);
        super.onCreate(bundle);
        Bundle A07 = C18250wR.A07(this);
        this.A01 = C18180wK.A0V(A07);
        this.A03 = A07.getBoolean("should_show_remove_captions");
        this.A04 = A07.getBoolean("should_show_captions_toggle_description");
        this.A05 = A07.getBoolean("is_surface_elevated");
        this.A02 = C18190wL.A0j(A07, "entrypoint");
        C14030oh.A09(-279220168, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        boolean z = this.A05;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(AnonymousClass4MC.A05(this, 3, 2131835532, C19537Axy.A06(this.A01)));
        if (this.A04) {
            String string = getString(2131823099);
            String string2 = getString(2131829580);
            SpannableStringBuilder A0D = C18190wL.A0D(string, string2);
            AnonymousClass3Zw.A02(A0D, this, string2, 1);
            C23411dm.A01(A0D, A0v);
        }
        C62153Xk r2 = new C62153Xk(getString(2131823096));
        r2.A04 = AnonymousClass0wJ.A0o(this, C31103Gfm.A03().getDisplayLanguage(), 2131823092);
        A0v.add(r2);
        if (this.A03) {
            C62133Xg r22 = new C62133Xg((View.OnClickListener) C18190wL.A0H(this, 221), 2131834635);
            r22.A02 = requireContext().getColor(R.color.igds_error_or_destructive);
            A0v.add(r22);
        }
        if (z) {
            setBottomSheetMenuItems(A0v);
        } else {
            setItems(A0v);
        }
    }
}
