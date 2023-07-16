package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.1xf  reason: invalid class name and case insensitive filesystem */
public final class C29271xf extends C23411dm implements C21839C2o, C21735BzM {
    public static final String __redex_internal_original_name = "TrendTransparencySheetFragment";
    public C13330nS A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return "trend_transparency_sheet";
    }

    public final boolean isElevated() {
        return true;
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C63293hC r1 = new C63293hC(2131836924);
        r1.A05 = true;
        setBottomSheetMenuItems(C18180wK.A0n(r1));
        setColorBackgroundDrawable();
        C13330nS r12 = this.A00;
        if (r12 == null) {
            C04220Ms.A0E("typedLogger");
            throw null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r12, "instagram_clips_trends_transparency_sheet_impression"), 1760);
        C18240wQ.A15(A0I, "trend_transparency_sheet");
        A0I.Bb4();
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1832064488);
        super.onCreate(bundle);
        this.A00 = C13330nS.A01(this, AnonymousClass0wJ.A0U(this.A01));
        C14030oh.A09(128237109, A02);
    }
}
