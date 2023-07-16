package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;
import kotlin.jvm.internal.KtLambdaShape27S0200000_I2_11;

/* renamed from: X.1Zi  reason: invalid class name and case insensitive filesystem */
public final class C22751Zi extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "FanClubSettingsRecommendationsFragment";
    public AnonymousClass3HY A00;
    public final C04530Oa A01 = C62373Zc.A03(C18250wR.A0g(this, 26));
    public final C04530Oa A02 = C18220wO.A0M(C18250wR.A0g(this, 29), C18250wR.A0g(this, 27), new KtLambdaShape27S0200000_I2_11(3, (Object) null, this), C18210wN.A0l(C19470zv.class));
    public final C04530Oa A03 = C62373Zc.A03(C18250wR.A0g(this, 28));
    public final C04530Oa A04 = C80644m9.A00(this);

    public final String getModuleName() {
        return "fan_club_settings_recommendations";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (AnonymousClass0wJ.A1X(this.A03.getValue())) {
            C62793ak A0N = C18200wM.A0N(this.A02);
            C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(A0N, (C146958n9) null, 39), AnonymousClass3J5.A00(A0N), 3);
        }
        C04530Oa r5 = this.A04;
        CDB cdb = new CDB(AnonymousClass0wJ.A0X(r5));
        cdb.A00 = this;
        ((RecyclerView) view.findViewById(R.id.product_settings_recycle_view)).setAdapter(cdb);
        AnonymousClass495 A002 = AnonymousClass2O7.A00(AnonymousClass0wJ.A0X(r5));
        C04530Oa r3 = this.A01;
        String A0q = C18200wM.A0q(r3);
        C04220Ms.A0B(A0q, 1);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A002.A00, "ig_fan_club_settings_recommendations_full_screen_impression"), 1203);
        C18230wP.A1H(A0I, "creator_management_settings");
        C18250wR.A0x(A0I, AnonymousClass0wJ.A0d(A002.A01.getUserId()));
        C18250wR.A0z(A0I, A0q);
        this.A00 = new AnonymousClass3HY(this, requireActivity(), AnonymousClass0wJ.A0X(r5), C18200wM.A0q(r3), 48);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(cdb, this, (C146958n9) null, 21), AnonymousClass3J3.A00(getLifecycle()), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A05(r2);
        r2.Cqb(2131827148);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass3HY r2 = this.A00;
        if (r2 == null) {
            C04220Ms.A0E("fanClubSettingsRecommendationsNavigator");
            throw null;
        } else {
            r2.A00(requireContext(), (AnonymousClass23Z) null, i, i2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1380565510);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_settings_layout, viewGroup, false);
        C14030oh.A09(-451251995, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(338053213);
        super.onResume();
        C62793ak A0N = C18200wM.A0N(this.A02);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(A0N, (C146958n9) null, 39), AnonymousClass3J5.A00(A0N), 3);
        C14030oh.A09(-762315130, A022);
    }
}
