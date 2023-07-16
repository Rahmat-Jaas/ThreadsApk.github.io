package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.6l8  reason: invalid class name and case insensitive filesystem */
public final class C110106l8 {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;

    public C110106l8(View view) {
        C04220Ms.A0B(view, 1);
        this.A00 = view;
        this.A03 = (TextView) AnonymousClass0wJ.A0I(view, R.id.title);
        this.A02 = (TextView) AnonymousClass0wJ.A0I(view, R.id.message);
        this.A01 = (ImageView) AnonymousClass0wJ.A0I(view, R.id.dismiss_button);
    }
}
