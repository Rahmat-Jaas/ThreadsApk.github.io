package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import com.instagram.barcelona.R;
import com.instagram.common.kotlindelegate.lifecycle.NotNullLazyAutoCleanup;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41;

/* renamed from: X.1dJ  reason: invalid class name */
public final class AnonymousClass1dJ extends C34640IcN implements C21735BzM {
    public static final /* synthetic */ AnonymousClass0A5[] A05;
    public static final String __redex_internal_original_name = "EncryptedBackupsCardEducationButtonSheetFragment";
    public final NotNullLazyAutoCleanup A00 = new NotNullLazyAutoCleanup(this, new KtLambdaShape61S0100000_I2_41(this, 14));
    public final NotNullLazyAutoCleanup A01 = new NotNullLazyAutoCleanup(this, new KtLambdaShape61S0100000_I2_41(this, 15));
    public final NotNullLazyAutoCleanup A02 = new NotNullLazyAutoCleanup(this, new KtLambdaShape61S0100000_I2_41(this, 17));
    public final AnonymousClass4AD A03 = new AnonymousClass4AD(this);
    public final C04530Oa A04 = C62373Zc.A03(new KtLambdaShape61S0100000_I2_41(this, 16));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        NotNullLazyAutoCleanup notNullLazyAutoCleanup = this.A02;
        ((ReboundViewPager) notNullLazyAutoCleanup.A01()).A0N(this.A03);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(new SlideCardViewModel(getString(2131826334), getString(2131826336), getString(2131826335), R.drawable.ig_illustrations_qp_shield_refresh, R.color.igds_primary_text));
        A0v.add(new SlideCardViewModel("", getString(2131826340), getString(2131826339), R.drawable.ig_illustrations_qp_messages_refresh, R.color.igds_elevated_background));
        A0v.add(new SlideCardViewModel("", getString(2131826338), getString(2131826337), R.drawable.ig_illustrations_qp_user_circle_refresh, R.color.igds_elevated_background));
        A0v.add(new SlideCardViewModel("", getString(2131826333), "", R.drawable.card_gradient_background, R.color.igds_elevated_background));
        C18850y0 r3 = new C18850y0(getContext(), A0v);
        ((ReboundViewPager) notNullLazyAutoCleanup.A01()).setAdapter((Adapter) r3);
        ((F4P) this.A01.A01()).A03(0, r3.getCount());
        NotNullLazyAutoCleanup notNullLazyAutoCleanup2 = this.A00;
        ((IgdsBottomButtonLayout) notNullLazyAutoCleanup2.A01()).setDividerVisible(true);
        C18210wN.A15(this, (IgdsBottomButtonLayout) notNullLazyAutoCleanup2.A01(), 2131826331);
    }

    static {
        Class<AnonymousClass1dJ> cls = AnonymousClass1dJ.class;
        A05 = new AnonymousClass0A5[]{new C000400f(cls, "viewPager", "getViewPager()Lcom/instagram/common/ui/widget/reboundviewpager/ReboundViewPager;", 0), new C000400f(cls, "pageIndicator", "getPageIndicator()Lcom/instagram/ui/widget/pageindicator/CirclePageIndicator;", 0), new C000400f(cls, "bottomButton", "getBottomButton()Lcom/instagram/igds/components/bottombutton/IgdsBottomButtonLayout;", 0)};
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1969687737);
        C04220Ms.A0B(layoutInflater, 0);
        if (viewGroup != null) {
            View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.fragment_eb_card_education_sheet_layout, false);
            C14030oh.A09(-1243487079, A022);
            return A0D;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(-1114929648, A022);
        throw A0b;
    }
}
