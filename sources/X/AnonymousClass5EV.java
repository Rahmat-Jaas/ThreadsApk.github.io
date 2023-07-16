package X;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;
import java.util.List;

/* renamed from: X.5EV  reason: invalid class name */
public final class AnonymousClass5EV extends AnonymousClass55x {
    public static final C11630kW A0A = C130487qA.A00;
    public View A00;
    public AutofillConnectPayload A01;
    public C881556y A02;
    public UserSession A03;
    public AnonymousClass0ZU A04;
    public AnonymousClass0ZU A05;
    public AnonymousClass0ZU A06;
    public AnonymousClass0ZU A07;
    public AnonymousClass0ZU A08;
    public boolean A09;

    public final Dialog A0C(Bundle bundle) {
        CardDetails cardDetails;
        String str;
        AutofillData autofillData;
        String A0r;
        AutofillData autofillData2;
        String A0r2;
        AutofillData autofillData3;
        String A0r3;
        AutofillData autofillData4;
        String A0r4;
        AutofillData autofillData5;
        String A0r5;
        AutofillData autofillData6;
        String A0r6;
        AutofillData autofillData7;
        String A0r7;
        AutofillData autofillData8;
        String A0r8;
        String str2;
        this.A03 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        this.A01 = (AutofillConnectPayload) requireArguments().getParcelable("connect_payload");
        this.A09 = requireArguments().getBoolean("is_payment_form");
        View inflate = LayoutInflater.from(requireActivity()).inflate(R.layout.layout_connect_and_autofill, (ViewGroup) null);
        C04220Ms.A06(inflate);
        this.A00 = inflate;
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
        this.A02 = (C881556y) AnonymousClass7IU.A00(r0, this).A01(C881556y.class);
        View view = this.A00;
        if (view == null) {
            C04220Ms.A0E("rootView");
            throw null;
        }
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(view, R.id.connect_and_autofill_headline);
        Drawable drawable = requireContext().getDrawable(R.drawable.ig_illustrations_illo_fb_ig_connection2_refresh);
        String A0k = AnonymousClass0wJ.A0k(requireActivity(), 2131824259);
        igdsHeadline.setImageDrawable(drawable);
        igdsHeadline.setHeadlineStyle(R.style.headline_emphasized);
        igdsHeadline.setBody((CharSequence) A00(A0k, "OPEN_URL"));
        View view2 = this.A00;
        if (view2 == null) {
            C04220Ms.A0E("rootView");
            throw null;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(view2, R.id.connect_and_autofill_bottom_button_layout);
        igdsBottomButtonLayout.setFooterText(A00(AnonymousClass0wJ.A0k(requireActivity(), 2131835127), "CREATE_FRAGMENT"));
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(C86164wN.A0L(igdsBottomButtonLayout, this, 0));
        igdsBottomButtonLayout.setSecondaryActionOnClickListener(C86134wK.A0P(this, 3));
        View view3 = this.A00;
        if (view3 != null) {
            IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0J(view3, R.id.profile_image);
            AutofillConnectPayload autofillConnectPayload = this.A01;
            if (!(autofillConnectPayload == null || (str2 = autofillConnectPayload.A02) == null)) {
                igImageView.setUrl(C18250wR.A0K(str2), A0A);
            }
            View view4 = this.A00;
            if (view4 != null) {
                TextView textView = (TextView) AnonymousClass0wJ.A0J(view4, R.id.name_primary_text);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                AutofillConnectPayload autofillConnectPayload2 = this.A01;
                if (!(autofillConnectPayload2 == null || (autofillData8 = autofillConnectPayload2.A00) == null || (A0r8 = C18220wO.A0r("given-name", autofillData8.A00)) == null)) {
                    spannableStringBuilder.append(A0r8);
                }
                AutofillConnectPayload autofillConnectPayload3 = this.A01;
                if (!(autofillConnectPayload3 == null || (autofillData7 = autofillConnectPayload3.A00) == null || (A0r7 = C18220wO.A0r("family-name", autofillData7.A00)) == null)) {
                    spannableStringBuilder.append(" ").append(A0r7);
                }
                if (spannableStringBuilder.length() > 0) {
                    textView.setText(spannableStringBuilder);
                }
                View view5 = this.A00;
                if (view5 != null) {
                    TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view5, R.id.email_secondary_text);
                    AutofillConnectPayload autofillConnectPayload4 = this.A01;
                    if (autofillConnectPayload4 == null || (autofillData6 = autofillConnectPayload4.A00) == null || (A0r6 = C18220wO.A0r("email", autofillData6.A00)) == null) {
                        textView2.setVisibility(8);
                    } else {
                        int A0G = AnonymousClass8bP.A0G(A0r6, '@', 0, 6);
                        int i = A0G - 1;
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((char) A0r6.codePointAt(0));
                        for (int i2 = 0; i2 < i; i2++) {
                            spannableStringBuilder2.append("•");
                        }
                        spannableStringBuilder2.append(A0r6.subSequence(A0G, AnonymousClass2C6.A00(A0r6)));
                        textView2.setText(C18190wL.A0n(spannableStringBuilder2));
                    }
                    View view6 = this.A00;
                    if (view6 != null) {
                        TextView textView3 = (TextView) AnonymousClass0wJ.A0J(view6, R.id.address_secondary_text);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        AutofillConnectPayload autofillConnectPayload5 = this.A01;
                        if (!(autofillConnectPayload5 == null || (autofillData5 = autofillConnectPayload5.A00) == null || (A0r5 = C18220wO.A0r("address-line1", autofillData5.A00)) == null)) {
                            spannableStringBuilder3.append(A0r5).append(", ");
                        }
                        AutofillConnectPayload autofillConnectPayload6 = this.A01;
                        if (!(autofillConnectPayload6 == null || (autofillData4 = autofillConnectPayload6.A00) == null || (A0r4 = C18220wO.A0r("address-line2", autofillData4.A00)) == null)) {
                            spannableStringBuilder3.append(A0r4).append(", ");
                        }
                        AutofillConnectPayload autofillConnectPayload7 = this.A01;
                        if (!(autofillConnectPayload7 == null || (autofillData3 = autofillConnectPayload7.A00) == null || (A0r3 = C18220wO.A0r("address-level2", autofillData3.A00)) == null)) {
                            spannableStringBuilder3.append(A0r3).append(", ");
                        }
                        AutofillConnectPayload autofillConnectPayload8 = this.A01;
                        if (!(autofillConnectPayload8 == null || (autofillData2 = autofillConnectPayload8.A00) == null || (A0r2 = C18220wO.A0r("address-level1", autofillData2.A00)) == null)) {
                            spannableStringBuilder3.append(A0r2).append(" ");
                        }
                        AutofillConnectPayload autofillConnectPayload9 = this.A01;
                        if (!(autofillConnectPayload9 == null || (autofillData = autofillConnectPayload9.A00) == null || (A0r = C18220wO.A0r("postal-code", autofillData.A00)) == null)) {
                            spannableStringBuilder3.append(A0r);
                        }
                        if (spannableStringBuilder3.length() > 0) {
                            textView3.setText(spannableStringBuilder3);
                        } else {
                            textView3.setVisibility(8);
                        }
                        View view7 = this.A00;
                        if (view7 != null) {
                            TextView textView4 = (TextView) AnonymousClass0wJ.A0J(view7, R.id.connect_card_number);
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                            AutofillConnectPayload autofillConnectPayload10 = this.A01;
                            if (!(autofillConnectPayload10 == null || (cardDetails = (CardDetails) AnonymousClass00J.A0C(autofillConnectPayload10.A03)) == null || (str = cardDetails.A04) == null)) {
                                List A072 = C81074n3.A07(str, "•", 0);
                                if (A072 != null && !A072.isEmpty() && A072.size() >= 2) {
                                    spannableStringBuilder4.append((CharSequence) A072.get(0));
                                    spannableStringBuilder4.append("•");
                                    spannableStringBuilder4.append((CharSequence) A072.get(C86144wL.A0C(A072, 1)));
                                }
                                textView4.setText(spannableStringBuilder4);
                            }
                            C41026Luf luf = new C41026Luf(requireActivity());
                            View view8 = this.A00;
                            if (view8 == null) {
                                C04220Ms.A0E("rootView");
                                throw null;
                            }
                            luf.A07(view8);
                            return luf.A00();
                        }
                    }
                }
            }
        }
        C04220Ms.A0E("rootView");
        throw null;
    }

    private final SpannableStringBuilder A00(String str, String str2) {
        int A002;
        int i;
        SpannableStringBuilder A0E = C18200wM.A0E(str);
        String A0k = AnonymousClass0wJ.A0k(requireActivity(), 2131829574);
        A0E.append(" ").append(A0k);
        if (C04220Ms.A0I(str2, "OPEN_URL")) {
            A002 = C18180wK.A00(this);
            i = 0;
        } else if (C04220Ms.A0I(str2, "CREATE_FRAGMENT")) {
            A002 = C18180wK.A00(this);
            i = 1;
        } else {
            C04220Ms.A0E("colorClickableSpan");
            throw null;
        }
        AnonymousClass3Zw.A00(A0E, new IDxCSpanShape187S0100000_1_I2(A002, i, this), A0k);
        return A0E;
    }
}
