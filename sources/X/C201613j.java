package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.13j  reason: invalid class name and case insensitive filesystem */
public final class C201613j extends M5O {
    public View A00;
    public View A01;
    public FrameLayout A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;

    public C201613j(View view, boolean z) {
        super(view);
        if (!z) {
            this.A02 = (FrameLayout) view.requireViewById(R.id.row_title_textview);
            this.A05 = AnonymousClass0wJ.A0L(view, R.id.row_header_subtitle_textview);
        }
        this.A06 = AnonymousClass0wJ.A0L(view, R.id.row_header_textview);
        this.A01 = view.requireViewById(R.id.frame_header);
        this.A00 = view.requireViewById(R.id.row_divider);
        this.A04 = C18180wK.A0G(view, R.id.row_header_action);
        this.A03 = C18220wO.A0K(view, R.id.row_header_action_icon);
    }
}
