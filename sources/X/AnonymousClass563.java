package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape508S0100000_2_I2;
import com.facebook.redex.IDxDListenerShape321S0100000_2_I2;
import com.facebookpay.paypal.model.LinkableTextParams;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import com.facebookpay.widget.button.FBPayButton;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape1S1200100_I2;

/* renamed from: X.563  reason: invalid class name */
public final class AnonymousClass563 extends Fragment {
    public ContextThemeWrapper A00;
    public ProgressBar A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public PaypalConsentLaunchParams A05;
    public FBPayButton A06;
    public FBPayButton A07;
    public LoggingContext A08;
    public final C880756q A09 = C880756q.A01();

    public final void onViewCreated(View view, Bundle bundle) {
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        Parcelable parcelable = requireArguments().getParcelable("logging_context");
        if (parcelable != null) {
            this.A08 = (LoggingContext) parcelable;
            if (getActivity() != null) {
                ViewGroup A0J = C18220wO.A0J(view2, R.id.text_container);
                if (AnonymousClass69R.A0F.A07) {
                    AnonymousClass7IS r0 = AnonymousClass6XN.A00;
                    C04220Ms.A04(A0J);
                    r0.A04(A0J);
                }
                TextView textView = (TextView) AnonymousClass0wJ.A0J(view2, R.id.header);
                AnonymousClass7Fd.A02(textView, AnonymousClass69Q.A0q);
                AnonymousClass7Fe.A01(textView, 2131886570);
                this.A03 = textView;
                TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view2, R.id.subheader);
                AnonymousClass7Fd.A02(textView2, AnonymousClass69Q.PRIMARY_TEXT);
                AnonymousClass7Fe.A01(textView2, 2131886570);
                this.A04 = textView2;
                TextView textView3 = (TextView) AnonymousClass0wJ.A0J(view2, R.id.description);
                AnonymousClass7Fd.A02(textView3, AnonymousClass69Q.A0D);
                AnonymousClass7Fe.A01(textView3, R.style.FBPayUITerms);
                this.A02 = textView3;
                FBPayButton fBPayButton = (FBPayButton) AnonymousClass0wJ.A0J(view2, R.id.consent_button);
                AnonymousClass7Fe.A01(fBPayButton, 2131886503);
                this.A06 = fBPayButton;
                ProgressBar progressBar = (ProgressBar) AnonymousClass0wJ.A0J(view2, R.id.progress_icon);
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                if (indeterminateDrawable != null) {
                    indeterminateDrawable.setColorFilter(AnonymousClass7Kz.A0G().A03(progressBar.getContext(), 7), PorterDuff.Mode.MULTIPLY);
                }
                this.A01 = progressBar;
                FBPayButton fBPayButton2 = (FBPayButton) AnonymousClass0wJ.A0J(view2, R.id.cancel_button);
                fBPayButton2.setButtonStyle(AnonymousClass69C.A09);
                AnonymousClass7Fe.A01(fBPayButton2, 2131886504);
                this.A07 = fBPayButton2;
                TextView textView4 = this.A03;
                if (textView4 == null) {
                    C04220Ms.A0E("headerTextView");
                    throw null;
                }
                PaypalConsentLaunchParams paypalConsentLaunchParams = this.A05;
                if (paypalConsentLaunchParams == null) {
                    C04220Ms.A0E("launchParams");
                    throw null;
                }
                textView4.setText(paypalConsentLaunchParams.A03);
                TextView textView5 = this.A04;
                if (textView5 == null) {
                    C04220Ms.A0E("subheaderTextView");
                    throw null;
                }
                PaypalConsentLaunchParams paypalConsentLaunchParams2 = this.A05;
                if (paypalConsentLaunchParams2 == null) {
                    C04220Ms.A0E("launchParams");
                    throw null;
                }
                textView5.setText(paypalConsentLaunchParams2.A0A);
                TextView textView6 = this.A02;
                if (textView6 == null) {
                    C04220Ms.A0E("descriptionTextView");
                    throw null;
                }
                PaypalConsentLaunchParams paypalConsentLaunchParams3 = this.A05;
                if (paypalConsentLaunchParams3 == null) {
                    C04220Ms.A0E("launchParams");
                    throw null;
                }
                String str = paypalConsentLaunchParams3.A02;
                if (str != null) {
                    LinkableTextParams linkableTextParams = paypalConsentLaunchParams3.A00;
                    if (linkableTextParams != null) {
                        charSequence = new C112166p6(linkableTextParams.A02, C18180wK.A0n(new C108886j7(linkableTextParams.A00, linkableTextParams.A01, linkableTextParams.A03))).A00(new IDxCListenerShape508S0100000_2_I2(this, 9), false);
                    } else {
                        charSequence = "";
                    }
                    spannableStringBuilder = C18200wM.A0E(charSequence).insert(0, str);
                } else {
                    spannableStringBuilder = null;
                }
                textView6.setText(spannableStringBuilder);
                TextView textView7 = this.A02;
                if (textView7 == null) {
                    C04220Ms.A0E("descriptionTextView");
                    throw null;
                }
                C18180wK.A0z(textView7);
                FBPayButton fBPayButton3 = this.A06;
                if (fBPayButton3 == null) {
                    C04220Ms.A0E("primaryButton");
                    throw null;
                }
                PaypalConsentLaunchParams paypalConsentLaunchParams4 = this.A05;
                if (paypalConsentLaunchParams4 == null) {
                    C04220Ms.A0E("launchParams");
                    throw null;
                }
                fBPayButton3.setText(paypalConsentLaunchParams4.A06);
                FBPayButton fBPayButton4 = this.A06;
                if (fBPayButton4 == null) {
                    C04220Ms.A0E("primaryButton");
                    throw null;
                }
                C86104wH.A1C(fBPayButton4, 45, this);
                FBPayButton fBPayButton5 = this.A07;
                if (fBPayButton5 == null) {
                    C04220Ms.A0E("secondaryButton");
                    throw null;
                }
                PaypalConsentLaunchParams paypalConsentLaunchParams5 = this.A05;
                if (paypalConsentLaunchParams5 == null) {
                    C04220Ms.A0E("launchParams");
                    throw null;
                }
                fBPayButton5.setText(paypalConsentLaunchParams5.A08);
                FBPayButton fBPayButton6 = this.A07;
                if (fBPayButton6 == null) {
                    C04220Ms.A0E("secondaryButton");
                    throw null;
                }
                C86104wH.A1C(fBPayButton6, 44, this);
                C128957ke A002 = AnonymousClass7JJ.A00();
                LoggingContext loggingContext = this.A08;
                if (loggingContext == null) {
                    C86124wJ.A19();
                    throw null;
                }
                PaypalConsentLaunchParams paypalConsentLaunchParams6 = this.A05;
                if (paypalConsentLaunchParams6 == null) {
                    C04220Ms.A0E("launchParams");
                    throw null;
                } else {
                    C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_load_ecppaypalconversion_display"), 292), loggingContext, new KtLambdaShape1S1200100_I2(loggingContext, (Object) null, "paypal_consent", 1, Long.parseLong(paypalConsentLaunchParams6.A05)));
                }
            }
            IDxDListenerShape321S0100000_2_I2 iDxDListenerShape321S0100000_2_I2 = new IDxDListenerShape321S0100000_2_I2(this, 3);
            Fragment fragment = this.mParentFragment;
            C04220Ms.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            Dialog dialog = ((AnonymousClass099) fragment).A02;
            if (dialog != null) {
                dialog.setOnDismissListener(iDxDListenerShape321S0100000_2_I2);
                return;
            }
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A00(AnonymousClass563 r5, boolean z) {
        String str = "primaryButton";
        ProgressBar progressBar = r5.A01;
        if (z) {
            if (progressBar != null) {
                progressBar.setVisibility(0);
                FBPayButton fBPayButton = r5.A06;
                if (fBPayButton != null) {
                    fBPayButton.setEnabled(false);
                    FBPayButton fBPayButton2 = r5.A06;
                    if (fBPayButton2 != null) {
                        fBPayButton2.setText((CharSequence) null);
                        return;
                    }
                }
            }
            C04220Ms.A0E("progressIcon");
            throw null;
        }
        if (progressBar != null) {
            progressBar.setVisibility(8);
            FBPayButton fBPayButton3 = r5.A06;
            if (fBPayButton3 != null) {
                fBPayButton3.setEnabled(true);
                FBPayButton fBPayButton4 = r5.A06;
                if (fBPayButton4 != null) {
                    PaypalConsentLaunchParams paypalConsentLaunchParams = r5.A05;
                    if (paypalConsentLaunchParams == null) {
                        str = "launchParams";
                    } else {
                        fBPayButton4.setText(paypalConsentLaunchParams.A06);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E("progressIcon");
        throw null;
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1610865588);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("PAYPAL_CONSENT_LAUNCH_PARAMS");
        C04220Ms.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.paypal.model.PaypalConsentLaunchParams");
        this.A05 = (PaypalConsentLaunchParams) parcelable;
        C14030oh.A09(-230617194, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1391283712);
        Context A0A = C18240wQ.A0A(this, layoutInflater, 0);
        AnonymousClass7Kz.A0G();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(A0A, R.style.FBPayUIWidget);
        this.A00 = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.ecp_paypal_consent_content_fragment, viewGroup, false);
        C14030oh.A09(-1682387365, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1676276426);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        AnonymousClass69R r4 = AnonymousClass69R.A0F;
        PaypalConsentLaunchParams paypalConsentLaunchParams = this.A05;
        if (paypalConsentLaunchParams == null) {
            C04220Ms.A0E("launchParams");
            throw null;
        }
        AnonymousClass3JK.A00(contextThemeWrapper, this, r4, paypalConsentLaunchParams.A04, (String) null, (AnonymousClass0ZU) null, (AnonymousClass0ZU) null, 472, false);
        C14030oh.A09(-1001200404, A022);
    }
}
