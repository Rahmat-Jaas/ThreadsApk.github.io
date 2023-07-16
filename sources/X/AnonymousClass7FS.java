package X;

import android.content.res.TypedArray;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.AbstractList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.7FS  reason: invalid class name */
public final class AnonymousClass7FS {
    public static float A00(TypedArray typedArray, String str, XmlPullParser xmlPullParser, int i) {
        if (!C37236Jn2.A03(str, xmlPullParser)) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return typedArray.getFloat(i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public static float A01(TypedArray typedArray, String str, XmlPullParser xmlPullParser, int i) {
        if (!C37236Jn2.A03(str, xmlPullParser)) {
            return 1.0f;
        }
        return typedArray.getFloat(i, 1.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01b9 A[LOOP:2: B:52:0x01b3->B:54:0x01b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C115286uo A02(X.C147188nY r50, int r51) {
        /*
            r0 = 473971343(0x1c403a8f, float:6.3603156E-22)
            r6 = r50
            r6.Cvb(r0)
            android.content.Context r10 = X.C147188nY.A0T(r6)
            r3 = 0
            X.534 r0 = X.AnonymousClass7DA.A00
            r6.AEA(r0)
            android.content.Context r0 = X.C147188nY.A0T(r6)
            android.content.res.Resources r7 = r0.getResources()
            X.C04220Ms.A06(r7)
            X.7W3 r5 = X.C147188nY.A0Y(r6)
            java.lang.Object r1 = r5.A13()
            java.lang.Object r26 = X.AnonymousClass7GN.A00
            r0 = r26
            if (r1 != r0) goto L_0x0033
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r5.A14(r1)
        L_0x0033:
            X.AnonymousClass7W3.A0w(r5, r3)
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            r4 = 1
            r2 = r51
            r7.getValue(r2, r1, r4)
            java.lang.CharSequence r8 = r1.string
            if (r8 == 0) goto L_0x0562
            java.lang.String r9 = ".xml"
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x00ad
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            X.C04220Ms.A0B(r0, r3)
            boolean r0 = r0.endsWith(r9)
        L_0x0052:
            if (r0 != r4) goto L_0x0562
            r0 = -738265327(0xffffffffd3fef711, float:-2.19013356E12)
            r6.Cvb(r0)
            android.content.res.Resources$Theme r11 = r10.getTheme()
            X.C04220Ms.A06(r11)
            int r0 = r1.changingConfigurations
            r51 = r0
            r0 = 21855625(0x14d7d89, float:3.774262E-38)
            r6.Cvb(r0)
            X.534 r0 = X.AnonymousClass7DA.A02
            java.lang.Object r1 = r6.AEA(r0)
            X.6bO r1 = (X.C104196bO) r1
            X.6tU r25 = new X.6tU
            r0 = r25
            r0.<init>(r11, r2)
            java.util.HashMap r0 = r1.A00
            r50 = r0
            r1 = r0
            r0 = r25
            java.lang.Object r0 = r1.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0091
            java.lang.Object r8 = r0.get()
            X.6tT r8 = (X.C114546tT) r8
            if (r8 != 0) goto L_0x04aa
        L_0x0091:
            android.content.res.XmlResourceParser r2 = r7.getXml(r2)
            X.C04220Ms.A06(r2)
        L_0x0098:
            int r0 = r2.next()
            r9 = 2
            if (r0 == r9) goto L_0x00c4
            if (r0 != r4) goto L_0x0098
            r0 = 174(0xae, float:2.44E-43)
            java.lang.String r1 = X.I17.A00(r0)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x00ad:
            int r13 = r8.length()
            int r0 = r9.length()
            int r13 = r13 - r0
            int r15 = r9.length()
            r11 = r8
            r12 = r9
            r14 = r3
            r16 = r3
            boolean r0 = X.AnonymousClass8bP.A0i(r11, r12, r13, r14, r15, r16)
            goto L_0x0052
        L_0x00c4:
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = "vector"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0484
            android.util.AttributeSet r24 = android.util.Xml.asAttributeSet(r2)
            X.C04220Ms.A06(r24)
            r14 = 3
            int[] r1 = X.C103666aW.A03
            r0 = r24
            android.content.res.TypedArray r8 = r11.obtainStyledAttributes(r0, r1, r3, r3)
            X.C04220Ms.A06(r8)
            r8.getChangingConfigurations()
            r0 = 794(0x31a, float:1.113E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r23 = 5
            boolean r0 = X.C37236Jn2.A03(r0, r2)
            if (r0 != 0) goto L_0x0455
            r49 = 0
        L_0x00f6:
            r8.getChangingConfigurations()
            java.lang.String r1 = "viewportWidth"
            r12 = 0
            r0 = 7
            float r44 = A00(r8, r1, r2, r0)
            r8.getChangingConfigurations()
            java.lang.String r1 = "viewportHeight"
            r0 = 8
            float r45 = A00(r8, r1, r2, r0)
            r8.getChangingConfigurations()
            int r0 = (r44 > r12 ? 1 : (r44 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0474
            int r0 = (r45 > r12 ? 1 : (r45 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0464
            float r42 = r8.getDimension(r14, r12)
            r8.getChangingConfigurations()
            float r43 = r8.getDimension(r9, r12)
            r8.getChangingConfigurations()
            boolean r0 = r8.hasValue(r4)
            if (r0 == 0) goto L_0x0451
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r8.getValue(r4, r0)
            int r0 = r0.type
            if (r0 == r9) goto L_0x0451
            android.content.res.ColorStateList r0 = X.C37236Jn2.A01(r11, r8, r2)
            r8.getChangingConfigurations()
            if (r0 == 0) goto L_0x0451
            int r0 = r0.getDefaultColor()
            long r0 = (long) r0
            r15 = r0
            r0 = 32
            long r15 = r15 << r0
        L_0x0149:
            r1 = 6
            r22 = -1
            r0 = r22
            int r1 = r8.getInt(r1, r0)
            r8.getChangingConfigurations()
            if (r1 == r0) goto L_0x0164
            if (r1 == r14) goto L_0x044d
            r0 = r23
            if (r1 == r0) goto L_0x0164
            r0 = 9
            if (r1 == r0) goto L_0x0449
            switch(r1) {
                case 14: goto L_0x0445;
                case 15: goto L_0x0441;
                case 16: goto L_0x043d;
                default: goto L_0x0164;
            }
        L_0x0164:
            r46 = 5
        L_0x0166:
            android.util.DisplayMetrics r0 = r7.getDisplayMetrics()
            float r0 = r0.density
            float r42 = r42 / r0
            android.util.DisplayMetrics r0 = r7.getDisplayMetrics()
            float r0 = r0.density
            float r43 = r43 / r0
            r8.recycle()
            r28 = 0
            java.util.ArrayList r21 = X.AnonymousClass0wJ.A0v()
            r37 = 1023(0x3ff, float:1.434E-42)
            X.76y r20 = new X.76y
            r27 = r20
            r29 = r28
            r30 = r12
            r31 = r12
            r32 = r12
            r33 = r12
            r34 = r12
            r35 = r12
            r36 = r12
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1 = r21
            r0 = r20
            r1.add(r0)
            r19 = 0
        L_0x01a1:
            int r0 = r2.getEventType()
            if (r0 == r4) goto L_0x01b3
            int r0 = r2.getDepth()
            if (r0 >= r4) goto L_0x01bd
            int r0 = r2.getEventType()
            if (r0 != r14) goto L_0x01bd
        L_0x01b3:
            int r0 = r21.size()
            if (r0 <= r4) goto L_0x048b
            A03(r21)
            goto L_0x01b3
        L_0x01bd:
            int r0 = r2.getEventType()
            java.lang.String r7 = "group"
            if (r0 == r9) goto L_0x01dc
            if (r0 != r14) goto L_0x0438
            java.lang.String r0 = r2.getName()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0438
            int r1 = r19 + 1
            r0 = 0
        L_0x01d4:
            if (r0 >= r1) goto L_0x0436
            A03(r21)
            int r0 = r0 + 1
            goto L_0x01d4
        L_0x01dc:
            java.lang.String r1 = r2.getName()
            if (r1 == 0) goto L_0x0438
            int r0 = r1.hashCode()
            r8 = -1649314686(0xffffffff9db17482, float:-4.6971976E-21)
            if (r0 == r8) goto L_0x03d2
            r8 = 3433509(0x346425, float:4.811371E-39)
            if (r0 == r8) goto L_0x026e
            r8 = 98629247(0x5e0f67f, float:2.1155407E-35)
            if (r0 != r8) goto L_0x0438
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x0438
            int[] r1 = X.C103666aW.A01
            r0 = r24
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r0, r1, r3, r3)
            X.C04220Ms.A06(r0)
            r0.getChangingConfigurations()
            java.lang.String r7 = "rotation"
            r1 = r23
            float r30 = A00(r0, r7, r2, r1)
            r0.getChangingConfigurations()
            float r31 = r0.getFloat(r4, r12)
            r0.getChangingConfigurations()
            float r32 = r0.getFloat(r9, r12)
            r0.getChangingConfigurations()
            java.lang.String r1 = "scaleX"
            float r33 = A01(r0, r1, r2, r14)
            r0.getChangingConfigurations()
            java.lang.String r7 = "scaleY"
            r1 = 4
            float r34 = A01(r0, r7, r2, r1)
            r0.getChangingConfigurations()
            java.lang.String r7 = "translateX"
            r1 = 6
            float r35 = A00(r0, r7, r2, r1)
            r0.getChangingConfigurations()
            java.lang.String r7 = "translateY"
            r1 = 7
            float r36 = A00(r0, r7, r2, r1)
            r0.getChangingConfigurations()
            java.lang.String r1 = r0.getString(r3)
            r0.getChangingConfigurations()
            if (r1 != 0) goto L_0x0254
            java.lang.String r1 = ""
        L_0x0254:
            r0.recycle()
            java.util.List r29 = X.C102766Wl.A00
            X.C04220Ms.A0B(r1, r3)
            r37 = 512(0x200, float:7.175E-43)
            X.76y r0 = new X.76y
            r27 = r0
            r28 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1 = r21
            r1.add(r0)
            goto L_0x0438
        L_0x026e:
            java.lang.String r0 = "path"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0438
            int[] r1 = X.C103666aW.A02
            r0 = r24
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r0, r1, r3, r3)
            X.C04220Ms.A06(r0)
            r0.getChangingConfigurations()
            java.lang.String r1 = "pathData"
            boolean r1 = X.C37236Jn2.A03(r1, r2)
            if (r1 == 0) goto L_0x045d
            java.lang.String r13 = r0.getString(r3)
            r0.getChangingConfigurations()
            if (r13 != 0) goto L_0x0297
            java.lang.String r13 = ""
        L_0x0297:
            java.lang.String r7 = r0.getString(r9)
            r0.getChangingConfigurations()
            if (r7 != 0) goto L_0x03c4
            java.util.List r18 = X.C102766Wl.A00
        L_0x02a2:
            java.lang.String r1 = "fillColor"
            X.6ic r10 = X.C37236Jn2.A02(r11, r0, r1, r2, r4)
            r0.getChangingConfigurations()
            java.lang.String r7 = "fillAlpha"
            r1 = 12
            float r32 = A01(r0, r7, r2, r1)
            r0.getChangingConfigurations()
            java.lang.String r1 = "strokeLineCap"
            r7 = 8
            boolean r1 = X.C37236Jn2.A03(r1, r2)
            if (r1 != 0) goto L_0x03bc
            r1 = -1
        L_0x02c1:
            r0.getChangingConfigurations()
            r40 = 0
            if (r1 == 0) goto L_0x02ce
            if (r1 == r4) goto L_0x03b8
            if (r1 != r9) goto L_0x02ce
            r40 = 2
        L_0x02ce:
            java.lang.String r1 = "strokeLineJoin"
            r7 = 9
            boolean r1 = X.C37236Jn2.A03(r1, r2)
            if (r1 != 0) goto L_0x03b0
            r1 = -1
        L_0x02d9:
            r0.getChangingConfigurations()
            r41 = 2
            if (r1 == 0) goto L_0x03ac
            if (r1 != r4) goto L_0x02e4
            r41 = 1
        L_0x02e4:
            r1 = 1137(0x471, float:1.593E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r1)
            r1 = 10
            float r35 = A01(r0, r7, r2, r1)
            r0.getChangingConfigurations()
            java.lang.String r1 = "strokeColor"
            X.6ic r7 = X.C37236Jn2.A02(r11, r0, r1, r2, r14)
            r0.getChangingConfigurations()
            java.lang.String r8 = "strokeAlpha"
            r1 = 11
            float r33 = A01(r0, r8, r2, r1)
            r0.getChangingConfigurations()
            java.lang.String r8 = "strokeWidth"
            r1 = 4
            float r34 = A01(r0, r8, r2, r1)
            r0.getChangingConfigurations()
            java.lang.String r8 = "trimPathEnd"
            r1 = 6
            float r37 = A01(r0, r8, r2, r1)
            r0.getChangingConfigurations()
            java.lang.String r8 = "trimPathOffset"
            r1 = 7
            float r38 = A00(r0, r8, r2, r1)
            r0.getChangingConfigurations()
            java.lang.String r8 = "trimPathStart"
            r1 = r23
            float r36 = A00(r0, r8, r2, r1)
            r0.getChangingConfigurations()
            java.lang.String r8 = "fillType"
            r1 = 13
            boolean r8 = X.C37236Jn2.A03(r8, r2)
            if (r8 != 0) goto L_0x03a7
            r17 = 0
        L_0x033c:
            r0.getChangingConfigurations()
            r0.recycle()
            android.graphics.Shader r0 = r10.A02
            if (r0 != 0) goto L_0x0393
            int r1 = r10.A00
            if (r1 != 0) goto L_0x0393
            r10 = 0
        L_0x034b:
            android.graphics.Shader r0 = r7.A02
            if (r0 != 0) goto L_0x037f
            int r1 = r7.A00
            if (r1 != 0) goto L_0x037f
            r1 = 0
        L_0x0354:
            r39 = 1
            if (r17 != 0) goto L_0x035a
            r39 = 0
        L_0x035a:
            X.C04220Ms.A0B(r13, r9)
            int r7 = X.C86164wN.A05(r21)
            r0 = r21
            java.lang.Object r0 = r0.get(r7)
            X.76y r0 = (X.C1197976y) r0
            java.util.List r7 = r0.A08
            X.549 r0 = new X.549
            r27 = r0
            r28 = r10
            r29 = r1
            r30 = r13
            r31 = r18
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r7.add(r0)
            goto L_0x0438
        L_0x037f:
            if (r0 == 0) goto L_0x0387
            X.53p r1 = new X.53p
            r1.<init>(r0)
            goto L_0x0354
        L_0x0387:
            int r0 = r7.A00
            long r7 = (long) r0
            r0 = 32
            long r7 = r7 << r0
            X.53m r1 = new X.53m
            r1.<init>(r7)
            goto L_0x0354
        L_0x0393:
            if (r0 == 0) goto L_0x039b
            X.53p r10 = new X.53p
            r10.<init>(r0)
            goto L_0x034b
        L_0x039b:
            int r0 = r10.A00
            long r0 = (long) r0
            r8 = 32
            long r0 = r0 << r8
            X.53m r10 = new X.53m
            r10.<init>(r0)
            goto L_0x034b
        L_0x03a7:
            int r17 = r0.getInt(r1, r3)
            goto L_0x033c
        L_0x03ac:
            r41 = 0
            goto L_0x02e4
        L_0x03b0:
            r1 = r22
            int r1 = r0.getInt(r7, r1)
            goto L_0x02d9
        L_0x03b8:
            r40 = 1
            goto L_0x02ce
        L_0x03bc:
            r1 = r22
            int r1 = r0.getInt(r7, r1)
            goto L_0x02c1
        L_0x03c4:
            X.M2h r1 = new X.M2h
            r1.<init>()
            r1.A04(r7)
            java.util.List r1 = r1.A04
            r18 = r1
            goto L_0x02a2
        L_0x03d2:
            r0 = 818(0x332, float:1.146E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0438
            int[] r1 = X.C103666aW.A00
            r0 = r24
            android.content.res.TypedArray r8 = r11.obtainStyledAttributes(r0, r1, r3, r3)
            X.C04220Ms.A06(r8)
            r8.getChangingConfigurations()
            java.lang.String r1 = r8.getString(r3)
            r8.getChangingConfigurations()
            if (r1 != 0) goto L_0x03f7
            java.lang.String r1 = ""
        L_0x03f7:
            java.lang.String r7 = r8.getString(r4)
            r8.getChangingConfigurations()
            if (r7 != 0) goto L_0x042b
            java.util.List r7 = X.C102766Wl.A00
        L_0x0402:
            r8.recycle()
            r33 = 1065353216(0x3f800000, float:1.0)
            X.C04220Ms.A0B(r1, r3)
            r37 = 512(0x200, float:7.175E-43)
            X.76y r0 = new X.76y
            r27 = r0
            r28 = r1
            r29 = r7
            r30 = r12
            r31 = r12
            r32 = r12
            r34 = r33
            r35 = r12
            r36 = r12
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1 = r21
            r1.add(r0)
            int r19 = r19 + 1
            goto L_0x0438
        L_0x042b:
            X.M2h r0 = new X.M2h
            r0.<init>()
            r0.A04(r7)
            java.util.List r7 = r0.A04
            goto L_0x0402
        L_0x0436:
            r19 = 0
        L_0x0438:
            r2.next()
            goto L_0x01a1
        L_0x043d:
            r46 = 12
            goto L_0x0166
        L_0x0441:
            r46 = 14
            goto L_0x0166
        L_0x0445:
            r46 = 13
            goto L_0x0166
        L_0x0449:
            r46 = 9
            goto L_0x0166
        L_0x044d:
            r46 = 3
            goto L_0x0166
        L_0x0451:
            long r15 = X.AnonymousClass7KE.A06
            goto L_0x0149
        L_0x0455:
            r0 = r23
            boolean r49 = r8.getBoolean(r0, r3)
            goto L_0x00f6
        L_0x045d:
            java.lang.String r0 = "No path data available"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0464:
            java.lang.String r1 = r8.getPositionDescription()
            java.lang.String r0 = "<VectorGraphic> tag requires viewportHeight > 0"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0474:
            java.lang.String r1 = r8.getPositionDescription()
            java.lang.String r0 = "<VectorGraphic> tag requires viewportWidth > 0"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0484:
            java.lang.String r0 = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x048b:
            X.54A r41 = X.C98136Ei.A00(r20)
            X.6sR r1 = new X.6sR
            r40 = r1
            r47 = r15
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r49)
            X.6tT r8 = new X.6tT
            r0 = r51
            r8.<init>(r1, r0)
            java.lang.ref.WeakReference r2 = X.C86144wL.A0w(r8)
            r1 = r50
            r0 = r25
            r1.put(r0, r2)
        L_0x04aa:
            X.6sR r13 = r8.A01
            X.AnonymousClass7W3.A0w(r5, r3)
            r0 = 1413834416(0x544566b0, float:3.39132547E12)
            r6.Cvb(r0)
            float r10 = r13.A01
            float r8 = r13.A00
            float r7 = r13.A03
            float r4 = r13.A02
            java.lang.String r15 = ""
            long r0 = r13.A05
            int r12 = r13.A04
            boolean r9 = r13.A07
            r11 = 1873274766(0x6fa7e78e, float:1.0392786E29)
            r2 = 3
            kotlin.jvm.internal.KtLambdaShape173S0100000_I2 r2 = X.C86164wN.A0x(r13, r2)
            X.8sI r16 = X.AnonymousClass7JR.A00(r6, r2, r11)
            r2 = 1068590786(0x3fb166c2, float:1.3859484)
            r6.Cvb(r2)
            X.8nV r2 = X.C147188nY.A0j(r6)
            float r11 = r2.CxL(r10)
            float r10 = r2.CxL(r8)
            boolean r2 = java.lang.Float.isNaN(r7)
            if (r2 == 0) goto L_0x04ea
            r7 = r11
        L_0x04ea:
            boolean r2 = java.lang.Float.isNaN(r4)
            if (r2 == 0) goto L_0x04f1
            r4 = r10
        L_0x04f1:
            X.7KE r13 = X.C86134wK.A0I(r0)
            X.LtO r8 = new X.LtO
            r8.<init>(r12)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r2 = X.C147188nY.A10(r6, r13, r8, r2)
            java.lang.Object r8 = r5.A13()
            if (r2 != 0) goto L_0x050b
            r2 = r26
            if (r8 != r2) goto L_0x0515
        L_0x050b:
            long r13 = X.AnonymousClass7KE.A06
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x055d
            r8 = 0
        L_0x0512:
            r5.A14(r8)
        L_0x0515:
            X.AnonymousClass7W3.A0w(r5, r3)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r2 = X.C147188nY.A0r(r6, r5, r0)
            r0 = r26
            if (r2 != r0) goto L_0x052b
            X.540 r2 = new X.540
            r2.<init>()
            r5.A14(r2)
        L_0x052b:
            X.AnonymousClass7W3.A0w(r5, r3)
            X.540 r2 = (X.AnonymousClass540) r2
            long r0 = X.C86104wH.A0C(r11, r10)
            X.8pE r11 = r2.A05
            X.7JK r10 = new X.7JK
            r10.<init>(r0)
            r11.CrC(r10)
            X.8pE r0 = r2.A03
            X.C147368pE.A04(r0, r9)
            X.547 r0 = r2.A06
            X.8pE r0 = r0.A05
            r0.CrC(r8)
            r19 = 35840(0x8c00, float:5.0223E-41)
            r13 = r2
            r14 = r6
            r17 = r7
            r18 = r4
            r13.A04(r14, r15, r16, r17, r18, r19)
            X.AnonymousClass7W3.A0w(r5, r3)
            X.AnonymousClass7W3.A0w(r5, r3)
            goto L_0x05b2
        L_0x055d:
            X.6bI r8 = X.C115866w2.A00(r12, r0)
            goto L_0x0512
        L_0x0562:
            r0 = -738265172(0xffffffffd3fef7ac, float:-2.19015388E12)
            r6.Cvb(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            android.content.res.Resources$Theme r1 = r10.getTheme()
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r0 = X.C147188nY.A0z(r6, r8, r0)
            boolean r0 = X.C147188nY.A11(r6, r4, r0)
            boolean r0 = X.C147188nY.A12(r6, r1, r0)
            java.lang.Object r1 = r5.A13()
            if (r0 != 0) goto L_0x0589
            r0 = r26
            if (r1 != r0) goto L_0x05a8
        L_0x0589:
            r0 = 0
            android.graphics.drawable.Drawable r1 = r7.getDrawable(r2, r0)     // Catch:{ all -> 0x05b9 }
            r0 = 99
            java.lang.String r0 = X.C28174Ezk.A00(r0)     // Catch:{ all -> 0x05b9 }
            X.C04220Ms.A0C(r1, r0)     // Catch:{ all -> 0x05b9 }
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1     // Catch:{ all -> 0x05b9 }
            android.graphics.Bitmap r0 = r1.getBitmap()     // Catch:{ all -> 0x05b9 }
            X.C04220Ms.A06(r0)     // Catch:{ all -> 0x05b9 }
            X.Gmy r1 = new X.Gmy     // Catch:{ all -> 0x05b9 }
            r1.<init>(r0)     // Catch:{ all -> 0x05b9 }
            r5.A14(r1)
        L_0x05a8:
            X.AnonymousClass7W3.A0w(r5, r3)
            X.8n0 r1 = (X.C146868n0) r1
            X.542 r2 = new X.542
            r2.<init>(r1)
        L_0x05b2:
            X.AnonymousClass7W3.A0w(r5, r3)
            X.AnonymousClass7W3.A0w(r5, r3)
            return r2
        L_0x05b9:
            java.lang.String r0 = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FS.A02(X.8nY, int):X.6uo");
    }

    public static void A03(AbstractList abstractList) {
        ((C1197976y) abstractList.get(abstractList.size() - 1)).A08.add(C98136Ei.A00((C1197976y) abstractList.remove(abstractList.size() - 1)));
    }
}
