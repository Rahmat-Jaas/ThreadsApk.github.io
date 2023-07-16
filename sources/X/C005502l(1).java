package X;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: X.02l  reason: invalid class name and case insensitive filesystem */
public final class C005502l extends AnonymousClass03U {
    public static Constructor A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public WindowInsets A00;
    public AnonymousClass01T A01;

    public final void A06(AnonymousClass01T r6) {
        WindowInsets windowInsets = this.A00;
        if (windowInsets != null) {
            this.A00 = windowInsets.replaceSystemWindowInsets(r6.A01, r6.A03, r6.A02, r6.A00);
        }
    }

    public C005502l(AnonymousClass03Y r2) {
        super(r2);
        this.A00 = r2.A04();
    }

    public final AnonymousClass03Y A00() {
        A01();
        WindowInsets windowInsets = this.A00;
        windowInsets.getClass();
        AnonymousClass03Y r2 = new AnonymousClass03Y(windowInsets);
        AnonymousClass01T[] r0 = this.A00;
        AnonymousClass03V r1 = r2.A00;
        r1.A0F(r0);
        r1.A0D(this.A01);
        return r2;
    }

    public final void A05(AnonymousClass01T r1) {
        this.A01 = r1;
    }

    public C005502l() {
        WindowInsets windowInsets;
        if (!A05) {
            try {
                A03 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            A05 = true;
        }
        Field field = A03;
        WindowInsets windowInsets2 = null;
        if (field != null) {
            try {
                WindowInsets windowInsets3 = (WindowInsets) field.get((Object) null);
                if (windowInsets3 != null) {
                    windowInsets = new WindowInsets(windowInsets3);
                    windowInsets2 = windowInsets;
                    this.A00 = windowInsets2;
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!A04) {
            try {
                A02 = WindowInsets.class.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException unused3) {
            }
            A04 = true;
        }
        Constructor constructor = A02;
        if (constructor != null) {
            try {
                windowInsets = (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
                windowInsets2 = windowInsets;
            } catch (ReflectiveOperationException unused4) {
            }
        }
        this.A00 = windowInsets2;
    }
}
