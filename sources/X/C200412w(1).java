package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.12w  reason: invalid class name and case insensitive filesystem */
public final class C200412w extends M5O {
    public final TextView A00;
    public final TextView A01;
    public final RecyclerView A02;

    public C200412w(View view) {
        super(view);
        this.A01 = (TextView) AnonymousClass0wJ.A0I(view, R.id.h_scroll_section_title);
        this.A00 = (TextView) AnonymousClass0wJ.A0I(view, R.id.h_scroll_section_description);
        this.A02 = (RecyclerView) AnonymousClass0wJ.A0I(view, R.id.h_scroll_recycle_view);
    }
}
