package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxACallbackShape4S1500000_2_I2;
import com.facebook.redex.IDxFunctionShape172S0000000_2_I2;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.facebook.redex.IDxObserverShape3S1500000_2_I2;
import com.facebook.redex.IDxSCallbackShape852S0100000_2_I2;
import com.fbpay.auth.models.AuthTicketType;
import com.fbpay.util.pttatresource.IDxBResourceShape34S0000000_2_I2;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.7Ic  reason: invalid class name */
public final class AnonymousClass7Ic {
    public static final C142618fJ A08 = C122607Tb.A00;
    public C128667k3 A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final AnonymousClass583 A03;
    public final C104996ci A04;
    public final List A05 = AnonymousClass0wJ.A0v();
    public final C142618fJ A06;
    public final C1203379t A07;

    public static void A01(C142618fJ r10, C880756q r11, C107266gT r12, AnonymousClass7Ic r13, Object obj, String str) {
        C107266gT r5 = r12;
        Bundle bundle = r12.A01;
        String A002 = AnonymousClass7Hq.A00(bundle);
        if ("VERIFY_BIO_TO_PAY".equalsIgnoreCase(A002)) {
            AnonymousClass7Hq.A03(bundle, "VERIFY_PIN_TO_PAY");
        }
        if ("VERIFY_BIO_TO_DISABLE_BIO_HUB".equalsIgnoreCase(A002)) {
            AnonymousClass7Hq.A03(bundle, "VERIFY_PIN_TO_DISABLE_BIO_HUB");
        }
        bundle.putString("AUTH_METHOD_TYPE", "PIN");
        AnonymousClass583 r1 = r13.A03;
        AnonymousClass7JD.A03(r1.A05, new C113936sP((AnonymousClass6DS) null, (C121597Gy) null, (C109576kE) null, new IDxACallbackShape4S1500000_2_I2(r10, r11, r5, r13, obj, str, 0), r5, r13.A04.A00.A03));
    }

    public final M5J A04(C107266gT r19, Object obj, String str) {
        IDxFunctionShape172S0000000_2_I2 iDxFunctionShape172S0000000_2_I2 = new IDxFunctionShape172S0000000_2_I2(1);
        C880756q A012 = C880756q.A01();
        A012.A0G(AnonymousClass7Kx.A09((Object) null));
        C107266gT r7 = r19;
        Bundle bundle = r7.A01;
        String string = bundle.getString("AUTH_METHOD_TYPE");
        Set set = AuthTicketType.A00;
        if (string != null) {
            string = string.toUpperCase(Locale.US);
        }
        Object obj2 = obj;
        String str2 = str;
        if (!set.contains(string) || (!"BIO_OR_PIN".equalsIgnoreCase(C18190wL.A0j(bundle, "AUTH_METHOD_TYPE")) && !"BIO".equalsIgnoreCase(C18190wL.A0j(bundle, "AUTH_METHOD_TYPE")))) {
            String string2 = bundle.getString("AUTH_METHOD_TYPE");
            if (string2 != null) {
                string2 = string2.toUpperCase(Locale.US);
            }
            if (set.contains(string2)) {
                A02(new IDxACallbackShape4S1500000_2_I2(iDxFunctionShape172S0000000_2_I2, A012, r7, this, obj2, str2, 1), r7, this);
                return A012;
            }
            C92885kB r0 = r7.A00;
            if (r0 == null || !r0.A00.A00.isEmpty()) {
                A012.A0G(AnonymousClass7Kx.A0B((Object) null, C18250wR.A0V("Not supported auth type")));
                return A012;
            }
            A00(iDxFunctionShape172S0000000_2_I2, A012, r7, (C108876j6) null, this, obj2, str2);
            return A012;
        }
        M5J m5j = this.A03.A02;
        AnonymousClass066 r02 = this.A01;
        if (r02 == null) {
            r02 = this.A02;
            r02.getClass();
        }
        AnonymousClass7Kx.A0F(r02, m5j, new IDxObserverShape3S1500000_2_I2(iDxFunctionShape172S0000000_2_I2, A012, r7, this, obj2, str2, 2));
        return A012;
    }

    public final void A05(C880856r r11, C107266gT r12, Object obj, String str, Queue queue) {
        Queue queue2 = queue;
        Object peek = queue.peek();
        if (peek != null) {
            M5J m5j = (M5J) this.A06.apply(peek);
            if (m5j != null) {
                AnonymousClass066 r0 = this.A01;
                if (r0 == null) {
                    r0 = this.A02;
                    r0.getClass();
                }
                AnonymousClass7Kx.A0F(r0, m5j, new IDxObserverShape3S1500000_2_I2(r11, r12, queue2, this, obj, str, 3));
                return;
            }
            throw C18190wL.A0a("Caller must provide success or fail live data whether DA should proceed or abort the DA");
        }
        throw C18190wL.A0a("Factor Queue can not be empty");
    }

