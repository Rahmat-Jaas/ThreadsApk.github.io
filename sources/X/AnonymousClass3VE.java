package X;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;

/* renamed from: X.3VE  reason: invalid class name */
public final class AnonymousClass3VE {
    public static final C15460rM A04 = new C15460rM("OJGKRT0HGZNU-LGa8F7GViztV4g", "8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M");
    public final C15460rM A00;
    public final Set A01;
    public final C04530Oa A02 = AnonymousClass0OY.A02(new KtLambdaShape26S0100000_I2_6(this, 45));
    public final C04530Oa A03 = AnonymousClass0OY.A02(new KtLambdaShape26S0100000_I2_6(this, 46));

    public final boolean A00(Context context) {
        if (((C15710rl) this.A03.getValue()).A01(context, (Intent) null, (C16240si) null) || Binder.getCallingPid() == Process.myPid()) {
            return true;
        }
        return false;
    }

    public AnonymousClass3VE(C15460rM r3, Set set) {
        this.A00 = r3;
        this.A01 = set;
    }

    public final boolean A01(Context context, Intent intent) {
        if (Binder.getCallingPid() == Process.myPid() || ((C15710rl) this.A03.getValue()).A01(context, intent, (C16240si) null)) {
            return true;
        }
        return false;
    }
}
