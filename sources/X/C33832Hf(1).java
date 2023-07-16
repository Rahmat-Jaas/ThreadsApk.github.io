package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape48S0200000_I2;

/* renamed from: X.2Hf  reason: invalid class name and case insensitive filesystem */
public final class C33832Hf {
    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        Context A08 = C18230wP.A08();
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r7));
        C04220Ms.A0B(A02, A1Z ? 1 : 0);
        KtLambdaShape48S0200000_I2 ktLambdaShape48S0200000_I2 = new KtLambdaShape48S0200000_I2(40, A08, A02);
        List list = r8.A00;
        Object obj = list.get(0);
        Long l = null;
        try {
            if (obj instanceof Number) {
                l = Long.valueOf(C18190wL.A08(obj));
            } else {
                Number number = (Number) obj;
                if (number != null) {
                    l = Long.valueOf(number.longValue());
                }
            }
        } catch (ClassCastException e) {
            C30967GcS.A01((AnonymousClass3HX) null, "CXF_CPDP", "Error when trying to get the TTL in argument index 0 for action bk.action.cxf.experimental.cpdp.Prefetch", e, 0);
        }
        Object obj2 = list.get(A1Z);
        boolean z = false;
        try {
            if (obj2 instanceof Boolean) {
                z = AnonymousClass0wJ.A1X(obj2);
            } else {
                Boolean bool = (Boolean) obj2;
                if (bool != null) {
                    z = bool.booleanValue();
                }
            }
        } catch (ClassCastException e2) {
            C30967GcS.A01((AnonymousClass3HX) null, "CXF_CPDP", "Error when trying to get the exit_view in argument index 1 for action bk.action.cxf.experimental.cpdp.Prefetch", e2, 0);
        }
        ktLambdaShape48S0200000_I2.invoke(l, Boolean.valueOf(z));
        return null;
    }
}
