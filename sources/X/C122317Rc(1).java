package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7Rc  reason: invalid class name and case insensitive filesystem */
public final class C122317Rc implements View.OnTouchListener {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ AnonymousClass7IR A01;

    public C122317Rc(Rect rect, AnonymousClass7IR r2) {
        this.A00 = rect;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 4) {
            return false;
        }
        if (this.A00.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return true;
        }
        this.A01.A09.A04();
        return true;
    }
}
