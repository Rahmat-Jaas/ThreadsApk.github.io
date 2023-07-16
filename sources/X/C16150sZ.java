package X;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0sZ  reason: invalid class name and case insensitive filesystem */
public final class C16150sZ implements C004402a {
    public final Rect A00 = new Rect();
    public final /* synthetic */ ViewPager A01;

    public C16150sZ(ViewPager viewPager) {
        this.A01 = viewPager;
    }

    public final AnonymousClass03Y Bky(View view, AnonymousClass03Y r11) {
        AnonymousClass03Y A05 = C006702y.A05(view, r11);
        AnonymousClass03V r2 = A05.A00;
        if (r2.A0H()) {
            return A05;
        }
        Rect rect = this.A00;
        rect.left = r2.A04().A01;
        rect.top = A05.A03();
        rect.right = r2.A04().A02;
        rect.bottom = A05.A02();
        ViewPager viewPager = this.A01;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AnonymousClass03Y A04 = C006702y.A04(viewPager.getChildAt(i), A05);
            AnonymousClass03V r8 = A04.A00;
            rect.left = Math.min(r8.A04().A01, rect.left);
            rect.top = Math.min(A04.A03(), rect.top);
            rect.right = Math.min(r8.A04().A02, rect.right);
            rect.bottom = Math.min(A04.A02(), rect.bottom);
        }
        AnonymousClass03T r4 = new AnonymousClass03T(A05);
        AnonymousClass01T A002 = AnonymousClass01T.A00(rect.left, rect.top, rect.right, rect.bottom);
        AnonymousClass03U r0 = r4.A00;
        r0.A06(A002);
        return r0.A00();
    }
}
