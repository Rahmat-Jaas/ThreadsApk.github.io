package X;

/* renamed from: X.7u7  reason: invalid class name and case insensitive filesystem */
public final class C132557u7 implements C144618in {
    public final int A00;
    public final AnonymousClass01V A01;
    public final C144618in A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        AnonymousClass01V r4 = this.A01;
        int i = this.A00;
        r4.markerStart(1001455617, i, "event", this.A03);
        try {
            Object then = this.A02.then(obj);
            r4.markerEnd(1001455617, i, 2);
            return then;
        } catch (Exception e) {
            r4.markerEnd(1001455617, i, 3);
            throw e;
        }
    }

    public C132557u7(AnonymousClass01V r2, C144618in r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
        this.A00 = str.hashCode();
    }
}
