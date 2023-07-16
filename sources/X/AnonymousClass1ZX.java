package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ZX  reason: invalid class name */
public final class AnonymousClass1ZX extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PromoteAdsManagerPromotionsInReviewFragment";
    public UserSession A00;
    public String A01;
    public ImageUrl A02;
    public boolean A03;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.Cqb(2131833106);
        C12560m7 r0 = this.mFragmentManager;
        if (r0 != null) {
            r2.CtT(C18180wK.A1X(r0.A0I()));
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String getModuleName() {
        return "promotions_in_review_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AnonymousClass0wJ.A0J(view, R.id.in_review_thumbnail);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.in_review_title);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.in_review_description);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(view, R.id.in_review_button);
        roundedCornerImageView.A03 = C303120n.CENTER_CROP;
        if (this.A03) {
            ViewGroup.LayoutParams layoutParams = roundedCornerImageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.container_dense_height_row_redesign);
                roundedCornerImageView.setLayoutParams(layoutParams);
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        ImageUrl imageUrl = this.A02;
        if (imageUrl == null) {
            str = "imageUrl";
        } else {
            roundedCornerImageView.setUrl(imageUrl, this);
            textView.setText(2131833107);
            textView2.setText(2131833105);
            igdsBottomButtonLayout.setPrimaryActionText(requireContext().getString(2131833104));
            UserSession userSession = this.A00;
            str = "userSession";
            if (userSession != null) {
                C37743K2d.A00(userSession).A01(requireActivity());
                igdsBottomButtonLayout.setPrimaryActionOnClickListener(C18190wL.A0H(this, 186));
                UserSession userSession2 = this.A00;
                if (userSession2 != null) {
                    C37062Jjm A002 = C34462Jq.A00(userSession2);
                    String str2 = this.A01;
                    if (str2 == null) {
                        str = "mediaId";
                    } else {
                        A002.A03("promotion_details", str2);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(106374801);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = C18180wK.A0V(bundle2);
            String string = bundle2.getString("media_id");
            if (string != null) {
                this.A01 = string;
                String string2 = bundle2.getString("url");
                if (string2 != null) {
                    this.A02 = C18250wR.A0K(string2);
                    this.A03 = bundle2.getBoolean("is_story");
                    C14030oh.A09(-912321841, A022);
                    return;
                }
                illegalStateException = C18180wK.A0a("Required value was null.");
                i = 171937296;
            } else {
                illegalStateException = C18180wK.A0a("Required value was null.");
                i = 1789379314;
            }
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -1456191633;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1097859150);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.promote_ads_manager_in_review_view, false);
        C14030oh.A09(-111601806, A022);
        return A0D;
    }
}
