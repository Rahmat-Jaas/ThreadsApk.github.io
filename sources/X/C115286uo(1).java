package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6uo  reason: invalid class name and case insensitive filesystem */
public abstract class C115286uo {
    public float A00 = 1.0f;
    public C104136bI A01;
    public C146398mB A02;
    public AnonymousClass69J A03 = AnonymousClass69J.Ltr;
    public boolean A04;
    public final AnonymousClass0YY A05 = C86154wM.A10(this, 24);

    public final long A01() {
        C147368pE r0;
        if (this instanceof AnonymousClass544) {
            C146868n0 r02 = (C146868n0) ((AnonymousClass544) this).A03.getValue();
            if (r02 != null) {
                Bitmap bitmap = ((C31336Gmy) r02).A00;
                return C86104wH.A0C((float) bitmap.getWidth(), (float) bitmap.getHeight());
            }
        } else if (this instanceof C877553z) {
            return ((C877553z) this).A02;
        } else {
            if (this instanceof C877453y) {
                return ((C877453y) this).A01;
            }
            if (!(this instanceof AnonymousClass543)) {
                if (this instanceof AnonymousClass545) {
                    r0 = ((AnonymousClass545) this).A02;
                } else if (this instanceof AnonymousClass540) {
                    r0 = ((AnonymousClass540) this).A05;
                } else if (this instanceof AnonymousClass541) {
                    return ((AnonymousClass541) this).A03;
                } else {
                    return AnonymousClass7FV.A02(((AnonymousClass542) this).A03);
                }
                return ((AnonymousClass7JK) r0.getValue()).A00;
            }
        }
        return AnonymousClass7JK.A01;
    }

