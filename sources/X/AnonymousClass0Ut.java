package X;

import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.profilo.ipc.TraceContext;
import java.util.AbstractCollection;
import java.util.TreeMap;

/* renamed from: X.0Ut  reason: invalid class name */
public final class AnonymousClass0Ut {
    public C05590Ui A00;
    public C05620Um A01;
    public boolean A02;
    public boolean A03;

    public AnonymousClass0Ut(TraceContext traceContext) {
        C05620Um r0;
        String[] strArr;
        int A002;
        AbstractCollection abstractCollection;
        try {
            TraceConfigExtras traceConfigExtras = traceContext.A08;
            int[] A032 = traceConfigExtras.A03("trace_config.duration_condition");
            if (A032 == null || A032.length <= 0) {
                r0 = null;
            } else {
                r0 = new C05620Um(A032);
            }
            this.A01 = r0;
            AnonymousClass0UJ r1 = traceConfigExtras.A01;
            if (r1 != null) {
                strArr = r1.optTraceConfigParamStringList(traceConfigExtras.A00, "trace_config.string_list_condition");
            } else {
                TreeMap treeMap = traceConfigExtras.A05;
                strArr = null;
                if (!(treeMap == null || (abstractCollection = (AbstractCollection) treeMap.get("trace_config.string_list_condition")) == null)) {
                    strArr = (String[]) abstractCollection.toArray(new String[abstractCollection.size()]);
                }
            }
            C05590Ui r3 = null;
            if (strArr != null && strArr.length > 0 && strArr[0].equals("annotation") && (A002 = traceConfigExtras.A00("trace_config.fallback_sampling_rate_for_string_list_condition", 0)) != 1) {
                r3 = new C05590Ui(strArr, A002);
            }
            this.A00 = r3;
        } catch (IllegalArgumentException unused) {
            this.A02 = true;
        }
        if (this.A01 != null || this.A00 != null) {
            this.A03 = true;
        }
    }
}
