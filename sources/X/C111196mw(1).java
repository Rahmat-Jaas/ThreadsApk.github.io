package X;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import com.instagram.barcelona.R;

/* renamed from: X.6mw  reason: invalid class name and case insensitive filesystem */
public final class C111196mw {
    public final View A00;
    public final Group A01;
    public final View A02;
    public final Button A03;
    public final EditText A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final Toolbar A0A;

    public C111196mw(View view) {
        this.A0A = (Toolbar) view.requireViewById(R.id.toolbar);
        this.A09 = AnonymousClass0wJ.A0L(view, R.id.title);
        this.A05 = AnonymousClass0wJ.A0L(view, R.id.description);
        this.A02 = view.requireViewById(R.id.progress_bar_layout);
        this.A06 = AnonymousClass0wJ.A0L(view, R.id.error_text_view);
        this.A04 = (EditText) view.requireViewById(R.id.cvv_text_field);
        this.A08 = AnonymousClass0wJ.A0L(view, R.id.text_field_hint);
        this.A03 = (Button) view.requireViewById(R.id.authorize_button);
        this.A07 = AnonymousClass0wJ.A0L(view, R.id.fb_payment_terms);
        this.A00 = view.requireViewById(R.id.paypal_login_webview_container);
        this.A01 = (Group) view.requireViewById(R.id.paypal_webview_hide_other_elements);
    }
}
