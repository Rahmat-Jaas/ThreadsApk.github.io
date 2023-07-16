package X;

import android.app.Application;
import kotlin.coroutines.jvm.internal.KtSLambdaShape10S0101000_I2_7;

/* renamed from: X.10X  reason: invalid class name */
public class AnonymousClass10X extends C62793ak {
    public final Application A00;

    public AnonymousClass10X(Application application) {
        C04220Ms.A0B(application, 1);
        this.A00 = application;
    }

    public final Application A08() {
        Application application = this.A00;
        C04220Ms.A0C(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return application;
    }

    public static C86064wD A07(Object obj, KtSLambdaShape10S0101000_I2_7 ktSLambdaShape10S0101000_I2_7) {
        AnonymousClass0OU.A00(obj);
        return ((C19240zX) ktSLambdaShape10S0101000_I2_7.A01).A06;
    }
}