    public final void A02(C104136bI r9, C147848q1 r10, float f, long j) {
        ColorFilter colorFilter;
        boolean z = false;
        if (this.A00 != f) {
            if (this instanceof AnonymousClass544) {
                ((AnonymousClass544) this).A00 = f;
            } else if (this instanceof AnonymousClass545) {
                Drawable drawable = ((AnonymousClass545) this).A00;
                int A032 = AnonymousClass8bA.A03(f, (float) 255);
                if (A032 < 0) {
                    A032 = 0;
                } else if (A032 > 255) {
                    A032 = 255;
                }
                drawable.setAlpha(A032);
            } else if (this instanceof AnonymousClass540) {
                ((AnonymousClass540) this).A00 = f;
            } else if (this instanceof AnonymousClass541) {
                ((AnonymousClass541) this).A00 = f;
            } else if (this instanceof AnonymousClass542) {
                ((AnonymousClass542) this).A00 = f;
            } else {
                int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                C146398mB r0 = this.A02;
                if (i == 0) {
                    if (r0 != null) {
                        r0.Chk(f);
                    }
                    this.A04 = false;
                } else {
                    if (r0 == null) {
                        r0 = new AnonymousClass7X0();
                        this.A02 = r0;
                    }
                    r0.Chk(f);
                    this.A04 = true;
                }
            }
            this.A00 = f;
        }
        if (!C04220Ms.A0I(this.A01, r9)) {
            if (this instanceof AnonymousClass544) {
                ((AnonymousClass544) this).A01 = r9;
            } else if (this instanceof AnonymousClass545) {
                Drawable drawable2 = ((AnonymousClass545) this).A00;
                if (r9 != null) {
                    colorFilter = r9.A00;
                } else {
                    colorFilter = null;
                }
                drawable2.setColorFilter(colorFilter);
            } else if (this instanceof AnonymousClass540) {
                ((AnonymousClass540) this).A02 = r9;
            } else if (this instanceof AnonymousClass541) {
                ((AnonymousClass541) this).A01 = r9;
            } else if (this instanceof AnonymousClass542) {
                ((AnonymousClass542) this).A02 = r9;
            } else {
                C146398mB r02 = this.A02;
                if (r9 != null) {
                    if (r02 == null) {
                        r02 = new AnonymousClass7X0();
                        this.A02 = r02;
                    }
                    AnonymousClass7X0 r03 = (AnonymousClass7X0) r02;
                    r03.A03 = r9;
                    r03.A01.setColorFilter(r9.A00);
                    z = true;
                } else if (r02 != null) {
                    AnonymousClass7X0 r04 = (AnonymousClass7X0) r02;
                    r04.A03 = null;
                    r04.A01.setColorFilter((ColorFilter) null);
                }
                this.A04 = z;
            }
            this.A01 = r9;
        }
        AnonymousClass69J layoutDirection = r10.getLayoutDirection();
        if (this.A03 != layoutDirection) {
            if (this instanceof AnonymousClass545) {
                C04220Ms.A0B(layoutDirection, 0);
                int i2 = 0;
                Drawable drawable3 = ((AnonymousClass545) this).A00;
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i2 = 1;
                    } else {
                        throw AnonymousClass4VZ.A00();
                    }
                }
                drawable3.setLayoutDirection(i2);
            }
            this.A03 = layoutDirection;
        }
        long BCH = r10.BCH();
        float A022 = AnonymousClass7JK.A02(BCH) - AnonymousClass7JK.A02(j);
        float A002 = AnonymousClass7JK.A00(BCH) - AnonymousClass7JK.A00(j);
        AnonymousClass7X9 r7 = (AnonymousClass7X9) r10.Ae6();
        C146278lx r4 = r7.A00;
        r4.BQe(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A022, A002);
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && AnonymousClass7JK.A02(j) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && AnonymousClass7JK.A00(j) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            if (this.A04) {
                AnonymousClass7F6 A003 = AnonymousClass6EY.A00(AnonymousClass7KC.A03, C86104wH.A0C(AnonymousClass7JK.A02(j), AnonymousClass7JK.A00(j)));
                C146678mg r1 = r7.A01.A02.A01;
                C146398mB r05 = this.A02;
                if (r05 == null) {
                    r05 = new AnonymousClass7X0();
                    this.A02 = r05;
                }
                try {
                    r1.Cfv(A003, r05);
                    A03(r10);
                } finally {
                    r1.Ces();
                }
            } else {
                A03(r10);
            }
        }
        r4.BQe(-0.0f, -0.0f, -A022, -A002);
    }

    public final void A03(C147848q1 r30) {
        C147848q1 r14 = r30;
        if (this instanceof AnonymousClass544) {
            AnonymousClass544 r4 = (AnonymousClass544) this;
            C04220Ms.A0B(r14, 0);
            C146868n0 r3 = (C146868n0) r4.A03.getValue();
            if (r3 != null) {
                long A012 = AnonymousClass7FV.A01(r14.BCH());
                float f = r4.A00;
                C104136bI r15 = r4.A01;
                long j = C121127Eg.A01;
                Bitmap bitmap = ((C31336Gmy) r3).A00;
                C146868n0 r16 = r3;
                r14.AIu(r15, r16, C877353x.A00, f, 3, 1, j, AnonymousClass7FV.A00(bitmap.getWidth(), bitmap.getHeight()), j, A012);
                return;
            }
            long A0A = C86114wI.A0A(r4.A04);
            C115886w4.A01(r4.A01, r14, r4.A00, A0A);
        } else if (this instanceof C877553z) {
            C877553z r2 = (C877553z) this;
            C04220Ms.A0B(r14, 0);
            long j2 = r2.A01;
            float f2 = r2.A00;
            r14.AIp((C104136bI) null, C877353x.A00, f2, 1.0f, 3, j2, C86104wH.A0C(f2, f2));
        } else if (this instanceof C877453y) {
            C877453y r1 = (C877453y) this;
            C04220Ms.A0B(r14, 0);
            long j3 = r1.A00;
            long A0C = C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            long j4 = r1.A01;
            float f3 = (float) 2;
            r14.AJD((C104136bI) null, C877353x.A00, 1.0f, 3, j3, A0C, j4, C86104wH.A0C(AnonymousClass7JK.A00(j4) / f3, AnonymousClass7JK.A00(j4) / f3));
        } else if (this instanceof AnonymousClass543) {
        } else {
            if (this instanceof AnonymousClass545) {
                AnonymousClass545 r12 = (AnonymousClass545) this;
                C04220Ms.A0B(r14, 0);
                C146678mg A013 = C147848q1.A01(r14);
                C86144wL.A1M(r12.A01.getValue());
                Drawable drawable = r12.A00;
                long BCH = r14.BCH();
                drawable.setBounds(0, 0, AnonymousClass8bA.A02(AnonymousClass7JK.A02(BCH)), AnonymousClass8bA.A02(AnonymousClass7JK.A00(BCH)));
                try {
                    A013.Cfm();
                    drawable.draw(((C123447Wy) A013).A00);
                } finally {
                    A013.Ces();
                }
            } else if (this instanceof AnonymousClass540) {
                AnonymousClass540 r11 = (AnonymousClass540) this;
                C04220Ms.A0B(r14, 0);
                AnonymousClass547 r10 = r11.A06;
                C104136bI r8 = r11.A02;
                if (r8 == null) {
                    r8 = (C104136bI) r10.A05.getValue();
                }
                if (!C86104wH.A1X(r11.A03) || r14.getLayoutDirection() != AnonymousClass69J.Rtl) {
                    r10.A05(r8, r14, r11.A00);
                } else {
                    long AX0 = r14.AX0();
                    C146708mj Ae6 = r14.Ae6();
                    AnonymousClass7X9 r6 = (AnonymousClass7X9) Ae6;
                    C121167El r32 = r6.A01.A02;
                    long A002 = C121167El.A00(r32);
                    r6.A00.Cg3(-1.0f, 1.0f, AX0);
                    r10.A05(r8, r14, r11.A00);
                    C146708mj.A00(r32, Ae6, A002);
                }
                C147368pE r13 = r11.A04;
                if (C86104wH.A1X(r13)) {
                    C147368pE.A04(r13, false);
                }
            } else if (this instanceof AnonymousClass541) {
                AnonymousClass541 r42 = (AnonymousClass541) this;
                C04220Ms.A0B(r14, 0);
                long j5 = r42.A02;
                C115886w4.A01(r42.A01, r14, r42.A00, j5);
            } else {
                AnonymousClass542 r7 = (AnonymousClass542) this;
                C04220Ms.A0B(r14, 0);
                C146868n0 r62 = r7.A06;
                long j6 = r7.A04;
                long j7 = r7.A05;
                long A014 = AnonymousClass7FV.A01(r14.BCH());
                float f4 = r7.A00;
                C146868n0 r162 = r62;
                r14.AIu(r7.A02, r162, C877353x.A00, f4, 3, r7.A01, j6, j7, C121127Eg.A01, A014);
            }
        }
    }
}
