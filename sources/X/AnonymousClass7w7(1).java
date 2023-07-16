package X;

import java.util.List;

/* renamed from: X.7w7  reason: invalid class name */
public final class AnonymousClass7w7 implements C145968lP {
    public long A00 = -1;
    public List A01 = AnonymousClass0wJ.A0v();
    public final List A02 = AnonymousClass0wJ.A0v();
    public final /* synthetic */ AnonymousClass8s9 A03;

    public AnonymousClass7w7(AnonymousClass8s9 r3) {
        this.A03 = r3;
    }

    public final void C2V(C170939vo r4, String str) {
        AnonymousClass8s9 r1 = this.A03;
        if (((C27420EnC) r1)._state instanceof C142598fH) {
            AnonymousClass8s9.A00("ColdStartFeedCache response is null", r1);
        }
    }

    public final void C2W(C35029IlY ilY, C170939vo r4, List list, long j) {
        this.A02.addAll(ilY.A01());
        this.A00 = j;
    }

    public final void C91(Integer num, List list) {
        if (num == AnonymousClass006.A00) {
            List list2 = this.A01;
            list2.addAll(list);
            List list3 = this.A02;
            list3.addAll(list);
            AnonymousClass8s9 r3 = this.A03;
            if (((C27420EnC) r3)._state instanceof C142598fH) {
                r3.Cf0(AnonymousClass1jA.A00(new C109426jz(list3, list2, this.A00)), (AnonymousClass0YY) null);
            }
        }
    }
}
