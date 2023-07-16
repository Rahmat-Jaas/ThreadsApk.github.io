package X;

import android.util.Pair;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: X.0kJ  reason: invalid class name and case insensitive filesystem */
public final class C11500kJ {
    public static final DateFormat A00 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);

    public static AnalyticsEventDebugInfo A00(AnonymousClass0KD r4) {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(2);
        for (int i = 0; i < r4.A00; i++) {
            A05(analyticsEventDebugInfo, r4.A0B(i), r4.A0C(i));
        }
        return analyticsEventDebugInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C15680ri A01(java.util.Map r5) {
        /*
            X.0ri r3 = new X.0ri
            r3.<init>()
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x000d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            if (r2 == 0) goto L_0x000d
            java.lang.Object r4 = r0.getKey()
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto L_0x0060
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0055
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 != 0) goto L_0x0063
            boolean r0 = r4 instanceof X.C021109v
            if (r0 == 0) goto L_0x0111
            X.09v r4 = (X.C021109v) r4
            java.lang.Object r4 = r4.getValue()
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto L_0x0060
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0055
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 != 0) goto L_0x0063
            java.lang.String r1 = "Enum type expects String, Integer or Long, but got: "
            java.lang.String r0 = r4.toString()
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0055:
            java.lang.Number r4 = (java.lang.Number) r4
            int r0 = r4.intValue()
            java.lang.String r4 = java.lang.Integer.toString(r0)
            goto L_0x006d
        L_0x0060:
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x006d
        L_0x0063:
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            java.lang.String r4 = java.lang.Long.toString(r0)
        L_0x006d:
            boolean r0 = r2 instanceof java.util.List
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L_0x007f
            java.util.Map r2 = (java.util.Map) r2
            X.0ri r2 = A01(r2)
        L_0x007b:
            r3.A07(r2, r4)
            goto L_0x000d
        L_0x007f:
            boolean r0 = r2 instanceof java.util.Set
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L_0x010a
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0103
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto L_0x00fc
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L_0x009a
            X.0kS r0 = r3.A00
            r0.A02(r4, r2)
            goto L_0x000d
        L_0x009a:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L_0x00a5
            java.lang.Double r2 = (java.lang.Double) r2
            r3.A0B(r4, r2)
            goto L_0x000d
        L_0x00a5:
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x00b0
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r3.A0A(r4, r2)
            goto L_0x000d
        L_0x00b0:
            boolean r0 = r2 instanceof X.C15680ri
            if (r0 == 0) goto L_0x00be
            X.0ri r2 = (X.C15680ri) r2
            goto L_0x007b
        L_0x00b7:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            X.0rW r2 = A02(r2)
            goto L_0x00c4
        L_0x00be:
            boolean r0 = r2 instanceof X.C15560rW
            if (r0 == 0) goto L_0x00c9
            X.0rW r2 = (X.C15560rW) r2
        L_0x00c4:
            r3.A08(r2, r4)
            goto L_0x000d
        L_0x00c9:
            boolean r0 = r2 instanceof X.AnonymousClass0V3
            if (r0 == 0) goto L_0x00d6
            X.0V3 r2 = (X.AnonymousClass0V3) r2
            java.util.Map r0 = r2.A00
            X.0ri r2 = A01(r0)
            goto L_0x007b
        L_0x00d6:
            boolean r0 = r2 instanceof X.C021109v
            if (r0 == 0) goto L_0x0119
            X.09v r2 = (X.C021109v) r2
            java.lang.Object r2 = r2.getValue()
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L_0x010a
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0103
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto L_0x00fc
            java.lang.String r1 = "Enum type expects String, Integer or Long, but got: "
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00fc:
            java.lang.Long r2 = (java.lang.Long) r2
            r3.A0C(r4, r2)
            goto L_0x000d
        L_0x0103:
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3.A09(r2, r4)
            goto L_0x000d
        L_0x010a:
            java.lang.String r2 = (java.lang.String) r2
            r3.A0D(r4, r2)
            goto L_0x000d
        L_0x0111:
            java.lang.String r0 = "illegal key type in Map"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x0119:
            java.lang.String r0 = "Unknown value type: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.Class r0 = r2.getClass()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0131:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11500kJ.A01(java.util.Map):X.0ri");
    }

    public static C15560rW A02(Iterable iterable) {
        C15560rW r2 = new C15560rW();
        for (Object A06 : iterable) {
            A06(r2, A06);
        }
        return r2;
    }

    public static HashMap A03(C15680ri r4) {
        Object obj;
        HashMap hashMap = new HashMap();
        C11540kN r2 = new C11540kN(r4);
        while (r2.hasNext()) {
            Pair pair = (Pair) r2.next();
            Object obj2 = pair.second;
            if (obj2 instanceof String) {
                obj = pair.first;
            } else if (obj2 instanceof Integer) {
                obj = pair.first;
                obj2 = Integer.toString(((Number) obj2).intValue());
            } else if (obj2 instanceof Double) {
                obj = pair.first;
                obj2 = Double.toString(((Number) obj2).doubleValue());
            } else if (obj2 instanceof Float) {
                obj = pair.first;
                obj2 = Float.toString(((Number) obj2).floatValue());
            } else if (obj2 instanceof Long) {
                obj = pair.first;
                obj2 = Long.toString(((Number) obj2).longValue());
            } else if (obj2 instanceof Boolean) {
                obj = pair.first;
                obj2 = Boolean.toString(((Boolean) obj2).booleanValue());
            } else if ((obj2 instanceof C15680ri) || (obj2 instanceof C15560rW)) {
                obj = pair.first;
                obj2 = obj2.toString();
            }
            hashMap.put(obj, obj2);
        }
        return hashMap;
    }

    public static void A04(AnonymousClass0KD r2, String str, StringBuilder sb) {
        sb.append("{\n");
        for (int i = 0; i < r2.A00; i++) {
            sb.append(str);
            sb.append(r2.A0C(i));
            sb.append(" = ");
            A07(sb, str, r2.A0B(i));
            sb.append(10);
        }
        sb.append("}");
    }

    public static void A05(AnalyticsEventDebugInfo analyticsEventDebugInfo, Object obj, String str) {
        AnalyticsEventEntry analyticsEventEntry;
        AnalyticsEventDebugInfo analyticsEventDebugInfo2;
        if (obj instanceof C11720kh) {
            analyticsEventDebugInfo2 = ((C11720kh) obj).CxC();
        } else if (obj instanceof AnonymousClass0KD) {
            analyticsEventDebugInfo2 = A00((AnonymousClass0KD) obj);
        } else if (obj instanceof C03590Jr) {
            C03590Jr r6 = (C03590Jr) obj;
            analyticsEventDebugInfo2 = new AnalyticsEventDebugInfo(2);
            int i = 0;
            while (true) {
                ArrayList arrayList = r6.A00;
                if (i >= arrayList.size()) {
                    break;
                }
                A05(analyticsEventDebugInfo2, arrayList.get(i), (String) null);
                i++;
            }
        } else {
            analyticsEventEntry = new AnalyticsEventEntry(str, obj);
            analyticsEventDebugInfo.A01.add(analyticsEventEntry);
        }
        analyticsEventEntry = new AnalyticsEventEntry(analyticsEventDebugInfo2, str);
        analyticsEventDebugInfo.A01.add(analyticsEventEntry);
    }

    public static void A06(C15560rW r2, Object obj) {
        String str;
        if (obj == null) {
            str = null;
        } else if (obj instanceof AnonymousClass0A0) {
            A06(r2, ((AnonymousClass0A0) obj).D7I());
            return;
        } else {
            if (!(obj instanceof List)) {
                if (obj instanceof Map) {
                    obj = A01((Map) obj);
                } else if (!(obj instanceof Set)) {
                    if (!(obj instanceof String)) {
                        if (!(obj instanceof Integer)) {
                            if (!(obj instanceof Long)) {
                                if (!(obj instanceof Float)) {
                                    if (obj instanceof Double) {
                                        r2.A00(((Number) obj).doubleValue());
                                        return;
                                    } else if (obj instanceof Boolean) {
                                        r2.A05(((Boolean) obj).booleanValue());
                                        return;
                                    } else if (!(obj instanceof C15680ri) && !(obj instanceof C15560rW)) {
                                        if (obj instanceof AnonymousClass0V3) {
                                            obj = A01(((AnonymousClass0V3) obj).A00);
                                        } else if (obj instanceof C021109v) {
                                            obj = ((C021109v) obj).getValue();
                                            if (!(obj instanceof String)) {
                                                if (!(obj instanceof Integer)) {
                                                    if (!(obj instanceof Long)) {
                                                        throw new IllegalArgumentException(AnonymousClass00U.A0L("Enum type expects String, Integer or Long, but got: ", obj.toString()));
                                                    }
                                                }
                                            }
                                        } else {
                                            StringBuilder sb = new StringBuilder("Unknown value type: ");
                                            sb.append(obj.getClass());
                                            throw new IllegalArgumentException(sb.toString());
                                        }
                                    }
                                }
                            }
                            r2.A02(((Number) obj).longValue());
                            return;
                        }
                        r2.A01(((Number) obj).intValue());
                        return;
                    }
                    str = (String) obj;
                }
                r2.A00.add(obj);
                return;
            }
            obj = A02((Iterable) obj);
            r2.A00.add(obj);
            return;
        }
        r2.A04(str);
    }

    public static void A07(StringBuilder sb, String str, Object obj) {
        String str2;
        String str3;
        if (obj == null) {
            str3 = "null";
        } else if (obj instanceof Long) {
            long longValue = ((Number) obj).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (longValue <= currentTimeMillis - 315360000000L || longValue >= currentTimeMillis + 315360000000L) {
                str3 = Long.toString(longValue);
            } else {
                DateFormat dateFormat = A00;
                dateFormat.setTimeZone(TimeZone.getDefault());
                str3 = AnonymousClass00U.A0d(Long.toString(longValue), " (", dateFormat.format(new Date(longValue)), ")");
            }
        } else if (obj instanceof C15680ri) {
            sb.append("{\n");
            ((C15680ri) obj).A0I(sb, AnonymousClass00U.A0L(str, "  "));
            str3 = "}";
        } else {
            if (obj instanceof C15560rW) {
                C15560rW r12 = (C15560rW) obj;
                str2 = AnonymousClass00U.A0L(str, "  ");
                sb.append("[\n");
                int i = 0;
                while (true) {
                    ArrayList arrayList = r12.A00;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    sb.append(AnonymousClass00U.A0L(str2, "  "));
                    A07(sb, AnonymousClass00U.A0L(str2, "  "), arrayList.get(i));
                    sb.append(10);
                    i++;
                }
            } else if (obj instanceof AnonymousClass0KD) {
                A04((AnonymousClass0KD) obj, AnonymousClass00U.A0L(str, "  "), sb);
                return;
            } else if (obj instanceof C03590Jr) {
                str2 = AnonymousClass00U.A0L(str, "  ");
                C03590Jr r122 = (C03590Jr) obj;
                sb.append("[\n");
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = r122.A00;
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    sb.append(AnonymousClass00U.A0L(str2, "  "));
                    A07(sb, AnonymousClass00U.A0L(str2, "  "), arrayList2.get(i2));
                    sb.append(10);
                    i2++;
                }
            } else {
                str3 = obj.toString();
            }
            sb.append(str2);
            str3 = "]";
        }
        sb.append(str3);
    }
}
