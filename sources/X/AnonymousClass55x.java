package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.instagram.barcelona.R;
import java.util.ArrayList;

/* renamed from: X.55x  reason: invalid class name */
public class AnonymousClass55x extends AnonymousClass099 {
    public C104396bi A00;
    public AnonymousClass7Rj A01;

    public final boolean A0D() {
        ArrayList parcelableArrayList;
        if (this instanceof AnonymousClass5ET) {
            Bundle bundle = this.mArguments;
            if (bundle == null || bundle.getParcelable("contact_info") == null) {
                return false;
            }
        } else if (this instanceof AnonymousClass5ER) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 == null || (parcelableArrayList = bundle2.getParcelableArrayList("contact_entries")) == null || parcelableArrayList.isEmpty()) {
                return false;
            }
        } else if ((this instanceof AnonymousClass5EY) || (this instanceof AnonymousClass5EX)) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-105700517);
        Window window = this.A02.getWindow();
        window.setBackgroundDrawableResource(R.drawable.bottom_sheet_background);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.windowAnimations = R.style.bottom_sheet_animation;
        window.setAttributes(attributes);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C14030oh.A09(-999476835, A02);
        return onCreateView;
    }

    public void onStart() {
        int A02 = C14030oh.A02(1171495963);
        super.onStart();
        C104396bi r0 = this.A00;
        if (r0 != null) {
            r0.A00.A03.A05 = false;
            this.A00 = null;
        }
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -2);
        }
        C14030oh.A09(-452160964, A02);
    }
}
