package X;

/* renamed from: X.3DC  reason: invalid class name */
public final class AnonymousClass3DC {
    public final C81984oq A00;
    public final C57233Ag A01;
    public final C57243Ah A02;
    public final Integer A03;
    public final String A04;
    public final Throwable A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public /* synthetic */ AnonymousClass3DC(C81984oq r5, C57233Ag r6, C57243Ah r7, Integer num, String str, Throwable th, int i, boolean z, boolean z2, boolean z3) {
        C81984oq r3 = null;
        str = (i & 2) != 0 ? null : str;
        th = (i & 4) != 0 ? null : th;
        boolean z4 = false;
        boolean A1R = C18240wQ.A1R(i & 8, z2);
        num = (i & 16) != 0 ? null : num;
        r7 = (i & 32) != 0 ? null : r7;
        r6 = (i & 64) != 0 ? null : r6;
        z4 = (i & 128) == 0 ? z3 : z4;
        r3 = (i & 256) == 0 ? r5 : r3;
        this.A08 = z;
        this.A04 = str;
        this.A05 = th;
        this.A07 = A1R;
        this.A03 = num;
        this.A02 = r7;
        this.A01 = r6;
        this.A06 = z4;
        this.A00 = r3;
    }
}
