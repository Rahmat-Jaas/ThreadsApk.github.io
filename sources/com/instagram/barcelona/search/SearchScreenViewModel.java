package com.instagram.barcelona.search;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass0TJ;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass10X;
import X.AnonymousClass3J5;
import X.AnonymousClass5IV;
import X.AnonymousClass5M1;
import X.AnonymousClass5M2;
import X.AnonymousClass7E6;
import X.BBZ;
import X.C04220Ms;
import X.C11630kW;
import X.C120737Cg;
import X.C146958n9;
import X.C148838sG;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C25237DiI;
import X.C27457Enn;
import X.C27952Ew2;
import X.C35144IoO;
import X.C36558Jad;
import X.C37410JrS;
import X.C38275KTk;
import X.C63803iN;
import X.C86074wE;
import X.C86094wG;
import X.C86114wI;
import X.C89905Hm;
import X.ILj;
import X.JOM;
import X.JXb;
import X.KKE;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SearchScreenViewModel extends AnonymousClass10X {
    public long A00;
    public String A01;
    public List A02;
    public List A03;
    public C148838sG A04;
    public C148838sG A05;
    public final C11630kW A06;
    public final C38275KTk A07;
    public final KKE A08;
    public final JXb A09 = new JXb();
    public final UserSession A0A;
    public final C37410JrS A0B;
    public final C86074wE A0C;
    public final C86094wG A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchScreenViewModel(Application application, C11630kW r26, UserSession userSession) {
        super(application);
        UserSession userSession2 = userSession;
        this.A0A = userSession2;
        C11630kW r1 = r26;
        this.A06 = r1;
        this.A08 = C36558Jad.A00(userSession2);
        C11630kW r16 = r1;
        this.A07 = new C38275KTk(r16, (JOM) null, userSession2, C18190wL.A0n(UUID.randomUUID()), (String) null, (String) null, (String) null, (String) null);
        this.A0B = new C37410JrS(r1, userSession2);
        AnonymousClass0ZV r13 = AnonymousClass0ZV.A00;
        Integer num = AnonymousClass006.A00;
        C27457Enn A0z = C18190wL.A0z(new AnonymousClass5IV((ILj) null, num, num, "", (String) null, (String) null, (String) null, r13, true));
        this.A0C = A0z;
        this.A0D = C18230wP.A0x((C148838sG) null, A0z);
        this.A02 = r13;
        this.A03 = r13;
        this.A00 = Long.MAX_VALUE;
        AnonymousClass3J5.A01(this, new KtSLambdaShape6S0200000_I2_1(this, (C146958n9) null, 37), AnonymousClass7E6.A00(userSession2).A02(BBZ.class), 34);
        A04(this, false);
    }

    public final void A09(Context context, String str) {
        Context context2 = context;
        C04220Ms.A0B(context, 0);
        User A0P = C18210wN.A0P(this.A0A, str);
        if (A0P != null) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0300000_I2(this, A0P, context2, (C146958n9) null, 16), AnonymousClass3J5.A00(this), 3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: X.ILj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: X.ILj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: X.ILj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.barcelona.search.SearchScreenViewModel r20, java.lang.String r21, X.C146958n9 r22) {
        /*
            r3 = r20
            r5 = r21
            r4 = 35
            r6 = r22
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r4, r6)
            if (r0 == 0) goto L_0x00fa
            r9 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r9 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fa
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x001c:
            java.lang.Object r1 = r9.A03
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r9.A00
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00c2
            if (r0 != r6) goto L_0x0187
            java.lang.Object r5 = r9.A02
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r9.A01
            com.instagram.barcelona.search.SearchScreenViewModel r3 = (com.instagram.barcelona.search.SearchScreenViewModel) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x0033:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x018c
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r7 = r1.A00
            r2 = r7
            X.IaF r2 = (X.C34542IaF) r2
            X.ILj r10 = r2.A00
            r11 = 0
            if (r10 == 0) goto L_0x00a1
            X.JXb r8 = r3.A09
            r8.A01(r10, r5)
            X.4wE r6 = r3.A0C
        L_0x004c:
            java.lang.Object r1 = r6.getValue()
            r9 = r1
            X.5IV r9 = (X.AnonymousClass5IV) r9
            boolean r19 = r8.A04(r5)
            r18 = 415(0x19f, float:5.82E-43)
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            X.5IV r0 = X.AnonymousClass5IV.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = r6.ADi(r1, r0)
            if (r0 == 0) goto L_0x004c
        L_0x006b:
            X.FaV r7 = (X.C28748FaV) r7
            java.util.List r1 = r7.A00
            X.C04220Ms.A06(r1)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0078
            java.lang.String r11 = r2.A02
        L_0x0078:
            java.lang.String r8 = r2.A03
            X.4wE r7 = r3.A0C
            java.lang.Object r0 = r7.getValue()
            X.5IV r0 = (X.AnonymousClass5IV) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0087
            r4 = 1
        L_0x0087:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r1.iterator()
        L_0x008f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C35144IoO
            if (r0 == 0) goto L_0x008f
            r5.add(r1)
            goto L_0x008f
        L_0x00a1:
            X.4wE r5 = r3.A0C
        L_0x00a3:
            java.lang.Object r1 = r5.getValue()
            r0 = r1
            X.5IV r0 = (X.AnonymousClass5IV) r0
            r17 = 415(0x19f, float:5.82E-43)
            r8 = r0
            r9 = r11
            r10 = r11
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r18 = r6
            X.5IV r0 = X.AnonymousClass5IV.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r5.ADi(r1, r0)
            if (r0 == 0) goto L_0x00a3
            goto L_0x006b
        L_0x00c2:
            X.AnonymousClass0OU.A00(r1)
            java.lang.String r10 = X.AnonymousClass0hA.A02(r5)
            if (r10 == 0) goto L_0x01af
            boolean r0 = X.AnonymousClass8bQ.A0n(r10)
            if (r0 != 0) goto L_0x01af
            com.instagram.service.session.UserSession r7 = r3.A0A
            X.4wG r1 = r3.A0D
            java.lang.Object r0 = r1.getValue()
            X.5IV r0 = (X.AnonymousClass5IV) r0
            java.lang.String r2 = r0.A03
            java.lang.Object r0 = r1.getValue()
            X.5IV r0 = (X.AnonymousClass5IV) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "user_search_page"
            X.H8c r2 = X.C25707DqV.A03(r7, r10, r0, r2, r1)
            r1 = 1431393523(0x555154f3, float:1.4385174E13)
            r0 = 14
            X.C86124wJ.A1S(r3, r5, r9, r6)
            java.lang.Object r1 = X.C63623hv.A01(r2, r9, r1, r4, r0)
            if (r1 != r8) goto L_0x0033
            return r8
        L_0x00fa:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r9 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r9.<init>(r3, r6, r4)
            goto L_0x001c
        L_0x0101:
            r3.A02 = r5
            if (r4 == 0) goto L_0x0184
            java.lang.Object r0 = r7.getValue()
            X.5IV r0 = (X.AnonymousClass5IV) r0
            java.util.List r6 = r0.A07
        L_0x010d:
            java.lang.Object r5 = r7.getValue()
            r12 = r5
            X.5IV r12 = (X.AnonymousClass5IV) r12
            java.util.List r0 = r3.A02
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x011e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0141
            java.lang.Object r0 = r10.next()
            X.IoO r0 = (X.C35144IoO) r0
            java.lang.String r4 = r0.A01()
            java.lang.Integer r2 = X.AnonymousClass006.A00
            com.instagram.user.model.User r0 = r0.A05()
            X.5Hm r1 = r3.A00(r0)
            X.5M1 r0 = new X.5M1
            r0.<init>(r1, r2, r4)
            r9.add(r0)
            goto L_0x011e
        L_0x0141:
            java.util.List r20 = X.AnonymousClass00J.A0V(r9, r6)
            r4 = 0
            java.lang.Integer r15 = X.AnonymousClass006.A01
            r21 = 241(0xf1, float:3.38E-43)
            r17 = r11
            r18 = r8
            r19 = r13
            r22 = r4
            X.5IV r0 = X.AnonymousClass5IV.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = r7.ADi(r5, r0)
            if (r0 == 0) goto L_0x010d
            X.KTk r5 = r3.A07
            X.4wG r0 = r3.A0D
            java.lang.Object r0 = r0.getValue()
            X.5IV r0 = (X.AnonymousClass5IV) r0
            java.lang.String r2 = r0.A05
            X.IoR r1 = new X.IoR
            r1.<init>(r4, r4, r4)
            java.util.List r0 = r3.A02
            r1.A0C(r0, r8)
            X.JG2 r0 = r1.A03()
            X.JNe r1 = X.C35766J3c.A00(r0)
            X.0kW r0 = r3.A06
            java.lang.String r0 = X.C18230wP.A0n(r0)
            r5.BeI(r1, r2, r8, r0)
            goto L_0x01af
        L_0x0184:
            X.0ZV r6 = X.AnonymousClass0ZV.A00
            goto L_0x010d
        L_0x0187:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x018c:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x01af
            X.4wE r2 = r3.A0C
        L_0x0192:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            X.5IV r3 = (X.AnonymousClass5IV) r3
            r4 = 0
            r13 = 0
            java.lang.Integer r6 = X.AnonymousClass006.A01
            r12 = 255(0xff, float:3.57E-43)
            r5 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            X.5IV r0 = X.AnonymousClass5IV.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0192
        L_0x01af:
            kotlin.Unit r8 = kotlin.Unit.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.search.SearchScreenViewModel.A01(com.instagram.barcelona.search.SearchScreenViewModel, java.lang.String, X.8n9):java.lang.Object");
    }

    public static final void A02(SearchScreenViewModel searchScreenViewModel) {
        List A0V;
        Object value;
        KKE kke = searchScreenViewModel.A08;
        if (kke.A00().isEmpty()) {
            A0V = AnonymousClass0ZV.A00;
        } else {
            List A0n = C18180wK.A0n(new AnonymousClass5M2((Object) null, (DefaultConstructorMarker) null, 1));
            List<C35144IoO> A002 = kke.A00();
            ArrayList A0w = AnonymousClass0wJ.A0w(A002);
            for (C35144IoO ioO : A002) {
                String A012 = ioO.A01();
                A0w.add(new AnonymousClass5M1(searchScreenViewModel.A00(ioO.A05()), AnonymousClass006.A01, A012));
            }
            A0V = AnonymousClass00J.A0V(A0w, A0n);
        }
        C86074wE r2 = searchScreenViewModel.A0C;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IV.A00((AnonymousClass5IV) value, (ILj) null, (Integer) null, AnonymousClass006.A01, (String) null, (String) null, (String) null, (String) null, A0V, 241, false)));
    }

    public static final void A03(SearchScreenViewModel searchScreenViewModel) {
        Object value;
        String str;
        SearchScreenViewModel searchScreenViewModel2 = searchScreenViewModel;
        List list = searchScreenViewModel2.A03;
        ArrayList A0x = AnonymousClass0wJ.A0x(list, 10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0c = C18220wO.A0c(it);
            String id = A0c.getId();
            Integer num = AnonymousClass006.A0C;
            Resources resources = searchScreenViewModel2.A08().getApplicationContext().getResources();
            Integer A0n = A0c.A0n();
            String A012 = C120737Cg.A01(resources, A0n, true);
            C04220Ms.A06(A012);
            List list2 = null;
            if (A0n != null) {
                try {
                    str = C18230wP.A0j(resources, A012, R.plurals.barcelona_search_follower_count, A0n.intValue());
                } catch (Exception unused) {
                    str = null;
                }
            } else {
                str = null;
            }
            String id2 = A0c.getId();
            String BK7 = A0c.BK7();
            ImageUrl B4M = A0c.B4M();
            boolean BZi = A0c.BZi();
            String Ak2 = A0c.Ak2();
            ImmutableList A062 = A0c.A06();
            if (A062 != null) {
                ArrayList A0x2 = AnonymousClass0wJ.A0x(A062, 10);
                Iterator it2 = A062.iterator();
                while (it2.hasNext()) {
                    C86114wI.A1Q(A0x2, it2);
                }
                list2 = AnonymousClass00J.A0Q(A0x2, 2);
            }
            A0x.add(new AnonymousClass5M1(new C89905Hm(B4M, A0c.A03, id2, BK7, Ak2, str, list2, BZi, A0c.A37(), C18250wR.A1J(searchScreenViewModel2.A0A, A0c.getId()), A0c.BRq()), num, id));
        }
        C86074wE r3 = searchScreenViewModel2.A0C;
        do {
            value = r3.getValue();
        } while (!r3.ADi(value, AnonymousClass5IV.A00((AnonymousClass5IV) value, (ILj) null, (Integer) null, AnonymousClass006.A01, (String) null, searchScreenViewModel2.A01, (String) null, (String) null, A0x, 249, false)));
    }

    public static final void A04(SearchScreenViewModel searchScreenViewModel, boolean z) {
        Object value;
        C148838sG r1 = searchScreenViewModel.A04;
        if (r1 != null) {
            r1.AC7((CancellationException) null);
        }
        if (C18190wL.A1a(searchScreenViewModel.A03) && !z) {
            if (SystemClock.elapsedRealtime() - searchScreenViewModel.A00 <= C63803iN.A03(AnonymousClass0TJ.A05, searchScreenViewModel.A0A, 36608952611378076L) * ((long) 1000)) {
                A03(searchScreenViewModel);
                return;
            }
        }
        C86074wE r2 = searchScreenViewModel.A0C;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IV.A00((AnonymousClass5IV) value, (ILj) null, (Integer) null, AnonymousClass006.A00, (String) null, (String) null, (String) null, (String) null, (List) null, 255, false)));
        searchScreenViewModel.A04 = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1101000_I2(searchScreenViewModel, (String) null, (C146958n9) null, 19), AnonymousClass3J5.A00(searchScreenViewModel), 3);
    }

    private final C89905Hm A00(User user) {
        String id = user.getId();
        String BK7 = user.BK7();
        ImageUrl B4M = user.B4M();
        boolean BZi = user.BZi();
        String Ak2 = user.Ak2();
        boolean A37 = user.A37();
        return new C89905Hm(B4M, user.A03, id, BK7, Ak2, (String) null, (List) null, BZi, A37, C18250wR.A1J(this.A0A, user.getId()), user.BRq());
    }
}
