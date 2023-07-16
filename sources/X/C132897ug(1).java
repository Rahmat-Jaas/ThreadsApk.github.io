package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.7ug  reason: invalid class name and case insensitive filesystem */
public final class C132897ug implements C33848Hvh {
    public final C28189F0m A00;
    public final Context A01;

    public C132897ug(Context context) {
        C04220Ms.A0B(context, 1);
        this.A01 = context;
        Drawable drawable = context.getDrawable(R.drawable.effect_no_selection);
        if (drawable != null) {
            this.A00 = new F6Z(context.getResources(), ((BitmapDrawable) drawable).getBitmap());
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final int AfU() {
        return 0;
    }

    public final boolean CsK() {
        return false;
    }

    public final boolean CsV() {
        return false;
    }

    public final String AfV() {
        return AnonymousClass0wJ.A0k(this.A01, 2131821361);
    }

    public final /* bridge */ /* synthetic */ Drawable AfW() {
        return this.A00;
    }

    public final /* synthetic */ String B9r() {
        return null;
    }
}
