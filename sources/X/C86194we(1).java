package X;

import android.app.Dialog;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4we  reason: invalid class name and case insensitive filesystem */
public final class C86194we extends Dialog {
    public final /* synthetic */ C104716cG A00;
    public final /* synthetic */ C121997Jj A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ AnonymousClass0ZU A03;

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Window window;
        View decorView;
        C127397h3 r2;
        C04220Ms.A0B(motionEvent, 0);
        C109326jp r3 = this.A02;
        if (r3 == null || motionEvent.getAction() != 0 || (window = getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return true;
        }
        if (motionEvent.getX() >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && motionEvent.getX() < ((float) decorView.getWidth()) && motionEvent.getY() >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && motionEvent.getY() < ((float) decorView.getHeight())) {
            return true;
        }
        C121997Jj r0 = this.A01;
        if (r0 != null) {
            r2 = r0.A02;
        } else {
            r2 = null;
        }
        C122047Jt.A03((AnonymousClass3HX) this.A03.invoke(), r2, C63893iY.A01, r3);
        this.A00.A00.A06();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86194we(Context context, C104716cG r2, C121997Jj r3, C109326jp r4, AnonymousClass0ZU r5) {
        super(context);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
    }
}
