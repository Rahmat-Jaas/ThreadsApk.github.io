package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3B9  reason: invalid class name */
public final class AnonymousClass3B9 {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;

    public AnonymousClass3B9(ViewGroup viewGroup) {
        this.A03 = (CircularImageView) viewGroup.findViewById(R.id.avatar_imageview);
        this.A02 = C18180wK.A0G(viewGroup, R.id.username_textview);
        this.A00 = viewGroup.findViewById(R.id.option_button);
        this.A01 = viewGroup.findViewById(R.id.option_button_dots);
    }
}
