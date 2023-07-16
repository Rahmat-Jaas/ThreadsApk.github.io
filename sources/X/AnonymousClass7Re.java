package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;

/* renamed from: X.7Re  reason: invalid class name */
public final class AnonymousClass7Re implements View.OnTouchListener {
    public final /* synthetic */ C144468iY A00;
    public final /* synthetic */ AnonymousClass51W A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass7Re(C144468iY r1, AnonymousClass51W r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            AnonymousClass51W r8 = this.A01;
            float x = motionEvent.getX();
            boolean z = this.A02;
            int A002 = AnonymousClass51W.A00(r8, x, z);
            this.A00.Bt7(A002);
            List list = r8.A0B;
            if (!C18190wL.A1a(list)) {
                for (C111236n0 A022 : r8.A0C) {
                    AnonymousClass50T A023 = AnonymousClass51W.A02(A022, r8);
                    FrameLayout frameLayout = r8.A08;
                    int i = r8.A07;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMarginStart(i);
                    frameLayout.addView(A023, layoutParams);
                    list.add(A023);
                }
            }
            r8.A07(AnonymousClass51W.A01(r8, A002, z));
            if (r8.A04) {
                r8.A05(A002);
                r8.A08.requestDisallowInterceptTouchEvent(true);
            }
        } else {
            if (motionEvent.getActionMasked() == 2) {
                AnonymousClass51W r2 = this.A01;
                if (r2.A04) {
                    int A003 = AnonymousClass51W.A00(r2, motionEvent.getX(), true);
                    r2.A07(AnonymousClass51W.A01(r2, A003, true));
                    r2.A05(A003);
                    return true;
                }
            }
            if (motionEvent.getActionMasked() == 1) {
                AnonymousClass51W r1 = this.A01;
                if (r1.A04) {
                    r1.A08.requestDisallowInterceptTouchEvent(false);
                    return true;
                }
            }
        }
        return true;
    }
}
