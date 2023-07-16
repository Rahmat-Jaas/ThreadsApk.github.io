package X;

import com.facebook.dcp.model.DcpData;
import com.facebook.dcp.model.ExampleContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.FeatureMetadata;
import com.facebook.dcp.model.Type;
import com.facebook.dcp.signals.model.SignalResult;
import java.util.List;
import java.util.Map;

/* renamed from: X.7e5  reason: invalid class name and case insensitive filesystem */
public final class C125817e5 implements C143298gU {
    public final C03700Kj A00;

    public final List ALN(ExampleContext exampleContext, FeatureMetadata featureMetadata, Map map) {
        long j;
        Number A0j;
        List list = (List) map.get("1800000");
        if (list == null) {
            list = AnonymousClass0ZV.A00;
        }
        FeatureMetadata featureMetadata2 = featureMetadata;
        DcpData dcpData = featureMetadata2.A03;
        if (dcpData != null) {
            j = dcpData.A03;
        } else {
            j = 0;
        }
        if (C18190wL.A1a(list) && (A0j = C86124wJ.A0j("1800001", ((SignalResult) list.get(C86104wH.A0B(list))).A06)) != null) {
            long longValue = A0j.longValue();
            if (longValue != 0) {
                j = C18240wQ.A09(longValue) / 1000;
            }
        }
        return C18180wK.A0n(new FeatureData(Type.LONG, featureMetadata2.A08, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, j, false));
    }

    public C125817e5(C03700Kj r1) {
        this.A00 = r1;
    }
}
