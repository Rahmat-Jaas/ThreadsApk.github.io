package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.1ZE  reason: invalid class name */
public final class AnonymousClass1ZE extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "CreatorSubscriberChatQuickPromotionFragment";
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131836339);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(view, R.id.bottom_button);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(view, R.id.headline_container);
        this.A01 = igdsHeadline;
        String str = "headline";
        if (igdsHeadline != null) {
            igdsHeadline.A05 = true;
            igdsHeadline.A08(R.drawable.ig_illustrations_illo_subscriber_crown_badge, true);
            IgdsHeadline igdsHeadline2 = this.A01;
            if (igdsHeadline2 != null) {
                igdsHeadline2.setHeadline(2131824646);
                IgdsHeadline igdsHeadline3 = this.A01;
                if (igdsHeadline3 != null) {
                    C62263Ya A002 = C62263Ya.A00(requireContext());
                    A002.A03(getString(2131824643), getString(2131824640), R.drawable.instagram_clock_dotted_pano_outline_24);
                    A002.A03(getString(2131824644), getString(2131824641), R.drawable.instagram_app_messenger_pano_outline_24);
                    igdsHeadline3.setBulletList(C62263Ya.A01(A002, getString(2131824645), getString(2131824642), R.drawable.instagram_sticker_pano_outline_24));
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
                    str = "bottomButton";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setDividerVisible(true);
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                        if (igdsBottomButtonLayout2 != null) {
                            C18210wN.A15(this, igdsBottomButtonLayout2, 2131824621);
                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
                            if (igdsBottomButtonLayout3 != null) {
                                igdsBottomButtonLayout3.setPrimaryActionOnClickListener(C18190wL.A0H(this, 318));
                                return;
                            }
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-313020631);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.quick_promotion, false);
        C14030oh.A09(-2079275323, A022);
        return A0D;
    }
}
