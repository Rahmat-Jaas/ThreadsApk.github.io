package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.0Wp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C05870Wp implements Runnable {
    public final /* synthetic */ C09350fH A00;
    public final /* synthetic */ AnonymousClass01V A01;

    public /* synthetic */ C05870Wp(C09350fH r1, AnonymousClass01V r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        String format;
        AnonymousClass01V r6 = this.A01;
        C09350fH r5 = this.A00;
        AnonymousClass0W4 r4 = r6.A00;
        AnonymousClass01V.A0H(r4, "BackgroundExecution", "MATURE");
        if (r5.A0Q) {
            r5.A0K = (C14900qN) r6.A0U.get();
            if (AnonymousClass01V.A0M(r6)) {
                if (AnonymousClass01V.A0N(r6)) {
                    StringBuilder sb = new StringBuilder("QPLSent - ");
                    sb.append("{\"id\":");
                    sb.append(r5.getMarkerId());
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    sb.append("\"event\":\"");
                    C04560Oe r7 = r6.A0Z;
                    r7.get();
                    sb.append(C07120av.A00(r5.getMarkerId()));
                    sb.append("\",");
                    sb.append("\"action\":\"");
                    r7.get();
                    sb.append(C06030Xj.A00(r5.AOk()));
                    sb.append("\",");
                    sb.append("\"timestamp\":");
                    sb.append(r5.BGw());
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    sb.append("\"duration\":");
                    sb.append(r5.AeK());
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    sb.append("\"duration_nano\":");
                    sb.append(r5.AeL());
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    AnonymousClass01V.A0I("tags", sb, r5.BFU());
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    AnonymousClass01V.A0I("extra", sb, r5.Ago());
                    if (!r5.AvU().A00.isEmpty()) {
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        AnonymousClass0WN AvU = r5.AvU();
                        HashMap hashMap = new HashMap();
                        AvU.A00(new C08900eU(AvU, hashMap));
                        AnonymousClass01V.A0J("metadata", sb, hashMap);
                    }
                    AnonymousClass0WF B22 = r5.B22();
                    if (B22 != null) {
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        sb.append("\"points\":[");
                        B22.A00(new C10940jD(r6, sb));
                        sb.append("]");
                    }
                    sb.append("}");
                    format = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    AnonymousClass0WF r1 = r5.A0G;
                    if (r1 != null) {
                        r1.A00(new C10920jB(r6, sb2));
                        sb2.append(' ');
                    }
                    AnonymousClass0W3 r12 = r5.A0Z;
                    if (!r12.A03().isEmpty()) {
                        String str = null;
                        int i = 0;
                        for (String str2 : r12.A03()) {
                            i++;
                            if (i % 2 == 0) {
                                sb2.append(", ");
                                sb2.append(str);
                                sb2.append("=");
                                sb2.append(str2);
                            } else {
                                str = str2;
                            }
                        }
                    }
                    if (!r5.A0a.isEmpty()) {
                        sb2.append(" ");
                        sb2.append(r5.BFV());
                    }
                    r5.AvU();
                    sb2.append(" metadata=");
                    AnonymousClass0WN AvU2 = r5.AvU();
                    HashMap hashMap2 = new HashMap();
                    AvU2.A00(new C08900eU(AvU2, hashMap2));
                    sb2.append(hashMap2);
                    Locale locale = Locale.US;
                    C04560Oe r13 = r6.A0Z;
                    r13.get();
                    String A002 = C07120av.A00(r5.A03);
                    r13.get();
                    String A003 = C06030Xj.A00(r5.A0O);
                    Integer valueOf = Integer.valueOf(r5.AeK());
                    boolean z = r5.A0S;
                    boolean z2 = r5.A0R;
                    int i2 = (int) ((r5.A0C >> 32) & 255);
                    format = String.format(locale, "%s %s %s %d[ms]%s %s (1:%d) %s", new Object[]{"QPLSent - ", A002, A003, valueOf, "", C13300nO.A00(i2, z, z2), Integer.valueOf(i2), sb2.toString()});
                }
                AnonymousClass01V.A0F(r6, format, 4);
            }
            r4.execute(r5);
            r6.A01 = r5;
        }
    }
}
