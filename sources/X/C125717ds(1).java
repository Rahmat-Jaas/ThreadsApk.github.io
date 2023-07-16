package X;

import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.util.List;
import java.util.Map;

/* renamed from: X.7ds  reason: invalid class name and case insensitive filesystem */
public final class C125717ds implements C145188k1 {
    public final AnonymousClass5Id ALA(DcpContext dcpContext) {
        long j;
        Type type = Type.LONG;
        String str = C25756DrT.A02;
        if (C04220Ms.A0I(str, "COLD")) {
            j = 0;
        } else if (C04220Ms.A0I(str, "LUKE_WARM")) {
            j = 1;
        } else if (C04220Ms.A0I(str, "HOT")) {
            j = 2;
        } else {
            j = -1;
        }
        return AnonymousClass5Id.A01(C18180wK.A0n(new FeatureData(type, "3699", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, j, false)), (String) null, true);
    }

    public final String getId() {
        return "AppStartType";
    }
}
