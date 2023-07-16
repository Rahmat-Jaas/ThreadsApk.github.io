package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.0Mn  reason: invalid class name and case insensitive filesystem */
public final class C04170Mn {
    public Throwable A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;

    public final void A01(AnonymousClass0OO r3, int i) {
        A02(r3, Long.valueOf((long) i));
    }

    public final void A00(AnonymousClass0OZ r3, boolean z) {
        this.A01.put(r3, Boolean.valueOf(z));
    }

    public final void A02(AnonymousClass0OO r2, Long l) {
        Map map = this.A06;
        if (l == null) {
            map.remove(r2);
        } else {
            map.put(r2, l);
        }
    }

    public final void A03(AnonymousClass0ON r2, String str) {
        Map map = this.A07;
        if (str == null) {
            str = "unknown";
        }
        map.put(r2, str);
    }

    public final void A04(AnonymousClass0MY r5, AnonymousClass0ND r6, File file) {
        Map map;
        String str;
        StringBuilder sb;
        String obj;
        if (r6 == AnonymousClass0ND.CRITICAL_REPORT) {
            map = this.A02;
            str = r5.A01;
            if (str.equals("__")) {
                obj = r5.A00;
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(r5.A00);
                obj = sb.toString();
            }
        } else {
            map = this.A04;
            sb = new StringBuilder();
            str = r5.A01;
            sb.append(str);
            sb.append(r5.A00);
            obj = sb.toString();
        }
        map.put(obj, file.getPath());
    }

    public final void A05(Properties properties) {
        properties.putAll(this.A03);
        for (Map.Entry entry : this.A07.entrySet()) {
            properties.put(((AnonymousClass0MP) entry.getKey()).A00, entry.getValue());
        }
        for (Map.Entry entry2 : this.A06.entrySet()) {
            properties.put(((AnonymousClass0MP) entry2.getKey()).A00, entry2.getValue().toString());
        }
        for (Map.Entry entry3 : this.A01.entrySet()) {
            properties.put(((AnonymousClass0MP) entry3.getKey()).A00, entry3.getValue().toString());
        }
        Iterator it = this.A05.entrySet().iterator();
        if (it.hasNext()) {
            ((Map.Entry) it.next()).getKey();
            throw new NullPointerException(FXPFAccessLibraryDebugFragment.NAME);
        }
    }

    public C04170Mn(Throwable th) {
        this.A03 = new HashMap();
        this.A07 = new HashMap();
        this.A06 = new HashMap();
        this.A01 = new HashMap();
        this.A05 = new HashMap();
        this.A02 = new HashMap();
        this.A04 = new HashMap();
        this.A00 = th;
    }

    public C04170Mn() {
        this((Throwable) null);
    }
}
