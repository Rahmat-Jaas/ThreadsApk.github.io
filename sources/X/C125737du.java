package X;

import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.util.List;
import java.util.Map;

/* renamed from: X.7du  reason: invalid class name and case insensitive filesystem */
public final class C125737du implements C145188k1 {
    public final GWa A00;

    public final AnonymousClass5Id ALA(DcpContext dcpContext) {
        Type type = Type.DOUBLE;
        GWa gWa = this.A00;
        GWa.A00(gWa);
        FeatureData featureData = new FeatureData(type, "2619", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, ((double) gWa.A00) / 100.0d, 16372, 0, false);
        Type type2 = Type.LONG;
        GWa.A00(gWa);
        String str = gWa.A03;
        C04220Ms.A06(str);
        long j = -1;
        switch (str.hashCode()) {
            case -1054830049:
                if (str.equals(C28174Ezk.A00(154))) {
                    j = 0;
                    break;
                }
                break;
            case 2201263:
                if (str.equals("Full")) {
                    j = 2;
                    break;
                }
                break;
            case 1500759697:
                if (str.equals("Charging")) {
                    j = 1;
                    break;
                }
                break;
        }
        return AnonymousClass5Id.A01(C06750aI.A17(featureData, new FeatureData(type2, "2618", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, j, false)), (String) null, true);
    }

    public final String getId() {
        return "BatteryStatusAndLevel";
    }

    public C125737du(GWa gWa) {
        this.A00 = gWa;
    }
}
