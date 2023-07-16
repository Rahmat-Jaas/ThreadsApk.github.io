package X;

import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.util.List;
import java.util.Map;

/* renamed from: X.7ES  reason: invalid class name */
public final class AnonymousClass7ES {
    public static final AnonymousClass7ES A00 = new AnonymousClass7ES();

    public static final void A00(Exception exc, String str) {
        C04220Ms.A0B(str, 1);
        C14100oo ABJ = C10770iu.A00().ABJ(str, 817899803);
        if (exc != null) {
            ABJ.Ciu(exc);
        }
        ABJ.report();
    }

    public final FeatureData A01(String str, List list) {
        boolean A1V = C18210wN.A1V(list);
        String str2 = str;
        if (list.isEmpty()) {
            A00((Exception) null, AnonymousClass00U.A0L("Empty list for calculating average value of signals, featureId: ", str2));
            return new FeatureData((Type) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16383, 0, A1V);
        }
        Type type = Type.DOUBLE;
        long j = 0;
        for (Object A08 : list) {
            j += C18190wL.A08(A08);
        }
        return new FeatureData(type, str2, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, ((double) j) / ((double) list.size()), 16372, 0, A1V);
    }

    public final FeatureData A02(String str, List list, int i) {
        StringBuilder A0s;
        boolean A1X = C18240wQ.A1X(list);
        String str2 = str;
        int i2 = i;
        if (!list.isEmpty()) {
            List A0M = AnonymousClass00J.A0M(list);
            return new FeatureData(Type.LONG, str2, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, C18190wL.A08(A0M.get(((int) Math.ceil((((double) i2) / 100.0d) * ((double) A0M.size()))) - 1)), A1X);
        }
        if (list.isEmpty()) {
            A0s = C18190wL.A0s("Empty list for getting value at percentile of signals, featureId: ");
        } else {
            A0s = C18190wL.A0s("Invalid percentile ");
            A0s.append(i2);
            A0s.append(", featureId: ");
        }
        A00((Exception) null, C18180wK.A0i(str2, A0s));
        return new FeatureData((Type) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16383, 0, A1X);
    }
}
