package X;

import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.2sg  reason: invalid class name and case insensitive filesystem */
public final class C50242sg {
    public static final void A00(View view, boolean z) {
        View findViewById;
        if (view != null && (findViewById = view.findViewById(R.id.listview_progressbar)) != null) {
            findViewById.setVisibility(C18190wL.A00(z ? 1 : 0));
        }
    }
}
