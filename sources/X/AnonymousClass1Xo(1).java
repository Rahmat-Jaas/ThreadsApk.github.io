package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1Xo  reason: invalid class name */
public final class AnonymousClass1Xo extends C34640IcN {
    public static final String __redex_internal_original_name = "RestrictCommentsBottomSheetFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return "restrict_comments_fragment";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1747314701);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.restrict_comments_bottom_sheet, viewGroup, false);
        View A0I = AnonymousClass0wJ.A0I(inflate, R.id.accounts_dont_follow_you_row);
        AnonymousClass0wJ.A17(A0I, 375, AnonymousClass0wJ.A0I(inflate, R.id.dont_follow_you_toggle));
        AnonymousClass0wJ.A17(AnonymousClass0wJ.A0I(inflate, R.id.accounts_you_dont_follow_back_row), 376, AnonymousClass0wJ.A0I(inflate, R.id.dont_follow_back_toggle));
        View A0I2 = AnonymousClass0wJ.A0I(inflate, R.id.recent_followers_row);
        AnonymousClass0wJ.A17(A0I2, 377, AnonymousClass0wJ.A0I(inflate, R.id.recent_followers_toggle));
        if (C18200wM.A0a(AnonymousClass0wJ.A0X(this.A00), C06810aP.A01) == C169839tz.PrivacyStatusPrivate) {
            A0I.setVisibility(8);
            A0I2.setVisibility(8);
        }
        C14030oh.A09(1265118810, A02);
        return inflate;
    }
}
