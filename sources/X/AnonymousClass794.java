package X;

import android.content.Context;

/* renamed from: X.794  reason: invalid class name */
public final class AnonymousClass794 {
    public static volatile AnonymousClass794 A0G;
    public static volatile C144548ig A0H;
    public final Context A00;
    public final AnonymousClass3FZ A01;
    public final AnonymousClass7H4 A02;
    public final AnonymousClass6O7 A03;
    public final AnonymousClass6O8 A04;
    public final AnonymousClass3TV A05;
    public final C100996Pm A06;
    public final C113296r7 A07;
    public final AnonymousClass77G A08;
    public final AnonymousClass3LX A09;
    public final AnonymousClass73W A0A;
    public final C142468eu A0B;
    public final C82414pa A0C;
    public final AnonymousClass73V A0D;
    public final C112226pD A0E;
    public final C112226pD A0F;

    public static AnonymousClass794 A00() {
        if (A0G == null) {
            synchronized (AnonymousClass794.class) {
                if (A0G == null) {
                    C144548ig r0 = A0H;
                    if (r0 != null) {
                        A0G = (AnonymousClass794) r0.get();
                    } else {
                        throw C18180wK.A0a("Can't find bloks instance. Is it initialized?");
                    }
                }
            }
        }
        return A0G;
    }

    public final C108686im A01() {
        return (C108686im) this.A0E.A00();
    }

    public final AnonymousClass3TU A02() {
        return (AnonymousClass3TU) this.A0F.A00();
    }

    public AnonymousClass794(Context context, AnonymousClass3FZ r3, AnonymousClass7H4 r4, AnonymousClass6O7 r5, AnonymousClass6O8 r6, AnonymousClass3TV r7, AnonymousClass73V r8, C100996Pm r9, C144548ig r10, C144548ig r11, C113296r7 r12, AnonymousClass77G r13, AnonymousClass3LX r14, AnonymousClass73W r15, C142468eu r16, C82414pa r17) {
        this.A00 = context;
        this.A0C = r17;
        this.A03 = r5;
        this.A06 = r9;
        this.A04 = r6;
        this.A0B = r16;
        this.A09 = r14;
        this.A07 = r12;
        this.A0A = r15;
        this.A08 = r13;
        this.A05 = r7;
        this.A02 = r4;
        this.A0D = r8;
        this.A01 = r3;
        this.A0E = new C112226pD(r10);
        this.A0F = new C112226pD(r11);
    }
}
