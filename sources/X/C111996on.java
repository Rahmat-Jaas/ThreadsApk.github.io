package X;

/* renamed from: X.6on  reason: invalid class name and case insensitive filesystem */
public final class C111996on {
    public final AnonymousClass7WW A00;
    public final Integer A01;

    public C111996on(AnonymousClass7WW r2, Integer num) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("AnimationResult(endReason=");
        if (this.A01.intValue() != 0) {
            str = "Finished";
        } else {
            str = "BoundReached";
        }
        A0s.append(str);
        A0s.append(", endState=");
        return C86104wH.A0y(this.A00, A0s);
    }
}
