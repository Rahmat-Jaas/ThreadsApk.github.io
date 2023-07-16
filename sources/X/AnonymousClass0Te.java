package X;

/* renamed from: X.0Te  reason: invalid class name */
public final class AnonymousClass0Te {
    public AnonymousClass0Ti[] A00;
    public final int A01;
    public final int A02;
    public final /* synthetic */ AnonymousClass0Tb A03;
    public final /* synthetic */ AnonymousClass0Tb A04;

    public AnonymousClass0Te(AnonymousClass0Tb r5, int i, int i2) {
        this.A03 = r5;
        this.A04 = r5;
        this.A01 = i;
        this.A02 = (1 << i2) - 1;
        int i3 = 1 << (i + i2);
        AnonymousClass0Ti[] r2 = new AnonymousClass0Ti[i3];
        this.A00 = r2;
        for (int i4 = 0; i4 < i3; i4++) {
            r2[i4] = new AnonymousClass0Ti(this);
        }
    }
}
