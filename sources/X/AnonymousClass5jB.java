package X;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxLListenerShape127S0200000_2_I2;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.fbpay.logging.LoggingContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape24S0200000_2_I2;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;

/* renamed from: X.5jB  reason: invalid class name */
public final class AnonymousClass5jB extends AnonymousClass5qq implements C146778mq {
    public ECPHandler A00;
    public AnonymousClass4x8 A01;
    public boolean A02;
    public ECPPaymentRequest A03;
    public final C880756q A04 = C880756q.A01();
    public final C04530Oa A05 = C86124wJ.A12(this, 6);
    public final C04530Oa A06 = C86124wJ.A12(this, 8);
    public final C04530Oa A07 = C86124wJ.A12(this, 9);
    public final C04530Oa A08 = C86124wJ.A12(this, 14);
    public final AnonymousClass0ZU A09 = new KtLambdaShape26S0100000_I2_6(this, 7);
    public final AnonymousClass0ZU A0A = new KtLambdaShape26S0100000_I2_6(this, 13);
    public final AnonymousClass6S2 A0B;

    public final void onAttach(Context context) {
        C04220Ms.A0B(context, 0);
        super.onAttach(context);
    }

    public final void onAttachFragment(Fragment fragment) {
        AnonymousClass52I r1;
        C04220Ms.A0B(fragment, 0);
        ECPHandler eCPHandler = this.A00;
        if (eCPHandler != null) {
            if (fragment instanceof C145328kK) {
                ((C145328kK) fragment).CkR(eCPHandler);
            }
            ((AnonymousClass58M) this.A05.getValue()).A10(eCPHandler);
        }
        A01();
        Dialog dialog = this.A02;
        if ((dialog instanceof AnonymousClass52I) && (r1 = (AnonymousClass52I) dialog) != null) {
            AnonymousClass52I.A02(r1);
            BottomSheetBehavior bottomSheetBehavior = r1.A03;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0N(!A02(this));
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C04220Ms.A0B(configuration, 0);
        C04220Ms.A06(AnonymousClass0wJ.A0B(this));
        super.onConfigurationChanged(configuration);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Dialog dialog = this.A02;
        if (dialog instanceof AnonymousClass52I) {
            AnonymousClass52I r1 = (AnonymousClass52I) dialog;
            AnonymousClass52I.A02(r1);
            BottomSheetBehavior bottomSheetBehavior = r1.A03;
            bottomSheetBehavior.A0N(false);
            bottomSheetBehavior.A0M(new IDxSCallbackShape24S0200000_2_I2(1, this, bottomSheetBehavior));
        }
    }

    public static final ECPPaymentRequest A00(AnonymousClass5jB r2) {
        ECPPaymentRequest eCPPaymentRequest = r2.A03;
        if (eCPPaymentRequest == null) {
            Parcelable parcelable = r2.requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
            if (parcelable instanceof ECPPaymentRequest) {
                eCPPaymentRequest = (ECPPaymentRequest) parcelable;
            } else {
                eCPPaymentRequest = null;
            }
            r2.A03 = eCPPaymentRequest;
        }
        return eCPPaymentRequest;
    }

    private final void A01() {
        Dialog dialog = this.A02;
        if (dialog instanceof AnonymousClass52I) {
            ConstraintLayout constraintLayout = this.A04;
            if (constraintLayout != null) {
                constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape127S0200000_2_I2(2, dialog, this));
            } else {
                C04220Ms.A0E("viewContainer");
                throw null;
            }
        }
    }

    public final Dialog A0C(Bundle bundle) {
        return A0D(new KtLambdaShape26S0100000_I2_6(this, 11));
    }

    public final void A0F(ECPHandler eCPHandler) {
        C145328kK r1;
        this.A00 = eCPHandler;
        Fragment A0O = getChildFragmentManager().A0O("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
        if ((A0O instanceof C145328kK) && (r1 = (C145328kK) A0O) != null) {
            r1.CkR(this.A00);
        }
        if (getChildFragmentManager().A0O("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG") != null) {
            ((AnonymousClass58M) this.A05.getValue()).A10(this.A00);
        }
    }

    public AnonymousClass5jB() {
        AnonymousClass6S2 A0F = AnonymousClass7Kz.A0F();
        C04220Ms.A06(A0F);
        this.A0B = A0F;
    }

    public static final boolean A02(AnonymousClass5jB r1) {
        AnonymousClass567 r12;
        Fragment A0O = r1.getChildFragmentManager().A0O("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
        if (!(A0O instanceof AnonymousClass567) || (r12 = (AnonymousClass567) A0O) == null || !(r12 instanceof AnonymousClass5j6)) {
            return true;
        }
        return false;
    }

    public final boolean Brt() {
        A01();
        return super.Brt();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(947327772);
        super.onCreate(bundle);
        A00(this);
        this.A01 = new AnonymousClass4x8(requireContext(), this.A0B);
        C880756q r2 = this.A04;
        C880856r.A05(((AnonymousClass58M) this.A05.getValue()).A0q, r2, this, 149);
        C880856r.A05(((AnonymousClass58J) this.A07.getValue()).A09, r2, this, 150);
        AnonymousClass7Kz.A0J();
        Context context = getContext();
        if (context != null) {
            Class cls = AutofillManager.class;
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(cls);
            if (autofillManager.isEnabled() && autofillManager.isAutofillSupported()) {
                AnonymousClass7JJ.A00().A01.markerStart(223872246);
                ((AutofillManager) context.getSystemService(cls)).registerCallback((AutofillManager.AutofillCallback) AnonymousClass6XT.A00.getValue());
                C128957ke A002 = AnonymousClass7JJ.A00();
                LoggingContext loggingContext = (LoggingContext) this.A06.getValue();
                String str = null;
                ComponentName autofillServiceComponentName = ((AutofillManager) context.getSystemService(cls)).getAutofillServiceComponentName();
                if (autofillServiceComponentName != null) {
                    str = autofillServiceComponentName.flattenToShortString();
                }
                C04220Ms.A0B(loggingContext, 0);
                A002.A01.markerEnd(223872246, 2);
                C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_enable_platformautofill_success"), 237), loggingContext, (Object) null, str, 17);
            }
        }
        C14030oh.A09(-951073789, A022);
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(971937823);
        C880756q r1 = this.A04;
        r1.A0J(((AnonymousClass58M) this.A05.getValue()).A0q);
        r1.A0J(((AnonymousClass58J) this.A07.getValue()).A09);
        Context context = getContext();
        if (context != null) {
            ((AutofillManager) context.getSystemService(AutofillManager.class)).unregisterCallback((AutofillManager.AutofillCallback) AnonymousClass6XT.A00.getValue());
        }
        super.onDestroy();
        C14030oh.A09(-1232211660, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1530022880);
        super.onPause();
        requireActivity().setRequestedOrientation(10);
        C14030oh.A09(-1995717248, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(824119500);
        super.onResume();
        C04220Ms.A06(AnonymousClass0wJ.A0B(this));
        requireActivity().setRequestedOrientation(1);
        C14030oh.A09(1942760132, A022);
    }
}
