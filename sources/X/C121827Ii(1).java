package X;

import android.content.ClipDescription;
import android.view.ActionMode;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxDObserverShape844S0100000_2_I2;
import kotlin.jvm.internal.KtLambdaShape20S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape21S0100000_I2_1;

/* renamed from: X.7Ii  reason: invalid class name and case insensitive filesystem */
public final class C121827Ii {
    public long A00;
    public long A01;
    public C113196qu A02;
    public AnonymousClass77X A03;
    public C142938fq A04;
    public C143038g0 A05;
    public C143048g1 A06;
    public C146978nB A07;
    public AnonymousClass7HD A08;
    public C146898n3 A09;
    public Integer A0A;
    public AnonymousClass0YY A0B;
    public final C146388mA A0C;
    public final C141698co A0D;
    public final C147368pE A0E;
    public final C147368pE A0F;
    public final C147368pE A0G;
    public final C147368pE A0H;
    public final AnonymousClass788 A0I;

    public static final void A01(C146848mx r14, C121827Ii r15, AnonymousClass7HD r16, int i, int i2, boolean z) {
        AnonymousClass7AW r12;
        long A002;
        C121457Gf A003;
        C121827Ii r3 = r15;
        C146978nB r11 = r15.A07;
        AnonymousClass7HD r6 = r16;
        long j = r6.A00;
        long A004 = AnonymousClass6FM.A00(r11.CVm((int) (j >> 32)), r11.CVm((int) (j & 4294967295L)));
        C113196qu r2 = r15.A02;
        C121767Ia r13 = null;
        if (r2 == null || (A003 = C147368pE.A00(r2)) == null) {
            r12 = null;
        } else {
            r12 = A003.A02;
        }
        if (!C121767Ia.A02(A004)) {
            r13 = new C121767Ia(A004);
        }
        if (r12 != null) {
            A002 = AnonymousClass6FM.A00(i, i2);
            C146848mx r112 = r14;
            if (r13 != null || !r14.equals(AnonymousClass74R.A00)) {
                A002 = r112.A82(r12, r13, -1, A002, z);
            }
        } else {
            A002 = AnonymousClass6FM.A00(0, 0);
        }
        C146978nB r7 = r3.A07;
        long A005 = AnonymousClass6FM.A00(r7.D7e((int) (A002 >> 32)), r7.D7e((int) (A002 & 4294967295L)));
        if (A005 != j) {
            C142938fq r1 = r3.A04;
            if (r1 != null) {
                r1.CWa(9);
            }
            r3.A0B.invoke(new AnonymousClass7HD(r6.A01, (C121767Ia) null, A005));
            C113196qu r22 = r3.A02;
            if (r22 != null) {
                C147368pE.A04(r22.A0E, C115786vu.A01(r3, true));
            }
            C113196qu r23 = r3.A02;
            if (r23 != null) {
                C147368pE.A04(r23.A0D, C115786vu.A01(r3, false));
            }
        }
    }

    public static final void A00(AnonymousClass679 r2, C121827Ii r3) {
        C113196qu r1 = r3.A02;
        if (r1 != null) {
            C04220Ms.A0B(r2, 0);
            r1.A08.CrC(r2);
        }
    }

    public static void A02(C121827Ii r5, C81784oM r6) {
        C143038g0 r52 = r5.A05;
        if (r52 != null) {
            AnonymousClass7HD r1 = (AnonymousClass7HD) r6.getValue();
            C04220Ms.A0B(r1, 0);
            C134747yH r4 = r1.A01;
            long j = r1.A00;
            r52.CqS(r4.subSequence(C121767Ia.A01(j), C121767Ia.A00(j)));
        }
    }

    public final long A03(boolean z) {
        long j;
        C121457Gf r0;
        C147368pE r6 = this.A0H;
        long A002 = AnonymousClass7HD.A00(r6);
        if (z) {
            j = A002 >> 32;
        } else {
            j = A002 & 4294967295L;
        }
        int i = (int) j;
        C113196qu r02 = this.A02;
        if (r02 != null) {
            r0 = C147368pE.A00(r02);
        } else {
            r0 = null;
        }
        C04220Ms.A0A(r0);
        AnonymousClass7AW r5 = r0.A02;
        int CVm = this.A07.CVm(i);
        long A003 = AnonymousClass7HD.A00(r6);
        return C86104wH.A0C(AnonymousClass6EA.A00(r5, CVm, z, C86134wK.A1X(C86104wH.A07(A003), C86104wH.A08(A003))), r5.A01(r5.A04(CVm)));
    }

