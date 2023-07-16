package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1wJ  reason: invalid class name */
public final class AnonymousClass1wJ extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "PromoPaymentsFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "settings_promo_payments_options";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r20) {
        AnonymousClass4u2 r3 = r20;
        r3.Cqb(2131832211);
        r3.CtT(true);
        if (getContext() != null) {
            r3.Cro(new C24758DYo(C63393hP.A01(getContext(), R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color), (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass006.A00, -2, -2, -2, -2, -2, -2, -2, true));
        }
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1818280668);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(-2051486250, A02);
    }

    public final void onResume() {
        int A02 = C14030oh.A02(-260362329);
        super.onResume();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass4MA.A03(C18210wN.A0H(this, 208), A0v, 2131822330);
        setItems(A0v);
        setItems(A0v);
        C14030oh.A09(1713873437, A02);
    }
}
