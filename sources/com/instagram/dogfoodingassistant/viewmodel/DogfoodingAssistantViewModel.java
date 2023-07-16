package com.instagram.dogfoodingassistant.viewmodel;

import X.AnonymousClass0wJ;
import X.AnonymousClass19K;
import X.AnonymousClass3J5;
import X.AnonymousClass3Ue;
import X.C04220Ms;
import X.C146958n9;
import X.C18190wL;
import X.C25237DiI;
import X.C27457Enn;
import X.C27952Ew2;
import X.C62793ak;
import X.C81454np;
import X.C86074wE;
import X.C86094wG;
import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2;
import com.instagram.dogfoodingassistant.repository.DogfoodingAssistantRepository;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1201000_I2_1;

public final class DogfoodingAssistantViewModel extends C62793ak {
    public final DogfoodingAssistantRepository A00;
    public final AnonymousClass3Ue A01;
    public final C86074wE A02;
    public final C86094wG A03;

    public /* synthetic */ DogfoodingAssistantViewModel(UserSession userSession) {
        DogfoodingAssistantRepository dogfoodingAssistantRepository = new DogfoodingAssistantRepository(userSession);
        AnonymousClass3Ue r0 = new AnonymousClass3Ue(userSession);
        this.A00 = dogfoodingAssistantRepository;
        this.A01 = r0;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0100000_I2((Object) null, 39));
        this.A02 = A0z;
        this.A03 = A0z;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096 A[RETURN] */
    public static final java.lang.Object A01(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2 r8, com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel r9, X.C146958n9 r10) {
        /*
            r5 = 2
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0402000_I2.A00(r5, r10)
            if (r0 == 0) goto L_0x0097
            r4 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape0S0402000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0402000_I2) r4
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0097
            int r2 = r2 - r1
            r4.A01 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A04
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A01
            r3 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 == r3) goto L_0x0054
            if (r0 != r5) goto L_0x009e
            int r2 = r4.A00
            java.lang.Object r8 = r4.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2) r8
            java.lang.Object r9 = r4.A02
            com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel r9 = (com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel) r9
            X.AnonymousClass0OU.A00(r1)
        L_0x002f:
            int r2 = r2 + 1
            r0 = 31
            if (r2 < r0) goto L_0x003f
            r3 = 0
        L_0x0036:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L_0x003b:
            X.AnonymousClass0OU.A00(r1)
            r2 = 1
        L_0x003f:
            com.instagram.dogfoodingassistant.repository.DogfoodingAssistantRepository r0 = r9.A00
            java.lang.String r1 = r8.A04
            r4.A02 = r9
            r4.A03 = r8
            r4.A00 = r2
            r4.A01 = r3
            com.instagram.dogfoodingassistant.api.DogfoodingAssistantApi r0 = r0.A01
            java.lang.Object r1 = r0.A02(r1, r4)
            if (r1 != r6) goto L_0x0061
            return r6
        L_0x0054:
            int r2 = r4.A00
            java.lang.Object r8 = r4.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2) r8
            java.lang.Object r9 = r4.A02
            com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel r9 = (com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel) r9
            X.AnonymousClass0OU.A00(r1)
        L_0x0061:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0086
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0086
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r7 = r1.A00
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r1 = r7.A00
            java.lang.String r0 = r8.A03
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0086
            java.lang.Object r1 = r7.A01
            java.lang.String r0 = r8.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0086
            goto L_0x0036
        L_0x0086:
            r0 = 2000(0x7d0, double:9.88E-321)
            r4.A02 = r9
            r4.A03 = r8
            r4.A00 = r2
            r4.A01 = r5
            java.lang.Object r0 = X.AnonymousClass729.A01(r4, r0)
            if (r0 != r6) goto L_0x002f
            return r6
        L_0x0097:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0402000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0402000_I2
            r4.<init>(r9, r10, r5)
            goto L_0x0015
        L_0x009e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel.A01(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2, com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel, X.8n9):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0111 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0130 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.AnonymousClass19K r15, com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel r16, X.C146958n9 r17) {
        /*
            r7 = r15
            r3 = r17
            r14 = r16
            boolean r0 = r3 instanceof X.AnonymousClass4WR
            if (r0 == 0) goto L_0x0131
            r13 = r3
            X.4WR r13 = (X.AnonymousClass4WR) r13
            int r2 = r13.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0131
            int r2 = r2 - r1
            r13.A01 = r2
        L_0x0017:
            java.lang.Object r3 = r13.A08
            X.D0E r12 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.A01
            r11 = 0
            r4 = 10
            r10 = 4
            r9 = 3
            r8 = 2
            r15 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0076
            if (r0 == r15) goto L_0x0060
            if (r0 == r8) goto L_0x00dd
            if (r0 == r9) goto L_0x0112
            if (r0 != r10) goto L_0x0138
            java.lang.Object r15 = r13.A03
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r7 = r13.A02
            X.19K r7 = (X.AnonymousClass19K) r7
            X.AnonymousClass0OU.A00(r3)
        L_0x003a:
            java.util.List r3 = (java.util.List) r3
            java.lang.String r8 = r7.A01
            java.lang.String r9 = r7.A03
            java.lang.String r10 = r7.A02
            java.lang.String r11 = r7.A04
            boolean r1 = r7.A09
            java.lang.String r12 = r7.A00
            java.util.List r13 = r7.A08
            java.util.List r14 = r7.A06
            r0 = 8
            X.C04220Ms.A0B(r15, r0)
            r0 = 9
            X.C04220Ms.A0B(r3, r0)
            X.19K r7 = new X.19K
            r17 = r1
            r16 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r7
        L_0x0060:
            java.lang.Object r5 = r13.A06
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r2 = r13.A05
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r0 = r13.A04
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r7 = r13.A03
            X.19K r7 = (X.AnonymousClass19K) r7
            java.lang.Object r14 = r13.A02
            X.AnonymousClass0OU.A00(r3)
            goto L_0x00a7
        L_0x0076:
            X.AnonymousClass0OU.A00(r3)
            java.util.List r0 = r7.A05
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r0, r4)
            java.util.Iterator r2 = r0.iterator()
        L_0x0083:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r3 = r2.next()
            r1 = 40
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2
            r0.<init>((X.C146958n9) r6, (java.lang.Object) r14, (java.lang.Object) r3, (int) r1)
            r13.A02 = r14
            r13.A03 = r7
            r13.A04 = r5
            r13.A05 = r2
            r13.A06 = r5
            r13.A01 = r15
            java.lang.Object r3 = X.AnonymousClass7Ja.A01(r13, r0)
            if (r3 == r12) goto L_0x013d
            r0 = r5
        L_0x00a7:
            r5.add(r3)
            r5 = r0
            goto L_0x0083
        L_0x00ac:
            java.util.List r1 = r7.A07
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0x(r1, r4)
            java.util.Iterator r1 = r1.iterator()
            r2 = r0
        L_0x00b7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00fb
            java.lang.Object r15 = r1.next()
            r4 = 41
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2
            r3.<init>((X.C146958n9) r6, (java.lang.Object) r14, (java.lang.Object) r15, (int) r4)
            r13.A02 = r14
            r13.A03 = r7
            r13.A04 = r5
            r13.A05 = r0
            r13.A06 = r1
            r13.A07 = r0
            r13.A01 = r8
            java.lang.Object r3 = X.AnonymousClass7Ja.A01(r13, r3)
            if (r3 != r12) goto L_0x00f6
            return r12
        L_0x00dd:
            java.lang.Object r2 = r13.A07
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r1 = r13.A06
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r0 = r13.A05
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r5 = r13.A04
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r7 = r13.A03
            X.19K r7 = (X.AnonymousClass19K) r7
            java.lang.Object r14 = r13.A02
            X.AnonymousClass0OU.A00(r3)
        L_0x00f6:
            r2.add(r3)
            r2 = r0
            goto L_0x00b7
        L_0x00fb:
            r13.A02 = r0
            r13.A03 = r7
            r13.A04 = r6
            r13.A05 = r6
            r13.A06 = r6
            r13.A07 = r6
            r13.A00 = r11
            r13.A01 = r9
            java.lang.Object r3 = X.C25236DiH.A00(r5, r13)
            if (r3 != r12) goto L_0x011f
            return r12
        L_0x0112:
            int r11 = r13.A00
            java.lang.Object r7 = r13.A03
            X.19K r7 = (X.AnonymousClass19K) r7
            java.lang.Object r0 = r13.A02
            java.util.Collection r0 = (java.util.Collection) r0
            X.AnonymousClass0OU.A00(r3)
        L_0x011f:
            r15 = r3
            java.util.List r15 = (java.util.List) r15
            r13.A02 = r7
            r13.A03 = r15
            r13.A00 = r11
            r13.A01 = r10
            java.lang.Object r3 = X.C25236DiH.A00(r0, r13)
            if (r3 != r12) goto L_0x003a
            return r12
        L_0x0131:
            X.4WR r13 = new X.4WR
            r13.<init>(r14, r3)
            goto L_0x0017
        L_0x0138:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x013d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel.A02(X.19K, com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel, X.8n9):java.lang.Object");
    }

    public final void A04(Context context, KtCSuperShape0S5010000_I2 ktCSuperShape0S5010000_I2, boolean z) {
        Object value;
        AnonymousClass19K r8;
        ArrayList A0w;
        String str;
        String str2;
        String str3;
        boolean z2;
        String str4;
        List list;
        List list2;
        String str5;
        KtCSuperShape0S5010000_I2 ktCSuperShape0S5010000_I22 = ktCSuperShape0S5010000_I2;
        C04220Ms.A0B(ktCSuperShape0S5010000_I22, 0);
        C81454np r5 = (C81454np) ((KtCSuperShape0S0100000_I2) this.A03.getValue()).A00;
        if (r5 instanceof AnonymousClass19K) {
            C86074wE r2 = this.A02;
            do {
                value = r2.getValue();
                r8 = (AnonymousClass19K) r5;
                List<KtCSuperShape0S5010000_I2> list3 = r8.A07;
                A0w = AnonymousClass0wJ.A0w(list3);
                for (KtCSuperShape0S5010000_I2 ktCSuperShape0S5010000_I23 : list3) {
                    String str6 = ktCSuperShape0S5010000_I23.A04;
                    String str7 = ktCSuperShape0S5010000_I22.A04;
                    if (C04220Ms.A0I(str6, str7)) {
                        String str8 = ktCSuperShape0S5010000_I23.A02;
                        String str9 = ktCSuperShape0S5010000_I22.A02;
                        if (C04220Ms.A0I(str8, str9)) {
                            String str10 = ktCSuperShape0S5010000_I23.A03;
                            String str11 = ktCSuperShape0S5010000_I22.A03;
                            if (C04220Ms.A0I(str10, str11)) {
                                String str12 = ktCSuperShape0S5010000_I22.A01;
                                String str13 = ktCSuperShape0S5010000_I22.A00;
                                C04220Ms.A0B(str7, 0);
                                AnonymousClass0wJ.A1Q(str11, str9);
                                ktCSuperShape0S5010000_I23 = new KtCSuperShape0S5010000_I2(str7, str11, str9, str12, str13, 1, true);
                            }
                        }
                    }
                    A0w.add(ktCSuperShape0S5010000_I23);
                }
                str = r8.A01;
                str2 = r8.A03;
                String str14 = r8.A02;
                str3 = r8.A04;
                z2 = r8.A09;
                str4 = r8.A00;
                list = r8.A08;
                list2 = r8.A06;
                str5 = str14;
            } while (!r2.ADi(value, new KtCSuperShape0S0100000_I2((Object) new AnonymousClass19K(str, str2, str5, str3, str4, list, list2, r8.A05, A0w, z2), 39)));
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0311000_I2(context, ktCSuperShape0S5010000_I22, this, (C146958n9) null, 13, z), AnonymousClass3J5.A00(this), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r5, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2 r6, com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel r7, X.C146958n9 r8) {
        /*
            r3 = 31
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r8)
            if (r0 == 0) goto L_0x004e
            r4 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A03
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 != r0) goto L_0x0054
            java.lang.Object r5 = r4.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r7 = r4.A01
            com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel r7 = (com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel) r7
            X.AnonymousClass0OU.A00(r3)
        L_0x002c:
            boolean r0 = X.AnonymousClass0wJ.A1X(r3)
            if (r0 == 0) goto L_0x003b
            X.3Ue r1 = r7.A01
            r0 = 0
            r1.A01(r5, r0)
        L_0x0038:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x003b:
            java.lang.String r0 = "Timeout in network check for qe sync"
            X.C63813iO.A0B(r5, r0)
            goto L_0x0038
        L_0x0041:
            X.AnonymousClass0OU.A00(r3)
            X.C18240wQ.A1M(r7, r5, r4, r0)
            java.lang.Object r3 = A01(r6, r7, r4)
            if (r3 != r2) goto L_0x002c
            return r2
        L_0x004e:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r4.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x0054:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel.A00(android.content.Context, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2, com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel, X.8n9):java.lang.Object");
    }

    public static final void A03(DogfoodingAssistantViewModel dogfoodingAssistantViewModel) {
        AnonymousClass19K r1;
        C81454np r12 = (C81454np) ((KtCSuperShape0S0100000_I2) dogfoodingAssistantViewModel.A03.getValue()).A00;
        if ((r12 instanceof AnonymousClass19K) && (r1 = (AnonymousClass19K) r12) != null) {
            String str = r1.A01;
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1201000_I2_1(dogfoodingAssistantViewModel, str, (C146958n9) null, 4), AnonymousClass3J5.A00(dogfoodingAssistantViewModel), 3);
        }
    }
}
