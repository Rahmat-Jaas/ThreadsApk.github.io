package X;

import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.7e2  reason: invalid class name */
public final class AnonymousClass7e2 implements C145188k1 {
    public final C696649n A00;
    public final UserSession A01;

    private final FeatureData A00(String str, String str2) {
        StringBuilder A0s;
        String str3 = str;
        AnonymousClass5Id CZ7 = ((C147058nK) this.A00.A01.getValue()).CZ7(str3, -1);
        boolean z = CZ7.A02;
        String str4 = str2;
        if (z) {
            Object obj = CZ7.A00;
            if (C18190wL.A1a((Collection) obj)) {
                return AnonymousClass7ES.A00.A01(str4, (List) obj);
            }
        }
        if (!z) {
            A0s = C18190wL.A0s("Fail to read all records on ");
            A0s.append(str3);
            A0s.append(" from signal store, error: ");
            A0s.append(CZ7.A01);
        } else {
            A0s = C18190wL.A0s("Empty list for calculating average value of ");
            A0s.append(str3);
        }
        AnonymousClass7ES.A00((Exception) null, A0s.toString());
        return new FeatureData(Type.DOUBLE, str4, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, -1.0d, 16372, 0, false);
    }

    private final FeatureData A01(String str, String str2) {
        StringBuilder sb;
        String str3 = str;
        AnonymousClass5Id CZ7 = ((C147058nK) this.A00.A01.getValue()).CZ7(str3, 1);
        String str4 = str2;
        if (CZ7.A02) {
            Object obj = CZ7.A00;
            List list = (List) obj;
            if (list.size() == 1) {
                return new FeatureData(Type.LONG, str4, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, C18190wL.A08(list.get(0)), false);
            }
            sb = C18190wL.A0s("Not exact one result returned for most recent record of ");
            sb.append(str3);
            sb.append(", returned records size: ");
            sb.append(C86144wL.A08(obj));
        } else {
            sb = C18190wL.A0s("Fail to read most recent record on ");
            sb.append(str3);
            sb.append(" from signal store, error: ");
            sb.append(CZ7.A01);
        }
        AnonymousClass7ES.A00((Exception) null, sb.toString());
        return new FeatureData(Type.LONG, str4, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, -1, false);
    }

    public final String getId() {
        return "StoryPrefetch";
    }

