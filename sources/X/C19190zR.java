package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;

/* renamed from: X.0zR  reason: invalid class name and case insensitive filesystem */
public final class C19190zR extends Fragment {
    public static C36911Jgz A02;
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;

    public final void onViewCreated(View view, Bundle bundle) {
        view.setBackgroundColor(C18220wO.A02(C18240wQ.A0A(this, view, 0), R.attr.backgroundColorPrimary));
        this.A01 = (IgdsHeadline) AnonymousClass0wJ.A0I(view, R.id.safe_browsing_headline);
        this.A00 = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0I(view, R.id.safe_browsing_bottom_button);
        IgdsHeadline igdsHeadline = this.A01;
        if (igdsHeadline == null) {
            C04220Ms.A0E("headline");
            throw null;
        }
        igdsHeadline.A08(R.drawable.ig_illustrations_illo_warning_refresh, false);
        IgdsHeadline igdsHeadline2 = this.A01;
        if (igdsHeadline2 == null) {
            C04220Ms.A0E("headline");
            throw null;
        }
        igdsHeadline2.setHeadline(2131837348);
        FragmentActivity activity = getActivity();
        C04220Ms.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C62263Ya A002 = C62263Ya.A00(activity);
        C35202Iq0 iq0 = new C35202Iq0(C18180wK.A00(this));
        String A0g = C18180wK.A0g(this, 2131829574);
        SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass00U.A0N(getString(2131837345), A0g, ' '));
        AnonymousClass3Zw.A00(A0E, iq0, A0g);
        A002.A03((CharSequence) null, A0E, R.drawable.instagram_info_pano_outline_24);
        A002.A03((CharSequence) null, getString(2131837346), R.drawable.instagram_user_circle_pano_outline_24);
        List A012 = C62263Ya.A01(A002, (CharSequence) null, getString(2131837347), R.drawable.instagram_settings_pano_outline_24);
        ((IgdsBulletCell) A012.get(0)).setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
        IgdsHeadline igdsHeadline3 = this.A01;
        if (igdsHeadline3 == null) {
            C04220Ms.A0E("headline");
            throw null;
        }
        igdsHeadline3.setBulletList(A012);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setDividerVisible(true);
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
            if (igdsBottomButtonLayout2 != null) {
                C18210wN.A15(this, igdsBottomButtonLayout2, 2131837339);
                IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
                if (igdsBottomButtonLayout3 != null) {
                    igdsBottomButtonLayout3.setPrimaryActionOnClickListener(C64793rs.A00);
                    IgdsBottomButtonLayout igdsBottomButtonLayout4 = this.A00;
                    if (igdsBottomButtonLayout4 != null) {
                        igdsBottomButtonLayout4.setSecondaryActionText(getString(2131837343));
                        IgdsBottomButtonLayout igdsBottomButtonLayout5 = this.A00;
                        if (igdsBottomButtonLayout5 != null) {
                            igdsBottomButtonLayout5.setSecondaryActionOnClickListener(C18190wL.A0H(this, 3));
                            return;
                        }
                    }
                }
            }
        }
        C04220Ms.A0E("bottomButton");
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1243002921);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.safe_browsing_warning_headline, false);
        C14030oh.A09(1737024814, A022);
        return A0D;
    }
}
