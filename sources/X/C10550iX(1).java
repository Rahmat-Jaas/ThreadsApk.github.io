package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0iX  reason: invalid class name and case insensitive filesystem */
public final class C10550iX implements C41711MaA {
    public Context A00;
    public final List A01 = Arrays.asList(new String[]{"year_class", "network_downlink_bandwidth", TraceFieldType.NetworkType});

    public C10550iX(Context context) {
        this.A00 = context;
    }

    public final M59 AZm(String str) {
        switch (str.hashCode()) {
            case -2007977226:
                if (str.equals("year_class")) {
                    return new C10570iZ(this.A00).A00();
                }
                break;
            case -969618049:
                if (str.equals("network_downlink_bandwidth")) {
                    return C10580ia.A00();
                }
                break;
            case -19457365:
                if (str.equals(TraceFieldType.NetworkType)) {
                    return C10580ia.A01(this.A00);
                }
                break;
        }
        return new M59("unknown_context");
    }
}