    public AnonymousClass7e2(C696649n r1, UserSession userSession) {
        AnonymousClass0wJ.A1O(r1, userSession);
        this.A00 = r1;
        this.A01 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5Id ALA(com.facebook.dcp.model.DcpContext r28) {
        /*
            r27 = this;
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            r4 = r27
            X.49n r0 = r4.A00
            java.lang.String r1 = "recent_time_on_story"
            r3 = -1
            X.0Oa r6 = r0.A01
            java.lang.Object r0 = r6.getValue()
            X.8nK r0 = (X.C147058nK) r0
            X.5Id r7 = r0.CZ7(r1, r3)
            boolean r1 = r7.A02
            if (r1 == 0) goto L_0x00fd
            java.lang.Object r9 = r7.A00
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x00fd
            java.util.List r9 = (java.util.List) r9
            X.7ES r7 = X.AnonymousClass7ES.A00
            java.lang.String r0 = "3341"
            com.facebook.dcp.model.FeatureData r0 = r7.A01(r0, r9)
            r2.add(r0)
            r1 = 5
            java.lang.String r0 = "3342"
            com.facebook.dcp.model.FeatureData r0 = r7.A02(r0, r9, r1)
            r2.add(r0)
            r1 = 20
            java.lang.String r0 = "3343"
            com.facebook.dcp.model.FeatureData r0 = r7.A02(r0, r9, r1)
            r2.add(r0)
            r1 = 50
            java.lang.String r0 = "3344"
            com.facebook.dcp.model.FeatureData r0 = r7.A02(r0, r9, r1)
            r2.add(r0)
            r1 = 95
            java.lang.String r0 = "3345"
            com.facebook.dcp.model.FeatureData r0 = r7.A02(r0, r9, r1)
            r2.add(r0)
        L_0x0066:
            r5.addAll(r2)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.lang.String r1 = "item_consumed_in_story_session"
            java.lang.String r0 = "3347"
            com.facebook.dcp.model.FeatureData r0 = r4.A00(r1, r0)
            r2.add(r0)
            java.lang.String r0 = "3346"
            com.facebook.dcp.model.FeatureData r0 = r4.A01(r1, r0)
            r2.add(r0)
            r5.addAll(r2)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.lang.String r1 = "ad_consumed_in_story_session"
            java.lang.String r0 = "3349"
            com.facebook.dcp.model.FeatureData r0 = r4.A00(r1, r0)
            r2.add(r0)
            java.lang.String r0 = "3348"
            com.facebook.dcp.model.FeatureData r0 = r4.A01(r1, r0)
            r2.add(r0)
            r5.addAll(r2)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.lang.String r1 = "last_story_session_end_timestamp"
            java.lang.Object r0 = r6.getValue()
            X.8nK r0 = (X.C147058nK) r0
            X.5Id r3 = r0.CZ7(r1, r3)
            boolean r2 = r3.A02
            if (r2 == 0) goto L_0x0110
            java.lang.Object r1 = r3.A00
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x0110
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            long r6 = java.lang.System.currentTimeMillis()
            java.util.Iterator r13 = X.C86154wM.A0q(r1)
        L_0x00ca:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r0 = r13.next()
            long r2 = X.C18190wL.A08(r0)
            long r0 = r6 - r2
            X.C86144wL.A1U(r9, r0)
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x00ca
            java.lang.String r0 = "Wrong time since last story session value, currentTimestampMs is : "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r1.append(r6)
            java.lang.String r0 = ", sessionEndRecordMs: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C18190wL.A0o(r1)
            r0 = 0
            X.AnonymousClass7ES.A00(r0, r1)
            goto L_0x00ca
        L_0x00fd:
            if (r1 != 0) goto L_0x010d
            java.lang.String r1 = "Fail to read all records on recent_time_on_story from signal store, error: "
            java.lang.String r0 = r7.A01
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
        L_0x0107:
            r0 = 0
            X.AnonymousClass7ES.A00(r0, r1)
            goto L_0x0066
        L_0x010d:
            java.lang.String r1 = "Empty list for calculating feature data for recent_time_on_story"
            goto L_0x0107
        L_0x0110:
            if (r2 != 0) goto L_0x011f
            java.lang.String r1 = "Fail to read all records on last_story_session_end_timestamp from signal store, error: "
            java.lang.String r0 = r3.A01
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
        L_0x011a:
            r0 = 0
            X.AnonymousClass7ES.A00(r0, r1)
            goto L_0x015f
        L_0x011f:
            java.lang.String r1 = "Empty list for calculating average value of last_story_session_end_timestamp"
            goto L_0x011a
        L_0x0122:
            X.7ES r1 = X.AnonymousClass7ES.A00
            java.lang.String r0 = "3354"
            com.facebook.dcp.model.FeatureData r0 = r1.A01(r0, r9)
            r4.add(r0)
            com.facebook.dcp.model.Type r10 = com.facebook.dcp.model.Type.LONG
            boolean r0 = X.C18250wR.A1K(r9)
            if (r0 == 0) goto L_0x01a3
            int r0 = X.C86164wN.A05(r9)
            java.lang.Object r0 = r9.get(r0)
            long r24 = X.C18190wL.A08(r0)
        L_0x0141:
            r21 = 0
            r12 = 0
            r26 = 0
            r23 = 16376(0x3ff8, float:2.2948E-41)
            java.lang.String r11 = "3353"
            com.facebook.dcp.model.FeatureData r9 = new com.facebook.dcp.model.FeatureData
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r26)
            r4.add(r9)
        L_0x015f:
            r5.addAll(r4)
            r8.addAll(r5)
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r9 = r8.iterator()
        L_0x016d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r7 = r9.next()
            r8 = r7
            com.facebook.dcp.model.FeatureData r8 = (com.facebook.dcp.model.FeatureData) r8
            java.lang.String r1 = r8.A03
            java.lang.String r0 = ""
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x016d
            com.facebook.dcp.model.Type r5 = r8.A02
            com.facebook.dcp.model.Type r0 = com.facebook.dcp.model.Type.DOUBLE
            if (r5 != r0) goto L_0x0193
            double r3 = r8.A00
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0193
            goto L_0x016d
        L_0x0193:
            com.facebook.dcp.model.Type r0 = com.facebook.dcp.model.Type.LONG
            if (r5 != r0) goto L_0x019f
            long r3 = r8.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x016d
        L_0x019f:
            r6.add(r7)
            goto L_0x016d
        L_0x01a3:
            r24 = -1
            goto L_0x0141
        L_0x01a6:
            X.5Id r0 = X.AnonymousClass5Id.A00(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7e2.ALA(com.facebook.dcp.model.DcpContext):X.5Id");
    }
}
