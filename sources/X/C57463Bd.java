package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3Bd  reason: invalid class name and case insensitive filesystem */
public final class C57463Bd {
    public IgTextView A00;
    public IgTextView A01;
    public CircularImageView A02;
    public CircularImageView A03;

    public C57463Bd(View view) {
        C04220Ms.A0B(view, 1);
        View findViewById = view.findViewById(R.id.avatar_container);
        if (findViewById != null) {
            this.A02 = (CircularImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.badge_container);
            if (findViewById2 != null) {
                this.A03 = (CircularImageView) findViewById2;
                View findViewById3 = view.findViewById(R.id.accountTitle);
                if (findViewById3 != null) {
                    this.A01 = (IgTextView) findViewById3;
                    View findViewById4 = view.findViewById(R.id.accountSubtitle);
                    if (findViewById4 != null) {
                        this.A00 = (IgTextView) findViewById4;
                        return;
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
