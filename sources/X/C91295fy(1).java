package X;

import org.json.JSONObject;

/* renamed from: X.5fy  reason: invalid class name and case insensitive filesystem */
public final class C91295fy extends C112416pY implements C143518gs {
    public final JSONObject CxG() {
        JSONObject A0y = C18230wP.A0y();
        A0y.put("bytes", this.A00);
        A0y.put("ondisk", this.A02);
        A0y.put("entries", this.A01);
        return A0y;
    }

    public C91295fy(long j, long j2, long j3) {
        super(j, j2, j3);
    }

    public C91295fy(C112416pY r8) {
        this(r8.A00, r8.A02, r8.A01);
    }
}
