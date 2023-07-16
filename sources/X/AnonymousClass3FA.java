package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.instagram.service.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3FA  reason: invalid class name */
public final class AnonymousClass3FA {
    public Object A00;
    public final AnonymousClass4nV A01;

    public final Map A00(KtCSuperShape0S0060000_I2 ktCSuperShape0S0060000_I2, ImmutableList immutableList) {
        Map map;
        if (C04220Ms.A0I(this.A00, ktCSuperShape0S0060000_I2)) {
            MUg mUg = ((C679041a) this.A01).A00;
            LinkedHashMap A0y = C18220wO.A0y();
            for (Object next : immutableList) {
                Object obj = mUg.get(next);
                if (obj != null) {
                    A0y.put(next, obj);
                }
            }
            map = ImmutableMap.copyOf(A0y);
        } else {
            map = AnonymousClass4To.A00();
        }
        map.keySet();
        return map;
    }

    public AnonymousClass3FA(UserSession userSession) {
        long A03 = C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36607195971392152L);
        Long valueOf = Long.valueOf(A03);
        C143978hc r7 = GUC.A01;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (A03 < 0 ? false : true) {
            this.A01 = new C679041a(new MUg(r7, timeUnit.toNanos(A03)));
            return;
        }
        throw C18190wL.A0a(Strings.A00("duration cannot be negative: %s %s", valueOf, timeUnit));
    }
}
