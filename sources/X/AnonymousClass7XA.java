package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.7XA  reason: invalid class name */
public final class AnonymousClass7XA implements C147848q1 {
    public C146398mB A00;
    public C146398mB A01;
    public final C121167El A02 = new C121167El();
    public final C146708mj A03 = new AnonymousClass7X9(this);

    public final void AIm(C104136bI r21, C98126Eh r22, float f, float f2, float f3, int i, long j, long j2, long j3, boolean z) {
        long j4 = j2;
        long j5 = j3;
        this.A02.A01.AIl(A01((C104136bI) null, this, r22, f3, 3, j), AnonymousClass7KC.A01(j4), AnonymousClass7KC.A02(j4), C86144wL.A01(j4, j5), C86134wK.A02(j4, j5), f, f2, false);
    }

    public final void AIu(C104136bI r19, C146868n0 r20, C98126Eh r21, float f, int i, int i2, long j, long j2, long j3, long j4) {
        C146868n0 r8 = r20;
        C04220Ms.A0B(r8, 0);
        C146678mg r7 = this.A02.A01;
        C146398mB A022 = A02(r21);
        AnonymousClass7X0 r3 = (AnonymousClass7X0) A022;
        Paint paint = r3.A01;
        float f2 = f;
        if (((float) paint.getAlpha()) / 255.0f != f) {
            A022.Chk(f2);
        }
        A03(r3, r19, A022);
        if (r3.A00 != 3) {
            A022.CiJ(3);
        }
        int i3 = 1;
        if (!paint.isFilterBitmap()) {
            i3 = 0;
        }
        int i4 = i2;
        if (i3 != i4) {
            paint.setFilterBitmap(!AnonymousClass0wJ.A1T(i4, 0));
        }
        r7.AIx(r8, A022, j, j2, j3, j4);
    }

