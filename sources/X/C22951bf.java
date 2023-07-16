package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.1bf  reason: invalid class name and case insensitive filesystem */
public final class C22951bf extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "InviteStoryFragment";
    public BusinessFlowAnalyticsLogger A00;
    public UserSession A01;
    public String A02;
    public C84654td A03;
    public BusinessNavBar A04;
    public User A05;
    public final C82394pY A06 = C18220wO.A0P(this, 14);

    public final String getModuleName() {
        return "invite_story_fragment";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            return false;
        }
        businessFlowAnalyticsLogger.BbZ(new C37408JrQ("invite_story", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        r4.Crj(C18190wL.A0H(this, 148), R.drawable.instagram_x_pano_outline_24).setColorFilter(C63393hP.A00(C121907Is.A00(getContext(), R.attr.textColorPrimary)));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A03 = C67293zJ.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-283750803);
        super.onCreate(bundle);
        Bundle A07 = C18250wR.A07(this);
        String A0j = C18190wL.A0j(A07, "ARG_TARGET_USER_ID");
        UserSession A0V = C18180wK.A0V(A07);
        this.A01 = A0V;
        this.A05 = A0V.multipleAccountHelper.A0E(A0j);
        this.A02 = C18190wL.A0j(A07, "entry_point");
        BusinessFlowAnalyticsLogger A002 = C67293zJ.A00(this.A03, this, this.A01);
        this.A00 = A002;
        if (A002 != null) {
            A002.Bdt(new C37408JrQ("invite_story", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        C14030oh.A09(1586457688, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-809956544);
        View inflate = layoutInflater.inflate(R.layout.stacked_value_props, viewGroup, false);
        UserSession userSession = this.A01;
        C04620Ok r1 = C06810aP.A01;
        ((TextView) C18180wK.A0E(inflate, R.id.title)).setText(AnonymousClass0wJ.A0o(this, C18200wM.A0k(userSession, r1), 2131829222));
        ((TextView) C18180wK.A0E(inflate, R.id.subtitle)).setText(C18220wO.A0k(this, C18200wM.A0k(this.A01, r1), this.A05.BK7(), 2131829221));
        C18180wK.A0E(inflate, R.id.divider).setVisibility(8);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) inflate.findViewById(R.id.title_icon);
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.A03(0, 0);
            int dimensionPixelSize = AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
            colorFilterAlphaImageView.setImageResource(R.drawable.instagram_business_images_business_story);
            ViewGroup.LayoutParams layoutParams = colorFilterAlphaImageView.getLayoutParams();
            layoutParams.getClass();
            layoutParams.height = dimensionPixelSize;
            ViewGroup.LayoutParams layoutParams2 = colorFilterAlphaImageView.getLayoutParams();
            layoutParams2.getClass();
            layoutParams2.width = dimensionPixelSize;
            colorFilterAlphaImageView.setBackground((Drawable) null);
        }
        BusinessNavBar businessNavBar = (BusinessNavBar) C18180wK.A0E(inflate, R.id.navigation_bar);
        this.A04 = businessNavBar;
        businessNavBar.setPrimaryButtonText(2131829220);
        this.A04.setPrimaryButtonOnclickListeners(C18190wL.A0H(this, 147));
        C38040KHr.A01.A03(this.A06, AnonymousClass0P9.class);
        C14030oh.A09(-1904983961, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(618727077);
        super.onDestroyView();
        C38040KHr.A01.A04(this.A06, AnonymousClass0P9.class);
        C14030oh.A09(-649485398, A022);
    }
}
