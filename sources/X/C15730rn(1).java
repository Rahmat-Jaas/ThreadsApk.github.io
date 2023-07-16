package X;

import android.util.Pair;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.0rn  reason: invalid class name and case insensitive filesystem */
public final class C15730rn implements C11720kh {
    public long A00;
    public Integer A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final C15680ri A05 = new C15680ri();
    public final EnumSet A06 = EnumSet.noneOf(C11560kP.class);

    public final AnalyticsEventDebugInfo CxC() {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(1);
        AnalyticsEventEntry analyticsEventEntry = new AnalyticsEventEntry(this.A05.CxC(), "extra");
        List list = analyticsEventDebugInfo.A01;
        list.add(analyticsEventEntry);
        list.add(new AnalyticsEventEntry(IgFragmentActivity.MODULE_KEY, (Object) this.A02));
        list.add(new AnalyticsEventEntry("event", (Object) this.A03));
        Integer num = this.A01;
        if (num != null) {
            list.add(new AnalyticsEventEntry("sample_rate", (Object) num));
        }
        EnumSet enumSet = this.A06;
        if (!enumSet.isEmpty()) {
            list.add(new AnalyticsEventEntry("tags", (Object) enumSet));
        }
        StringBuilder sb = new StringBuilder();
        long j = this.A00;
        sb.append(j);
        sb.append(" (");
        sb.append(C11500kJ.A00.format(new Date(j)));
        sb.append(")");
        list.add(new AnalyticsEventEntry("time", (Object) sb.toString()));
        analyticsEventDebugInfo.A00 = this.A03;
        return analyticsEventDebugInfo;
    }

    public final Float A02(String str) {
        Object A012 = this.A05.A00.A01(str);
        if (A012 == null) {
            return null;
        }
        if (A012 instanceof Float) {
            return (Float) A012;
        }
        AnonymousClass0LU.A0B("ExtraBundle", AnonymousClass00U.A0V("You are trying get value as Float from key: ", str, " but the value type is not Float. Please check again if you use it to log USL."));
        return null;
    }

    public final String A03() {
        StringBuilder sb = new StringBuilder("Name: ");
        sb.append(this.A03);
        sb.append("; ModuleName: ");
        sb.append(this.A02);
        sb.append("; Extra: ");
        sb.append(this.A05.toString());
        Integer num = this.A01;
        if (num != null) {
            sb.append("; Sample Rate: ");
            sb.append(num);
        }
        EnumSet enumSet = this.A06;
        if (enumSet != null) {
            sb.append("; Tags: ");
            sb.append(enumSet);
        }
        return sb.toString();
    }

    public final void A04(C15680ri r5) {
        C11540kN r1 = new C11540kN(r5);
        while (r1.hasNext()) {
            Pair pair = (Pair) r1.next();
            Object obj = pair.second;
            if (obj instanceof String) {
                A0D((String) pair.first, (String) obj);
            } else if (obj instanceof Integer) {
                A08((Integer) obj, (String) pair.first);
            } else if (obj instanceof Double) {
                A0A((String) pair.first, (Double) obj);
            } else if (obj instanceof Long) {
                A0C((String) pair.first, (Long) obj);
            } else if (obj instanceof Float) {
                A0B((String) pair.first, (Float) obj);
            } else if (obj instanceof Boolean) {
                A09((String) pair.first, (Boolean) obj);
            } else if (obj instanceof C15560rW) {
                A06((C15560rW) obj, (String) pair.first);
            } else if (obj instanceof C15680ri) {
                A05((C15680ri) obj, (String) pair.first);
            }
        }
    }

    public final void A05(C15680ri r2, String str) {
        this.A05.A07(r2, str);
    }

    public final void A06(C15560rW r2, String str) {
        this.A05.A08(r2, str);
    }

    public final void A07(C11490kI r2, String str) {
        A0D(r2.A01, str);
    }

    public final void A08(Integer num, String str) {
        this.A05.A09(num, str);
    }

    public final void A09(String str, Boolean bool) {
        this.A05.A0A(str, bool);
    }

    public final void A0A(String str, Double d) {
        this.A05.A0B(str, d);
    }

    public final void A0B(String str, Float f) {
        this.A05.A00.A02(str, f);
    }

    public final void A0C(String str, Long l) {
        this.A05.A0C(str, l);
    }

    public final void A0D(String str, String str2) {
        this.A05.A0D(str, str2);
    }

    public final void A0E(String str, List list) {
        this.A05.A0E(str, list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        sb.append("| extra = {\n");
        this.A05.A0I(sb, "|   ");
        sb.append("| }");
        sb.append("\n| module = ");
        sb.append(this.A02);
        sb.append("\n| name = ");
        sb.append(this.A03);
        sb.append("\n| time = ");
        long j = this.A00;
        sb.append(j);
        sb.append(" (");
        sb.append(C11500kJ.A00.format(new Date(j)));
        sb.append(")");
        Integer num = this.A01;
        if (num != null) {
            sb.append("\n| sample_rate = ");
            sb.append(num);
        }
        EnumSet enumSet = this.A06;
        if (!enumSet.isEmpty()) {
            sb.append("\n| tags = ");
            sb.append(enumSet);
        }
        sb.append("\n}");
        return sb.toString();
    }

    public static C15730rn A00(C11630kW r0, String str) {
        String moduleName;
        str.getClass();
        if (r0 == null) {
            moduleName = null;
        } else {
            moduleName = r0.getModuleName();
        }
        return A01(str, moduleName);
    }

    public static C15730rn A01(String str, String str2) {
        str.getClass();
        C15730rn r1 = new C15730rn();
        r1.A04 = false;
        r1.A03 = str;
        r1.A02 = str2;
        return r1;
    }

    public final void A0F(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                A08((Integer) value, str);
            } else if (value instanceof String) {
                A0D(str, (String) value);
            } else if (value instanceof Double) {
                A0A(str, (Double) value);
            } else if (value instanceof Long) {
                A0C(str, (Long) value);
            } else if (value instanceof Boolean) {
                A09(str, (Boolean) value);
            } else if (value != null) {
                C10450iM.A03("AnalyticsEvent", AnonymousClass00U.A0L("Unsupported value type: ", value.getClass().getName()));
            }
        }
    }
}
