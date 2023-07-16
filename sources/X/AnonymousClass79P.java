package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.redex.IDxFunctionShape17S1200000_2_I2;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.79P  reason: invalid class name */
public final class AnonymousClass79P {
    public final Object A00;
    public final Object A01;

    public static C85754vi A00(AnonymousClass79P r7, IDxFunctionShape17S1200000_2_I2 iDxFunctionShape17S1200000_2_I2, C108226i1 r9) {
        String str = iDxFunctionShape17S1200000_2_I2.A02;
        Object obj = r7.A00;
        obj.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((C120977Dl) iDxFunctionShape17S1200000_2_I2.A01).A07);
        String userId = r9.A01.getUserId();
        C126477fJ A002 = C99046Hx.A00();
        GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000 = new GQLCallInputCInputShape1S0000000();
        gQLCallInputCInputShape1S0000000.A0D(C03480Iw.A00().toString(), "client_mutation_id");
        gQLCallInputCInputShape1S0000000.A0D(userId, "actor_id");
        gQLCallInputCInputShape1S0000000.A0D((String) obj, "platform_trust_token");
        gQLCallInputCInputShape1S0000000.A0D(str, "payment_type");
        gQLCallInputCInputShape1S0000000.A0D(C122037Js.A03(unmodifiableMap), "logging_id");
        A002.A00.A02(gQLCallInputCInputShape1S0000000, "input");
        A002.A02 = true;
        return A002.AB4();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass79P)) {
            return false;
        }
        AnonymousClass79P r4 = (AnonymousClass79P) obj;
        if (!C002401c.A00(r4.A00, this.A00) || !C002401c.A00(r4.A01, this.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A03(this.A00) ^ C18200wM.A07(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Pair{");
        A0s.append(this.A00);
        A0s.append(" ");
        A0s.append(this.A01);
        return C18180wK.A0i("}", A0s);
    }

    public AnonymousClass79P(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
