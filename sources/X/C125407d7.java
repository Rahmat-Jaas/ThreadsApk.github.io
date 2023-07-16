package X;

/* renamed from: X.7d7  reason: invalid class name and case insensitive filesystem */
public final class C125407d7 implements C145778l4, C03570Jn {
    public AnonymousClass0T5 A00;
    public AnonymousClass0T5 A01;
    public AnonymousClass0T5 A02;
    public final AnonymousClass0T4 A03;

    public final String getName() {
        return "memory_red";
    }

    public final void update() {
    }

    public final void ACJ(C113166qr r2, StackTraceElement[] stackTraceElementArr) {
        if (r2 instanceof AnonymousClass5EC) {
            AnonymousClass5EC r22 = (AnonymousClass5EC) r2;
            AnonymousClass0T5 r0 = this.A01;
            if (r0 != null) {
                r22.A05 = r0.name();
            }
            AnonymousClass0T5 r02 = this.A02;
            if (r02 != null) {
                r22.A0A = r02.name();
            }
            AnonymousClass0T5 r03 = this.A00;
            if (r03 != null) {
                r22.A04 = r03.name();
            }
        }
    }

    public C125407d7(AnonymousClass0T4 r1) {
        this.A03 = r1;
        r1.A6Q(this);
    }

    public final void Bk4(AnonymousClass0T5 r1) {
        this.A00 = r1;
    }

    public final void C3x(AnonymousClass0T5 r1) {
        this.A01 = r1;
    }

    public final void COO(AnonymousClass0T5 r1) {
        this.A02 = r1;
    }
}
