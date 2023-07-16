package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.6ja  reason: invalid class name and case insensitive filesystem */
public final class C109176ja {
    public final View A00;
    public final CheckBox A01;
    public final TextView A02;

    public C109176ja(View view) {
        C04220Ms.A0B(view, 1);
        this.A00 = view;
        View requireViewById = view.requireViewById(R.id.row_service_partner_type_title);
        C04220Ms.A0C(requireViewById, C18170wI.A00(5));
        this.A02 = (TextView) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.checkbox);
        C04220Ms.A0C(requireViewById2, I17.A00(779));
        this.A01 = (CheckBox) requireViewById2;
    }
}
