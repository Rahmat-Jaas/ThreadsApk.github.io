package X;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.instagram.barcelona.R;

/* renamed from: X.6mx  reason: invalid class name and case insensitive filesystem */
public final class C111206mx {
    public final View A00;
    public final Button A01;
    public final EditText A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final Toolbar A0A;

    public C111206mx(View view) {
        this.A0A = (Toolbar) view.requireViewById(R.id.toolbar);
        this.A09 = AnonymousClass0wJ.A0L(view, R.id.title);
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.description);
        this.A00 = view.requireViewById(R.id.progress_bar_layout);
        this.A05 = AnonymousClass0wJ.A0L(view, R.id.error_text_view);
        this.A02 = (EditText) view.requireViewById(R.id.cvv_text_field);
        this.A03 = C18200wM.A0J(view, R.id.cvv_toggle_eye_view);
        this.A08 = AnonymousClass0wJ.A0L(view, R.id.text_field_hint);
        this.A06 = AnonymousClass0wJ.A0L(view, R.id.forgot_text_view);
        this.A01 = (Button) view.requireViewById(R.id.password_continue);
        this.A07 = AnonymousClass0wJ.A0L(view, R.id.forgot_password_link);
    }
}
