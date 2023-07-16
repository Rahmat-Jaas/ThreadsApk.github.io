package X;

import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7dy  reason: invalid class name and case insensitive filesystem */
public final class C125777dy implements C145188k1 {
    public final C1200878l A00;
    public final KtCSuperShape0S0200000_I2 A01;

    public C125777dy(C1200878l r2, KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = ktCSuperShape0S0200000_I2;
    }

    public final String getId() {
        return "RelaxedSharedPrefs";
    }

    public final AnonymousClass5Id ALA(DcpContext dcpContext) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2 = this.A01;
        Iterator A0y = C86144wL.A0y(ktCSuperShape0S0200000_I2.A01);
        while (A0y.hasNext()) {
            String str = (String) A0y.next();
            C1200878l r4 = this.A00;
            C04220Ms.A0B(str, 0);
            long j = r4.A00.getLong(C1200878l.A00(r4, str), Long.MAX_VALUE);
            if (j != Long.MAX_VALUE) {
                A0v.add(new FeatureData(Type.LONG, str, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, j, false));
            }
        }
        Iterator A0y2 = C86144wL.A0y(ktCSuperShape0S0200000_I2.A00);
        while (A0y2.hasNext()) {
            String str2 = (String) A0y2.next();
            C1200878l r2 = this.A00;
            C04220Ms.A0B(str2, 0);
            float f = r2.A00.getFloat(C1200878l.A00(r2, str2), Float.MAX_VALUE);
            if (C86124wJ.A01(Float.MAX_VALUE, f) >= 1.0E-4f) {
                A0v.add(new FeatureData(Type.DOUBLE, str2, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, (double) f, 16372, 0, false));
            }
        }
        return AnonymousClass5Id.A00(A0v);
    }
}
