package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5Ba  reason: invalid class name and case insensitive filesystem */
public final class C88875Ba extends M5O {
    public final TextView A00;
    public final View A01;
    public final TextView A02;

    public C88875Ba(View view) {
        super(view);
        this.A01 = view;
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.keyword_name);
        this.A00 = textView;
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.see_all);
        this.A02 = textView2;
        textView.setFocusable(true);
        textView2.setFocusable(true);
        AnonymousClass7FY.A02(textView2, AnonymousClass006.A01);
    }
}
