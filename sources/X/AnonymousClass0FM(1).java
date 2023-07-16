package X;

/* renamed from: X.0FM  reason: invalid class name */
public final class AnonymousClass0FM implements AnonymousClass0AG, C02500Br {
    public static AnonymousClass0FM A03;
    public int A00 = 0;
    public String A01 = C13730oC.A00();
    public Integer A02 = AnonymousClass006.A00;

    public final synchronized void Bm8() {
        this.A00++;
        this.A02 = AnonymousClass006.A01;
    }

    public final synchronized void Bzt() {
        this.A00++;
        this.A02 = AnonymousClass006.A00;
    }

    public final synchronized String CYD() {
        StringBuilder sb;
        String str;
        sb = new StringBuilder();
        sb.append("UFS");
        sb.append("-");
        sb.append(this.A01);
        sb.append("-");
        if (this.A02.intValue() != 0) {
            str = "bg";
        } else {
            str = "fg";
        }
        sb.append(str);
        sb.append("-");
        sb.append(this.A00);
        return sb.toString();
    }
}
