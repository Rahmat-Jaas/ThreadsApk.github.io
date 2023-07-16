package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.6Qt  reason: invalid class name and case insensitive filesystem */
public final class C101326Qt {
    public static final void A00(View view) {
        Locale A02 = C31103Gfm.A02();
        ((TextView) AnonymousClass0wJ.A0J(view, R.id.like_count)).setText(NumberFormat.getInstance(A02).format(1));
        ((TextView) AnonymousClass0wJ.A0J(view, R.id.comment_count)).setText(NumberFormat.getInstance(A02).format(1));
    }
}
