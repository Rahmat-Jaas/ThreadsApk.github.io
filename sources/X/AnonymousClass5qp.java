package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxSListenerShape455S0100000_2_I2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.barcelona.R;

/* renamed from: X.5qp  reason: invalid class name */
public final class AnonymousClass5qp extends AnonymousClass52J {
    public Fragment A00;

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.bottom_sheet_container);
        View A0K2 = AnonymousClass0wJ.A0K(view, R.id.bottom_sheet_drag_handle);
        Context requireContext = requireContext();
        AnonymousClass7Kz.A0D();
        Drawable drawable = requireContext.getDrawable(R.drawable.bsc_bottom_sheet_background);
        if (drawable != null) {
            drawable.setTint(requireContext.getColor(R.color.direct_widget_primary_background));
        }
        A0K.setBackground(drawable);
        AnonymousClass7Kz.A0D();
        Drawable drawable2 = requireContext.getDrawable(R.drawable.bsc_bottom_sheet_drag_handle);
        if (drawable2 != null) {
            drawable2.setTint(requireContext.getColor(R.color.igds_separator));
        }
        A0K2.setBackground(drawable2);
        Dialog dialog = this.A02;
        if (dialog instanceof AnonymousClass52I) {
            AnonymousClass52I r1 = (AnonymousClass52I) dialog;
            AnonymousClass52I.A02(r1);
            BottomSheetBehavior bottomSheetBehavior = r1.A03;
            C04220Ms.A06(bottomSheetBehavior);
            bottomSheetBehavior.A0I(3);
        }
        Fragment fragment = this.A00;
        if (fragment == null) {
            fragment = getChildFragmentManager().A0O("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
            if (fragment != null) {
                this.A00 = fragment;
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        C12560m7 childFragmentManager = getChildFragmentManager();
        C04220Ms.A06(childFragmentManager);
        AnonymousClass01J r2 = new AnonymousClass01J(childFragmentManager);
        r2.A0G(fragment, "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG", R.id.content_fragment);
        r2.A0K((String) null);
        r2.A00();
    }

    public final Dialog A0C(Bundle bundle) {
        Context requireContext = requireContext();
        AnonymousClass7Kz.A0Q();
        AnonymousClass5qm r2 = new AnonymousClass5qm(requireContext);
        r2.setOnShowListener(new IDxSListenerShape455S0100000_2_I2(this, 0));
        return r2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(8357107);
        Context A0A = C18240wQ.A0A(this, layoutInflater, 0);
        AnonymousClass7Kz.A0Q();
        View inflate = C86154wM.A0E(A0A, layoutInflater, R.style.BSCIGTheme).inflate(R.layout.bsc_bottom_sheet_fragment, viewGroup, false);
        C14030oh.A09(-101293252, A02);
        return inflate;
    }
}
