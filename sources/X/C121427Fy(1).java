package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.redex.IDxLListenerShape407S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Fy  reason: invalid class name and case insensitive filesystem */
public final class C121427Fy {
    public static final void A00(ImageView imageView) {
        BitmapDrawable bitmapDrawable;
        C04220Ms.A0B(imageView, 0);
        Drawable drawable = imageView.getContext().getDrawable(R.drawable.default_album_art_icon);
        Bitmap bitmap = null;
        if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        imageView.setImageBitmap(bitmap);
    }

    public static final void A01(ImageView imageView, ImageUrl imageUrl) {
        C04220Ms.A0B(imageView, 0);
        Drawable drawable = imageView.getDrawable();
        C04220Ms.A0C(drawable, "null cannot be cast to non-null type com.instagram.music.common.ui.AlbumArtDrawable");
        ((C86674y5) drawable).A02(imageUrl);
    }

    public static final void A02(ImageView imageView, List list) {
        if (list.size() == 1) {
            A01(imageView, (ImageUrl) list.get(0));
            return;
        }
        Drawable drawable = imageView.getDrawable();
        C04220Ms.A0C(drawable, "null cannot be cast to non-null type com.instagram.music.common.ui.AlbumArtDrawable");
        C86674y5 r5 = (C86674y5) drawable;
        if (list.size() != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass3WG.A02((ImageUrl) it.next())) {
                }
            }
            int i = 0;
            List subList = list.subList(0, Math.min(list.size(), 4));
            ArrayList A0t = C18200wM.A0t(subList);
            Iterator it2 = subList.iterator();
            while (it2.hasNext()) {
                it2.next();
                A0t.add((Object) null);
            }
            r5.A01 = A0t;
            for (Object next : subList) {
                int i2 = i + 1;
                if (i < 0) {
                    C06750aI.A1A();
                    throw null;
                }
                ImageUrl imageUrl = (ImageUrl) next;
                if (imageUrl != null) {
                    C37030Jj7 A0A = C37744K2e.A01().A0A(imageUrl, "AlbumArtDrawable");
                    A0A.A07 = Integer.valueOf(i);
                    A0A.A02(r5.A07);
                    A0A.A01();
                }
                i = i2;
            }
            return;
        }
        r5.A00 = (Bitmap) C18190wL.A0f(r5.A08);
        C86674y5.A01(r5);
        r5.invalidateSelf();
        r5.invalidateSelf();
    }

    public static final void A03(ImageUrl imageUrl, IgImageView igImageView, C11630kW r5) {
        C04220Ms.A0B(igImageView, 0);
        if (AnonymousClass3WG.A02(imageUrl)) {
            A00(igImageView);
            return;
        }
        igImageView.setPlaceHolderColor(igImageView.getContext().getColor(R.color.cds_white_a20));
        igImageView.A0F = new IDxLListenerShape407S0100000_2_I2(igImageView, 0);
        if (imageUrl != null) {
            igImageView.setUrl(imageUrl, r5);
        }
    }
}
