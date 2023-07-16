package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0000000_I2;

/* renamed from: X.8Fk  reason: invalid class name */
public final class AnonymousClass8Fk extends C02220Ah implements AnonymousClass0ZU {
    public static final AnonymousClass8Fk A00 = new AnonymousClass8Fk();

    public AnonymousClass8Fk() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographer = Choreographer.getInstance();
        } else {
            choreographer = (Choreographer) DH9.A00(AnonymousClass6ZB.A00, new KtSLambdaShape0S0000000_I2(2, (C146958n9) null));
        }
        C04220Ms.A09(choreographer);
        Handler createAsync = Handler.createAsync(Looper.getMainLooper());
        C04220Ms.A06(createAsync);
        AnonymousClass8bZ r1 = new AnonymousClass8bZ(createAsync, choreographer);
        return C25235DiG.A01(r1, r1.A06);
    }
}
