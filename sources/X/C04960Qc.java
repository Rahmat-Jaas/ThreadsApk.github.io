package X;

import java.io.File;
import java.io.Writer;
import java.util.ArrayList;

/* renamed from: X.0Qc  reason: invalid class name and case insensitive filesystem */
public final class C04960Qc implements C05500Tz {
    public final C05500Tz A00;
    public final AnonymousClass0B8 A01;

    public final int Ag8() {
        return this.A00.Ag8();
    }

    public final boolean BOB() {
        return this.A00.BOB();
    }

    public final boolean BWF() {
        return this.A00.BWF();
    }

    public final void Beo() {
        File file;
        boolean equals;
        this.A00.Beo();
        AnonymousClass0B8 r2 = this.A01;
        String valueOf = String.valueOf(AnonymousClass0AJ.A00());
        String valueOf2 = String.valueOf(AnonymousClass0AJ.A01());
        ArrayList arrayList = r2.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0AM r1 = (AnonymousClass0AM) arrayList.get(i);
            if (r1 instanceof C017708j) {
                file = r1.A00;
                equals = file.getName().equals(valueOf2);
            } else {
                boolean z = r1 instanceof C017808k;
                file = r1.A00;
                if (z) {
                    equals = file.getName().equals(valueOf);
                }
                AnonymousClass0B9.A01(file);
            }
            if (equals) {
            }
            AnonymousClass0B9.A01(file);
        }
        arrayList.clear();
    }

    public final void DBS(Writer writer) {
        this.A00.DBS(writer);
    }

    public final void unlock() {
        this.A00.unlock();
    }

    public C04960Qc(C05500Tz r1, AnonymousClass0B8 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
