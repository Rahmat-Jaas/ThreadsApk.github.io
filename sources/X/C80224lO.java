package X;

import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.4lO  reason: invalid class name and case insensitive filesystem */
public final class C80224lO extends C02220Ah implements AnonymousClass0YY {
    public static final C80224lO A00 = new C80224lO();

    public C80224lO() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View findViewById;
        View view = (View) obj;
        C04220Ms.A0B(view, 0);
        boolean z = true;
        if (!(view.getId() == R.id.product_feed_title_row && (findViewById = view.findViewById(R.id.button_text)) != null && findViewById.getVisibility() == 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
