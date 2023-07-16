package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5BD  reason: invalid class name */
public final class AnonymousClass5BD extends M5O {
    public TextView A00;
    public TextView A01;

    public AnonymousClass5BD(View view) {
        super(view);
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.hub_header);
        this.A01 = A0L;
        A0L.setFocusable(true);
        this.A00 = AnonymousClass0wJ.A0L(view, R.id.cta_button);
        C006702y.A0G(this.A01, true);
        AnonymousClass7FY.A02(this.A00, AnonymousClass006.A01);
    }
}
