package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import kotlin.jvm.internal.KtLambdaShape64S0100000_I2_44;

/* renamed from: X.1b4  reason: invalid class name */
public abstract class AnonymousClass1b4 extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "ChannelBottomSheetNuxFragment";
    public IgdsButton A00;
    public IgdsButton A01;
    public View A02;
    public IgSimpleImageView A03;
    public IgTextView A04;
    public IgTextView A05;
    public final C04530Oa A06 = C80644m9.A00(this);
    public final C04530Oa A07 = AnonymousClass0OY.A02(new KtLambdaShape64S0100000_I2_44(this, 22));
    public final C04530Oa A08 = AnonymousClass0OY.A02(new KtLambdaShape64S0100000_I2_44(this, 23));

    public final String getModuleName() {
        return "ChannelJoinFlowBottomSheetNuxFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AnonymousClass0wJ.A0J(view, R.id.nux_icon);
        this.A03 = igSimpleImageView;
        if (igSimpleImageView == null) {
            str = "drawableView";
        } else {
            igSimpleImageView.setImageResource(R.drawable.ig_illustrations_illo_channels_broadcast_features_refresh);
            IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.nux_title);
            this.A05 = igTextView;
            str = "titleText";
            if (igTextView != null) {
                igTextView.setText(C18180wK.A0g(this, 2131822653));
                IgTextView igTextView2 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.nux_subtitle);
                this.A04 = igTextView2;
                str = "subtitleText";
                if (igTextView2 != null) {
                    C18180wK.A0z(igTextView2);
                    IgTextView igTextView3 = this.A04;
                    if (igTextView3 != null) {
                        igTextView3.setText(C18180wK.A0g(this, 2131822652));
                        View A0K = AnonymousClass0wJ.A0K(view, R.id.nux_divider);
                        this.A02 = A0K;
                        A0K.setVisibility(8);
                        IgdsButton igdsButton = (IgdsButton) AnonymousClass0wJ.A0J(view, R.id.nux_get_started_button);
                        C04220Ms.A0B(igdsButton, 0);
                        this.A00 = igdsButton;
                        igdsButton.setText(C18180wK.A0g(this, 2131822650));
                        IgdsButton igdsButton2 = this.A00;
                        if (igdsButton2 != null) {
                            AnonymousClass0wJ.A16(igdsButton2, 374, this);
                            IgdsButton igdsButton3 = (IgdsButton) AnonymousClass0wJ.A0J(view, R.id.nux_secondary_cta);
                            C04220Ms.A0B(igdsButton3, 0);
                            this.A01 = igdsButton3;
                            igdsButton3.setText(C18180wK.A0g(this, 2131822651));
                            IgdsButton igdsButton4 = this.A01;
                            if (igdsButton4 != null) {
                                C04220Ms.A06(getString(2131822651));
                                igdsButton4.setVisibility(0);
                                IgdsButton igdsButton5 = this.A01;
                                if (igdsButton5 != null) {
                                    AnonymousClass0wJ.A16(igdsButton5, 375, this);
                                    return;
                                }
                            }
                            str = "secondaryCtaButton";
                        } else {
                            str = "ctaButton";
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A06);
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-684129803);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_channels_nux_bottom_sheet, viewGroup, false);
        C14030oh.A09(1015784816, A022);
        return inflate;
    }
}
