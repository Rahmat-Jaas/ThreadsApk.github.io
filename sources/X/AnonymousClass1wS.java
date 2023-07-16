package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1wS  reason: invalid class name */
public final class AnonymousClass1wS extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "HelpOptionsFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "settings_help_options";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        r4.Cqb(2131829091);
        r4.CtT(C18180wK.A1X(this.mFragmentManager.A0I()));
        C58763Hc r2 = new C58763Hc(AnonymousClass006.A00);
        r2.A05 = C63393hP.A01(getContext(), R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        r4.Cro(r2.A00());
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1914170046);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(-1251962069, A02);
    }

    public final void onResume() {
        int A02 = C14030oh.A02(1054470077);
        super.onResume();
        C14030oh.A09(-1398256309, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C61573Ug r1 = new C61573Ug(this.A00, this);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        r1.A01(A0v);
        setItems(A0v);
    }
}
