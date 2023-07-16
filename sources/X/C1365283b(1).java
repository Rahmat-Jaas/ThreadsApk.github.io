package X;

import java.util.Comparator;

/* renamed from: X.83b  reason: invalid class name and case insensitive filesystem */
public final class C1365283b implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        C108706io r6 = (C108706io) obj;
        C108706io r7 = (C108706io) obj2;
        AnonymousClass55x r1 = r6.A01;
        if (r1.A0D() && ((r1 instanceof AnonymousClass5EU) || (r1 instanceof AnonymousClass5ES))) {
            i = 0;
        } else if (r1.A0D()) {
            i = 1;
        } else if ((r1 instanceof AnonymousClass5EU) || (r1 instanceof AnonymousClass5ES)) {
            i = 2;
        } else {
            i = 3;
        }
        AnonymousClass55x r12 = r7.A01;
        if (r12.A0D() && ((r12 instanceof AnonymousClass5EU) || (r12 instanceof AnonymousClass5ES))) {
            i2 = 0;
        } else if (r12.A0D()) {
            i2 = 1;
        } else if ((r12 instanceof AnonymousClass5EU) || (r12 instanceof AnonymousClass5ES)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        int i3 = i - i2;
        if (i3 != 0) {
            return i3;
        }
        long j = r6.A00;
        long j2 = r7.A00;
        if (j < j2) {
            return -1;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }
}
