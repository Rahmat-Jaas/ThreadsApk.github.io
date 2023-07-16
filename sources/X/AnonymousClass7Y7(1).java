package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.7Y7  reason: invalid class name */
public final class AnonymousClass7Y7 implements C147608pc {
    public float A00;
    public float A01;
    public AnonymousClass69J A02 = AnonymousClass69J.Rtl;
    public final /* synthetic */ AnonymousClass7H8 A03;

    public final /* synthetic */ C146098ld BaT(Map map, AnonymousClass0YY r3, int i, int i2) {
        C04220Ms.A0B(r3, 4);
        return new C123627Xv(this, map, r3, i, i2);
    }

    public final /* synthetic */ int CfL(float f) {
        return AnonymousClass7FU.A01(this, f);
    }

    public final List CwO(Object obj, AnonymousClass0YP r9) {
        AnonymousClass7Y3 r3;
        C04220Ms.A0B(r9, 1);
        AnonymousClass7H8 r2 = this.A03;
        r2.A03();
        AnonymousClass7Y3 r5 = r2.A06;
        Integer num = r5.A0Y.A01;
        if (num == AnonymousClass006.A00 || num == AnonymousClass006.A0C) {
            Map map = r2.A09;
            Object obj2 = map.get(obj);
            AnonymousClass7Y3 r32 = obj2;
            if (obj2 == null) {
                AnonymousClass7Y3 r33 = (AnonymousClass7Y3) r2.A08.remove(obj);
                if (r33 != null) {
                    int i = r2.A01;
                    if (i > 0) {
                        r2.A01 = i - 1;
                        r3 = r33;
                    } else {
                        throw C18180wK.A0a("Check failed.");
                    }
                } else {
                    AnonymousClass7Y3 A002 = AnonymousClass7H8.A00(r2, obj);
                    r3 = A002;
                    if (A002 == null) {
                        int i2 = r2.A00;
                        AnonymousClass7Y3 r34 = new AnonymousClass7Y3(true, AnonymousClass55K.A01.addAndGet(1));
                        r5.A0L = true;
                        r5.A0L(r34, i2);
                        r5.A0L = false;
                        r3 = r34;
                    }
                }
                map.put(obj, r3);
                r32 = r3;
            }
            AnonymousClass7Y3 r35 = (AnonymousClass7Y3) r32;
            int indexOf = r5.A0Z.A00.A04().indexOf(r35);
            int i3 = r2.A00;
            if (indexOf >= i3) {
                if (i3 != indexOf) {
                    AnonymousClass7H8.A01(r2, indexOf, i3);
                }
                r2.A00++;
                AnonymousClass7H8.A02(r2, r35, obj, r9);
                return r35.A0A();
            }
            StringBuilder A0s = C18190wL.A0s("Key \"");
            A0s.append(obj);
            throw C18190wL.A0a(C18180wK.A0i("\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.", A0s));
        }
        throw C18180wK.A0a("subcompose can only be used inside the measure or layout blocks");
    }

    public final /* synthetic */ float CxE(int i) {
        return C147168nV.A00(this, (float) i);
    }

    public final /* synthetic */ long CxF(long j) {
        return AnonymousClass7FU.A02(this, j);
    }

    public final /* synthetic */ float CxK(long j) {
        return AnonymousClass7FU.A00(this, j);
    }

    public final /* synthetic */ long D7K(long j) {
        return AnonymousClass7FU.A03(this, j);
    }

    public AnonymousClass7Y7(AnonymousClass7H8 r2) {
        this.A03 = r2;
    }

    public final float Acr() {
        return this.A00;
    }

    public final float AjK() {
        return this.A01;
    }

    public final AnonymousClass69J getLayoutDirection() {
        return this.A02;
    }

    public final /* synthetic */ int CfK(long j) {
        return C147168nV.A01(this, j);
    }

    public final /* synthetic */ float CxD(float f) {
        return C147168nV.A00(this, f);
    }

    public final /* synthetic */ float CxL(float f) {
        return f * Acr();
    }
}
