package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3tp  reason: invalid class name and case insensitive filesystem */
public final class C65583tp implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass3Ft A00;
    public final /* synthetic */ AnonymousClass4tS A01;

    public C65583tp(AnonymousClass3Ft r1, AnonymousClass4tS r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (1 != motionEvent.getAction()) {
            return false;
        }
        this.A00.A00(this.A01, AnonymousClass006.A01);
        return false;
    }
}