    public final void A04() {
        C147368pE r3 = this.A0H;
        if (!C121767Ia.A02(AnonymousClass7HD.A00(r3))) {
            A02(this, r3);
            C134747yH A062 = C134747yH.A03(C86154wM.A0I(r3), C134747yH.A01(r3)).A06(AnonymousClass6FW.A00(C86154wM.A0I(r3), C134747yH.A01(r3)));
            int A012 = C121767Ia.A01(AnonymousClass7HD.A00(r3));
            this.A0B.invoke(new AnonymousClass7HD(A062, (C121767Ia) null, AnonymousClass6FM.A00(A012, A012)));
            A00(AnonymousClass679.None, this);
            AnonymousClass788 r1 = this.A0I;
            if (r1 != null) {
                r1.A04 = true;
            }
        }
    }

    public final void A05() {
        AnonymousClass77X r1;
        C113196qu r0 = this.A02;
        if (!(r0 == null || C86104wH.A1X(r0.A09) || (r1 = this.A03) == null)) {
            r1.A00(AnonymousClass8LW.A00);
        }
        this.A08 = C86154wM.A0I(this.A0H);
        C113196qu r12 = this.A02;
        if (r12 != null) {
            r12.A06 = true;
        }
        A00(AnonymousClass679.Selection, this);
    }

