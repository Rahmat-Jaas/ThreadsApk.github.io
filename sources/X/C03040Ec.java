package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: X.0Ec  reason: invalid class name and case insensitive filesystem */
public final class C03040Ec extends C12880me {
    public final synchronized JSONObject A01(boolean z, boolean z2) {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        long j = 0;
        for (Map.Entry entry : this.A01.entrySet()) {
            switch (((C12940mk) entry.getKey()).ordinal()) {
                case 0:
                case 1:
                    j += ((AtomicLong) entry.getValue()).longValue();
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 13:
                    if (!z) {
                        jSONObject.putOpt(((AnonymousClass0LJ) entry.getKey()).Aqm(), entry.getValue());
                        break;
                    } else {
                        jSONObject.putOpt(((AnonymousClass0LJ) entry.getKey()).Aqm(), Long.valueOf(((AtomicLong) entry.getValue()).getAndSet(0)));
                        continue;
                    }
            }
            jSONObject.putOpt(((AnonymousClass0LJ) entry.getKey()).Aqm(), entry.getValue());
        }
        jSONObject.putOpt("mt", Long.valueOf(j));
        return jSONObject;
    }

    public C03040Ec() {
        super("lc");
    }
}
