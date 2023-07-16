package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4z5  reason: invalid class name */
public final class AnonymousClass4z5 extends Handler {
    public final void handleMessage(Message message) {
        C04220Ms.A0B(message, 0);
        super.handleMessage(message);
        if (message.what == 0) {
            Object obj = message.obj;
            C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.bloks.components.IgSliderBinderUtils.SliderController");
            C109116jU r5 = ((C105666dn) obj).A00;
            if (r5 != null) {
                C127397h3 r4 = r5.A02;
                C109326jp A0L = r4.A0L(40);
                AnonymousClass3VO A00 = AnonymousClass3VO.A00();
                A00.A02(r5.A02, 0);
                C122047Jt.A03(r5.A01, r4, C86154wM.A0R(A00, Integer.valueOf(r5.A00), 1), A0L);
            }
        }
    }

    public AnonymousClass4z5(Looper looper) {
        super(looper);
    }
}
