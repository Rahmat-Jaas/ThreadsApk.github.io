package X;

import com.facebook.dcp.model.ExampleContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.FeatureMetadata;
import com.facebook.dcp.model.Type;
import com.facebook.dcp.signals.model.SignalResult;
import java.util.List;
import java.util.Map;

/* renamed from: X.7e3  reason: invalid class name */
public final class AnonymousClass7e3 implements C143298gU {
    public final List ALN(ExampleContext exampleContext, FeatureMetadata featureMetadata, Map map) {
        Number A0j;
        List list = (List) map.get("2474000");
        if (list == null) {
            list = AnonymousClass0ZV.A00;
        }
        long j = -1;
        if (C18190wL.A1a(list) && (A0j = C86124wJ.A0j("2474001", ((SignalResult) list.get(C86104wH.A0B(list))).A06)) != null) {
            j = A0j.longValue();
        }
        return C18180wK.A0n(new FeatureData(Type.LONG, featureMetadata.A08, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, j, false));
    }
}
