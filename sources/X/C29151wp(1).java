package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.facebook.redex.IDxRCallbackShape874S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1wp  reason: invalid class name and case insensitive filesystem */
public final class C29151wp extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "ShoppingOptionsFragment";
    public UserSession A00;
    public AnonymousClass3T7 A01;
    public AnonymousClass3Ea A02;

    public final String getModuleName() {
        return "shopping_business_settings";
    }

    public static void A0B(AnonymousClass3T7 r2, List list, int i, int i2) {
        list.add(new C62153Xk((View.OnClickListener) new IDxCListenerShape202S0100000_1_I2_1(r2, i), i2));
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public static void A0C(C29151wp r11) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass3T7 r3 = r11.A01;
        UserSession userSession = r11.A00;
        C04620Ok r7 = C06810aP.A01;
        User A012 = r7.A01(userSession);
        UserSession userSession2 = r3.A02;
        List A0v2 = C18230wP.A0v(userSession2, r7);
        if (A0v2 != null && A0v2.contains("POLICY_MIGRATION_SHOPPING_SETTINGS")) {
            A0B(r3, A0v, 212, 2131835878);
        }
        List A0v3 = C18230wP.A0v(userSession2, r7);
        if (A0v3 != null && A0v3.contains("DOMAIN_CHANGE_SHOPPING_SETTINGS")) {
            A0B(r3, A0v, 213, 2131835882);
        }
        Fragment fragment = r3.A00;
        FragmentActivity fragmentActivity = r3.A01;
        if (C25790Ds3.A04(userSession2)) {
            ((AnonymousClass491) C18180wK.A0c(userSession2, AnonymousClass491.class, 31)).A00(fragment, fragmentActivity);
        }
        if (A012.A2m()) {
            C62153Xk r10 = new C62153Xk((View.OnClickListener) new IDxCListenerShape202S0100000_1_I2_1(r3, 217), 2131835884);
            H1T h1t = new H1T(userSession2);
            C18220wO.A1K(h1t, "commerce/permissions/users/count/");
            C32165H8c A0T = AnonymousClass0wJ.A0T(h1t, C21791Se.class, AnonymousClass3OY.class);
            C63873iU.A0F(A0T, r3, r10, 37);
            C31155GhB.A03(A0T);
            A0v.add(r10);
        }
        List A0v4 = C18230wP.A0v(userSession2, r7);
        if (A0v4 != null && A0v4.contains("SHOP_INVENTORY_SHOPPING_SETTINGS")) {
            A0B(r3, A0v, 211, 2131835873);
            A0v.add(new C63293hC(2131835874));
        }
        AnonymousClass0TJ r8 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r8, userSession2, 36317766714068974L)) {
            A0B(r3, A0v, 218, 2131835879);
        }
        if (C63803iN.A0E(r8, userSession2, 36328207779113278L)) {
            A0B(r3, A0v, 219, 2131835875);
        }
        if (A012.A2m() && C63803iN.A0E(r8, userSession2, 36312848976053447L)) {
            A0B(r3, A0v, 210, 2131824594);
        }
        if (C49532rX.A00(userSession2)) {
            A0v.add(new C62153Xk((View.OnClickListener) C18200wM.A0R(A012, r3, 194), 2131827356));
            String string = fragment.getString(2131829574);
            String A0o = AnonymousClass0wJ.A0o(fragment, string, 2131827351);
            Uri A013 = C15430rJ.A01("https://www.facebook.com/help/instagram/3514581701914650?ref=igapp");
            SpannableStringBuilder A0E = C18200wM.A0E(A0o);
            AnonymousClass3Zw.A01(A0E, new C18670xb(A013), string);
            A0v.add(new C63293hC(A0E));
        }
        List A0v5 = C18230wP.A0v(userSession2, r7);
        if (A0v5 != null && A0v5.contains("CHECKOUT_SETUP_SHOPPING_SETTINGS")) {
            C62133Xg r1 = new C62133Xg((View.OnClickListener) new IDxCListenerShape202S0100000_1_I2_1(r3, 214), 2131835880);
            r1.A02 = fragmentActivity.getColor(R.color.blue_5);
            r1.A04 = fragment.getString(2131835881);
            A0v.add(r1);
        }
        List A0v6 = C18230wP.A0v(userSession2, r7);
        if (A0v6 != null && A0v6.contains("CHECKOUT_DEFERRED_PAYOUT_SHOPPING_SETTINGS")) {
            C62133Xg r12 = new C62133Xg((View.OnClickListener) new IDxCListenerShape202S0100000_1_I2_1(r3, 215), 2131835871);
            r12.A02 = fragmentActivity.getColor(R.color.blue_5);
            r12.A04 = fragment.getString(2131835872);
            A0v.add(r12);
        }
        List A0v7 = C18230wP.A0v(userSession2, r7);
        if (A0v7 != null && A0v7.contains("CHECKOUT_UPSELL_SHOPPING_SETTINGS")) {
            C62133Xg r13 = new C62133Xg((View.OnClickListener) new IDxCListenerShape202S0100000_1_I2_1(r3, 216), 2131835880);
            r13.A02 = fragmentActivity.getColor(R.color.blue_5);
            r13.A04 = fragment.getString(2131835881);
            A0v.add(r13);
        }
        if (AnonymousClass3T7.A00(userSession2)) {
            AnonymousClass4MC A05 = AnonymousClass4MC.A05(r3, 48, 2131835876, true);
            C29151wp r32 = r3.A03;
            H1T A0P = C18180wK.A0P(userSession2);
            C18220wO.A1K(A0P, "commerce/shopping_feature_settings/");
            C32165H8c A0T2 = AnonymousClass0wJ.A0T(A0P, AnonymousClass1RB.class, AnonymousClass3KU.class);
            C63873iU.A0F(A0T2, r32, A05, 36);
            C31155GhB.A03(A0T2);
            A0v.add(A05);
            A0v.add(new C63293hC(2131835877));
        }
        r11.setItems(A0v);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C23411dm.A04(this, r2, 2131835810);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-226012055);
        super.onCreate(bundle);
        UserSession A0V = C18180wK.A0V(this.mArguments);
        this.A00 = A0V;
        AnonymousClass3Ea r1 = new AnonymousClass3Ea(this, A0V);
        this.A02 = r1;
        this.A01 = new AnonymousClass3T7(this, A0V, this, r1);
        C14030oh.A09(-604336376, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-2129169730);
        super.onResume();
        A0C(this);
        C18180wK.A0I(AnonymousClass0wJ.A0M(this.A02.A00, "shopping_business_settings_opened"), 2697).Bb4();
        C63493hb.A05(getContext(), AnonymousClass06E.A00(this), this.A00, new IDxRCallbackShape874S0100000_1_I2(this, 1));
        C14030oh.A09(-1302382251, A022);
    }
}
