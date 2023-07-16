package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3Bb  reason: invalid class name and case insensitive filesystem */
public final class C57443Bb {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public C57443Bb(ViewGroup viewGroup) {
        this.A03 = (CircularImageView) viewGroup.findViewById(R.id.avatar_image_view);
        this.A02 = C18180wK.A0G(viewGroup, R.id.title);
        this.A01 = C18180wK.A0G(viewGroup, R.id.full_name);
        this.A00 = viewGroup.findViewById(R.id.login_button);
    }
}
