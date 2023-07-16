package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.3Co  reason: invalid class name and case insensitive filesystem */
public final class C57813Co {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;

    public C57813Co(View view) {
        this.A00 = view;
        this.A05 = AnonymousClass0wJ.A0L(view, R.id.title);
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.subtitle);
        this.A01 = C18200wM.A0J(view, R.id.notification_badge_icon);
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.count_badge);
        this.A02 = C18200wM.A0J(view, R.id.error_badge);
    }
}
