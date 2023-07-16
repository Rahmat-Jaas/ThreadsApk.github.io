package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.6zV  reason: invalid class name and case insensitive filesystem */
public final class C117946zV {
    public static final void A01(ImageView imageView) {
        C04220Ms.A0B(imageView, 0);
        imageView.setImageDrawable((Drawable) null);
        imageView.setTag(R.id.image_request_callback, (Object) null);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setColorFilter((ColorFilter) null);
        imageView.setImageAlpha(255);
        imageView.setScaleX(1.0f);
    }

    public static final void A00(ImageView.ScaleType scaleType, ImageView imageView, AnonymousClass3HX r6, C127397h3 r7, String str) {
        AnonymousClass0wJ.A1O(imageView, r6);
        H4D h4d = new H4D(scaleType, imageView, r6, r7, str);
        AnonymousClass794.A00();
        if (str != null) {
            C37030Jj7 A0A = C37744K2e.A01().A0A(C18250wR.A0K(str), "bloks");
            A0A.A02(h4d);
            L5E A00 = A0A.A00();
            imageView.setTag(R.id.image_request_callback, h4d);
            A00.CYj();
            return;
        }
        imageView.setImageDrawable((Drawable) null);
    }
}
