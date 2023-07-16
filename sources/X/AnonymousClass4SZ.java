package X;

import android.graphics.Bitmap;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.4SZ  reason: invalid class name */
public final class AnonymousClass4SZ implements Runnable {
    public final /* synthetic */ AnonymousClass3D8 A00;
    public final /* synthetic */ AnonymousClass3TK A01;
    public final /* synthetic */ User A02;

    public AnonymousClass4SZ(AnonymousClass3D8 r1, AnonymousClass3TK r2, User user) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = user;
    }

    public final void run() {
        AnonymousClass3TK r8 = this.A01;
        IgImageView igImageView = (IgImageView) r8.A05.findViewById(R.id.avatar_picture);
        CircularImageView circularImageView = (CircularImageView) r8.A05.requireViewById(R.id.small_avatar_picture);
        TextView A0L = AnonymousClass0wJ.A0L(r8.A05, R.id.user_preview_id);
        circularImageView.setStrokeAlpha(circularImageView.A00);
        AnonymousClass3D8 r5 = this.A00;
        Bitmap bitmap = r5.A00;
        User user = this.A02;
        ImageUrl B4M = user.B4M();
        C11630kW r3 = r8.A08;
        igImageView.setImageDrawable(r8.A00);
        if (bitmap != null) {
            igImageView.setImageBitmap(bitmap);
        } else {
            igImageView.setUrl(B4M, r3);
        }
        Bitmap bitmap2 = r5.A00;
        ImageUrl B4M2 = user.B4M();
        circularImageView.setImageDrawable(r8.A00);
        if (bitmap2 != null) {
            circularImageView.setImageBitmap(bitmap2);
        } else {
            circularImageView.setUrl(B4M2, r3);
        }
        A0L.setText(user.BK7());
    }
}
