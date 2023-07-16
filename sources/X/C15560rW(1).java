package X;

import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0rW  reason: invalid class name and case insensitive filesystem */
public final class C15560rW implements C11720kh {
    public ArrayList A00 = new ArrayList(16);

    public final void A03(C03590Jr r4) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A00;
            if (i < arrayList.size()) {
                Object obj = arrayList.get(i);
                if (!(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                    if (obj instanceof C15680ri) {
                        AnonymousClass0KD A02 = r4.A01.A02();
                        r4.A0B(A02);
                        ((C15680ri) obj).A06(A02);
                    } else if (obj instanceof C15560rW) {
                        C03590Jr A01 = r4.A01.A01();
                        r4.A0B(A01);
                        ((C15560rW) obj).A03(A01);
                    }
                    i++;
                }
                C03590Jr.A00(r4, obj);
                i++;
            } else {
                return;
            }
        }
    }

    public final AnalyticsEventDebugInfo CxC() {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(3);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A00;
            if (i >= arrayList.size()) {
                return analyticsEventDebugInfo;
            }
            C11500kJ.A05(analyticsEventDebugInfo, arrayList.get(i), (String) null);
            i++;
        }
    }

    public final void A00(double d) {
        this.A00.add(Double.valueOf(d));
    }

    public final void A01(int i) {
        this.A00.add(Integer.valueOf(i));
    }

    public final void A02(long j) {
        this.A00.add(Long.valueOf(j));
    }

    public final void A04(String str) {
        this.A00.add(str);
    }

    public final void A05(boolean z) {
        this.A00.add(Boolean.valueOf(z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15560rW)) {
            return false;
        }
        return C002401c.A00(this.A00, ((C15560rW) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str;
        StringWriter stringWriter = new StringWriter();
        stringWriter.append("[");
        List list = (List) this.A00.clone();
        int i = 0;
        while (i < list.size()) {
            try {
                Object obj = list.get(i);
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = "";
                }
                if (str.isEmpty()) {
                    str = "null";
                }
                stringWriter.append(str);
                if (i < list.size() - 1) {
                    stringWriter.append(", ");
                }
                i++;
            } catch (IndexOutOfBoundsException e) {
                AnonymousClass0LU.A0H(getClass().getSimpleName(), "The List has no items even though its size is greater than 0.", e);
            }
        }
        stringWriter.append("]");
        return stringWriter.toString();
    }
}
