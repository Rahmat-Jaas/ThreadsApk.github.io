package X;

/* renamed from: X.0NL  reason: invalid class name */
public final class AnonymousClass0NL {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[Rel And Abs Timestamp ");
        if (this.A04) {
            str = "was not set";
        } else if (!this.A03) {
            sb.append("was not valid with error code ");
            sb.append(this.A01);
            sb.append("]");
            return sb.toString();
        } else {
            sb.append("rel time ");
            sb.append(this.A02);
            str = " ms";
            sb.append(str);
            sb.append(" and ");
            sb.append("abs time ");
            sb.append(this.A00);
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public AnonymousClass0NL(long j) {
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = j;
        boolean z = false;
        this.A03 = false;
        this.A04 = j == -758 ? true : z;
    }

    public AnonymousClass0NL(long j, long j2) {
        this.A02 = j;
        this.A00 = j2;
        this.A01 = 0;
        this.A03 = true;
        this.A04 = false;
    }
}
