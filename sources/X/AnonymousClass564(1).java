package X;

import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.views.AutofillTextInputLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape97S0100000_2_I2;
import com.instagram.barcelona.R;
import java.security.GeneralSecurityException;

/* renamed from: X.564  reason: invalid class name */
public final class AnonymousClass564 extends Fragment {
    public View A00;
    public Button A01;
    public EditText A02;
    public EditText A03;
    public LinearLayout A04;
    public ScrollView A05;
    public TextView A06;
    public TextView A07;
    public CardDetails A08;
    public AnonymousClass56X A09;
    public AutofillTextInputLayout A0A;
    public AutofillTextInputLayout A0B;
    public BottomSheetBehavior A0C;

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        this.A01 = (Button) AnonymousClass0wJ.A0I(view, R.id.confrm_button);
        this.A07 = (TextView) AnonymousClass0wJ.A0I(view, R.id.title);
        this.A06 = (TextView) AnonymousClass0wJ.A0I(view, R.id.description);
        this.A04 = (LinearLayout) AnonymousClass0wJ.A0I(view, R.id.enter_card_details_layout);
        this.A0A = (AutofillTextInputLayout) AnonymousClass0wJ.A0I(view, R.id.card_cvv_input_layout);
        this.A02 = (EditText) AnonymousClass0wJ.A0I(view, R.id.card_cvv_input);
        this.A0B = (AutofillTextInputLayout) AnonymousClass0wJ.A0I(view, R.id.card_pan_input_layout);
        this.A03 = (EditText) AnonymousClass0wJ.A0I(view, R.id.card_pan_input);
        this.A00 = AnonymousClass0wJ.A0I(view, R.id.progress_layout);
        this.A05 = (ScrollView) AnonymousClass0wJ.A0I(view, R.id.bottom_sheet_scroll_view);
        Drawable background = view.findViewById(R.id.bottom_sheet_layout).getBackground();
        C04220Ms.A0C(background, C28174Ezk.A00(0));
        ((GradientDrawable) background).setColor(C86104wH.A0G(getContext(), R.attr.w3c_bottom_sheet_color).data);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2021 && i2 == -1 && intent != null) {
            try {
                AnonymousClass7Kz.A0R();
                throw C97396Be.A00("add ig implementation");
            } catch (GeneralSecurityException e) {
                AnonymousClass0LU.A0B("CreditCardScannerUtil", C18230wP.A0t("Couldn't decrypt credit card number due to ", e));
            }
        }
    }

    public static final Intent A00(CardDetails cardDetails, AnonymousClass564 r6, AnonymousClass771 r7, Long l, long j) {
        String str;
        String str2;
        Intent A0B2 = C18230wP.A0B();
        if (r7 == null) {
            A0B2.putExtra("keyResultCardDetails", cardDetails);
            A0B2.putExtra("timeElapsedInMs", j);
            if (l != null) {
                A0B2.putExtra("additionalTimeElapsedInMs", l.longValue());
            }
            AnonymousClass56X r0 = r6.A09;
            if (r0 != null) {
                if (r0.A07.A08() == AnonymousClass67R.A03) {
                    str2 = "SUCCEEDED_CARD_VERIFICATION";
                } else {
                    str2 = "SUCCEEDED_CVV_VERIFICATION";
                }
                A0B2.putExtra("keyResultEventName", str2);
                return A0B2;
            }
        } else {
            AnonymousClass56X r02 = r6.A09;
            if (r02 != null) {
                if (r02.A07.A08() == AnonymousClass67R.A03) {
                    str = "FAILED_CARD_VERIFICATION";
                } else {
                    str = "FAILED_CVV_VERIFICATION";
                }
                A0B2.putExtra("keyResultEventName", str);
                A0B2.putExtra("keyResultError", C18200wM.A0q(r7.A03));
                return A0B2;
            }
        }
        C04220Ms.A0E("viewModel");
        throw null;
    }

    public final void onActivityCreated(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(-209125254);
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        CardDetails cardDetails = null;
        if (activity != null) {
            Application application = activity.getApplication();
            C04220Ms.A06(application);
            this.A09 = (AnonymousClass56X) AnonymousClass7IU.A00(new AnonymousClass58Z(application, this.mArguments), this).A01(AnonymousClass56X.class);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                cardDetails = (CardDetails) bundle2.getParcelable("keyAuthFlow");
            }
            this.A08 = cardDetails;
            EditText editText = this.A03;
            if (editText == null) {
                str = "viewPanInput";
            } else {
                editText.addTextChangedListener(new IDxObjectShape282S0100000_1_I2(C86164wN.A0s(this, 11), 0));
                EditText editText2 = this.A02;
                str = "viewCvvInput";
                if (editText2 != null) {
                    editText2.addTextChangedListener(new IDxObjectShape282S0100000_1_I2(C86164wN.A0s(this, 12), 0));
                    EditText editText3 = this.A02;
                    if (editText3 != null) {
                        editText3.setOnEditorActionListener(new AnonymousClass7SB(this));
                        Button button = this.A01;
                        if (button == null) {
                            str = "viewConfirmButton";
                        } else {
                            C86104wH.A1C(button, 77, this);
                            ScrollView scrollView = this.A05;
                            if (scrollView == null) {
                                str = "viewBottomSheetScrollView";
                            } else {
                                BottomSheetBehavior A012 = BottomSheetBehavior.A01(scrollView);
                                C04220Ms.A06(A012);
                                this.A0C = A012;
                                str = "bottomSheetBehavior";
                                A012.A0I(3);
                                BottomSheetBehavior bottomSheetBehavior = this.A0C;
                                if (bottomSheetBehavior != null) {
                                    bottomSheetBehavior.A0M(new IDxSCallbackShape97S0100000_2_I2(this, 0));
                                    AnonymousClass56X r0 = this.A09;
                                    str = "viewModel";
                                    if (r0 != null) {
                                        C86104wH.A1F(this, r0.A07, 278);
                                        AnonymousClass56X r02 = this.A09;
                                        if (r02 != null) {
                                            C86104wH.A1F(this, r02.A06, 279);
                                            AnonymousClass56X r03 = this.A09;
                                            if (r03 != null) {
                                                C86104wH.A1F(this, r03.A05, 280);
                                                activity.mOnBackPressedDispatcher.A05(new AnonymousClass52G(activity, this), this);
                                                C14030oh.A09(-1504645293, A022);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        NullPointerException A0W = C18210wN.A0W("Activity cannot be null");
        C14030oh.A09(-2084781138, A022);
        throw A0W;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(42755852);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.w3c_fbpay_autofill_demask_card_fragment, viewGroup, false);
        C14030oh.A09(840128083, A022);
        return inflate;
    }
}
