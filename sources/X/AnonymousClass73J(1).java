package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.73J  reason: invalid class name */
public final class AnonymousClass73J {
    public static final C04530Oa A00 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C74384aM.A00);

    public static final C115286uo A00(Drawable drawable, C147188nY r5) {
        Object r3;
        r5.Cvb(1756822313);
        boolean A0y = C147188nY.A0y(r5, drawable);
        AnonymousClass7W3 r52 = (AnonymousClass7W3) r5;
        Object A13 = r52.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            if (drawable == null) {
                A13 = AnonymousClass543.A00;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    C04220Ms.A06(bitmap);
                    r3 = new AnonymousClass542(new C31336Gmy(bitmap));
                } else if (drawable instanceof ColorDrawable) {
                    r3 = new AnonymousClass541(((long) ((ColorDrawable) drawable).getColor()) << 32);
                } else {
                    Drawable mutate = drawable.mutate();
                    C04220Ms.A06(mutate);
                    r3 = new AnonymousClass545(mutate);
                }
                A13 = (C115286uo) r3;
            }
            r52.A14(A13);
        }
        AnonymousClass7W3.A0w(r52, false);
        C115286uo r32 = (C115286uo) A13;
        AnonymousClass7W3.A0w(r52, false);
        return r32;
    }
}
