package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.78b  reason: invalid class name and case insensitive filesystem */
public final class C1200178b {
    public final List A00;

    public C1200178b() {
        this((List) null, (DefaultConstructorMarker) null, 1);
    }

    public final int A00() {
        int A04;
        List list = this.A00;
        if (list.size() > 0) {
            int A042 = AnonymousClass0wJ.A04(list.get(0));
            while (C18190wL.A1a(list) && AnonymousClass0wJ.A04(list.get(0)) == A042) {
                list.set(0, AnonymousClass00J.A0E(list));
                list.remove(C86144wL.A0C(list, 1));
                int size = list.size();
                int size2 = list.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int A043 = AnonymousClass0wJ.A04(list.get(i));
                    int i2 = (i + 1) << 1;
                    int i3 = i2 - 1;
                    int A044 = AnonymousClass0wJ.A04(list.get(i3));
                    if (i2 < size && (A04 = AnonymousClass0wJ.A04(list.get(i2))) > A044) {
                        if (A04 <= A043) {
                            break;
                        }
                        list.set(i, Integer.valueOf(A04));
                        list.set(i2, Integer.valueOf(A043));
                        i = i2;
                    } else if (A044 <= A043) {
                        break;
                    } else {
                        list.set(i, Integer.valueOf(A044));
                        list.set(i3, Integer.valueOf(A043));
                        i = i3;
                    }
                }
            }
            return A042;
        }
        AnonymousClass7J4.A02("Set is empty");
        throw null;
    }

    public final void A01(int i) {
        List list = this.A00;
        if (!C18190wL.A1a(list) || !(AnonymousClass0wJ.A04(C18240wQ.A0b(list)) == i || AnonymousClass0wJ.A04(list.get(C86104wH.A0B(list))) == i)) {
            int size = list.size();
            Integer valueOf = Integer.valueOf(i);
            list.add(valueOf);
            while (size > 0) {
                int i2 = ((size + 1) >>> 1) - 1;
                int A04 = AnonymousClass0wJ.A04(list.get(i2));
                if (i <= A04) {
                    break;
                }
                list.set(size, Integer.valueOf(A04));
                size = i2;
            }
            list.set(size, valueOf);
        }
    }

    public /* synthetic */ C1200178b(List list, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A00 = AnonymousClass0wJ.A0v();
    }
}
