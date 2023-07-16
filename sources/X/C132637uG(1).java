package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7uG  reason: invalid class name and case insensitive filesystem */
public final class C132637uG implements C33450Ho5 {
    public final void Ccg(Bitmap bitmap, IgImageView igImageView) {
        Drawable drawable = igImageView.getDrawable();
        if ((drawable instanceof BitmapDrawable) || (drawable instanceof C86684y6)) {
            C86684y6 r0 = new C86684y6(drawable, new BitmapDrawable(igImageView.getResources(), bitmap));
            igImageView.setImageDrawable(r0);
            r0.A04.setDuration(200).start();
            return;
        }
        igImageView.setImageBitmap(bitmap);
    }
}
