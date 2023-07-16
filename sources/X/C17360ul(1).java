package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.0ul  reason: invalid class name and case insensitive filesystem */
public final class C17360ul {
    public String A00;
    public Map A01;
    public final C17340uj A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final String toString() {
        StringBuilder sb = new StringBuilder("{clientIdentifier='");
        sb.append(this.A03);
        sb.append("', willTopic='");
        sb.append(this.A06);
        sb.append("', willMessage='");
        sb.append(this.A05);
        sb.append("', userName='");
        sb.append(this.A02);
        sb.append("', phpOverride='");
        sb.append(this.A00);
        sb.append("'");
        sb.append('}');
        return sb.toString();
    }

    public C17360ul(C17340uj r1, String str, String str2, String str3, String str4, List list) {
        this.A03 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = r1;
        this.A04 = str4;
        this.A07 = list;
    }

    public C17360ul(C17340uj r2, String str, String str2, List list, Map map) {
        this.A03 = str;
        this.A07 = list;
        this.A06 = null;
        this.A05 = null;
        this.A02 = r2;
        this.A04 = str2;
        this.A01 = map;
    }
}