    public final void A06() {
        Integer num;
        C143048g1 r2 = this.A06;
        if (r2 != null) {
            num = ((AnonymousClass7YX) r2).A01;
        } else {
            num = null;
        }
        if (num == AnonymousClass006.A00 && r2 != null) {
            AnonymousClass7YX r22 = (AnonymousClass7YX) r2;
            r22.A01 = AnonymousClass006.A01;
            ActionMode actionMode = r22.A00;
            if (actionMode != null) {
                actionMode.finish();
            }
            r22.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014b, code lost:
        if (r1 != 1) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0175, code lost:
        if (r0 != 2) goto L_0x0177;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r48 = this;
            r11 = r48
            X.8g0 r0 = r11.A05
            if (r0 == 0) goto L_0x007b
            X.7YS r0 = (X.AnonymousClass7YS) r0
            android.content.ClipboardManager r0 = r0.A00
            android.content.ClipData r1 = r0.getPrimaryClip()
            if (r1 == 0) goto L_0x007b
            int r0 = r1.getItemCount()
            if (r0 <= 0) goto L_0x007b
            r2 = 0
            android.content.ClipData$Item r0 = r1.getItemAt(r2)
            if (r0 == 0) goto L_0x007b
            java.lang.CharSequence r13 = r0.getText()
            if (r13 == 0) goto L_0x007b
            boolean r0 = r13 instanceof android.text.Spanned
            if (r0 != 0) goto L_0x007c
            java.lang.String r1 = r13.toString()
            r5 = 0
            r0 = 6
            X.7yH r3 = new X.7yH
            r3.<init>(r5, r0, r1)
        L_0x0032:
            X.8pE r6 = r11.A0H
            X.7HD r1 = X.C86154wM.A0I(r6)
            int r0 = X.C134747yH.A01(r6)
            X.7yH r0 = X.C134747yH.A03(r1, r0)
            X.7yH r2 = r0.A06(r3)
            X.7HD r1 = X.C86154wM.A0I(r6)
            int r0 = X.C134747yH.A01(r6)
            X.7yH r0 = X.AnonymousClass6FW.A00(r1, r0)
            X.7yH r4 = r2.A06(r0)
            long r0 = X.AnonymousClass7HD.A00(r6)
            int r1 = X.C121767Ia.A01(r0)
            int r0 = r3.length()
            int r1 = r1 + r0
            long r2 = X.AnonymousClass6FM.A00(r1, r1)
            X.7HD r1 = new X.7HD
            r1.<init>((X.C134747yH) r4, (X.C121767Ia) r5, (long) r2)
            X.0YY r0 = r11.A0B
            r0.invoke(r1)
            X.679 r0 = X.AnonymousClass679.None
            A00(r0, r11)
            X.788 r1 = r11.A0I
            if (r1 == 0) goto L_0x007b
            r0 = 1
            r1.A04 = r0
        L_0x007b:
            return
        L_0x007c:
            r12 = r13
            android.text.Spanned r12 = (android.text.Spanned) r12
            int r1 = r13.length()
            java.lang.Class<android.text.Annotation> r0 = android.text.Annotation.class
            r9 = 0
            java.lang.Object[] r8 = r12.getSpans(r2, r1, r0)
            android.text.Annotation[] r8 = (android.text.Annotation[]) r8
            java.util.ArrayList r27 = X.AnonymousClass0wJ.A0v()
            X.C04220Ms.A04(r8)
            int r0 = r8.length
            int r15 = r0 + -1
            if (r15 < 0) goto L_0x029e
        L_0x0098:
            r3 = r8[r9]
            java.lang.String r1 = r3.getKey()
            java.lang.String r0 = "androidx.compose.text.SpanStyle"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0298
            int r26 = r12.getSpanStart(r3)
            int r25 = r12.getSpanEnd(r3)
            java.lang.String r0 = r3.getValue()
            X.C04220Ms.A06(r0)
            r30 = 0
            android.os.Parcel r14 = android.os.Parcel.obtain()
            X.C04220Ms.A06(r14)
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            r14.unmarshall(r1, r2, r0)
            r14.setDataPosition(r2)
            long r22 = X.AnonymousClass7KE.A06
            long r20 = X.AnonymousClass7HC.A01
            r42 = r20
            r24 = r30
            r19 = r30
            r18 = r30
            r41 = r30
            r44 = r20
            r17 = r30
            r16 = r30
            r46 = r22
            r7 = r30
            r29 = r7
        L_0x00e3:
            int r0 = r14.dataAvail()
            r6 = 1
            if (r0 <= r6) goto L_0x0272
            byte r5 = r14.readByte()
            r4 = 8
            if (r5 != r6) goto L_0x00fd
            int r0 = r14.dataAvail()
            if (r0 < r4) goto L_0x0272
            long r22 = r14.readLong()
            goto L_0x00e3
        L_0x00fd:
            r3 = 2
            r1 = 5
            if (r5 != r3) goto L_0x0126
            int r0 = r14.dataAvail()
            if (r0 < r1) goto L_0x0272
            byte r0 = r14.readByte()
            if (r0 != r6) goto L_0x011b
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
        L_0x0112:
            float r3 = r14.readFloat()
            long r42 = X.AnonymousClass7Hi.A02(r3, r0)
            goto L_0x00e3
        L_0x011b:
            if (r0 != r3) goto L_0x0123
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0112
        L_0x0123:
            r42 = r20
            goto L_0x00e3
        L_0x0126:
            r10 = 3
            r0 = 4
            if (r5 != r10) goto L_0x013c
            int r1 = r14.dataAvail()
            if (r1 < r0) goto L_0x0272
            int r1 = r14.readInt()
            X.7yQ r24 = new X.7yQ
            r0 = r24
            r0.<init>(r1)
            goto L_0x00e3
        L_0x013c:
            if (r5 != r0) goto L_0x0156
            int r0 = r14.dataAvail()
            if (r0 < r6) goto L_0x0272
            byte r1 = r14.readByte()
            if (r1 == 0) goto L_0x014d
            r0 = 1
            if (r1 == r6) goto L_0x014e
        L_0x014d:
            r0 = 0
        L_0x014e:
            X.6su r19 = new X.6su
            r1 = r19
            r1.<init>(r0)
            goto L_0x00e3
        L_0x0156:
            if (r5 != r1) goto L_0x0179
            int r0 = r14.dataAvail()
            if (r0 < r6) goto L_0x0272
            byte r0 = r14.readByte()
            if (r0 == 0) goto L_0x0177
            if (r0 != r6) goto L_0x0170
            r1 = 1
        L_0x0167:
            X.6sv r18 = new X.6sv
            r0 = r18
            r0.<init>(r1)
            goto L_0x00e3
        L_0x0170:
            if (r0 != r10) goto L_0x0174
            r1 = 3
            goto L_0x0167
        L_0x0174:
            r1 = 2
            if (r0 == r3) goto L_0x0167
        L_0x0177:
            r1 = 0
            goto L_0x0167
        L_0x0179:
            r10 = 6
            if (r5 != r10) goto L_0x0182
            java.lang.String r41 = r14.readString()
            goto L_0x00e3
        L_0x0182:
            r10 = 7
            if (r5 != r10) goto L_0x01ac
            int r0 = r14.dataAvail()
            if (r0 < r1) goto L_0x0272
            byte r0 = r14.readByte()
            if (r0 != r6) goto L_0x01a0
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
        L_0x0196:
            float r3 = r14.readFloat()
            long r44 = X.AnonymousClass7Hi.A02(r3, r0)
            goto L_0x00e3
        L_0x01a0:
            if (r0 != r3) goto L_0x01a8
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0196
        L_0x01a8:
            r44 = r20
            goto L_0x00e3
        L_0x01ac:
            if (r5 != r4) goto L_0x01c1
            int r1 = r14.dataAvail()
            if (r1 < r0) goto L_0x0272
            float r1 = r14.readFloat()
            X.6sx r17 = new X.6sx
            r0 = r17
            r0.<init>(r1)
            goto L_0x00e3
        L_0x01c1:
            r1 = 9
            if (r5 != r1) goto L_0x01dc
            int r0 = r14.dataAvail()
            if (r0 < r4) goto L_0x0272
            float r3 = r14.readFloat()
            float r1 = r14.readFloat()
            X.7Ei r16 = new X.7Ei
            r0 = r16
            r0.<init>(r3, r1)
            goto L_0x00e3
        L_0x01dc:
            r1 = 10
            if (r5 != r1) goto L_0x01ec
            int r0 = r14.dataAvail()
            if (r0 < r4) goto L_0x0272
            long r46 = r14.readLong()
            goto L_0x00e3
        L_0x01ec:
            r1 = 11
            if (r5 != r1) goto L_0x0249
            int r1 = r14.dataAvail()
            if (r1 < r0) goto L_0x0272
            int r1 = r14.readInt()
            X.79I r7 = X.AnonymousClass79I.A01
            r0 = r1 & 2
            boolean r3 = X.C18180wK.A1V(r0)
            X.79I r0 = X.AnonymousClass79I.A03
            r1 = r1 & 1
            boolean r1 = X.C18180wK.A1V(r1)
            if (r3 == 0) goto L_0x0240
            if (r1 == 0) goto L_0x00e3
            X.79I[] r0 = new X.AnonymousClass79I[]{r7, r0}
            java.util.List r4 = X.C06750aI.A17(r0)
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            int r1 = r4.size()
        L_0x021f:
            if (r3 >= r1) goto L_0x0235
            java.lang.Object r0 = r4.get(r3)
            X.79I r0 = (X.AnonymousClass79I) r0
            int r5 = r5.intValue()
            int r0 = r0.A00
            r5 = r5 | r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r3 = r3 + 1
            goto L_0x021f
        L_0x0235:
            int r0 = r5.intValue()
            X.79I r7 = new X.79I
            r7.<init>(r0)
            goto L_0x00e3
        L_0x0240:
            if (r1 == 0) goto L_0x0245
            r7 = r0
            goto L_0x00e3
        L_0x0245:
            X.79I r7 = X.AnonymousClass79I.A02
            goto L_0x00e3
        L_0x0249:
            r0 = 12
            if (r5 != r0) goto L_0x00e3
            int r1 = r14.dataAvail()
            r0 = 20
            if (r1 < r0) goto L_0x0272
            long r33 = r14.readLong()
            float r1 = r14.readFloat()
            float r0 = r14.readFloat()
            long r35 = X.C86104wH.A0C(r1, r0)
            float r32 = r14.readFloat()
            X.79b r29 = new X.79b
            r31 = r29
            r31.<init>(r32, r33, r35)
            goto L_0x00e3
        L_0x0272:
            X.8nH r39 = X.AnonymousClass7CC.A00(r22)
            X.7F0 r0 = new X.7F0
            r28 = r0
            r31 = r30
            r32 = r30
            r33 = r19
            r34 = r18
            r35 = r24
            r36 = r30
            r37 = r17
            r38 = r7
            r40 = r16
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r46)
            r4 = r26
            r3 = r27
            r1 = r25
            X.AnonymousClass7HE.A01(r0, r3, r4, r1)
        L_0x0298:
            if (r9 == r15) goto L_0x029e
            int r9 = r9 + 1
            goto L_0x0098
        L_0x029e:
            java.lang.String r2 = r13.toString()
            r5 = 0
            r1 = 4
            X.7yH r3 = new X.7yH
            r0 = r27
            r3.<init>(r0, r1, r2)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121827Ii.A07():void");
    }

