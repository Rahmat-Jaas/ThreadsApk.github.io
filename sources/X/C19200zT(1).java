package X;

import android.app.Application;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S0100000_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17;

/* renamed from: X.0zT  reason: invalid class name and case insensitive filesystem */
public final class C19200zT extends AnonymousClass10X {
    public final UserSession A00;
    public final List A01;

    public C19200zT(Application application, UserSession userSession) {
        super(application);
        this.A00 = userSession;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A01 = A0v;
        A0v.add(new KtCSuperShape2S0100000_I2(AnonymousClass4b0.A00, 4));
        if (C09650fs.A07(application)) {
            A0v.add(new KtCSuperShape2S0100000_I2(new KtLambdaShape37S0100000_I2_17(this, 0), 3));
        }
        C000300e.A0r(C06750aI.A17(new KtCSuperShape2S0100000_I2(new KtLambdaShape37S0100000_I2_17(this, 1), 1), new KtCSuperShape2S0100000_I2(new KtLambdaShape37S0100000_I2_17(this, 2), 0), new KtCSuperShape2S0100000_I2(new KtLambdaShape37S0100000_I2_17(this, 3), 2)), A0v);
    }
}
