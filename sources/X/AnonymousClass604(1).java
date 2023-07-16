package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.604  reason: invalid class name */
public final class AnonymousClass604 extends AnonymousClass1lO {
    public final Class modelClass() {
        return C953760a.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        int dimensionPixelSize;
        AnonymousClass69F r0;
        C953760a r4 = (C953760a) mfV;
        AnonymousClass5BE r5 = (AnonymousClass5BE) m5o;
        AnonymousClass0wJ.A1N(r4, r5);
        ViewGroup.LayoutParams layoutParams = r5.A00.getLayoutParams();
        Integer num = r4.A00;
        if (num != null) {
            dimensionPixelSize = num.intValue();
        } else {
            Resources resources = r5.itemView.getResources();
            C04220Ms.A06(resources);
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.browser_actions_context_menu_max_width);
        }
        layoutParams.height = dimensionPixelSize;
        SpinnerImageView spinnerImageView = r5.A01;
        if (r4.A01) {
            r0 = AnonymousClass69F.LOADING;
        } else {
            r0 = AnonymousClass69F.SUCCESS;
        }
        spinnerImageView.setLoadingStatus(r0);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5BE(C18180wK.A0D(layoutInflater, viewGroup, R.layout.placeholder_generic, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
