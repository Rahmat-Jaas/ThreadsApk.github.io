package X;

import android.app.Activity;
import android.os.Build;
import java.util.Map;

/* renamed from: X.484  reason: invalid class name */
public final class AnonymousClass484 implements C144608im {
    public AnonymousClass0ZU A00 = C75564cR.A00;
    public AnonymousClass0ZU A01 = C75574cS.A00;
    public boolean A02;
    public boolean A03;
    public final Activity A04;

    public final void CAi(Map map) {
        AnonymousClass0ZU r0;
        C04220Ms.A0B(map, 0);
        boolean z = false;
        this.A03 = false;
        C971568d A002 = C121897Ir.A00(map);
        if (A002 == C971568d.DENIED_DONT_ASK_AGAIN) {
            z = true;
        }
        this.A02 = z;
        if (A002 == C971568d.GRANTED || C121897Ir.A03(this.A04)) {
            r0 = this.A01;
        } else {
            r0 = this.A00;
        }
        r0.invoke();
    }

    public final String A00() {
        Activity activity;
        int i;
        if (Build.VERSION.SDK_INT >= 33) {
            activity = this.A04;
            if (activity.getApplicationInfo().targetSdkVersion >= 33) {
                i = 2131827869;
                String string = activity.getString(i);
                C04220Ms.A09(string);
                String A0l = AnonymousClass0wJ.A0l(activity, string, 2131827891);
                C04220Ms.A06(A0l);
                return A0l;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        activity = this.A04;
        i = 2131827890;
        if (i2 >= 30) {
            i = 2131827845;
        }
        String string2 = activity.getString(i);
        C04220Ms.A09(string2);
        String A0l2 = AnonymousClass0wJ.A0l(activity, string2, 2131827891);
        C04220Ms.A06(A0l2);
        return A0l2;
    }

    public AnonymousClass484(Activity activity) {
        this.A04 = activity;
    }
}
