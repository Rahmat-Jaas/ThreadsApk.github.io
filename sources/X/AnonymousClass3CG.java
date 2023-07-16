package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.3CG  reason: invalid class name */
public final class AnonymousClass3CG {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public AnonymousClass3CG(View view) {
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.super_title);
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.title);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.secondary_title);
        this.A00 = C18200wM.A0J(view, R.id.toggle);
        this.A01 = (LinearLayout) view.requireViewById(R.id.operation_hours_container);
    }
}
