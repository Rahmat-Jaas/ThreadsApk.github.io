package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.switchbutton.IgSwitch;

/* renamed from: X.13k  reason: invalid class name and case insensitive filesystem */
public final class C201713k extends M5O {
    public View A00;
    public View A01;
    public CheckBox A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public IgSwitch A06;

    public C201713k(View view) {
        super(view);
        this.A05 = AnonymousClass0wJ.A0L(view, R.id.row_simple_text_textview);
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.row_simple_text_description);
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.row_simple_text_detail);
        this.A06 = C18250wR.A0N(view, R.id.row_menu_item_switch);
        this.A00 = view.requireViewById(R.id.row_divider);
        this.A02 = (CheckBox) view.requireViewById(R.id.checkbox);
        this.A01 = view.requireViewById(R.id.row_switch_item_view);
    }
}
