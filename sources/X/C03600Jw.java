package X;

import com.facebook.redex.IDxComparatorShape93S0000000_I2;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: X.0Jw  reason: invalid class name and case insensitive filesystem */
public final class C03600Jw {
    public static final AnonymousClass0K9 A06 = new AnonymousClass0K9("ErrMsg");
    public static final Comparator A07 = new IDxComparatorShape93S0000000_I2(4);
    public static final Comparator A08 = new IDxComparatorShape93S0000000_I2(3);
    public String A00;
    public final Object A01 = new Object();
    public final String A02;
    public final Map A03;
    public final Set A04;
    public final Set A05;

    public static void A00(C03600Jw r3) {
        r3.A00 = null;
        HashSet hashSet = new HashSet();
        synchronized (r3.A01) {
            hashSet.addAll(r3.A05);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            A00((C03600Jw) it.next());
        }
    }

    public final void A01(StringBuilder sb) {
        String str = this.A00;
        if (str != null) {
            sb.append(str);
            return;
        }
        TreeMap treeMap = new TreeMap(A08);
        TreeSet treeSet = new TreeSet(A07);
        synchronized (this.A01) {
            treeMap.putAll(this.A03);
            treeSet.addAll(this.A04);
        }
        sb.append('[');
        sb.append(this.A02);
        sb.append(": ");
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append(", ");
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            ((C03600Jw) it.next()).A01(sb);
        }
    }

    public final String toString() {
        String str = this.A00;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            A01(sb);
            str = sb.toString();
            this.A00 = str;
        }
        return AnonymousClass00U.A0h("[ErrMsg - ", this.A02, ": ", str, "]");
    }

    public C03600Jw(String str) {
        Comparator comparator = A07;
        this.A04 = new TreeSet(comparator);
        this.A05 = new TreeSet(comparator);
        this.A03 = new TreeMap(A08);
        str.getClass();
        this.A02 = str;
        this.A00 = null;
    }
}
