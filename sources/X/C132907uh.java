package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.7uh  reason: invalid class name and case insensitive filesystem */
public final class C132907uh implements C33848Hvh {
    public final Drawable A00;
    public final String A01;
    public final AnonymousClass0ZU A02;

    public final int AfU() {
        return 0;
    }

    public final boolean CsK() {
        return false;
    }

    public final boolean CsV() {
        return true;
    }

    public final String AfV() {
        return this.A01;
    }

    public final Drawable AfW() {
        return this.A00;
    }

    public final String B9r() {
        return (String) this.A02.invoke();
    }

    public C132907uh(Context context, AnonymousClass0ZU r4) {
        this.A02 = r4;
        this.A01 = AnonymousClass0wJ.A0k(context, 2131823861);
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_x_pano_outline_24);
        C04220Ms.A0A(drawable);
        Drawable mutate = drawable.mutate();
        C04220Ms.A06(mutate);
        this.A00 = mutate;
        mutate.setTint(-1);
    }
}
