package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.4EG  reason: invalid class name */
public final class AnonymousClass4EG implements C83664rm {
    public AnonymousClass17J A00 = new AnonymousClass17J(AnonymousClass2AP.A06, (List) null, 0, 0);
    public final C84154sd A01;
    public final Map A02 = C18220wO.A0y();
    public final AnonymousClass0ZU A03;

    public AnonymousClass4EG(C84154sd r5, AnonymousClass0ZU r6) {
        C04220Ms.A0B(r5, 1);
        this.A01 = r5;
        this.A03 = r6;
    }

    public final void ASn(C83654rl r6, AnonymousClass35K r7, AnonymousClass17J r8) {
        C04220Ms.A0B(r6, 0);
        if (!(r6 == AnonymousClass2AP.A06 || r8 == null)) {
            Map map = this.A02;
            map.put(r6, r8);
            AnonymousClass17J r2 = this.A00;
            AnonymousClass17J r22 = new AnonymousClass17J(r2.A03, AnonymousClass00J.A0N(map.values()), 0, r2.A02);
            if (r22.A00 > this.A00.A00) {
                this.A03.invoke();
            }
            this.A00 = r22;
            if (r6 == AnonymousClass2AP.A0R) {
                this.A01.CWx(new C210818v(r8.A01 + r8.A00));
            }
        }
        r7.A00.resumeWith(new AnonymousClass17J(r6, (List) null, 0, 0));
    }

    public final void AD2(C83654rl r5) {
        this.A02.clear();
        this.A00 = new AnonymousClass17J(AnonymousClass2AP.A06, (List) null, 0, 0);
    }
}
