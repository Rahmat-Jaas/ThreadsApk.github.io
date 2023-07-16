package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1QJ  reason: invalid class name */
public abstract class AnonymousClass1QJ extends AnonymousClass1QM {
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C04220Ms.A0B(view, 0);
        View A00 = AnonymousClass2CW.A00(view, R.id.tv_permissions_title);
        C04220Ms.A0C(A00, "null cannot be cast to non-null type com.facebook.smartcapture.ui.ResourcesTextView");
        TextView textView = (TextView) A00;
        if (this instanceof AnonymousClass1QH) {
            i = R.string.f0nameremoved;
        } else {
            i = R.string.f0nameremoved;
        }
        textView.setText(i);
        AnonymousClass0wJ.A16(AnonymousClass2CW.A00(view, R.id.btn_camera_access_allow), 7, this);
        AnonymousClass0wJ.A16(AnonymousClass2CW.A00(view, R.id.btn_camera_access_deny), 8, this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-885655930);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_credit_card_permissions_fragment, viewGroup, false);
        C14030oh.A09(76470324, A02);
        return inflate;
    }
}
