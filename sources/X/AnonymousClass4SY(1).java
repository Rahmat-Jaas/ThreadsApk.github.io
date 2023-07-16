package X;

import android.graphics.Bitmap;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.4SY  reason: invalid class name */
public final class AnonymousClass4SY implements Runnable {
    public final /* synthetic */ AnonymousClass3D8 A00;
    public final /* synthetic */ AnonymousClass3TK A01;
    public final /* synthetic */ User A02;

    public AnonymousClass4SY(AnonymousClass3D8 r1, AnonymousClass3TK r2, User user) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = user;
    }

    public final void run() {
        AnonymousClass3TK r8 = this.A01;
        CircularImageView circularImageView = (CircularImageView) r8.A05.requireViewById(R.id.avatar_picture);
        TextView A0L = AnonymousClass0wJ.A0L(r8.A05, R.id.user_id);
        TextView A0L2 = AnonymousClass0wJ.A0L(r8.A05, R.id.user_name);
        AnonymousClass3D8 r1 = this.A00;
        circularImageView.setImageBitmap(r1.A00);
        circularImageView.setStrokeAlpha(circularImageView.A00);
        Bitmap bitmap = r1.A00;
        User user = this.A02;
        ImageUrl B4M = user.B4M();
        C11630kW r12 = r8.A08;
        circularImageView.setImageDrawable(r8.A00);
        if (bitmap != null) {
            circularImageView.setImageBitmap(bitmap);
        } else {
            circularImageView.setUrl(B4M, r12);
        }
        A0L.setText(user.BK7());
        A0L2.setText(user.Ak1());
    }
}
