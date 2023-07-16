package X;

import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: X.7d2  reason: invalid class name and case insensitive filesystem */
public final class C125367d2 implements C145778l4 {
    public final AnonymousClass5E9 A00 = new AnonymousClass5E9();

    public final String getName() {
        return "wholestat";
    }

    public final void ACJ(C113166qr r7, StackTraceElement[] stackTraceElementArr) {
        AnonymousClass5E9 r5 = this.A00;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass5E9.A00(r5);
        ListIterator listIterator = r5.A00.listIterator();
        while (listIterator.hasNext()) {
            AnonymousClass5EB r2 = (AnonymousClass5EB) listIterator.next();
            if (r2 != null) {
                if (!r2.A0F.exists()) {
                    r5.A01.remove(Integer.valueOf(r2.A0E));
                    listIterator.remove();
                } else {
                    String A01 = r2.A01();
                    if (A01 != null) {
                        A0v.add(A01);
                    }
                }
            }
        }
        r7.A0C = A0v;
    }

    public final void update() {
        AnonymousClass5E9 r4 = this.A00;
        AnonymousClass5E9.A00(r4);
        ListIterator listIterator = r4.A00.listIterator();
        while (listIterator.hasNext()) {
            AnonymousClass5EB r2 = (AnonymousClass5EB) listIterator.next();
            if (r2 != null) {
                if (!r2.A0F.exists()) {
                    r4.A01.remove(Integer.valueOf(r2.A0E));
                    listIterator.remove();
                } else {
                    r2.A02();
                }
            }
        }
    }
}
