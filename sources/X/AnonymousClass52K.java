package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;

/* renamed from: X.52K  reason: invalid class name */
public final class AnonymousClass52K extends AnonymousClass55w {
    public Fragment A00;

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.dialog_fragment_container);
        AnonymousClass7Kz.A0D();
        Context requireContext = requireContext();
        Drawable drawable = requireContext().getDrawable(R.drawable.bsc_dialog_background);
        if (drawable != null) {
            drawable.setTint(requireContext.getColor(R.color.direct_widget_primary_background));
        }
        A0K.setBackground(drawable);
        Fragment fragment = this.A00;
        if (fragment == null) {
            fragment = getChildFragmentManager().A0O("DIALOG_CONTENT_FRAGMENT_TAG");
            if (fragment != null) {
                this.A00 = fragment;
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        C12560m7 childFragmentManager = getChildFragmentManager();
        C04220Ms.A06(childFragmentManager);
        AnonymousClass01J r2 = new AnonymousClass01J(childFragmentManager);
        r2.A0G(fragment, "DIALOG_CONTENT_FRAGMENT_TAG", R.id.dialog_fragment);
        r2.A0K((String) null);
        r2.A00();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        int A02 = C14030oh.A02(415389798);
        Context A0A = C18240wQ.A0A(this, layoutInflater, 0);
        AnonymousClass7Kz.A0Q();
        LayoutInflater A0E = C86154wM.A0E(A0A, layoutInflater, R.style.BSCIGTheme);
        Dialog dialog = this.A02;
        if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = this.A02;
        if (!(dialog2 == null || (window = dialog2.getWindow()) == null)) {
            window.requestFeature(1);
        }
        View inflate = A0E.inflate(R.layout.bsc_dialog_fragment, viewGroup, false);
        C14030oh.A09(-1909975196, A02);
        return inflate;
    }
}
