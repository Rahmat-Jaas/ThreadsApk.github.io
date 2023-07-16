package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;

/* renamed from: X.56J  reason: invalid class name */
public final class AnonymousClass56J extends Fragment implements C143678h8 {
    public View A00;
    public TextView A01;
    public Context A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;

    public final C113986sV BH4() {
        return new C113986sV((Drawable) null, (View.OnClickListener) null, (String) null, getString(2131827301), 0, 0, false, false, true);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        this.A01 = AnonymousClass0wJ.A0L(view, R.id.fbpay_qr_code_description);
        this.A05 = AnonymousClass0wJ.A0L(view, R.id.fbpay_qr_code_share_button);
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.fbpay_qr_code_link_text);
        this.A03 = C18200wM.A0J(view, R.id.fbpay_qr_code_image);
        this.A00 = view.requireViewById(R.id.fbpay_progress_bar);
        TextView textView = this.A05;
        C04220Ms.A0A(textView);
        C86104wH.A1C(textView, 10, this);
        C121817Ig.A00(this).A01(C880956s.class);
        C04220Ms.A0A((Object) null);
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1212994852);
        C04220Ms.A0B(layoutInflater, 0);
        FragmentActivity activity = getActivity();
        AnonymousClass7Kz.A0K();
        AnonymousClass0LU.A0B("FBPayIgHubManager", AnonymousClass00U.A0S("Unknown style: ", " is not supported!", 11));
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, R.style.Ig4aFbPay);
        this.A02 = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fragment_p2p_qr_code, viewGroup, false);
        C14030oh.A09(645534204, A022);
        return inflate;
    }
}
