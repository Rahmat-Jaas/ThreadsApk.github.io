package X;

/* renamed from: X.0jB  reason: invalid class name and case insensitive filesystem */
public final class C10920jB implements AnonymousClass0WE {
    public final /* synthetic */ AnonymousClass01V A00;
    public final /* synthetic */ StringBuilder A01;

    public C10920jB(AnonymousClass01V r1, StringBuilder sb) {
        this.A00 = r1;
        this.A01 = sb;
    }

    public final void DAa(AnonymousClass0WQ r3, AnonymousClass0Jz r4, String str, int i, long j, long j2) {
        StringBuilder sb = this.A01;
        sb.append("<p:");
        sb.append(str);
        if (r3 != null) {
            sb.append('=');
            sb.append(r3);
        }
        sb.append(' ');
        sb.append(j);
        sb.append("[ms]>");
    }
}