    public final void AJ2(C111366nD r14, C104136bI r15, C29 c29, float f, float f2, int i, int i2, long j, long j2) {
        C04220Ms.A0B(r14, 0);
        C146678mg r7 = this.A02.A01;
        C146398mB r8 = this.A01;
        AnonymousClass7X0 r82 = r8;
        if (r8 == null) {
            AnonymousClass7X0 r83 = new AnonymousClass7X0();
            C86134wK.A12(r83.A01);
            this.A01 = r83;
            r82 = r83;
        }
        r14.A00(r82, f2, BCH());
        AnonymousClass7X0 r1 = (AnonymousClass7X0) r82;
        A03(r1, (C104136bI) null, r82);
        if (r1.A00 != 3) {
            r82.CiJ(3);
        }
        Paint paint = r1.A01;
        float f3 = f;
        if (paint.getStrokeWidth() != f) {
            paint.setStrokeWidth(f3);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (r82.BEW() != 0) {
            paint.setStrokeCap(Paint.Cap.BUTT);
        }
        if (r82.BEX() != 0) {
            r82.CqD(0);
        }
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        r7.AJ4(r82, j, j2);
    }

    public final void AJ3(C104136bI r18, C29 c29, float f, float f2, int i, int i2, long j, long j2, long j3) {
        C146678mg r11 = this.A02.A01;
        C146398mB r12 = this.A01;
        AnonymousClass7X0 r122 = r12;
        if (r12 == null) {
            AnonymousClass7X0 r123 = new AnonymousClass7X0();
            C86134wK.A12(r123.A01);
            this.A01 = r123;
            r122 = r123;
        }
        AnonymousClass7X0 r8 = (AnonymousClass7X0) r122;
        Paint paint = r8.A01;
        long j4 = j;
        if ((((long) paint.getColor()) << 32) != j) {
            r122.CjA(j4);
        }
        if (r8.A02 != null) {
            r8.A02 = null;
            paint.setShader((Shader) null);
        }
        A03(r8, (C104136bI) null, r122);
        if (r8.A00 != 3) {
            r122.CiJ(3);
        }
        float f3 = f;
        if (paint.getStrokeWidth() != f) {
            paint.setStrokeWidth(f3);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (r122.BEW() != 0) {
            paint.setStrokeCap(Paint.Cap.BUTT);
        }
        if (r122.BEX() != 0) {
            r122.CqD(0);
        }
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        r11.AJ4(r122, j2, j3);
    }

    public final void AJ6(C111366nD r9, C104136bI r10, C147018nF r11, C98126Eh r12, float f, int i) {
        AnonymousClass0wJ.A1N(r11, r9);
        this.A02.A01.AJ5(A00(r9, (C104136bI) null, this, r12, f, i), r11);
    }

    public final void AJ7(C104136bI r10, C147018nF r11, C98126Eh r12, float f, int i, long j) {
        this.A02.A01.AJ5(A01((C104136bI) null, this, r12, f, C86144wL.A09(r11), j), r11);
    }

    public final void AJ9(C111366nD r17, C104136bI r18, C98126Eh r19, float f, int i, long j, long j2) {
        C111366nD r4 = r17;
        int A09 = C86144wL.A09(r4);
        long j3 = j;
        long j4 = j2;
        this.A02.A01.AJ8(A00(r4, (C104136bI) null, this, r19, f, A09), AnonymousClass7KC.A01(j3), AnonymousClass7KC.A02(j3), C86144wL.A01(j3, j4), C86134wK.A02(j3, j4));
    }

    public final void AJC(C111366nD r19, C104136bI r20, C98126Eh r21, float f, int i, long j, long j2, long j3) {
        C111366nD r12 = r19;
        int A09 = C86144wL.A09(r12);
        long j4 = j;
        long j5 = j2;
        this.A02.A01.AJB(A00(r12, (C104136bI) null, this, r21, f, A09), AnonymousClass7KC.A01(j4), AnonymousClass7KC.A02(j4), C86144wL.A01(j4, j5), C86134wK.A02(j4, j5), C86104wH.A00(j3), Float.intBitsToFloat(C86104wH.A08(j3)));
    }

    public final /* synthetic */ int CfL(float f) {
        return AnonymousClass7FU.A01(this, f);
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

    private final C146398mB A02(C98126Eh r5) {
        Paint.Cap cap;
        if (r5.equals(C877353x.A00)) {
            C146398mB r2 = this.A00;
            if (r2 != null) {
                return r2;
            }
            AnonymousClass7X0 r22 = new AnonymousClass7X0();
            C86134wK.A13(r22.A01);
            this.A00 = r22;
            return r22;
        } else if (r5 instanceof C877253w) {
            C146398mB r23 = this.A01;
            AnonymousClass7X0 r24 = r23;
            if (r23 == null) {
                AnonymousClass7X0 r25 = new AnonymousClass7X0();
                C86134wK.A12(r25.A01);
                this.A01 = r25;
                r24 = r25;
            }
            Paint paint = ((AnonymousClass7X0) r24).A01;
            float strokeWidth = paint.getStrokeWidth();
            C877253w r52 = (C877253w) r5;
            float f = r52.A01;
            if (strokeWidth != f) {
                paint.setStrokeWidth(f);
            }
            int BEW = r24.BEW();
            int i = r52.A02;
            if (BEW != i) {
                if (i == 2) {
                    cap = Paint.Cap.SQUARE;
                } else if (i == 1) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                paint.setStrokeCap(cap);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f2 = r52.A00;
            if (strokeMiter != f2) {
                paint.setStrokeMiter(f2);
            }
            int BEX = r24.BEX();
            int i2 = r52.A03;
            if (BEX == i2) {
                return r24;
            }
            r24.CqD(i2);
            return r24;
        } else {
            throw AnonymousClass4VZ.A00();
        }
    }

    public static void A03(AnonymousClass7X0 r1, C104136bI r2, C146398mB r3) {
        ColorFilter colorFilter;
        if (!C04220Ms.A0I(r1.A03, r2)) {
            AnonymousClass7X0 r32 = (AnonymousClass7X0) r3;
            r32.A03 = r2;
            Paint paint = r32.A01;
            if (r2 != null) {
                colorFilter = r2.A00;
            } else {
                colorFilter = null;
            }
            paint.setColorFilter(colorFilter);
        }
    }

    public final void AIp(C104136bI r10, C98126Eh r11, float f, float f2, int i, long j, long j2) {
        this.A02.A01.AIo(A01((C104136bI) null, this, r11, 1.0f, i, j), f, j2);
    }

    public final void AIw(C104136bI r9, C146868n0 r10, C98126Eh r11, float f, int i, long j) {
        C104136bI r3 = r9;
        this.A02.A01.AIv(r10, A00((C111366nD) null, r3, this, r11, 1.0f, C86144wL.A09(r10)), j);
    }

    public final void AJA(C104136bI r17, C98126Eh r18, float f, int i, long j, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        this.A02.A01.AJ8(A01(r17, this, r18, f, i, j), AnonymousClass7KC.A01(j4), AnonymousClass7KC.A02(j4), C86144wL.A01(j4, j5), C86134wK.A02(j4, j5));
    }

    public final void AJD(C104136bI r20, C98126Eh r21, float f, int i, long j, long j2, long j3, long j4) {
        long j5 = j2;
        long j6 = j3;
        this.A02.A01.AJB(A01((C104136bI) null, this, r21, 1.0f, 3, j), AnonymousClass7KC.A01(j5), AnonymousClass7KC.A02(j5), C86144wL.A01(j5, j6), C86134wK.A02(j5, j6), C86104wH.A00(j4), Float.intBitsToFloat(C86104wH.A08(j4)));
    }

    public final float Acr() {
        return this.A02.A02.Acr();
    }

    public final C146708mj Ae6() {
        return this.A03;
    }

    public final float AjK() {
        return this.A02.A02.AjK();
    }

    public final AnonymousClass69J getLayoutDirection() {
        return this.A02.A03;
    }

    public static /* synthetic */ C146398mB A00(C111366nD r3, C104136bI r4, AnonymousClass7XA r5, C98126Eh r6, float f, int i) {
        C146398mB A022 = r5.A02(r6);
        if (r3 != null) {
            r3.A00(A022, f, r5.BCH());
        } else if (((float) ((AnonymousClass7X0) A022).A01.getAlpha()) / 255.0f != f) {
            A022.Chk(f);
        }
        AnonymousClass7X0 r1 = (AnonymousClass7X0) A022;
        A03(r1, r4, A022);
        if (r1.A00 != i) {
            A022.CiJ(i);
        }
        Paint paint = r1.A01;
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        return A022;
    }

    public static /* synthetic */ C146398mB A01(C104136bI r6, AnonymousClass7XA r7, C98126Eh r8, float f, int i, long j) {
        C146398mB A022 = r7.A02(r8);
        if (f != 1.0f) {
            j = C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), AnonymousClass7KE.A00(j) * f);
        }
        AnonymousClass7X0 r5 = (AnonymousClass7X0) A022;
        Paint paint = r5.A01;
        if ((((long) paint.getColor()) << 32) != j) {
            A022.CjA(j);
        }
        if (r5.A02 != null) {
            r5.A02 = null;
            paint.setShader((Shader) null);
        }
        A03(r5, r6, A022);
        if (r5.A00 != i) {
            A022.CiJ(i);
        }
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        return A022;
    }

    public final /* synthetic */ long AX0() {
        return AnonymousClass7An.A01(((AnonymousClass7X9) Ae6()).A01.A02.A00);
    }

    public final /* synthetic */ long BCH() {
        return ((AnonymousClass7X9) Ae6()).A01.A02.A00;
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
