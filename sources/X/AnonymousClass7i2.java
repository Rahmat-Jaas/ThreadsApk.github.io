package X;

import org.json.JSONObject;

/* renamed from: X.7i2  reason: invalid class name */
public final class AnonymousClass7i2 implements C143518gs {
    public final long A00;
    public final long A01;
    public final long A02;

    public AnonymousClass7i2(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }

    public final JSONObject CxG() {
        JSONObject A0y = C18230wP.A0y();
        A0y.put(I17.A00(506), this.A00);
        A0y.put("free_space", this.A01);
        A0y.put("total_space", this.A02);
        return A0y;
    }
}
