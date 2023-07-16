package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.12k  reason: invalid class name and case insensitive filesystem */
public final class C199212k extends M5O {
    public final ImageView A00;
    public final TextView A01;

    public C199212k(View view) {
        super(view);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(view, R.id.row_simple_text_title);
        this.A00 = (ImageView) AnonymousClass0wJ.A0J(view, R.id.row_icon);
        int A03 = C18230wP.A03(view, R.id.row_simple_text_description);
        C18190wL.A18(view, R.id.row_address_dot, A03);
        C18190wL.A18(view, R.id.row_simple_text_extra_info, A03);
    }
}
