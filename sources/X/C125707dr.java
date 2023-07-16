package X;

import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.util.List;
import java.util.Map;

/* renamed from: X.7dr  reason: invalid class name and case insensitive filesystem */
public final class C125707dr implements C145188k1 {
    public final String getId() {
        return "NetworkStatus";
    }

    public final AnonymousClass5Id ALA(DcpContext dcpContext) {
        long j;
        long j2;
        AnonymousClass0fT A03 = AnonymousClass0fS.A03(AnonymousClass0fS.A00());
        Type type = Type.LONG;
        Integer num = A03.A01;
        C04220Ms.A06(num);
        int intValue = num.intValue();
        if (intValue == 0) {
            j = 0;
        } else if (intValue == 2) {
            j = 1;
        } else if (intValue == 1) {
            j = 2;
        } else if (intValue == 3) {
            j = 3;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        FeatureData featureData = new FeatureData(type, "3369", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, j, false);
        Integer num2 = A03.A00;
        C04220Ms.A06(num2);
        switch (num2.intValue()) {
            case 1:
                j2 = 1;
                break;
            case 2:
                j2 = 2;
                break;
            case 3:
                j2 = 3;
                break;
            case 4:
                j2 = -1;
                break;
            default:
                j2 = 4;
                break;
        }
        return AnonymousClass5Id.A01(C06750aI.A17(featureData, new FeatureData(type, "3757", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, j2, false)), (String) null, true);
    }
}