    public final void A08() {
        KtLambdaShape20S0100000_I2 ktLambdaShape20S0100000_I2;
        KtLambdaShape20S0100000_I2 ktLambdaShape20S0100000_I22;
        KtLambdaShape21S0100000_I2_1 ktLambdaShape21S0100000_I2_1;
        AnonymousClass7F6 r13;
        long j;
        long j2;
        float f;
        C146508mM r6;
        float f2;
        C146508mM r7;
        float f3;
        C146508mM r72;
        C146508mM r2;
        C143038g0 r0;
        ClipDescription primaryClipDescription;
        boolean z = this.A09 instanceof AnonymousClass7Z8;
        C147368pE r5 = this.A0H;
        KtLambdaShape21S0100000_I2_1 ktLambdaShape21S0100000_I2_12 = null;
        if (C121767Ia.A02(AnonymousClass7HD.A00(r5)) || z) {
            ktLambdaShape20S0100000_I2 = null;
        } else {
            ktLambdaShape20S0100000_I2 = C86154wM.A12(this, 48);
        }
        if (C121767Ia.A02(AnonymousClass7HD.A00(r5)) || !C86104wH.A1X(this.A0G) || z) {
            ktLambdaShape20S0100000_I22 = null;
        } else {
            ktLambdaShape20S0100000_I22 = C86154wM.A12(this, 49);
        }
        if (!C86104wH.A1X(this.A0G) || (r0 = this.A05) == null || (primaryClipDescription = ((AnonymousClass7YS) r0).A00.getPrimaryClipDescription()) == null || !primaryClipDescription.hasMimeType("text/*")) {
            ktLambdaShape21S0100000_I2_1 = null;
        } else {
            ktLambdaShape21S0100000_I2_1 = C86154wM.A13(this, 0);
        }
        long A002 = AnonymousClass7HD.A00(r5);
        if (C121767Ia.A00(A002) - C121767Ia.A01(A002) != C134747yH.A01(r5)) {
            ktLambdaShape21S0100000_I2_12 = C86154wM.A13(this, 1);
        }
        C143048g1 r12 = this.A06;
        if (r12 != null) {
            C113196qu r4 = this.A02;
            if (r4 == null || !(!r4.A05)) {
                r13 = AnonymousClass7F6.A04;
            } else {
                int CVm = this.A07.CVm(C86104wH.A07(AnonymousClass7HD.A00(r5)));
                int CVm2 = this.A07.CVm(C86104wH.A08(AnonymousClass7HD.A00(r5)));
                C113196qu r02 = this.A02;
                if (r02 == null || (r2 = r02.A01) == null) {
                    j = AnonymousClass7KC.A03;
                } else {
                    j = r2.Bb0(A03(true));
                }
                C113196qu r03 = this.A02;
                if (r03 == null || (r72 = r03.A01) == null) {
                    j2 = AnonymousClass7KC.A03;
                } else {
                    j2 = r72.Bb0(A03(false));
                }
                C113196qu r04 = this.A02;
                float f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (r04 == null || (r7 = r04.A01) == null) {
                    f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                } else {
                    C121457Gf A003 = C147368pE.A00(r4);
                    if (A003 != null) {
                        f3 = A003.A02.A0A(CVm).A03;
                    } else {
                        f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    }
                    f = AnonymousClass7KC.A02(r7.Bb0(C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f3)));
                }
                C113196qu r05 = this.A02;
                if (!(r05 == null || (r6 = r05.A01) == null)) {
                    C121457Gf A004 = C147368pE.A00(r4);
                    if (A004 != null) {
                        f2 = A004.A02.A0A(CVm2).A03;
                    } else {
                        f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    }
                    f4 = AnonymousClass7KC.A02(r6.Bb0(C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2)));
                }
                r13 = new AnonymousClass7F6(Math.min(AnonymousClass7KC.A01(j), AnonymousClass7KC.A01(j2)), Math.min(f, f4), Math.max(AnonymousClass7KC.A01(j), AnonymousClass7KC.A01(j2)), Math.max(AnonymousClass7KC.A02(j), AnonymousClass7KC.A02(j2)) + (((float) 25) * r4.A00.A08.Acr()));
            }
            r12.Ctn(r13, ktLambdaShape20S0100000_I2, ktLambdaShape21S0100000_I2_1, ktLambdaShape20S0100000_I22, ktLambdaShape21S0100000_I2_12);
        }
    }

    public final void A09(AnonymousClass7KC r8) {
        AnonymousClass679 r0;
        C121457Gf r3;
        int A002;
        C147368pE r6 = this.A0H;
        if (!C121767Ia.A02(AnonymousClass7HD.A00(r6))) {
            C113196qu r02 = this.A02;
            if (r02 != null) {
                r3 = C147368pE.A00(r02);
            } else {
                r3 = null;
            }
            if (r8 == null || r3 == null) {
                A002 = C121767Ia.A00(AnonymousClass7HD.A00(r6));
            } else {
                A002 = this.A07.D7e(C121457Gf.A00(r3, C121457Gf.A01(r3, r8.A00)));
            }
            AnonymousClass7HD A0I2 = C86154wM.A0I(r6);
            long A003 = AnonymousClass6FM.A00(A002, A002);
            C134747yH r5 = A0I2.A01;
            C121767Ia r4 = A0I2.A02;
            C04220Ms.A0B(r5, 0);
            this.A0B.invoke(new AnonymousClass7HD(r5, r4, A003));
        }
        if (r8 == null || C134747yH.A01(r6) <= 0) {
            r0 = AnonymousClass679.None;
        } else {
            r0 = AnonymousClass679.Cursor;
        }
        A00(r0, this);
        A06();
    }

    public final void A0A(boolean z) {
        C147368pE r2 = this.A0H;
        if (!C121767Ia.A02(AnonymousClass7HD.A00(r2))) {
            A02(this, r2);
            if (z) {
                int A002 = C121767Ia.A00(AnonymousClass7HD.A00(r2));
                this.A0B.invoke(new AnonymousClass7HD(C86154wM.A0I(r2).A01, (C121767Ia) null, AnonymousClass6FM.A00(A002, A002)));
                A00(AnonymousClass679.None, this);
            }
        }
    }

    public C121827Ii(AnonymousClass788 r11) {
        this.A0I = r11;
        this.A07 = AnonymousClass6WW.A00;
        this.A0B = C77864hV.A00;
        AnonymousClass7HD r0 = new AnonymousClass7HD((String) null, 7, 0);
        AnonymousClass7WR r9 = AnonymousClass7WR.A00;
        this.A0H = C86104wH.A0I(r9, r0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A09 = C1191673u.A00;
        this.A0G = C86104wH.A0I(r9, true, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        long j = AnonymousClass7KC.A03;
        this.A00 = j;
        this.A01 = j;
        this.A0F = C86104wH.A0I(r9, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0E = C86104wH.A0I(r9, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A08 = new AnonymousClass7HD((String) null, 7, 0);
        this.A0C = new IDxDObserverShape844S0100000_2_I2(this, 1);
        this.A0D = new C123187Vt(this);
    }

    public C121827Ii() {
        this((AnonymousClass788) null);
    }
}
