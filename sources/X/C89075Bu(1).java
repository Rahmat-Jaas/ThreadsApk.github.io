package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.5Bu  reason: invalid class name and case insensitive filesystem */
public final class C89075Bu extends M5O {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final IgImageView A04;
    public final View A05;

    public C89075Bu(View view) {
        super(view);
        this.A05 = view;
        this.A04 = (IgImageView) AnonymousClass0wJ.A0J(view, R.id.media_thumbnail);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.media_caption);
        this.A03 = (TextView) AnonymousClass0wJ.A0J(view, R.id.media_taken_at);
        this.A00 = AnonymousClass0wJ.A0K(view, R.id.approve_button);
        this.A01 = AnonymousClass0wJ.A0K(view, R.id.decline_button);
    }
}
