package X;

import java.util.List;

/* renamed from: X.52y  reason: invalid class name and case insensitive filesystem */
public final class C874852y extends AnonymousClass7W1 {
    public final /* bridge */ /* synthetic */ void BQd(int i, Object obj) {
        AnonymousClass798 r5 = (AnonymousClass798) obj;
        C04220Ms.A0B(r5, 1);
        AnonymousClass798 r2 = (AnonymousClass798) this.A00;
        if (r2 instanceof AnonymousClass548) {
            AnonymousClass548 r22 = (AnonymousClass548) r2;
            List list = r22.A0F;
            if (i < list.size()) {
                list.set(i, r5);
            } else {
                list.add(r5);
            }
            r5.A04(r22.A0B);
            r22.A02();
            return;
        }
        throw C18180wK.A0a("Cannot only insert VNode into Group");
    }

    public final void Bgb(int i, int i2, int i3) {
        AnonymousClass798 r4 = (AnonymousClass798) this.A00;
        if (r4 instanceof AnonymousClass548) {
            AnonymousClass548 r42 = (AnonymousClass548) r4;
            int i4 = 0;
            if (i > i2) {
                while (i4 < i3) {
                    List list = r42.A0F;
                    Object obj = list.get(i);
                    list.remove(i);
                    list.add(i2, obj);
                    i2++;
                    i4++;
                }
            } else {
                while (i4 < i3) {
                    List list2 = r42.A0F;
                    Object obj2 = list2.get(i);
                    list2.remove(i);
                    list2.add(i2 - 1, obj2);
                    i4++;
                }
            }
            r42.A02();
            return;
        }
        throw C18180wK.A0a("Cannot only insert VNode into Group");
    }

    public final void CbJ(int i, int i2) {
        AnonymousClass798 r1 = (AnonymousClass798) this.A00;
        if (r1 instanceof AnonymousClass548) {
            ((AnonymousClass548) r1).A05(i, i2);
            return;
        }
        throw C18180wK.A0a("Cannot only insert VNode into Group");
    }

    public final /* bridge */ /* synthetic */ void BQW(int i, Object obj) {
    }

    public C874852y(AnonymousClass798 r1) {
        super(r1);
    }
}
