package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.54y  reason: invalid class name */
public final class AnonymousClass54y extends AnonymousClass7YV implements C147418pJ {
    public AnonymousClass7JK A00;
    public C98106Ef A01;
    public AnonymousClass69J A02;
    public final float A03;
    public final C111366nD A04;
    public final AnonymousClass7KE A05;
    public final C142918fo A06;

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnonymousClass54y(C111366nD r3, AnonymousClass7KE r4, C142918fo r5, AnonymousClass0YY r6, float f, int i) {
        super(r6);
        r4 = (i & 1) != 0 ? null : r4;
        r3 = (i & 2) != 0 ? null : r3;
        f = (i & 4) != 0 ? 1.0f : f;
        this.A05 = r4;
        this.A04 = r3;
        this.A03 = f;
        this.A06 = r5;
    }

    public final void AIj(C147558pX r24) {
        C98106Ef AG2;
        C147018nF r2;
        C147018nF r22;
        C142918fo r7 = this.A06;
        C147558pX r8 = r24;
        if (r7 == C102746Wj.A00) {
            AnonymousClass7KE r0 = this.A05;
            if (r0 != null) {
                long j = r0.A00;
                long j2 = AnonymousClass7KC.A03;
                r8.AJA((C104136bI) null, C877353x.A00, 1.0f, 3, j, j2, C115886w4.A00(r8.BCH(), j2));
            }
            C111366nD r9 = this.A04;
            if (r9 != null) {
                float f = this.A03;
                long j3 = AnonymousClass7KC.A03;
                r8.AJ9(r9, (C104136bI) null, C877353x.A00, f, 3, j3, C115886w4.A00(r8.BCH(), j3));
            }
        } else {
            long BCH = r8.BCH();
            AnonymousClass7JK r02 = this.A00;
            if (r02 != null && BCH == r02.A00 && r8.getLayoutDirection() == this.A02) {
                AG2 = this.A01;
                C04220Ms.A0A(AG2);
            } else {
                AG2 = r7.AG2(r8, r8.getLayoutDirection(), BCH);
            }
            AnonymousClass7KE r23 = this.A05;
            if (r23 != null) {
                long j4 = r23.A00;
                C877353x r10 = C877353x.A00;
                C04220Ms.A0B(AG2, 1);
                if (AG2 instanceof C876453o) {
                    AnonymousClass7F6 r5 = ((C876453o) AG2).A00;
                    float f2 = r5.A01;
                    float f3 = r5.A03;
                    r8.AJA((C104136bI) null, r10, 1.0f, 3, j4, C86104wH.A0C(f2, f3), C86104wH.A0C(r5.A02 - f2, r5.A00 - f3));
                } else {
                    if (AG2 instanceof C876853s) {
                        C876853s r3 = (C876853s) AG2;
                        r22 = r3.A01;
                        if (r22 == null) {
                            C1203079q r52 = r3.A00;
                            float A002 = C86104wH.A00(r52.A04);
                            float f4 = r52.A01;
                            float f5 = r52.A03;
                            r8.AJD((C104136bI) null, r10, 1.0f, 3, j4, C86104wH.A0C(f4, f5), C86104wH.A0C(r52.A02 - f4, r52.A00 - f5), C86104wH.A0C(A002, A002));
                        }
                    } else if (AG2 instanceof C876353n) {
                        r22 = ((C876353n) AG2).A00;
                    } else {
                        throw AnonymousClass4VZ.A00();
                    }
                    r8.AJ7((C104136bI) null, r22, r10, 1.0f, 3, j4);
                }
            }
            C111366nD r92 = this.A04;
            if (r92 != null) {
                float f6 = this.A03;
                C877353x r11 = C877353x.A00;
                C04220Ms.A0B(AG2, 1);
                if (AG2 instanceof C876453o) {
                    AnonymousClass7F6 r53 = ((C876453o) AG2).A00;
                    float f7 = r53.A01;
                    float f8 = r53.A03;
                    r8.AJ9(r92, (C104136bI) null, r11, f6, 3, C86104wH.A0C(f7, f8), C86104wH.A0C(r53.A02 - f7, r53.A00 - f8));
                } else {
                    if (AG2 instanceof C876853s) {
                        C876853s r32 = (C876853s) AG2;
                        r2 = r32.A01;
                        if (r2 == null) {
                            C1203079q r6 = r32.A00;
                            float A003 = C86104wH.A00(r6.A04);
                            float f9 = r6.A01;
                            float f10 = r6.A03;
                            r8.AJC(r92, (C104136bI) null, r11, f6, 3, C86104wH.A0C(f9, f10), C86104wH.A0C(r6.A02 - f9, r6.A00 - f10), C86104wH.A0C(A003, A003));
                        }
                    } else if (AG2 instanceof C876353n) {
                        r2 = ((C876353n) AG2).A00;
                    } else {
                        throw AnonymousClass4VZ.A00();
                    }
                    r8.AJ6(r92, (C104136bI) null, r2, r11, f6, 3);
                }
            }
            this.A01 = AG2;
            this.A00 = new AnonymousClass7JK(r8.BCH());
            this.A02 = r8.getLayoutDirection();
        }
        r8.AIq();
    }

    public final boolean equals(Object obj) {
        AnonymousClass54y r4;
        if (obj instanceof AnonymousClass54y) {
            r4 = (AnonymousClass54y) obj;
        } else {
            r4 = null;
        }
        if (r4 == null || !C04220Ms.A0I(this.A05, r4.A05) || !C04220Ms.A0I(this.A04, r4.A04) || this.A03 != r4.A03) {
            return false;
        }
        return C86134wK.A1a(this.A06, r4.A06, false);
    }

    public final int hashCode() {
        int i;
        AnonymousClass7KE r0 = this.A05;
        int i2 = 0;
        if (r0 != null) {
            i = C18190wL.A02(r0.A00);
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C111366nD r02 = this.A04;
        if (r02 != null) {
            i2 = r02.hashCode();
        }
        return C18220wO.A06(this.A06, C86104wH.A05((i3 + i2) * 31, this.A03));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Background(color=");
        A0s.append(this.A05);
        A0s.append(", brush=");
        A0s.append(this.A04);
        A0s.append(", alpha = ");
        A0s.append(this.A03);
        A0s.append(", shape=");
        return C86104wH.A0y(this.A06, A0s);
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
