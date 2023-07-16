package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0101000_I2_3;
import kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19;

/* renamed from: X.1wy  reason: invalid class name */
public final class AnonymousClass1wy extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "BrandedContentAdsCreatorSettingsFragment";
    public int A00;
    public int A01;
    public final C04530Oa A02 = C62373Zc.A03(new KtLambdaShape39S0100000_I2_19(this, 8));
    public final C04530Oa A03 = C62373Zc.A03(new KtLambdaShape39S0100000_I2_19(this, 9));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(A0B(this));
    }

    public static final void A0C(AnonymousClass1wy r3) {
        A0D(r3, "posts");
        C25786Drz A0Q = C18180wK.A0Q(r3.requireActivity(), AnonymousClass0wJ.A0U(r3.A03));
        C24016D5r.A00();
        Bundle A06 = C18180wK.A06();
        C18210wN.A0x(A06, "bca_creator_setting");
        A06.putString("media_id", (String) null);
        C18180wK.A0x(A06, new AnonymousClass1ZQ(), A0Q);
    }

    public static final void A0D(AnonymousClass1wy r2, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r2, AnonymousClass0wJ.A0U(r2.A03)), "instagram_bc_ads_settings_action"), 1701);
        C18210wN.A1A(A0I, str);
        C18240wQ.A16(A0I, C18200wM.A0q(r2.A02));
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A07(r2, 2131822571);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public static final List A0B(AnonymousClass1wy r9) {
        C62593aM r3;
        C62593aM r32;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A03(A0v, 2131822643);
        C23411dm.A02(C18190wL.A0H(r9, 68), A0v, 2131822522);
        C23411dm.A02(C18190wL.A0H(r9, 69), A0v, 2131822600);
        C63273h9.A02(A0v);
        C63613hu.A03(A0v, 2131822607);
        if (r9.A00 != 0) {
            r3 = new C62593aM(C18190wL.A0H(r9, 64), AnonymousClass0wJ.A0m(AnonymousClass0wJ.A0B(r9), r9.A00, R.plurals.bca_requests), 2131822529, 0, true);
        } else {
            r3 = new C62593aM(C18190wL.A0H(r9, 65), 2131822529);
        }
        A0v.add(r3);
        if (r9.A01 != 0) {
            r32 = new C62593aM(C18190wL.A0H(r9, 66), AnonymousClass0wJ.A0m(AnonymousClass0wJ.A0B(r9), r9.A01, R.plurals.bca_requests), 2131822543, 0, true);
        } else {
            r32 = new C62593aM(C18190wL.A0H(r9, 67), 2131822543);
        }
        A0v.add(r32);
        return A0v;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1205286617);
        super.onCreate(bundle);
        C18240wQ.A16(C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, AnonymousClass0wJ.A0U(this.A03)), "instagram_bc_ads_settings_entry"), 1702), C18200wM.A0q(this.A02));
        C14030oh.A09(-629802923, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(993574659);
        C04220Ms.A0B(layoutInflater, 0);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape6S0101000_I2_3(this, (C146958n9) null, 23), C18200wM.A0M(this), 3);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C14030oh.A09(-2069873374, A022);
        return onCreateView;
    }
}
