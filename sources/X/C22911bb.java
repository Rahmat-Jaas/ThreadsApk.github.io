package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.1bb  reason: invalid class name and case insensitive filesystem */
public final class C22911bb extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "HiddenWordsNuxFragment";
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final String getModuleName() {
        return "HiddenWordsNUXBottomSheetFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (IgdsHeadline) AnonymousClass0wJ.A0I(view, R.id.hidden_words_settings_nux);
        this.A00 = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0I(view, R.id.hidden_words_settings_bottom_button);
        IgdsHeadline igdsHeadline = this.A01;
        String str = "headline";
        if (igdsHeadline != null) {
            igdsHeadline.A08(R.drawable.ig_illustrations_illo_hidden_words, false);
            IgdsHeadline igdsHeadline2 = this.A01;
            if (igdsHeadline2 != null) {
                igdsHeadline2.setHeadline(2131828399);
                IgdsHeadline igdsHeadline3 = this.A01;
                if (igdsHeadline3 != null) {
                    FragmentActivity activity = getActivity();
                    C04220Ms.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    C62263Ya A002 = C62263Ya.A00(activity);
                    A002.A03(getString(2131828396), getString(2131828395), R.drawable.instagram_comment_pano_outline_24);
                    A002.A03(getString(2131828398), getString(2131828397), R.drawable.instagram_eye_off_pano_outline_24);
                    igdsHeadline3.setBulletList(C62263Ya.A01(A002, getString(2131828394), getString(2131828393), R.drawable.instagram_settings_pano_outline_24));
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
                    str = "bottomButton";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setDividerVisible(true);
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                        if (igdsBottomButtonLayout2 != null) {
                            C18210wN.A15(this, igdsBottomButtonLayout2, 2131824397);
                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
                            if (igdsBottomButtonLayout3 != null) {
                                igdsBottomButtonLayout3.setPrimaryActionOnClickListener(C18190wL.A0H(this, 397));
                                C35382Nf.A00(AnonymousClass298.HIDDEN_WORDS_NUX_IMPRESSION, AnonymousClass0wJ.A0X(this.A02));
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

    public final void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, getString(2131831620));
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final boolean onBackPressed() {
        C35382Nf.A00(AnonymousClass298.DISMISS, AnonymousClass0wJ.A0X(this.A02));
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-312146830);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.fragment_hidden_words_nux_screen, false);
        C14030oh.A09(2080691110, A022);
        return A0D;
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-659015971);
        super.onStart();
        getRootActivity();
        C14030oh.A09(-541638065, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(1770727895);
        super.onStop();
        getRootActivity();
        C14030oh.A09(677681095, A022);
    }
}