    public static void A00(C142618fJ r14, C880756q r15, C107266gT r16, C108876j6 r17, AnonymousClass7Ic r18, Object obj, String str) {
        Set emptySet;
        C104996ci r11 = r18.A04;
        AnonymousClass76O A09 = AnonymousClass7Kz.A09();
        AnonymousClass7HL A002 = AnonymousClass76O.A00();
        C108876j6 r0 = r17;
        if (r17 != null) {
            emptySet = C18200wM.A0u();
            Collections.addAll(emptySet, new C120967Dk[]{r0.A01});
        } else {
            emptySet = Collections.emptySet();
        }
        Bundle bundle = r16.A01;
        r15.A0K(new IDxBResourceShape34S0000000_2_I2(r14, A09, r11, C120977Dl.A00(new IDxSCallbackShape852S0100000_2_I2(A002, 1), obj, str, C86134wK.A0n(bundle), bundle.getString("PAYMENT_OTC_SESSION_ID"), bundle.getString("PAYMENT_OTC_TYPE"), (String) null, C121257Ff.A00(bundle), emptySet), 0).A03(), new IDxObserverShape211S0100000_2_I2(r15, (int) HttpStatus.SC_NO_CONTENT));
    }

    public static void A02(C145348kM r3, C107266gT r4, AnonymousClass7Ic r5) {
        C12560m7 childFragmentManager;
        C1203379t r0 = r5.A07;
        Bundle bundle = r4.A01;
        AnonymousClass099 r42 = (AnonymousClass099) r0.A06.A01(bundle, "AUTH_CONTAINER");
        if (r42 instanceof C145338kL) {
            ((C145338kL) r42).Ci3(r3);
        }
        FragmentActivity fragmentActivity = r5.A02;
        if (fragmentActivity != null) {
            childFragmentManager = fragmentActivity.getSupportFragmentManager();
        } else {
            Fragment fragment = r5.A01;
            fragment.getClass();
            childFragmentManager = fragment.getChildFragmentManager();
        }
        AnonymousClass01J r32 = new AnonymousClass01J(childFragmentManager);
        String A0j = C18190wL.A0j(bundle, "AUTH_METHOD_TYPE");
        if ("FB_ACCESS_TOKEN".equalsIgnoreCase(A0j) || "IG_ACCESS_TOKEN".equalsIgnoreCase(A0j)) {
            r32.A0E(r42, "AUTH_CONTAINER_FRAGMENT_TAG");
            r32.A00();
            return;
        }
        r42.A08 = false;
        r42.A09 = true;
        r32.A0E(r42, "AUTH_CONTAINER_FRAGMENT_TAG");
        r42.A0B = false;
        r42.A00 = r32.A0L(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.facebook.redex.IDxObserverShape211S0100000_2_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: com.facebook.redex.IDxObserverShape3S1500000_2_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: com.facebook.redex.IDxObserverShape3S1500000_2_I2} */
    /* JADX WARNING: type inference failed for: r0v16, types: [X.8gC] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.M5J A03(X.C142618fJ r27, X.C142618fJ r28, X.C107266gT r29, java.lang.Object r30, java.lang.String r31) {
        /*
            r26 = this;
            r5 = r29
            android.os.Bundle r10 = r5.A01
            r9 = 1
            java.lang.String r3 = java.lang.Boolean.toString(r9)
            java.lang.String r2 = "is_dynamic_auth_flow"
            java.lang.String r1 = "AUTH_LOGGING_EXTRA_KEY"
            android.os.Bundle r0 = r10.getBundle(r1)
            if (r0 != 0) goto L_0x0017
            android.os.Bundle r0 = X.C18180wK.A06()
        L_0x0017:
            r0.putString(r2, r3)
            r10.putBundle(r1, r0)
            X.79t r0 = X.AnonymousClass7Kz.A07()
            X.8h9 r2 = r0.A07
            java.util.Map r1 = X.C121257Ff.A01(r10)
            r8 = 0
            java.lang.String r0 = "DYNAMIC_AUTH_OPERATION_NAME"
            r13 = r31
            r1.put(r0, r13)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.lang.String r0 = "client_load_dynamic_auth_init"
            r2.Bb8(r0, r1)
            X.56r r4 = X.C880856r.A03()
            java.lang.String r0 = "REUSE_ATS_IN_AUTH_PROMPT_OBJ_SCOPED"
            r11 = 0
            boolean r0 = r10.getBoolean(r0, r11)
            r6 = r26
            r12 = r30
            if (r0 == 0) goto L_0x0060
            X.6ci r2 = r6.A04
            X.583 r1 = r6.A03
            X.7k3 r0 = new X.7k3
            r14 = r0
            r15 = r4
            r16 = r1
            r17 = r6
            r18 = r2
            r19 = r12
            r20 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r6.A00 = r0
        L_0x0060:
            X.5kB r0 = r5.A00
            r20 = r28
            if (r0 == 0) goto L_0x00c1
            X.6tp r0 = r0.A00
            java.util.List<X.6uL> r1 = r0.A00
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00c1
            java.lang.Object r0 = r1.get(r11)
            X.6uL r0 = (X.C115006uL) r0
            java.util.List<X.6v0> r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c1
            X.5kB r0 = r5.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r8, r0)
            X.56r r2 = X.C880856r.A04(r0)
            androidx.fragment.app.Fragment r1 = r6.A01
            if (r1 != 0) goto L_0x0091
            androidx.fragment.app.FragmentActivity r1 = r6.A02
            r1.getClass()
        L_0x0091:
            com.facebook.redex.IDxObserverShape3S1500000_2_I2 r0 = new com.facebook.redex.IDxObserverShape3S1500000_2_I2
            r22 = r6
            r23 = r12
            r24 = r13
            r25 = r9
            r19 = r4
            r21 = r5
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
        L_0x00a4:
            X.AnonymousClass7Kx.A0F(r1, r2, r0)
            X.86N r0 = new X.86N
            r2 = r27
            r1 = r0
            r3 = r20
            r7 = r12
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.M5J r2 = X.C30821GXg.A02(r4, r0)
            r1 = 3
            com.facebook.redex.IDxObserverShape24S1200000_2_I2 r0 = new com.facebook.redex.IDxObserverShape24S1200000_2_I2
            r0.<init>(r5, r6, r13, r1)
            r2.A0E(r0)
            return r2
        L_0x00c1:
            X.6ci r7 = r6.A04
            X.76O r3 = X.AnonymousClass7Kz.A09()
            X.7HL r2 = X.AnonymousClass76O.A00()
            X.7Dk[] r0 = new X.C120967Dk[r11]
            java.util.HashSet r1 = X.C18200wM.A0u()
            java.util.Collections.addAll(r1, r0)
            java.lang.String r0 = "PAYMENT_ACCOUNT_ID"
            java.lang.String r14 = r10.getString(r0)
            java.lang.String r0 = "PAYMENT_OTC_SESSION_ID"
            java.lang.String r15 = r10.getString(r0)
            java.lang.String r0 = "PAYMENT_OTC_TYPE"
            java.lang.String r16 = r10.getString(r0)
            java.util.Map r18 = X.C121257Ff.A00(r10)
            com.facebook.redex.IDxSCallbackShape852S0100000_2_I2 r11 = new com.facebook.redex.IDxSCallbackShape852S0100000_2_I2
            r11.<init>(r2, r9)
            r19 = r1
            r17 = r8
            X.7Dl r0 = X.C120977Dl.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.79j r0 = X.C92975kL.A01(r3, r7, r0)
            X.M5J r2 = r0.A03()
            androidx.fragment.app.Fragment r1 = r6.A01
            if (r1 != 0) goto L_0x0108
            androidx.fragment.app.FragmentActivity r1 = r6.A02
            r1.getClass()
        L_0x0108:
            r0 = 205(0xcd, float:2.87E-43)
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r0 = X.C86114wI.A0Q(r4, r0)
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Ic.A03(X.8fJ, X.8fJ, X.6gT, java.lang.Object, java.lang.String):X.M5J");
    }

    public AnonymousClass7Ic(C142618fJ r5, Fragment fragment, FragmentActivity fragmentActivity, C1203379t r8, C104996ci r9) {
        this.A04 = r9;
        this.A02 = fragmentActivity;
        this.A07 = r8;
        this.A01 = fragment;
        this.A06 = r5;
        AnonymousClass583 r0 = (AnonymousClass583) C1203379t.A00().create(AnonymousClass583.class);
        this.A03 = r0;
        C880856r r3 = r0.A05;
        AnonymousClass066 r02 = this.A01;
        if (r02 == null) {
            r02 = this.A02;
            r02.getClass();
        }
        C86114wI.A1A(r02, r3, C86114wI.A0Q(this, HttpStatus.SC_PARTIAL_CONTENT), 275);
    }
}
