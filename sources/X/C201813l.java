package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.13l  reason: invalid class name and case insensitive filesystem */
public final class C201813l extends M5O {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;

    public C201813l(View view) {
        super(view);
        this.A08 = AnonymousClass0wJ.A0L(view, R.id.qp_item_title);
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.qp_item_id_value);
        this.A06 = AnonymousClass0wJ.A0L(view, R.id.qp_item_surface_value);
        this.A01 = AnonymousClass0wJ.A0L(view, R.id.qp_item_content_value);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.qp_item_duration_value);
        this.A07 = AnonymousClass0wJ.A0L(view, R.id.qp_item_surface_info_value);
        this.A05 = AnonymousClass0wJ.A0L(view, R.id.qp_item_qualification_value);
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.qp_item_error_value);
        this.A00 = view.requireViewById(R.id.qp_item_preview_button);
    }
}
