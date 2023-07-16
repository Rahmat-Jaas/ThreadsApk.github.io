package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxLListenerShape127S0200000_2_I2;
import com.facebookpay.connect.models.ConnectExitConfirmationDialogConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape24S0200000_2_I2;
import kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5;

/* renamed from: X.5jA  reason: invalid class name */
public final class AnonymousClass5jA extends AnonymousClass5qq {
    public ConnectExitConfirmationDialogConfig A00 = new ConnectExitConfirmationDialogConfig(2131824286, 2131824281, 2131824285, 2131824283, 2131824284, 2131824282);
    public AnonymousClass4x8 A01;
    public boolean A02;
    public final AnonymousClass0ZU A03 = new KtLambdaShape25S0100000_I2_5(this, 42);
    public final AnonymousClass0ZU A04 = new KtLambdaShape25S0100000_I2_5(this, 46);
    public final AnonymousClass6S2 A05;

    public final void onAttach(Context context) {
        C04220Ms.A0B(context, 0);
        super.onAttach(context);
    }

    public final void onAttachFragment(Fragment fragment) {
        AnonymousClass52I r1;
        C04220Ms.A0B(fragment, 0);
        Dialog dialog = this.A02;
        if (dialog instanceof AnonymousClass52I) {
            ConstraintLayout constraintLayout = this.A04;
            if (constraintLayout != null) {
                constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape127S0200000_2_I2(1, dialog, this));
            } else {
                C04220Ms.A0E("viewContainer");
                throw null;
            }
        }
        Dialog dialog2 = this.A02;
        if ((dialog2 instanceof AnonymousClass52I) && (r1 = (AnonymousClass52I) dialog2) != null) {
            AnonymousClass52I.A02(r1);
            BottomSheetBehavior bottomSheetBehavior = r1.A03;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0N(!A00(this));
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C04220Ms.A0B(configuration, 0);
        C04220Ms.A06(AnonymousClass0wJ.A0B(this));
        super.onConfigurationChanged(configuration);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ConnectExitConfirmationDialogConfig connectExitConfirmationDialogConfig;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Parcelable parcelable = requireArguments().getParcelable("CONNECT_EXIT_CONFIRMATION_DIALOG_CONFIG");
        if ((parcelable instanceof ConnectExitConfirmationDialogConfig) && (connectExitConfirmationDialogConfig = (ConnectExitConfirmationDialogConfig) parcelable) != null) {
            this.A00 = connectExitConfirmationDialogConfig;
        }
        Dialog dialog = this.A02;
        if (dialog instanceof AnonymousClass52I) {
            AnonymousClass52I r1 = (AnonymousClass52I) dialog;
            AnonymousClass52I.A02(r1);
            BottomSheetBehavior bottomSheetBehavior = r1.A03;
            bottomSheetBehavior.A0N(false);
            bottomSheetBehavior.A0M(new IDxSCallbackShape24S0200000_2_I2(0, this, bottomSheetBehavior));
        }
    }

    public final Dialog A0C(Bundle bundle) {
        return A0D(new KtLambdaShape25S0100000_I2_5(this, 44));
    }

    public AnonymousClass5jA() {
        AnonymousClass6S2 A0F = AnonymousClass7Kz.A0F();
        C04220Ms.A06(A0F);
        this.A05 = A0F;
    }

    public static final boolean A00(AnonymousClass5jA r1) {
        AnonymousClass567 r12;
        Fragment A0O = r1.getChildFragmentManager().A0O("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
        if (!(A0O instanceof AnonymousClass567) || (r12 = (AnonymousClass567) A0O) == null || !(r12 instanceof AnonymousClass5j6)) {
            return true;
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-96085120);
        super.onCreate(bundle);
        this.A01 = new AnonymousClass4x8(requireContext(), this.A05);
        C14030oh.A09(1107713735, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1825884393);
        super.onPause();
        requireActivity().setRequestedOrientation(10);
        C14030oh.A09(-1795967518, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1729586468);
        super.onResume();
        C04220Ms.A06(AnonymousClass0wJ.A0B(this));
        requireActivity().setRequestedOrientation(1);
        C14030oh.A09(857055504, A022);
    }
}
