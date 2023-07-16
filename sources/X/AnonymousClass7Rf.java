package X;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4120000_I2;

/* renamed from: X.7Rf  reason: invalid class name */
public final class AnonymousClass7Rf implements View.OnTouchListener {
    public final /* synthetic */ KtCSuperShape0S4120000_I2 A00;
    public final /* synthetic */ C21839C2o A01;
    public final /* synthetic */ C3G A02;

    public AnonymousClass7Rf(KtCSuperShape0S4120000_I2 ktCSuperShape0S4120000_I2, C21839C2o c2o, C3G c3g) {
        this.A00 = ktCSuperShape0S4120000_I2;
        this.A02 = c3g;
        this.A01 = c2o;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        C04220Ms.A0B(motionEvent, 1);
        if (motionEvent.getAction() != 0 || (onTouchListener = (View.OnTouchListener) ((AnonymousClass0YP) ((KtCSuperShape0S0400000_I2) this.A00.A00).A01).invoke(this.A02, this.A01)) == null) {
            return false;
        }
        return onTouchListener.onTouch(view, motionEvent);
    }
}
