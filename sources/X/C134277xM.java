package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7xM  reason: invalid class name and case insensitive filesystem */
public final class C134277xM implements C21658By4 {
    public final /* synthetic */ AnonymousClass7IR A00;

    public final void C26(Drawable drawable) {
        AnonymousClass7IR r2 = this.A00;
        IgImageView igImageView = r2.A00;
        if (igImageView != null) {
            igImageView.setImageDrawable(drawable);
            IgImageView igImageView2 = r2.A00;
            if (igImageView2 != null) {
                igImageView2.setVisibility(0);
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
    }

    public C134277xM(AnonymousClass7IR r1) {
        this.A00 = r1;
    }

    public final void BwY() {
        this.A00.A00 = null;
    }
}
