package com.instagram.common.analytics.intf;

import X.AnonymousClass00U;
import X.C11560kP;
import X.C15560rW;
import X.C15680ri;
import X.C15730rn;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class AnalyticsEventDebugInfo implements Parcelable {
    public String A00;
    public List A01 = new ArrayList();
    public final int A02;

    public static C15730rn A00(AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        int i = 0;
        while (true) {
            AnalyticsEventDebugInfo analyticsEventDebugInfo2 = analyticsEventDebugInfo;
            List list = analyticsEventDebugInfo2.A01;
            AnalyticsEventDebugInfo analyticsEventDebugInfo3 = null;
            if (i >= list.size()) {
                return null;
            }
            AnalyticsEventEntry analyticsEventEntry = (AnalyticsEventEntry) list.get(i);
            if (IgFragmentActivity.MODULE_KEY.equals(analyticsEventEntry.A02)) {
                C15730rn A012 = C15730rn.A01(analyticsEventDebugInfo2.A00, String.valueOf(analyticsEventEntry.A01));
                for (int i2 = 0; i2 < list.size(); i2++) {
                    AnalyticsEventEntry analyticsEventEntry2 = (AnalyticsEventEntry) list.get(i2);
                    String str = analyticsEventEntry2.A02;
                    Object obj = analyticsEventEntry2.A01;
                    if ("extra".equals(str)) {
                        analyticsEventDebugInfo3 = analyticsEventEntry2.A00;
                    } else if ("sample_rate".equals(str)) {
                        A012.A01 = (Integer) obj;
                    } else if ("time".equals(str)) {
                        String valueOf = String.valueOf(obj);
                        A012.A00 = Math.round(Double.parseDouble(valueOf.substring(0, valueOf.indexOf(32))));
                    } else if ("tags".equals(str)) {
                        long longValue = ((Number) obj).longValue();
                        EnumSet<E> noneOf = EnumSet.noneOf(C11560kP.class);
                        for (C11560kP r5 : C11560kP.values()) {
                            long j = r5.A00;
                            if ((j & longValue) == j) {
                                noneOf.add(r5);
                            }
                        }
                        Iterator<E> it = noneOf.iterator();
                        while (it.hasNext()) {
                            A012.A06.add(it.next());
                        }
                    }
                }
                A02(analyticsEventDebugInfo3, A012.A05);
                return A012;
            }
            i++;
        }
    }

    public static void A03(AnalyticsEventDebugInfo analyticsEventDebugInfo, String str, StringBuilder sb, boolean z) {
        String str2;
        int i = 0;
        while (true) {
            List list = analyticsEventDebugInfo.A01;
            if (i < list.size()) {
                AnalyticsEventEntry analyticsEventEntry = (AnalyticsEventEntry) list.get(i);
                sb.append(str);
                if (z) {
                    sb.append(analyticsEventEntry.A02);
                    sb.append(" = ");
                }
                if (analyticsEventEntry.A00 != null) {
                    if (analyticsEventEntry.A00.A02 == 2) {
                        sb.append("{\n");
                        A03(analyticsEventEntry.A00, AnonymousClass00U.A0L(str, "  "), sb, true);
                        sb.append(str);
                        str2 = "}";
                    } else if (analyticsEventEntry.A00.A02 == 3) {
                        sb.append("[\n");
                        A03(analyticsEventEntry.A00, AnonymousClass00U.A0L(str, "  "), sb, false);
                        sb.append(str);
                        str2 = "]";
                    }
                    sb.append(str2);
                } else {
                    sb.append(analyticsEventEntry.A01);
                }
                sb.append("\n");
                i++;
            } else {
                return;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public static C15560rW A01(AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        C15680ri r1;
        C15560rW r3 = new C15560rW();
        int i = 0;
        while (true) {
            List list = analyticsEventDebugInfo.A01;
            if (i >= list.size()) {
                return r3;
            }
            AnalyticsEventEntry analyticsEventEntry = (AnalyticsEventEntry) list.get(i);
            Object obj = analyticsEventEntry.A01;
            AnalyticsEventDebugInfo analyticsEventDebugInfo2 = analyticsEventEntry.A00;
            if (analyticsEventDebugInfo2 != null) {
                int i2 = analyticsEventDebugInfo2.A02;
                if (i2 == 2) {
                    C15680ri r12 = new C15680ri();
                    A02(analyticsEventEntry.A00, r12);
                    r1 = r12;
                } else if (i2 == 3) {
                    r1 = A01(analyticsEventDebugInfo2);
                } else {
                    i++;
                }
            } else {
                if (obj instanceof Long) {
                    r3.A02(((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    r3.A01(((Number) obj).intValue());
                } else if (obj instanceof Boolean) {
                    r3.A05(((Boolean) obj).booleanValue());
                } else {
                    boolean z = obj instanceof C15680ri;
                    r1 = obj;
                    if (!z) {
                        boolean z2 = obj instanceof C15560rW;
                        r1 = obj;
                        if (!z2) {
                            if (obj instanceof Double) {
                                r3.A00(((Number) obj).doubleValue());
                            } else {
                                r3.A04(String.valueOf(obj));
                            }
                        }
                    }
                }
                i++;
            }
            r3.A00.add(r1);
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0031 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r6, X.C15680ri r7) {
        /*
            if (r6 == 0) goto L_0x00a1
            r2 = 0
        L_0x0003:
            java.util.List r1 = r6.A01
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x00a1
            java.lang.Object r5 = r1.get(r2)
            com.instagram.common.analytics.intf.AnalyticsEventEntry r5 = (com.instagram.common.analytics.intf.AnalyticsEventEntry) r5
            java.lang.String r1 = r5.A02
            java.lang.Object r3 = r5.A01
            com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r4 = r5.A00
            if (r4 == 0) goto L_0x003c
            if (r1 != 0) goto L_0x001f
            java.lang.String r1 = java.lang.String.valueOf(r2)
        L_0x001f:
            int r3 = r4.A02
            r0 = 2
            if (r3 != r0) goto L_0x0034
            X.0ri r3 = new X.0ri
            r3.<init>()
            com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r0 = r5.A00
            A02(r0, r3)
        L_0x002e:
            r7.A07(r3, r1)
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0034:
            r0 = 3
            if (r3 != r0) goto L_0x0031
            X.0rW r3 = A01(r4)
            goto L_0x006f
        L_0x003c:
            if (r1 == 0) goto L_0x0031
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L_0x004a
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L_0x0031
            r7.A0C(r1, r3)
            goto L_0x0031
        L_0x004a:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0056
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0031
            r7.A09(r3, r1)
            goto L_0x0031
        L_0x0056:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0062
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x0031
            r7.A0A(r1, r3)
            goto L_0x0031
        L_0x0062:
            boolean r0 = r3 instanceof X.C15680ri
            if (r0 == 0) goto L_0x0069
            X.0ri r3 = (X.C15680ri) r3
            goto L_0x002e
        L_0x0069:
            boolean r0 = r3 instanceof X.C15560rW
            if (r0 == 0) goto L_0x0075
            X.0rW r3 = (X.C15560rW) r3
        L_0x006f:
            if (r3 == 0) goto L_0x0031
            r7.A08(r3, r1)
            goto L_0x0031
        L_0x0075:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L_0x007f
            java.util.List r3 = (java.util.List) r3
            r7.A0E(r1, r3)
            goto L_0x0031
        L_0x007f:
            boolean r0 = r3 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x0089
            java.lang.String[] r3 = (java.lang.String[]) r3
            r7.A0H(r1, r3)
            goto L_0x0031
        L_0x0089:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0095
            java.lang.Double r3 = (java.lang.Double) r3
            if (r3 == 0) goto L_0x0031
            r7.A0B(r1, r3)
            goto L_0x0031
        L_0x0095:
            if (r3 == 0) goto L_0x0031
            java.lang.String r0 = java.lang.String.valueOf(r3)
            if (r0 == 0) goto L_0x0031
            r7.A0D(r1, r0)
            goto L_0x0031
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.analytics.intf.AnalyticsEventDebugInfo.A02(com.instagram.common.analytics.intf.AnalyticsEventDebugInfo, X.0ri):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A00);
    }

    public AnalyticsEventDebugInfo(int i) {
        this.A02 = i;
    }
}
