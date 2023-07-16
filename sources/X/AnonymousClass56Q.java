package X;

import android.app.Application;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.56Q  reason: invalid class name */
public final class AnonymousClass56Q extends AnonymousClass10X {
    public final UserSession A00;
    public final C86074wE A01;
    public final C86094wG A02;

    public AnonymousClass56Q(Application application, UserSession userSession) {
        super(application);
        Object value;
        this.A00 = userSession;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0020000_I2(false, false, 2));
        this.A01 = A0z;
        this.A02 = A0z;
        boolean A002 = C34832Lb.A00(A08(), userSession);
        do {
            value = A0z.getValue();
        } while (!A0z.ADi(value, new KtCSuperShape0S0020000_I2(A002, ((KtCSuperShape0S0020000_I2) value).A01, 2)));
    }
}
