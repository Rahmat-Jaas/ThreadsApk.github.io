package X;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.02h  reason: invalid class name and case insensitive filesystem */
public class C005102h extends AnonymousClass03V {
    public static Class A05;
    public static Field A06;
    public static Field A07;
    public static Method A08;
    public static boolean A09;
    public AnonymousClass01T A00;
    public AnonymousClass03Y A01;
    public AnonymousClass01T A02 = null;
    public AnonymousClass01T[] A03;
    public final WindowInsets A04;

    public AnonymousClass01T A05(int i) {
        AnonymousClass01T r2 = AnonymousClass01T.A04;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                r2 = AnonymousClass01T.A02(r2, A0J(i2, false));
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return r2;
    }

    public AnonymousClass01T A06(int i) {
        AnonymousClass01T r2 = AnonymousClass01T.A04;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                r2 = AnonymousClass01T.A02(r2, A0J(i2, true));
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (r3 != 128) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(int r6) {
        /*
            r5 = this;
            r4 = 1
            r3 = 1
        L_0x0002:
            r0 = r6 & r3
            if (r0 == 0) goto L_0x0017
            r2 = 0
            if (r3 == r4) goto L_0x001e
            r0 = 2
            if (r3 == r0) goto L_0x001e
            r0 = 4
            if (r3 == r0) goto L_0x002c
            r0 = 8
            if (r3 == r0) goto L_0x001e
            r0 = 128(0x80, float:1.794E-43)
            if (r3 == r0) goto L_0x001e
        L_0x0017:
            int r3 = r3 << 1
            r0 = 256(0x100, float:3.59E-43)
            if (r3 <= r0) goto L_0x0002
            return r4
        L_0x001e:
            X.01T r1 = r5.A0J(r3, r2)
            X.01T r0 = X.AnonymousClass01T.A04
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0017
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005102h.A0I(int):boolean");
    }

    public final AnonymousClass01T A0J(int i, boolean z) {
        AnonymousClass01T r0;
        AnonymousClass01T r6;
        AnonymousClass01T r1;
        AnonymousClass01T r12;
        AnonymousClass01T r02;
        AnonymousClass025 A072;
        if (i != 1) {
            AnonymousClass01T r03 = null;
            if (i != 2) {
                if (i == 8) {
                    AnonymousClass01T[] r13 = this.A03;
                    if (r13 != null && (r02 = r13[3]) != null) {
                        return r02;
                    }
                    AnonymousClass01T A042 = A04();
                    AnonymousClass03Y r04 = this.A01;
                    if (r04 != null) {
                        r1 = r04.A00.A03();
                    } else {
                        r1 = AnonymousClass01T.A04;
                    }
                    int i2 = A042.A00;
                    int i3 = r1.A00;
                    if (i2 > i3 || ((r12 = this.A00) != null && !r12.equals(AnonymousClass01T.A04) && (i2 = r12.A00) > i3)) {
                        return AnonymousClass01T.A00(0, 0, 0, i2);
                    }
                } else if (i == 16) {
                    return A00();
                } else {
                    if (i == 32) {
                        return A02();
                    }
                    if (i == 64) {
                        return A01();
                    }
                    if (i == 128) {
                        AnonymousClass03Y r05 = this.A01;
                        if (r05 != null) {
                            A072 = r05.A00.A07();
                        } else {
                            A072 = A07();
                        }
                        if (A072 != null) {
                            DisplayCutout displayCutout = A072.A00;
                            return AnonymousClass01T.A00(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
                return AnonymousClass01T.A04;
            } else if (z) {
                AnonymousClass03Y r06 = this.A01;
                if (r06 != null) {
                    r6 = r06.A00.A03();
                } else {
                    r6 = AnonymousClass01T.A04;
                }
                AnonymousClass01T A032 = A03();
                return AnonymousClass01T.A00(Math.max(r6.A01, A032.A01), 0, Math.max(r6.A02, A032.A02), Math.max(r6.A00, A032.A00));
            } else {
                AnonymousClass01T A043 = A04();
                AnonymousClass03Y r14 = this.A01;
                if (r14 != null) {
                    r03 = r14.A00.A03();
                }
                int i4 = A043.A00;
                if (r03 != null) {
                    i4 = Math.min(i4, r03.A00);
                }
                return AnonymousClass01T.A00(A043.A01, 0, A043.A02, i4);
            }
        } else if (!z) {
            return AnonymousClass01T.A00(0, A04().A03, 0, 0);
        } else {
            AnonymousClass03Y r07 = this.A01;
            if (r07 != null) {
                r0 = r07.A00.A03();
            } else {
                r0 = AnonymousClass01T.A04;
            }
            return AnonymousClass01T.A00(0, Math.max(r0.A03, A04().A03), 0, 0);
        }
    }

    public final AnonymousClass01T A04() {
        AnonymousClass01T r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        WindowInsets windowInsets = this.A04;
        AnonymousClass01T A002 = AnonymousClass01T.A00(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.A02 = A002;
        return A002;
    }

    public AnonymousClass03Y A0B(int i, int i2, int i3, int i4) {
        AnonymousClass03T r1 = new AnonymousClass03T(new AnonymousClass03Y(this.A04));
        AnonymousClass01T A002 = AnonymousClass03Y.A00(A04(), i, i2, i3, i4);
        AnonymousClass03U r12 = r1.A00;
        r12.A06(A002);
        r12.A05(AnonymousClass03Y.A00(A03(), i, i2, i3, i4));
        return r12.A00();
    }

    public void A0C(View view) {
        AnonymousClass01T r0;
        if (Build.VERSION.SDK_INT < 30) {
            if (!A09) {
                try {
                    A08 = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                    Class<?> cls = Class.forName("android.view.View$AttachInfo");
                    A05 = cls;
                    A07 = cls.getDeclaredField("mVisibleInsets");
                    A06 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                    A07.setAccessible(true);
                    A06.setAccessible(true);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", AnonymousClass00U.A0L("Failed to get visible insets. (Reflection error). ", e.getMessage()), e);
                }
                A09 = true;
            }
            Method method = A08;
            if (!(method == null || A05 == null || A07 == null)) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    } else {
                        Rect rect = (Rect) A07.get(A06.get(invoke));
                        if (rect != null) {
                            r0 = AnonymousClass01T.A00(rect.left, rect.top, rect.right, rect.bottom);
                            if (r0 == null) {
                            }
                            this.A00 = r0;
                            return;
                        }
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", AnonymousClass00U.A0L("Failed to get visible insets. (Reflection error). ", e2.getMessage()), e2);
                }
            }
            r0 = AnonymousClass01T.A04;
            this.A00 = r0;
            return;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    public final boolean A0G() {
        return this.A04.isRound();
    }

    public C005102h(AnonymousClass03Y r2, WindowInsets windowInsets) {
        super(r2);
        this.A04 = windowInsets;
    }

    public final void A0E(AnonymousClass03Y r1) {
        this.A01 = r1;
    }

    public final void A0F(AnonymousClass01T[] r1) {
        this.A03 = r1;
    }
}
