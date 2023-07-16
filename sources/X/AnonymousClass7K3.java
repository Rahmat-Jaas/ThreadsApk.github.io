package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.autofill.AutofillValue;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.extensions.autofill.base.AutofillFrameworkControllerBase$1;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import com.facebook.browser.lite.webview.SystemWebView;
import com.fbpay.w3c.CardDetails;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7K3  reason: invalid class name */
public final class AnonymousClass7K3 {
    public C143158gC A00 = null;
    public C872350v A01;
    public C89405Ej A02;
    public C89405Ej A03;
    public IF5 A04;
    public C03700Kj A05 = AnonymousClass0IY.A00;
    public AnonymousClass7IX A06;
    public UserSession A07;
    public Long A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public List A0E;
    public Map A0F;
    public Map A0G;
    public Map A0H;
    public Set A0I;
    public Set A0J;
    public Set A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q;
    public final AutofillContactDataCallback A0R;
    public final Map A0S;
    public final Map A0T;

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r12 = X.C18200wM.A0s(r16);
        r2 = r14.A02;
        r9 = r2.A0A();
        r2.A0B();
        r4 = r14.A07;
        r3 = X.AnonymousClass0TJ.A05;
        r10 = X.C63803iN.A0E(r3, r4, 36310512514760810L);
        r8 = r2.A0B();
        r7 = r2.A0Z;
        r3 = X.C63803iN.A03(r3, r4, 36591987493109814L);
        r5 = new X.AnonymousClass5ER();
        r1 = X.C18180wK.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r15 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r1.putParcelableArrayList("contact_entries", X.C18200wM.A0s(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r1.putStringArrayList("requested_fields", X.C18200wM.A0s(r12));
        r1.putBoolean("is_consent_accepted", r9);
        r1.putBoolean("should_always_show_ads_disclosure", r10);
        r1.putBoolean("should_show_fbpay_disclosure", r8);
        r1.putBoolean("show_meta_pay_brand", r7);
        r1.putLong("disable_autofill_dismiss_option", r3);
        r5.setArguments(r1);
        r5.A00 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        if (r2.A03() == X.AnonymousClass006.A00) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        r2.A03();
        r0 = "PROMPTED_PREFETCH";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        r1 = A01(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        if (r2.A0A() == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        r0 = "PROMPTED_AUTOFILL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        r1.A0L = r6;
        r2.A05(r5, r1.A01(), "AutofillPaymentBottomSheetDialogFragment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        if (r2.A0B() == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        if (r13 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        r2.A0L = false;
        r0 = X.AnonymousClass7Ep.A00().A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ac, code lost:
        if (r0 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.Cku();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass78Q.A00(new X.AnonymousClass78Q(X.I17.A00(161), r2.A0c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r15.isEmpty() != false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r17 == false) goto L_0x000e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A05(X.AnonymousClass7K3 r14, java.util.List r15, java.util.Set r16, boolean r17) {
        /*
            monitor-enter(r14)
            r6 = 1
            if (r15 == 0) goto L_0x000b
            boolean r0 = r15.isEmpty()     // Catch:{ all -> 0x00c3 }
            r13 = 1
            if (r0 == 0) goto L_0x0010
        L_0x000b:
            r13 = 0
            if (r17 != 0) goto L_0x0010
        L_0x000e:
            monitor-exit(r14)
            return
        L_0x0010:
            java.util.ArrayList r12 = X.C18200wM.A0s(r16)     // Catch:{ all -> 0x00c3 }
            X.5Ej r2 = r14.A02     // Catch:{ all -> 0x00c3 }
            boolean r9 = r2.A0A()     // Catch:{ all -> 0x00c3 }
            r2.A0B()     // Catch:{ all -> 0x00c3 }
            com.instagram.service.session.UserSession r4 = r14.A07     // Catch:{ all -> 0x00c3 }
            X.0TJ r3 = X.AnonymousClass0TJ.A05     // Catch:{ all -> 0x00c3 }
            r0 = 36310512514760810(0x810038000e006a, double:3.0262525528083905E-306)
            boolean r10 = X.C63803iN.A0E(r3, r4, r0)     // Catch:{ all -> 0x00c3 }
            boolean r8 = r2.A0B()     // Catch:{ all -> 0x00c3 }
            boolean r7 = r2.A0Z     // Catch:{ all -> 0x00c3 }
            r0 = 36591987493109814(0x82003800270036, double:3.2042584625250645E-306)
            long r3 = X.C63803iN.A03(r3, r4, r0)     // Catch:{ all -> 0x00c3 }
            X.5ER r5 = new X.5ER     // Catch:{ all -> 0x00c3 }
            r5.<init>()     // Catch:{ all -> 0x00c3 }
            android.os.Bundle r1 = X.C18180wK.A06()     // Catch:{ all -> 0x00c3 }
            if (r15 == 0) goto L_0x004d
            java.util.ArrayList r11 = X.C18200wM.A0s(r15)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "contact_entries"
            r1.putParcelableArrayList(r0, r11)     // Catch:{ all -> 0x00c3 }
        L_0x004d:
            java.util.ArrayList r11 = X.C18200wM.A0s(r12)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "requested_fields"
            r1.putStringArrayList(r0, r11)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "is_consent_accepted"
            r1.putBoolean(r0, r9)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "should_always_show_ads_disclosure"
            r1.putBoolean(r0, r10)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "should_show_fbpay_disclosure"
            r1.putBoolean(r0, r8)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "show_meta_pay_brand"
            r1.putBoolean(r0, r7)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "disable_autofill_dismiss_option"
            r1.putLong(r0, r3)     // Catch:{ all -> 0x00c3 }
            r5.setArguments(r1)     // Catch:{ all -> 0x00c3 }
            r5.A00 = r14     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r1 = r2.A03()     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x00c3 }
            if (r1 == r0) goto L_0x008c
            r2.A03()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "PROMPTED_PREFETCH"
        L_0x0081:
            X.78Q r1 = A01(r14, r0)     // Catch:{ all -> 0x00c3 }
            boolean r0 = r2.A0A()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x0090
            goto L_0x008f
        L_0x008c:
            java.lang.String r0 = "PROMPTED_AUTOFILL"
            goto L_0x0081
        L_0x008f:
            r6 = 0
        L_0x0090:
            r1.A0L = r6     // Catch:{ all -> 0x00c3 }
            X.6n8 r1 = r1.A01()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "AutofillPaymentBottomSheetDialogFragment"
            r2.A05(r5, r1, r0)     // Catch:{ all -> 0x00c3 }
            boolean r0 = r2.A0B()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x000e
            if (r13 == 0) goto L_0x000e
            r0 = 0
            r2.A0L = r0     // Catch:{ all -> 0x00c3 }
            X.7Ep r0 = X.AnonymousClass7Ep.A00()     // Catch:{ all -> 0x00c3 }
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r0.A06     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00b1
            r0.Cku()     // Catch:{ RemoteException -> 0x00b1 }
        L_0x00b1:
            java.lang.String r2 = r2.A0c     // Catch:{ all -> 0x00c3 }
            r0 = 161(0xa1, float:2.26E-43)
            java.lang.String r1 = X.I17.A00(r0)     // Catch:{ all -> 0x00c3 }
            X.78Q r0 = new X.78Q     // Catch:{ all -> 0x00c3 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00c3 }
            X.AnonymousClass78Q.A00(r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x000e
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K3.A05(X.7K3, java.util.List, java.util.Set, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(int r13, android.content.Intent r14) {
        /*
            r12 = this;
            r2 = 0
            if (r14 == 0) goto L_0x0107
            java.lang.String r1 = "keyResultEventName"
            boolean r0 = r14.hasExtra(r1)
            if (r0 == 0) goto L_0x0107
            java.lang.String r7 = r14.getStringExtra(r1)
        L_0x000f:
            r0 = -1
            r6 = r12
            if (r13 != r0) goto L_0x00f9
            if (r14 == 0) goto L_0x008b
            java.lang.String r0 = "keyResultCardDetails"
            android.os.Parcelable r3 = r14.getParcelableExtra(r0)
            com.fbpay.w3c.CardDetails r3 = (com.fbpay.w3c.CardDetails) r3
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "timeElapsedInMs"
            r4 = 33
            if (r5 < r4) goto L_0x00f1
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.Object r0 = r14.getParcelableExtra(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
        L_0x002d:
            r10 = -999(0xfffffffffffffc19, double:NaN)
            if (r0 != 0) goto L_0x00eb
            r8 = -999(0xfffffffffffffc19, double:NaN)
        L_0x0033:
            java.lang.String r1 = "additionalTimeElapsedInMs"
            if (r5 < r4) goto L_0x00e3
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.Object r0 = r14.getParcelableExtra(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
        L_0x003f:
            if (r0 == 0) goto L_0x0045
            long r10 = r0.longValue()
        L_0x0045:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x004d
            java.lang.String r7 = "SUCCEEDED_CVV_VERIFICATION"
        L_0x004d:
            X.78Q r4 = r6.A07(r7, r8, r10)
            if (r3 == 0) goto L_0x0087
            java.util.Map r5 = r12.A0F
            java.lang.String r1 = r3.A06
            java.lang.String r0 = "cc-number"
            r5.put(r0, r1)
            java.util.Map r5 = r12.A0F
            java.lang.Integer r0 = r3.A02
            if (r0 != 0) goto L_0x00de
            r1 = r2
        L_0x0063:
            java.lang.String r0 = "cc-exp-month"
            r5.put(r0, r1)
            java.util.Map r1 = r12.A0F
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L_0x0072
            java.lang.String r2 = r0.toString()
        L_0x0072:
            java.lang.String r0 = "cc-exp-year"
            r1.put(r0, r2)
            java.util.Map r2 = r12.A0F
            java.lang.String r1 = r3.A08
            java.lang.String r0 = "cc-csc"
            r2.put(r0, r1)
            java.lang.String r0 = r3.A07
            r4.A0C = r0
            int r0 = (int) r8
            r4.A01 = r0
        L_0x0087:
            X.AnonymousClass78Q.A00(r4)
            r2 = r3
        L_0x008b:
            java.lang.String r1 = A02(r12)
            java.util.Map r0 = r12.A0T
            java.lang.Object r1 = r0.get(r1)
            X.78k r1 = (X.C1200778k) r1
            if (r1 != 0) goto L_0x00a3
            X.5Ej r1 = r12.A02
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x00d9
            X.78k r1 = r1.A08
            if (r1 == 0) goto L_0x00d9
        L_0x00a3:
            X.IF5 r0 = r12.A04
            if (r0 == 0) goto L_0x00d9
            java.util.Map r4 = r1.A02()
            if (r2 == 0) goto L_0x00c4
            X.5Ej r1 = r12.A02
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x00da
            r0 = 1
            r1.A0P = r0
        L_0x00b6:
            java.lang.String r1 = r2.A06
            java.lang.String r0 = "cc-number"
            r4.put(r0, r1)
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "cc-csc"
            r4.put(r0, r1)
        L_0x00c4:
            X.50v r3 = r12.A01
            java.util.Set r2 = X.C103836ao.A03
            java.util.Set r1 = X.C103836ao.A04
            X.5Ej r0 = r12.A03
            android.util.SparseArray r1 = X.C122097Kc.A01(r3, r0, r4, r2, r1)
            X.IF5 r0 = r12.A04
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.5fr r0 = r0.A01
            r0.autofill(r1)
        L_0x00d9:
            return
        L_0x00da:
            r0 = 1
            r1.A0O = r0
            goto L_0x00b6
        L_0x00de:
            java.lang.String r1 = r0.toString()
            goto L_0x0063
        L_0x00e3:
            android.os.Parcelable r0 = r14.getParcelableExtra(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            goto L_0x003f
        L_0x00eb:
            long r8 = r0.longValue()
            goto L_0x0033
        L_0x00f1:
            android.os.Parcelable r0 = r14.getParcelableExtra(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            goto L_0x002d
        L_0x00f9:
            if (r13 != 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0103
            java.lang.String r7 = "CANCELED_CVV_VERIFICATION"
        L_0x0103:
            A04(r12, r7)
            goto L_0x008b
        L_0x0107:
            r7 = r2
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K3.A08(int, android.content.Intent):void");
    }

    public static AnonymousClass78Q A00(C89405Ej r6, AnonymousClass7K3 r7, String str) {
        AnonymousClass78Q A072 = r7.A07(str, -1, -1);
        A072.A0L = !r6.A0A();
        return A072;
    }

    public static AnonymousClass78Q A01(AnonymousClass7K3 r4, String str) {
        return r4.A07(str, -1, -1);
    }

    public static String A02(AnonymousClass7K3 r0) {
        C39730Kys kys = r0.A02.A03;
        if (kys == null) {
            return null;
        }
        return ((BrowserLiteFragment) kys).A0e;
    }

    public static void A03(AnonymousClass7K3 r6, CardDetails cardDetails, String str) {
        Activity activity = (Activity) r6.A02.A00;
        if (r6.A06 != null && activity != null) {
            Bundle A062 = C18180wK.A06();
            A062.putString("keyCredentialId", str);
            A062.putParcelable("keyAuthFlow", cardDetails);
            AnonymousClass7IX r0 = r6.A06;
            Intent A002 = AnonymousClass7IX.A00(activity, r0);
            if (A002 != null) {
                A062.putStringArrayList("methodNames", r0.A09);
                A002.putExtras(A062);
                C16430t3.A00(activity, A002, 1001);
                return;
            }
            throw C18180wK.A0a("No payment activity is found. Did you check if payment is available?");
        }
    }

    public static void A04(AnonymousClass7K3 r4, String str) {
        AnonymousClass7KI.A08(r4.A07(str, -1, -1).A01());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r4 == null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A06(com.fbpay.w3c.CardDetails r7) {
        /*
            r6 = this;
            X.50v r0 = r6.A01
            if (r0 != 0) goto L_0x00f9
            r2 = 0
        L_0x0005:
            java.util.Set r0 = r6.A0I
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = r7.A06
            if (r1 != 0) goto L_0x00d7
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_UNDETECTED_CC_NUMBER"
            java.lang.String r0 = "UNDETECTED_CC_NUMBER"
        L_0x0017:
            r3.put(r1, r0)
        L_0x001a:
            java.lang.String r0 = r7.A08
            if (r0 != 0) goto L_0x00c5
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_UNDETECTED_CC_CSC"
            java.lang.String r0 = "UNDETECTED_CC_CSC"
        L_0x0024:
            r3.put(r1, r0)
        L_0x0027:
            java.lang.Integer r5 = r7.A02
            if (r5 != 0) goto L_0x00b0
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_UNDETECTED_CC_EXP_MONTH"
            java.lang.String r0 = "UNDETECTED_CC_EXP_MONTH"
        L_0x0031:
            r3.put(r1, r0)
        L_0x0034:
            java.lang.Integer r4 = r7.A03
            if (r4 != 0) goto L_0x00a1
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_UNDETECTED_CC_EXP_YEAR"
            java.lang.String r0 = "UNDETECTED_CC_EXP_YEAR"
        L_0x003e:
            r3.put(r1, r0)
            if (r4 == 0) goto L_0x0054
        L_0x0043:
            if (r5 == 0) goto L_0x0054
            boolean r0 = X.C122097Kc.A07(r7)
            if (r0 != 0) goto L_0x0054
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_INVALID_CC_EXP_DATE"
            java.lang.String r0 = "INVALID_CC_EXP_DATE"
            r3.put(r1, r0)
        L_0x0054:
            boolean r0 = r6.A0M
            if (r0 == 0) goto L_0x0061
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_DECLINED_SAVE_ONCE"
            java.lang.String r0 = "DECLINED_SAVE_ONCE"
            r3.put(r1, r0)
        L_0x0061:
            X.5Ej r0 = r6.A02
            java.lang.Integer r1 = r0.A03()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x0074
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_USER_OPTED_OUT"
            java.lang.String r0 = "USER_OPTED_OUT"
            r3.put(r1, r0)
        L_0x0074:
            java.util.List r3 = r6.A0E
            if (r3 == 0) goto L_0x008d
            r1 = 1
            com.facebook.redex.IDxPredicateShape352S0100000_2_I2 r0 = new com.facebook.redex.IDxPredicateShape352S0100000_2_I2
            r0.<init>(r7, r1)
            java.lang.Object r0 = X.AnonymousClass3W7.A00(r0, r3)
            if (r0 == 0) goto L_0x008d
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_CARD_EXIST"
            java.lang.String r0 = "CARD_EXIST"
            r3.put(r1, r0)
        L_0x008d:
            java.util.Map r0 = r6.A0G
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = "NO_PROMPTED_SAVE"
            X.78Q r0 = A01(r6, r0)
            r0.A0B = r2
            X.AnonymousClass78Q.A00(r0)
        L_0x00a0:
            return
        L_0x00a1:
            int r1 = r4.intValue()
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 >= r0) goto L_0x0043
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_INVALID_CC_EXP_YEAR"
            java.lang.String r0 = "INVALID_CC_EXP_YEAR"
            goto L_0x003e
        L_0x00b0:
            r0 = 1
            int r1 = r5.intValue()
            if (r1 < r0) goto L_0x00bd
            r0 = 12
            if (r1 > r0) goto L_0x00bd
            goto L_0x0034
        L_0x00bd:
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_INVALID_CC_EXP_MONTH"
            java.lang.String r0 = "INVALID_CC_EXP_MONTH"
            goto L_0x0031
        L_0x00c5:
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L_0x0027
            r0 = 4
            if (r1 == r0) goto L_0x0027
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_INVALID_CC_CSC"
            java.lang.String r0 = "INVALID_CC_CSC"
            goto L_0x0024
        L_0x00d7:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00f1
            X.69W r0 = X.AnonymousClass69W.A00(r1)
            boolean r0 = X.C99236Iq.A00(r0, r1)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = r7.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f1
            goto L_0x001a
        L_0x00f1:
            java.util.Map r3 = r6.A0H
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_INVALID_CC_NUMBER"
            java.lang.String r0 = "INVALID_CC_NUMBER"
            goto L_0x0017
        L_0x00f9:
            java.lang.String r0 = r0.A05
            java.lang.String r2 = X.AnonymousClass7K0.A00(r0)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K3.A06(com.fbpay.w3c.CardDetails):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0246, code lost:
        r7.put("use_ptt", java.lang.String.valueOf(X.C63803iN.A0E(r14, r15, r0)));
        r1 = java.lang.String.valueOf(r23);
        r0 = "time_elapsed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0259, code lost:
        r7.put(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if (r0 == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e3, code lost:
        r15 = X.AnonymousClass7HK.A00();
        r14 = X.AnonymousClass0TJ.A06;
        r7.put("use_ptt", java.lang.String.valueOf(X.C63803iN.A0E(r14, r15, 36310512516792442L)));
        r7.put("use_ptt_for_bindcard", java.lang.String.valueOf(X.C63803iN.A0E(r14, X.AnonymousClass7HK.A00(), 36310512516726905L)));
        r7.put("time_elapsed", java.lang.String.valueOf(r23));
        r1 = java.lang.String.valueOf(r25);
        r0 = "additional_time_elapsed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0225, code lost:
        if (r0 == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0227, code lost:
        r15 = X.AnonymousClass7HK.A00();
        r14 = X.AnonymousClass0TJ.A06;
        r0 = 36310512516726905L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0239, code lost:
        if (r10.equals(r0) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023b, code lost:
        r15 = X.AnonymousClass7HK.A00();
        r14 = X.AnonymousClass0TJ.A06;
        r0 = 36310512516792442L;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass78Q A07(java.lang.String r22, long r23, long r25) {
        /*
            r21 = this;
            r11 = r21
            X.5Ej r9 = r11.A02
            java.lang.String r0 = r9.A0c
            X.78Q r8 = new X.78Q
            r10 = r22
            r8.<init>(r10, r0)
            java.lang.String r0 = r11.A0A
            r8.A08 = r0
            java.lang.String r0 = A02(r11)
            r8.A06 = r0
            java.util.Set r0 = r11.A0I
            java.lang.String r0 = X.AnonymousClass7KI.A01(r0)
            r8.A0B = r0
            java.lang.String r0 = r11.A09
            r8.A04 = r0
            java.util.HashSet r1 = X.C18200wM.A0u()
            java.util.List r0 = r11.A0D
            java.util.Set r0 = X.AnonymousClass7KI.A04(r0)
            r1.addAll(r0)
            java.util.List r0 = r11.A0E
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003f
            java.util.Set r0 = X.C103836ao.A05
            r1.addAll(r0)
        L_0x003f:
            java.lang.String r0 = X.AnonymousClass7KI.A01(r1)
            r8.A05 = r0
            java.lang.String r0 = r11.A0B
            r8.A0F = r0
            java.lang.String r0 = r11.A0C
            r8.A0D = r0
            java.util.Set r0 = r11.A0J
            java.lang.String r0 = X.AnonymousClass7KI.A01(r0)
            r8.A0C = r0
            java.util.HashMap r7 = X.AnonymousClass0wJ.A0y()
            int r20 = r10.hashCode()
            java.lang.String r13 = "PROMPTED_ADD_NEW_CARD"
            java.lang.String r12 = "PROMPTED_SAVE"
            switch(r20) {
                case -1824420039: goto L_0x025e;
                case -1745715671: goto L_0x0263;
                case -1736385848: goto L_0x0268;
                case -1099895954: goto L_0x026b;
                case -144590650: goto L_0x026e;
                default: goto L_0x0064;
            }
        L_0x0064:
            java.lang.String r19 = "ACCEPTED_ADD_NEW_CARD"
            java.lang.String r18 = "DECLINED_ADD_NEW_CARD"
            java.lang.String r17 = "DECLINED_SAVE"
            java.lang.String r16 = "ACCEPTED_SAVE"
            java.lang.String r6 = "SUCCEEDED_SAVE_PAYMENT_OPT_IN_DATA"
            java.lang.String r5 = "FAILED_SAVE_NEW_CARD"
            java.lang.String r4 = "SUCCEEDED_SAVE_NEW_CARD"
            java.lang.String r3 = "FAILED_SAVE_PAYMENT_OPT_IN_DATA"
            java.lang.String r2 = "FAILED_CARD_VERIFICATION"
            switch(r20) {
                case -1801318401: goto L_0x01c4;
                case -1539874445: goto L_0x01c9;
                case -1215959441: goto L_0x01ce;
                case -1199051928: goto L_0x01d3;
                case 797729369: goto L_0x01d8;
                case 964705388: goto L_0x01db;
                case 1801540219: goto L_0x0221;
                case 1837359317: goto L_0x0233;
                default: goto L_0x0079;
            }
        L_0x0079:
            switch(r20) {
                case -2017877686: goto L_0x015b;
                case -1993895147: goto L_0x015e;
                case -1824420039: goto L_0x0165;
                case -1801318401: goto L_0x016a;
                case -1796214034: goto L_0x016f;
                case -1745715671: goto L_0x0176;
                case -1539874445: goto L_0x017b;
                case -1238602589: goto L_0x0180;
                case -1215959441: goto L_0x0183;
                case -1199051928: goto L_0x0188;
                case -1099895954: goto L_0x018d;
                case -255182467: goto L_0x0190;
                case 520419524: goto L_0x0193;
                case 797729369: goto L_0x0196;
                case 964705388: goto L_0x0199;
                case 1458592990: goto L_0x019c;
                case 1801540219: goto L_0x01a3;
                case 1837359317: goto L_0x01a8;
                case 2146756101: goto L_0x01af;
                default: goto L_0x007c;
            }
        L_0x007c:
            switch(r20) {
                case -1993895147: goto L_0x00b7;
                case -1824420039: goto L_0x00be;
                case -1801318401: goto L_0x00c3;
                case -1796214034: goto L_0x00c8;
                case -1790013079: goto L_0x00cf;
                case -1745715671: goto L_0x00d2;
                case -1654021070: goto L_0x00d7;
                case -1539874445: goto L_0x00da;
                case -1215959441: goto L_0x00df;
                case -1199051928: goto L_0x00f5;
                case -1057706804: goto L_0x00e4;
                case -936146503: goto L_0x00e7;
                case -511727928: goto L_0x00ea;
                case 520419524: goto L_0x00ed;
                case 592348558: goto L_0x00f0;
                case 964705388: goto L_0x00f3;
                case 1458592990: goto L_0x00fa;
                case 1801540219: goto L_0x0101;
                case 2146756101: goto L_0x0106;
                default: goto L_0x007f;
            }
        L_0x007f:
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = "NO_PROMPTED_SAVE"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0094
            java.util.Map r0 = r11.A0H
        L_0x0091:
            r7.putAll(r0)
        L_0x0094:
            r8.A0I = r7
            boolean r0 = r11.A0L
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "credit_card_nux"
        L_0x009c:
            r8.A0H = r0
            boolean r0 = r9.A0V
            r0 = r0 ^ 1
            r8.A0J = r0
            java.lang.Integer r1 = r9.A03()
            java.lang.Integer r0 = X.AnonymousClass006.A00
            boolean r0 = r1.equals(r0)
            r8.A0K = r0
            return r8
        L_0x00b1:
            java.lang.String r0 = "credit_card_pux"
            goto L_0x009c
        L_0x00b4:
            java.util.Map r0 = r11.A0G
            goto L_0x0091
        L_0x00b7:
            r0 = r16
            boolean r0 = r10.equals(r0)
            goto L_0x010c
        L_0x00be:
            boolean r0 = r10.equals(r12)
            goto L_0x010c
        L_0x00c3:
            boolean r0 = r10.equals(r3)
            goto L_0x010c
        L_0x00c8:
            r0 = r17
            boolean r0 = r10.equals(r0)
            goto L_0x010c
        L_0x00cf:
            java.lang.String r2 = "CONNECT_PAYMENT_FORM_COMPLETION"
            goto L_0x00f5
        L_0x00d2:
            boolean r0 = r10.equals(r13)
            goto L_0x010c
        L_0x00d7:
            java.lang.String r2 = "ACCEPTED_CONNECT"
            goto L_0x00f5
        L_0x00da:
            boolean r0 = r10.equals(r4)
            goto L_0x010c
        L_0x00df:
            boolean r0 = r10.equals(r5)
            goto L_0x010c
        L_0x00e4:
            java.lang.String r2 = "SUCCEEDED_CONNECT"
            goto L_0x00f5
        L_0x00e7:
            java.lang.String r2 = "DECLINED_CONNECT"
            goto L_0x00f5
        L_0x00ea:
            java.lang.String r2 = "FAILED_CONNECT"
            goto L_0x00f5
        L_0x00ed:
            java.lang.String r2 = "CANCELED_CARD_VERIFICATION"
            goto L_0x00f5
        L_0x00f0:
            java.lang.String r2 = "PROMPTED_CONNECT"
            goto L_0x00f5
        L_0x00f3:
            java.lang.String r2 = "SUCCEEDED_CARD_VERIFICATION"
        L_0x00f5:
            boolean r0 = r10.equals(r2)
            goto L_0x010c
        L_0x00fa:
            r0 = r18
            boolean r0 = r10.equals(r0)
            goto L_0x010c
        L_0x0101:
            boolean r0 = r10.equals(r6)
            goto L_0x010c
        L_0x0106:
            r0 = r19
            boolean r0 = r10.equals(r0)
        L_0x010c:
            if (r0 == 0) goto L_0x007f
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r9.A09
            if (r0 == 0) goto L_0x0158
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r0 = r0.A02
            if (r0 == 0) goto L_0x0158
            java.lang.String r1 = "Yes"
        L_0x0118:
            java.lang.String r0 = "connect_eligibility"
            r7.put(r0, r1)
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r9.A09
            if (r0 == 0) goto L_0x0155
            java.lang.String r1 = ""
            int r0 = r0.A00
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r0)
        L_0x0129:
            java.lang.String r0 = "connect_neg_count"
            r7.put(r0, r1)
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r9.A09
            if (r0 == 0) goto L_0x007f
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r0 = r0.A02
            if (r0 == 0) goto L_0x007f
            com.instagram.service.session.UserSession r3 = r9.A0B
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36310512515874932(0x810038001f0074, double:3.026252553512966E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "connect_qe_ineligible"
        L_0x014b:
            java.lang.String r1 = "connect_status"
            r7.put(r1, r0)
            goto L_0x007f
        L_0x0152:
            java.lang.String r0 = r9.A0F
            goto L_0x014b
        L_0x0155:
            java.lang.String r1 = "0"
            goto L_0x0129
        L_0x0158:
            java.lang.String r1 = "No"
            goto L_0x0118
        L_0x015b:
            java.lang.String r0 = "ACCEPTED_AUTOFILL"
            goto L_0x01aa
        L_0x015e:
            r0 = r16
            boolean r0 = r10.equals(r0)
            goto L_0x01b5
        L_0x0165:
            boolean r0 = r10.equals(r12)
            goto L_0x01b5
        L_0x016a:
            boolean r0 = r10.equals(r3)
            goto L_0x01b5
        L_0x016f:
            r0 = r17
            boolean r0 = r10.equals(r0)
            goto L_0x01b5
        L_0x0176:
            boolean r0 = r10.equals(r13)
            goto L_0x01b5
        L_0x017b:
            boolean r0 = r10.equals(r4)
            goto L_0x01b5
        L_0x0180:
            java.lang.String r0 = "DECLINED_AUTOFILL"
            goto L_0x01aa
        L_0x0183:
            boolean r0 = r10.equals(r5)
            goto L_0x01b5
        L_0x0188:
            boolean r0 = r10.equals(r2)
            goto L_0x01b5
        L_0x018d:
            java.lang.String r0 = "PROMPTED_AUTOFILL"
            goto L_0x01aa
        L_0x0190:
            java.lang.String r0 = "CANCELED_CVV_VERIFICATION"
            goto L_0x01aa
        L_0x0193:
            java.lang.String r0 = "CANCELED_CARD_VERIFICATION"
            goto L_0x01aa
        L_0x0196:
            java.lang.String r0 = "FAILED_CVV_VERIFICATION"
            goto L_0x01aa
        L_0x0199:
            java.lang.String r0 = "SUCCEEDED_CARD_VERIFICATION"
            goto L_0x01aa
        L_0x019c:
            r0 = r18
            boolean r0 = r10.equals(r0)
            goto L_0x01b5
        L_0x01a3:
            boolean r0 = r10.equals(r6)
            goto L_0x01b5
        L_0x01a8:
            java.lang.String r0 = "SUCCEEDED_CVV_VERIFICATION"
        L_0x01aa:
            boolean r0 = r10.equals(r0)
            goto L_0x01b5
        L_0x01af:
            r0 = r19
            boolean r0 = r10.equals(r0)
        L_0x01b5:
            if (r0 == 0) goto L_0x007c
            int r0 = r9.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "DECLINED_AUTOFILL_COUNT"
            r7.put(r0, r1)
            goto L_0x007c
        L_0x01c4:
            boolean r0 = r10.equals(r3)
            goto L_0x0225
        L_0x01c9:
            boolean r0 = r10.equals(r4)
            goto L_0x0225
        L_0x01ce:
            boolean r0 = r10.equals(r5)
            goto L_0x0225
        L_0x01d3:
            boolean r0 = r10.equals(r2)
            goto L_0x01e1
        L_0x01d8:
            java.lang.String r0 = "FAILED_CVV_VERIFICATION"
            goto L_0x0235
        L_0x01db:
            java.lang.String r0 = "SUCCEEDED_CARD_VERIFICATION"
            boolean r0 = r10.equals(r0)
        L_0x01e1:
            if (r0 == 0) goto L_0x0079
            com.instagram.service.session.UserSession r15 = X.AnonymousClass7HK.A00()
            X.0TJ r14 = X.AnonymousClass0TJ.A06
            r0 = 36310512516792442(0x810038002d007a, double:3.026252554093203E-306)
            boolean r0 = X.C63803iN.A0E(r14, r15, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "use_ptt"
            r7.put(r0, r1)
            com.instagram.service.session.UserSession r15 = X.AnonymousClass7HK.A00()
            r0 = 36310512516726905(0x810038002c0079, double:3.026252554051757E-306)
            boolean r0 = X.C63803iN.A0E(r14, r15, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "use_ptt_for_bindcard"
            r7.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r23)
            java.lang.String r0 = "time_elapsed"
            r7.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r25)
            java.lang.String r0 = "additional_time_elapsed"
            goto L_0x0259
        L_0x0221:
            boolean r0 = r10.equals(r6)
        L_0x0225:
            if (r0 == 0) goto L_0x0079
            com.instagram.service.session.UserSession r15 = X.AnonymousClass7HK.A00()
            X.0TJ r14 = X.AnonymousClass0TJ.A06
            r0 = 36310512516726905(0x810038002c0079, double:3.026252554051757E-306)
            goto L_0x0246
        L_0x0233:
            java.lang.String r0 = "SUCCEEDED_CVV_VERIFICATION"
        L_0x0235:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0079
            com.instagram.service.session.UserSession r15 = X.AnonymousClass7HK.A00()
            X.0TJ r14 = X.AnonymousClass0TJ.A06
            r0 = 36310512516792442(0x810038002d007a, double:3.026252554093203E-306)
        L_0x0246:
            boolean r0 = X.C63803iN.A0E(r14, r15, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "use_ptt"
            r7.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r23)
            java.lang.String r0 = "time_elapsed"
        L_0x0259:
            r7.put(r0, r1)
            goto L_0x0079
        L_0x025e:
            boolean r0 = r10.equals(r12)
            goto L_0x0274
        L_0x0263:
            boolean r0 = r10.equals(r13)
            goto L_0x0274
        L_0x0268:
            java.lang.String r0 = "PAYMENT_AUTOFILL_DOMAIN_REQUEST"
            goto L_0x0270
        L_0x026b:
            java.lang.String r0 = "PROMPTED_AUTOFILL"
            goto L_0x0270
        L_0x026e:
            java.lang.String r0 = "FIRST_FORM_INTERACTION"
        L_0x0270:
            boolean r0 = r10.equals(r0)
        L_0x0274:
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11.A0L
            if (r0 == 0) goto L_0x0283
            java.lang.String r1 = "credit_card_nux"
        L_0x027c:
            java.lang.String r0 = "meta_pay_account_payment_method_status"
            r7.put(r0, r1)
            goto L_0x0064
        L_0x0283:
            java.lang.String r1 = "credit_card_pux"
            goto L_0x027c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K3.A07(java.lang.String, long, long):X.78Q");
    }

    public final void A09(Context context) {
        if (this.A0E == null) {
            AnonymousClass7IX r0 = this.A06;
            if (r0 == null) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                A0v.add("https://www.facebook.com/basiccard");
                A0v.add(I17.A00(244));
                r0 = new AnonymousClass7IX(context, A0v);
                this.A06 = r0;
            }
            if (!r0.A04()) {
                A04(this, "W3CCLIENT_NOT_AVAILABLE");
                return;
            }
            if (this.A00 == null) {
                this.A00 = C86114wI.A0Q(this, 11);
            }
            C1189172u.A00(new AnonymousClass80X(this.A06.A04, this));
        }
    }

    public final void A0A(C872350v r11) {
        String A002;
        String A0r;
        String A052;
        Pair A003;
        Object obj;
        if (r11 != null && (A002 = AnonymousClass7K0.A00(r11.A05)) != null) {
            C89405Ej r1 = this.A02;
            if (!r1.A0J.contains(A002)) {
                Context context = r1.A00;
                Set set = C103836ao.A04;
                C89405Ej r5 = this.A03;
                HashMap A0y = AnonymousClass0wJ.A0y();
                for (C872350v r12 : Collections.unmodifiableList(r11.A08)) {
                    AutofillValue autofillValue = r12.A03;
                    String A042 = C122097Kc.A04(r12, r5, set);
                    if (!(A042 == null || autofillValue == null)) {
                        if (autofillValue.isText()) {
                            if (autofillValue.getTextValue().length() != 0) {
                                if (!(!"cc-exp".equals(A042) || (A003 = C122097Kc.A00(context, autofillValue.getTextValue().toString())) == null || (obj = A003.first) == null || A003.second == null)) {
                                    A0y.put("cc-exp-month", obj.toString());
                                    A0y.put("cc-exp-year", A003.second.toString());
                                }
                                if (C122097Kc.A05(A042, autofillValue.getTextValue().toString()) != null) {
                                    A052 = autofillValue.getTextValue().toString();
                                }
                            }
                        } else if (autofillValue.isList()) {
                            int listValue = autofillValue.getListValue();
                            CharSequence[] charSequenceArr = r12.A06;
                            if (charSequenceArr != null && listValue < charSequenceArr.length) {
                                A052 = C122097Kc.A05(A042, charSequenceArr[listValue].toString());
                            }
                        }
                        A0y.put(A042, A052);
                    }
                }
                if (C122097Kc.A01.contains(r11.A05) && (A0r = C18220wO.A0r("cc-number", A0y)) != null) {
                    String replaceAll = A0r.replaceAll(" ", "");
                    if (replaceAll.length() == 15) {
                        int i = 48;
                        while (true) {
                            String A0A2 = AnonymousClass00U.A0A(replaceAll, (char) i);
                            if (!TextUtils.isEmpty(A0A2) && C99236Iq.A00(AnonymousClass69W.A00(A0A2), A0A2)) {
                                A0y.put("cc-number", A0A2);
                                break;
                            }
                            i++;
                            if (i > 57) {
                                break;
                            }
                        }
                    }
                }
                this.A0F.putAll(A0y);
            }
        }
    }

    public final void A0B(C1200778k r6) {
        if (this.A04 != null) {
            ((SystemWebView) this.A04).A01.autofill(C122097Kc.A01(this.A01, this.A03, r6.A01(), C103836ao.A03, C103836ao.A04));
            A0C(r6);
        }
    }

    public final boolean A0D() {
        List list = this.A0E;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r2 = r2.replaceAll(" ", "");
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(com.facebook.browser.lite.extensions.autofill.model.AutofillData r25, java.lang.String r26) {
        /*
            r24 = this;
            r4 = r24
            java.util.Map r0 = r4.A0F
            boolean r0 = r0.isEmpty()
            r10 = 0
            if (r0 != 0) goto L_0x0101
            r17 = 0
            r16 = 0
            r21 = 0
            java.util.Map r1 = r4.A0F
            java.lang.String r0 = "cc-number"
            java.lang.String r2 = X.C18220wO.A0r(r0, r1)
            if (r2 == 0) goto L_0x002f
            java.lang.String r1 = " "
            java.lang.String r0 = ""
            java.lang.String r2 = r2.replaceAll(r1, r0)
            int r1 = r2.length()
            r0 = 4
            if (r1 <= r0) goto L_0x002f
            int r1 = r1 - r0
            java.lang.String r21 = r2.substring(r1)
        L_0x002f:
            java.util.Map r1 = r4.A0F
            java.lang.String r0 = "cc-csc"
            java.lang.String r20 = X.C18220wO.A0r(r0, r1)
            if (r20 == 0) goto L_0x003d
            java.lang.String r20 = r20.trim()
        L_0x003d:
            if (r2 == 0) goto L_0x0047
            X.69W r0 = X.AnonymousClass69W.A00(r2)
            java.lang.String r16 = r0.toString()
        L_0x0047:
            java.util.Map r0 = r4.A0F
            java.lang.String r1 = "cc-exp"
            java.lang.Object r0 = r0.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x014c
            java.util.Map r0 = r4.A0F
            java.lang.String r1 = X.C18220wO.A0r(r1, r0)
            X.5Ej r3 = r4.A02
            android.content.Context r0 = r3.A00
            android.util.Pair r0 = X.C122097Kc.A00(r0, r1)
            if (r0 == 0) goto L_0x014c
            java.lang.Object r6 = r0.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
        L_0x006f:
            com.fbpay.w3c.CardDetails r5 = new com.fbpay.w3c.CardDetails
            r14 = r6
            r15 = r0
            r18 = r2
            r19 = r17
            r12 = r5
            r13 = r17
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r26
            boolean r0 = r3.A0D(r0)
            if (r0 != 0) goto L_0x00fe
            boolean r0 = r4.A0M
            if (r0 != 0) goto L_0x00fe
            java.lang.String r1 = r5.A06
            if (r1 == 0) goto L_0x00fe
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00fe
            X.69W r0 = X.AnonymousClass69W.A00(r1)
            boolean r0 = X.C99236Iq.A00(r0, r1)
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = r5.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00fe
            java.lang.Integer r1 = r5.A02
            r0 = 1
            if (r1 == 0) goto L_0x00fe
            int r1 = r1.intValue()
            if (r1 < r0) goto L_0x00fe
            r0 = 12
            if (r1 > r0) goto L_0x00fe
            java.lang.Integer r0 = r5.A03
            if (r0 == 0) goto L_0x00fe
            int r1 = r0.intValue()
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 < r0) goto L_0x00fe
            java.lang.String r0 = r5.A08
            if (r0 == 0) goto L_0x00fe
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L_0x00ce
            r0 = 4
            if (r1 != r0) goto L_0x00fe
        L_0x00ce:
            boolean r0 = X.C122097Kc.A07(r5)
            if (r0 == 0) goto L_0x00fe
            java.lang.String r19 = "FORM_COMPLETION"
            r20 = -1
            r18 = r4
            r22 = r20
            X.78Q r9 = r18.A07(r19, r20, r22)
            java.lang.String r8 = "PAYMENT_AUTOFILL"
            r9.A0F = r8
            java.lang.Long r2 = r4.A08
            if (r2 != 0) goto L_0x0142
            r0 = 0
        L_0x00ea:
            r9.A02 = r0
            X.AnonymousClass78Q.A00(r9)
            java.lang.Integer r1 = r3.A03()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r7 = 1
            if (r1 != r0) goto L_0x0102
            boolean r0 = r3.A0E(r7)
            if (r0 != 0) goto L_0x0102
        L_0x00fe:
            r4.A06(r5)
        L_0x0101:
            return r10
        L_0x0102:
            java.lang.Integer r0 = r3.A03()
            java.lang.Integer r12 = X.AnonymousClass006.A00
            boolean r2 = r0.equals(r12)
            boolean r0 = r3.A0K
            java.util.List r1 = r4.A0E
            if (r0 == 0) goto L_0x0121
            if (r2 == 0) goto L_0x013f
            if (r1 == 0) goto L_0x013c
            com.facebook.redex.IDxPredicateShape352S0100000_2_I2 r0 = new com.facebook.redex.IDxPredicateShape352S0100000_2_I2
            r0.<init>(r5, r7)
            java.lang.Object r0 = X.AnonymousClass3W7.A00(r0, r1)
            if (r0 == 0) goto L_0x013c
        L_0x0121:
            X.67G r9 = X.AnonymousClass67G.DO_NOTHING
        L_0x0123:
            X.67G r0 = X.AnonymousClass67G.DO_NOTHING
            if (r9 != r0) goto L_0x012a
            r4.A06(r5)
        L_0x012a:
            if (r9 == r0) goto L_0x012f
            r4.A0D()
        L_0x012f:
            if (r9 == r0) goto L_0x0101
            java.lang.String r1 = "LIGHT_WEIGHT_AUTOSAVE_ENABLED"
            X.7Ep r0 = X.AnonymousClass7Ep.A00()
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r0.A06
            if (r0 == 0) goto L_0x017f
            goto L_0x017c
        L_0x013c:
            X.67G r9 = X.AnonymousClass67G.SHOW_SAVE_DIALOG
            goto L_0x0123
        L_0x013f:
            X.67G r9 = X.AnonymousClass67G.SHOW_OPT_IN_DIALOG
            goto L_0x0123
        L_0x0142:
            long r0 = java.lang.System.currentTimeMillis()
            long r6 = r2.longValue()
            long r0 = r0 - r6
            goto L_0x00ea
        L_0x014c:
            java.util.Map r1 = r4.A0F
            java.lang.String r0 = "cc-exp-month"
            java.lang.String r0 = X.C18220wO.A0r(r0, r1)
            r6 = 0
            if (r0 == 0) goto L_0x015f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x015f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015f }
        L_0x015f:
            java.util.Map r1 = r4.A0F
            java.lang.String r0 = "cc-exp-year"
            java.lang.String r0 = X.C18220wO.A0r(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0172
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0172 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0172 }
        L_0x0172:
            X.5Ej r3 = r4.A02
            android.content.Context r0 = r3.A00
            java.lang.Integer r0 = X.C122097Kc.A02(r0, r1)
            goto L_0x006f
        L_0x017c:
            r0.BbQ(r1)     // Catch:{ RemoteException -> 0x017f }
        L_0x017f:
            boolean r16 = r3.A0A()
            com.instagram.service.session.UserSession r11 = r4.A07
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36310512514760810(0x810038000e006a, double:3.0262525528083905E-306)
            boolean r15 = X.C63803iN.A0E(r6, r11, r0)
            X.67h r2 = X.C969467h.ORIGINAL
            r10 = r25
            if (r25 == 0) goto L_0x01af
            boolean r0 = r10.A02()
            if (r0 == 0) goto L_0x01af
            r0 = 36873462469689353(0x83003800250009, double:3.382264371122722E-306)
            java.lang.String r1 = X.C63803iN.A0C(r6, r11, r0)
            java.lang.String r0 = "test1"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0242
            X.67h r2 = X.C969467h.CONTACT_AND_PAYMENT
        L_0x01af:
            boolean r14 = r3.A0Z
            r0 = 36591987493109814(0x82003800270036, double:3.2042584625250645E-306)
            long r0 = X.C63803iN.A03(r6, r11, r0)
            X.5ET r13 = new X.5ET
            r13.<init>()
            android.os.Bundle r11 = X.C18180wK.A06()
            java.lang.String r6 = "contact_info"
            r11.putParcelable(r6, r10)
            java.lang.String r6 = "payment_info"
            r11.putParcelable(r6, r5)
            java.lang.String r5 = "action"
            r11.putSerializable(r5, r9)
            java.lang.String r6 = "is_consent_accepted"
            r5 = r16
            r11.putBoolean(r6, r5)
            java.lang.String r5 = "should_always_show_ads_disclosure"
            r11.putBoolean(r5, r15)
            java.lang.String r5 = "show_meta_pay_brand"
            r11.putBoolean(r5, r14)
            java.lang.String r5 = "disable_autofill_dismiss_option"
            r11.putLong(r5, r0)
            java.lang.String r0 = "contact_and_payment_scaling_option"
            r11.putSerializable(r0, r2)
            r13.setArguments(r11)
            r13.A00 = r4
            java.lang.String r1 = "SaveAutofillPaymentBottomSheetDialogFragment"
            r0 = r17
            r3.A05(r13, r0, r1)
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            r4.A0F = r0
            java.lang.Integer r0 = r3.A03()
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x023f
            java.lang.String r19 = "PROMPTED_ADD_NEW_CARD"
        L_0x020b:
            X.78Q r2 = r18.A07(r19, r20, r22)
            boolean r0 = r3.A0A()
            r0 = r0 ^ 1
            r2.A0L = r0
            if (r25 == 0) goto L_0x021b
            java.lang.String r8 = "CONTACT_AND_PAYMENT_AUTOFILL"
        L_0x021b:
            r2.A0F = r8
            java.util.Set r0 = X.C103836ao.A05
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            if (r25 == 0) goto L_0x0235
            com.facebook.browser.lite.extensions.autofill.model.AutofillData[] r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData[]{r10}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Set r0 = X.AnonymousClass7KI.A04(r0)
            r1.addAll(r0)
        L_0x0235:
            java.lang.String r0 = X.AnonymousClass7KI.A01(r1)
            r2.A05 = r0
            X.AnonymousClass78Q.A00(r2)
            return r7
        L_0x023f:
            java.lang.String r19 = "PROMPTED_SAVE"
            goto L_0x020b
        L_0x0242:
            java.lang.String r0 = "test2"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x024e
            X.67h r2 = X.C969467h.CONTACT_AND_PAYMENT_WITH_SAVE_BILLING_OPTION_CIRCLE_CHECKBOX
            goto L_0x01af
        L_0x024e:
            java.lang.String r0 = "test3"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x01af
            X.67h r2 = X.C969467h.CONTACT_AND_PAYMENT_WITH_SAVE_BILLING_OPTION_TOGGLE
            goto L_0x01af
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K3.A0E(com.facebook.browser.lite.extensions.autofill.model.AutofillData, java.lang.String):boolean");
    }

    public AnonymousClass7K3(C89405Ej r4, C89405Ej r5, UserSession userSession) {
        this.A02 = r4;
        this.A03 = r5;
        this.A0S = AnonymousClass0wJ.A0y();
        this.A0T = AnonymousClass0wJ.A0y();
        this.A0Q = false;
        this.A0F = AnonymousClass0wJ.A0y();
        this.A0N = false;
        this.A0A = C18230wP.A0h();
        this.A08 = null;
        this.A0J = C18200wM.A0u();
        this.A0K = C18200wM.A0u();
        this.A0I = C18200wM.A0u();
        this.A0M = false;
        this.A0G = AnonymousClass0wJ.A0y();
        this.A0H = AnonymousClass0wJ.A0y();
        this.A0R = new AutofillFrameworkControllerBase$1(this);
        this.A07 = userSession;
    }

    public final void A0C(C1200778k r6) {
        String A022 = A02(this);
        String A002 = AnonymousClass7K0.A00(A022);
        if (A022 != null && A002 != null) {
            boolean z = true;
            C86154wM.A1U(A002, this.A0S, AnonymousClass0wJ.A1W(r6));
            this.A0T.put(A022, r6);
            if (r6 == null) {
                z = false;
            }
            this.A0Q = z;
        }
    }
}
