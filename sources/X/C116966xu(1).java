package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.6xu  reason: invalid class name and case insensitive filesystem */
public final class C116966xu {
    public static /* synthetic */ void A01(ImageView imageView, AnonymousClass697 r5) {
        C04220Ms.A0B(r5, 1);
        int i = r5.A00;
        int i2 = r5.A01;
        C121097Ec.A01(imageView.getContext(), imageView, AnonymousClass7Kz.A0G(), i, i2);
    }

    public static final void A00(Context context, ImageView imageView, AnonymousClass697 r5) {
        int i;
        if (r5 != null) {
            int i2 = r5.A00;
            int i3 = r5.A01;
            C121097Ec A0G = AnonymousClass7Kz.A0G();
            if (context == null) {
                context = imageView.getContext();
            }
            C121097Ec.A01(context, imageView, A0G, i2, i3);
            i = 0;
        } else {
            imageView.setImageDrawable((Drawable) null);
            i = 8;
        }
        imageView.setVisibility(i);
    }
}
