package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.13P  reason: invalid class name */
public final class AnonymousClass13P extends M5O {
    public final TextView A00;
    public final TextView A01;
    public final RecyclerView A02;
    public final IgImageView A03;

    public AnonymousClass13P(View view) {
        super(view);
        this.A01 = (TextView) AnonymousClass0wJ.A0I(view, R.id.section_title);
        this.A00 = (TextView) AnonymousClass0wJ.A0I(view, R.id.section_description);
        this.A03 = (IgImageView) AnonymousClass0wJ.A0I(view, R.id.image);
        this.A02 = (RecyclerView) AnonymousClass0wJ.A0I(view, R.id.value_props_list_recycle_view);
    }
}
