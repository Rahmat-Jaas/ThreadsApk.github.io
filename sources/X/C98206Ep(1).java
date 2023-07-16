package X;

import android.view.MotionEvent;

/* renamed from: X.6Ep  reason: invalid class name and case insensitive filesystem */
public final class C98206Ep {
    public static final void A00(C109656kM r3, AnonymousClass0YY r4, long j, boolean z) {
        C112316pN r0 = r3.A02;
        if (r0 != null) {
            MotionEvent motionEvent = r0.A01.A00;
            int action = motionEvent.getAction();
            if (z) {
                motionEvent.setAction(3);
            }
            motionEvent.offsetLocation(-AnonymousClass7KC.A01(j), -AnonymousClass7KC.A02(j));
            r4.invoke(motionEvent);
            motionEvent.offsetLocation(AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j));
            motionEvent.setAction(action);
            return;
        }
        throw C18190wL.A0a("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
