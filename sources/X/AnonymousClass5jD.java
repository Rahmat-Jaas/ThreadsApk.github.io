package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.facebookpay.connect.models.ConnectAddressDetails;
import com.facebookpay.connect.models.ConnectBulletCellConfig;
import com.facebookpay.connect.models.ConnectContactDetails;
import com.facebookpay.connect.models.ConnectErrorDialogConfig;
import com.facebookpay.connect.models.ConnectExitConfirmationDialogConfig;
import com.facebookpay.connect.models.ConnectLearnMoreConfig;
import com.facebookpay.connect.models.ConnectNavigationBarStyle;
import com.facebookpay.connect.models.ConnectPayload;
import com.fbpay.w3c.CardDetails;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5;

/* renamed from: X.5jD  reason: invalid class name */
public abstract class AnonymousClass5jD extends AnonymousClass567 {
    public ContextThemeWrapper A00;
    public LayoutInflater A01;
    public ConnectBulletCellConfig A02;
    public ConnectErrorDialogConfig A03 = new ConnectErrorDialogConfig(2131824274, 2131824271, 2131824273, 2131824272);
    public ConnectExitConfirmationDialogConfig A04 = new ConnectExitConfirmationDialogConfig(2131824286, 2131824281, 2131824285, 2131824283, 2131824284, 2131824282);
    public ConnectLearnMoreConfig A05;
    public ConnectLearnMoreConfig A06;
    public ConnectNavigationBarStyle A07;
    public ConnectPayload A08;
    public C881556y A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public AnonymousClass0ZU A0E;
    public AnonymousClass0YY A0F;

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        CardDetails cardDetails;
        ConnectAddressDetails connectAddressDetails;
        String str2;
        ConnectAddressDetails connectAddressDetails2;
        String str3;
        ConnectAddressDetails connectAddressDetails3;
        String str4;
        ConnectAddressDetails connectAddressDetails4;
        String str5;
        ConnectAddressDetails connectAddressDetails5;
        String str6;
        ConnectContactDetails connectContactDetails;
        String str7;
        ConnectContactDetails connectContactDetails2;
        String str8;
        String str9;
        ConnectErrorDialogConfig connectErrorDialogConfig;
        ConnectExitConfirmationDialogConfig connectExitConfirmationDialogConfig;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A08 = (ConnectPayload) requireArguments().getParcelable("connect_payload");
        this.A07 = (ConnectNavigationBarStyle) requireArguments().getParcelable("connect_nav_bar_style");
        requireArguments().getBoolean("is_payment_form");
        this.A0D = requireArguments().getString("headline_title_text");
        this.A0C = requireArguments().getString("headline_body_text");
        this.A02 = (ConnectBulletCellConfig) requireArguments().getParcelable("bullet_cell_config");
        this.A0A = requireArguments().getString("connect_bottom_button_secondary_action_text");
        this.A0B = requireArguments().getString("footer_text");
        this.A06 = (ConnectLearnMoreConfig) requireArguments().getParcelable("connect_learn_more_headline_config");
        this.A05 = (ConnectLearnMoreConfig) requireArguments().getParcelable("connect_learn_more_footer_config");
        Parcelable parcelable = requireArguments().getParcelable("connect_exit_confirmation_dialog_config");
        if ((parcelable instanceof ConnectExitConfirmationDialogConfig) && (connectExitConfirmationDialogConfig = (ConnectExitConfirmationDialogConfig) parcelable) != null) {
            this.A04 = connectExitConfirmationDialogConfig;
        }
        Parcelable parcelable2 = requireArguments().getParcelable("connect_error_dialog_config");
        if ((parcelable2 instanceof ConnectErrorDialogConfig) && (connectErrorDialogConfig = (ConnectErrorDialogConfig) parcelable2) != null) {
            this.A03 = connectErrorDialogConfig;
        }
        AnonymousClass7Kz A0A2 = AnonymousClass7Kz.A0A();
        C002801h.A02(A0A2.A00.A04, "FBPayConnectManager Factory is not provided!");
        C109786kc r3 = (C109786kc) A0A2.A00.A04.get();
        C124207ag r0 = r3.A00;
        if (r0 == null) {
            C107296gW r2 = r3.A01;
            if (r2 == null) {
                r2 = new C107296gW((C104996ci) r3.A03.get(), r3.A02);
                r3.A01 = r2;
            }
            r0 = new C124207ag(r2);
            r3.A00 = r0;
        }
        this.A09 = (C881556y) AnonymousClass7IU.A00(r0, this).A01(C881556y.class);
        AnonymousClass5jC r32 = (AnonymousClass5jC) this;
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(r32.A05(), R.id.connect_headline);
        igdsHeadline.setImageDrawable(r32.requireContext().getDrawable(R.drawable.ig_illustrations_illo_fb_ig_connection2_refresh));
        igdsHeadline.setHeadline((CharSequence) r32.A0D);
        igdsHeadline.setHeadlineStyle(R.style.headline_emphasized);
        String str10 = r32.A0C;
        if (str10 != null) {
            ConnectLearnMoreConfig connectLearnMoreConfig = r32.A06;
            CharSequence charSequence = str10;
            if (connectLearnMoreConfig != null) {
                charSequence = AnonymousClass5jC.A03(connectLearnMoreConfig, r32, str10);
            }
            igdsHeadline.setBody(charSequence);
        }
        IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0J(r32.A05(), R.id.profile_image);
        ConnectPayload connectPayload = r32.A08;
        if (!(connectPayload == null || (str9 = connectPayload.A03) == null)) {
            igImageView.setUrl(C18250wR.A0K(str9), AnonymousClass5jC.A02);
        }
        TextView textView = (TextView) AnonymousClass0wJ.A0J(r32.A05(), R.id.name_primary_text);
        ConnectPayload connectPayload2 = r32.A08;
        if (!(connectPayload2 == null || (connectContactDetails2 = connectPayload2.A01) == null || (str8 = connectContactDetails2.A01) == null || str8.length() <= 0)) {
            textView.setText(str8);
        }
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(r32.A05(), R.id.email_secondary_text);
        ConnectPayload connectPayload3 = r32.A08;
        if (connectPayload3 == null || (connectContactDetails = connectPayload3.A01) == null || (str7 = connectContactDetails.A00) == null) {
            textView2.setVisibility(8);
        } else {
            int A0G = AnonymousClass8bP.A0G(str7, '@', 0, 6);
            int i = A0G - 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((char) str7.codePointAt(0));
            for (int i2 = 0; i2 < i; i2++) {
                spannableStringBuilder.append("•");
            }
            spannableStringBuilder.append(str7.subSequence(A0G, AnonymousClass2C6.A00(str7)));
            textView2.setText(C18190wL.A0n(spannableStringBuilder));
        }
        TextView textView3 = (TextView) AnonymousClass0wJ.A0J(r32.A05(), R.id.address_line_1_secondary_text);
        TextView textView4 = (TextView) AnonymousClass0wJ.A0J(r32.A05(), R.id.address_line_2_secondary_text);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        ConnectPayload connectPayload4 = r32.A08;
        if (!(connectPayload4 == null || (connectAddressDetails5 = connectPayload4.A00) == null || (str6 = connectAddressDetails5.A02) == null || str6.length() <= 0)) {
            spannableStringBuilder2.append(str6);
        }
        ConnectPayload connectPayload5 = r32.A08;
        if (!(connectPayload5 == null || (connectAddressDetails4 = connectPayload5.A00) == null || (str5 = connectAddressDetails4.A03) == null || str5.length() <= 0)) {
            if (spannableStringBuilder2.length() > 0) {
                spannableStringBuilder2.append(", ");
            }
            spannableStringBuilder2.append(str5);
        }
        ConnectPayload connectPayload6 = r32.A08;
        if (!(connectPayload6 == null || (connectAddressDetails3 = connectPayload6.A00) == null || (str4 = connectAddressDetails3.A01) == null || str4.length() <= 0)) {
            spannableStringBuilder3.append(AnonymousClass00J.A0H(" ", (CharSequence) null, (CharSequence) null, AnonymousClass8bP.A0f(str4, new String[]{" "}, 0, 6), C139118Ms.A00, 30));
        }
        ConnectPayload connectPayload7 = r32.A08;
        if (!(connectPayload7 == null || (connectAddressDetails2 = connectPayload7.A00) == null || (str3 = connectAddressDetails2.A00) == null || str3.length() <= 0)) {
            if (spannableStringBuilder3.length() > 0) {
                spannableStringBuilder3.append(", ");
            }
            spannableStringBuilder3.append(str3);
        }
        ConnectPayload connectPayload8 = r32.A08;
        if (!(connectPayload8 == null || (connectAddressDetails = connectPayload8.A00) == null || (str2 = connectAddressDetails.A04) == null || str2.length() <= 0)) {
            if (spannableStringBuilder3.length() > 0) {
                spannableStringBuilder3.append(" ");
            }
            spannableStringBuilder3.append(str2);
        }
        if (C18180wK.A1X(spannableStringBuilder2.length())) {
            textView3.setText(spannableStringBuilder2);
        } else {
            textView3.setVisibility(8);
        }
        if (spannableStringBuilder3.length() > 0) {
            textView4.setText(spannableStringBuilder3);
        } else {
            textView4.setVisibility(8);
        }
        IgImageView igImageView2 = (IgImageView) AnonymousClass0wJ.A0J(r32.A05(), R.id.connect_card_icon);
        IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(r32.A05(), R.id.connect_card_number);
        ConnectPayload connectPayload9 = r32.A08;
        if (!(connectPayload9 == null || (cardDetails = (CardDetails) AnonymousClass00J.A0C(connectPayload9.A04)) == null)) {
            igImageView2.A0F = new C132627uF(cardDetails, igTextView, igImageView2, r32);
            String str11 = cardDetails.A05;
            if (str11 != null) {
                igImageView2.setUrl(C18250wR.A0K(str11), AnonymousClass5jC.A02);
            }
            AnonymousClass5jC.A04(cardDetails, igTextView, false);
        }
        if (this.A02 != null) {
            IgdsBulletCell igdsBulletCell = (IgdsBulletCell) AnonymousClass0wJ.A0J(r32.A05(), R.id.message_bullet_cell);
            ConnectBulletCellConfig connectBulletCellConfig = r32.A02;
            if (!(connectBulletCellConfig == null || (num = connectBulletCellConfig.A00) == null)) {
                igdsBulletCell.setIcon(num.intValue());
            }
            ConnectBulletCellConfig connectBulletCellConfig2 = r32.A02;
            if (connectBulletCellConfig2 != null) {
                str = connectBulletCellConfig2.A01;
            } else {
                str = null;
            }
            igdsBulletCell.setText((CharSequence) str, (CharSequence) null);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(r32.A05(), R.id.connect_bottom_button_layout);
        String str12 = r32.A0B;
        if (str12 != null) {
            ConnectLearnMoreConfig connectLearnMoreConfig2 = r32.A05;
            CharSequence charSequence2 = str12;
            if (connectLearnMoreConfig2 != null) {
                charSequence2 = AnonymousClass5jC.A03(connectLearnMoreConfig2, r32, str12);
            }
            igdsBottomButtonLayout.setFooterText(charSequence2);
        }
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(C86164wN.A0L(igdsBottomButtonLayout, r32, 67));
        igdsBottomButtonLayout.setSecondaryActionText(r32.A0A);
        igdsBottomButtonLayout.setSecondaryActionOnClickListener(C86134wK.A0P(r32, 123));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1046122535);
        ContextThemeWrapper A002 = AnonymousClass567.A00(this, layoutInflater);
        this.A00 = A002;
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A002);
        C04220Ms.A06(cloneInContext);
        this.A01 = cloneInContext;
        AnonymousClass5jC r2 = (AnonymousClass5jC) this;
        LayoutInflater layoutInflater2 = r2.A01;
        if (layoutInflater2 != null) {
            r2.A00 = C18180wK.A0D(layoutInflater2, viewGroup, R.layout.connect_content_fragment, false);
            View A052 = r2.A05();
            C14030oh.A09(1414411938, A022);
            return A052;
        }
        C04220Ms.A0E("themeInflater");
        throw null;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1340050913);
        super.onResume();
        ConnectNavigationBarStyle connectNavigationBarStyle = this.A07;
        if (connectNavigationBarStyle != null) {
            ContextThemeWrapper contextThemeWrapper = this.A00;
            if (contextThemeWrapper != null) {
                KtLambdaShape25S0100000_I2_5 ktLambdaShape25S0100000_I2_5 = new KtLambdaShape25S0100000_I2_5(this, 41);
                AnonymousClass697 r0 = connectNavigationBarStyle.A01;
                if (r0 != null) {
                    AnonymousClass7KT.A04(this, r0);
                }
                int i = connectNavigationBarStyle.A00;
                Integer valueOf = Integer.valueOf(i);
                if (!(i == 0 || valueOf == null)) {
                    String A0k = AnonymousClass0wJ.A0k(contextThemeWrapper, i);
                    AnonymousClass5qq A0S = C86134wK.A0S(this);
                    C86024w9 r1 = A0S.A0I;
                    AnonymousClass0A5[] r2 = AnonymousClass5qq.A0V;
                    C86114wI.A1L(A0S, A0k, r1, r2, 4);
                    C86114wI.A1L(A0S, (Object) null, A0S.A0G, r2, 15);
                }
                AnonymousClass7KT.A08(this, connectNavigationBarStyle.A02);
                if (connectNavigationBarStyle.ordinal() == 0) {
                    IDxCListenerShape201S0100000_1_I2 A0H = C18190wL.A0H(ktLambdaShape25S0100000_I2_5, 16);
                    AnonymousClass5qq A0S2 = C86134wK.A0S(this);
                    C86114wI.A1L(A0S2, A0H, A0S2.A0H, AnonymousClass5qq.A0V, 12);
                } else {
                    throw C18190wL.A0a(AnonymousClass0wJ.A0t(C18170wI.A00(676), connectNavigationBarStyle));
                }
            } else {
                C04220Ms.A0E("wrapperContext");
                throw null;
            }
        } else {
            AnonymousClass7KT.A03(this);
        }
        C14030oh.A09(394443293, A022);
    }
}
