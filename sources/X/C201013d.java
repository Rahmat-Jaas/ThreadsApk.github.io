package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.13d  reason: invalid class name and case insensitive filesystem */
public final class C201013d extends M5O {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;

    public C201013d(View view) {
        super(view);
        this.A00 = view;
        this.A01 = (ImageView) AnonymousClass0wJ.A0J(view, R.id.image_check_list_item);
        this.A05 = (TextView) AnonymousClass0wJ.A0J(view, R.id.text_check_list_item);
        this.A04 = C18180wK.A0G(view, R.id.text_check_list_item_subtitle);
        this.A02 = (ImageView) AnonymousClass0wJ.A0J(view, R.id.image_check_list_item_status);
        this.A03 = (TextView) AnonymousClass0wJ.A0J(view, R.id.text_progress);
    }
}
