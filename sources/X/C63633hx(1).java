package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3hx  reason: invalid class name and case insensitive filesystem */
public final class C63633hx {
    public static final C63633hx A00 = new C63633hx();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r8 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(android.content.Context r7, X.C11630kW r8, X.C10300i6 r9, X.C83914sC r10, java.lang.String r11) {
        /*
            r0 = 1
            X.C04220Ms.A0B(r9, r0)
            java.util.List r0 = A02(r7, r9, r11)
            if (r10 == 0) goto L_0x000d
            r10.C0m(r0)
        L_0x000d:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            android.accounts.AccountManager r5 = android.accounts.AccountManager.get(r7)
            if (r11 == 0) goto L_0x001a
            r4 = 1
            if (r8 != 0) goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            java.util.Iterator r3 = r0.iterator()
        L_0x001f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r2 = r3.next()
            android.accounts.Account r2 = (android.accounts.Account) r2
            if (r4 == 0) goto L_0x0048
            X.C04220Ms.A06(r5)
            java.lang.String r0 = A00(r2, r5, r8, r9, r11)
        L_0x0034:
            if (r0 == 0) goto L_0x001f
            int r1 = r0.length()
            if (r1 == 0) goto L_0x001f
            X.C18240wQ.A1I(r0)
            r6.add(r0)
            if (r10 == 0) goto L_0x001f
            r10.C0n(r2, r0)
            goto L_0x001f
        L_0x0048:
            X.C04220Ms.A06(r5)
            r0 = 2
            X.C04220Ms.A0B(r2, r0)
            r0 = 0
            java.lang.String r0 = A00(r2, r5, r0, r9, r0)
            goto L_0x0034
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63633hx.A01(android.content.Context, X.0kW, X.0i6, X.4sC, java.lang.String):java.util.List");
    }

    public static final void A03(Context context, C11630kW r11, C10300i6 r12, String str, String str2, boolean z) {
        String str3;
        C10300i6 r8 = r12;
        C04220Ms.A0B(r12, 0);
        String str4 = str2;
        AnonymousClass0wJ.A1Q(str, str2);
        A05(r12, str2);
        if (C18180wK.A1W(context.checkSelfPermission("android.permission.GET_ACCOUNTS"))) {
            AccountManager accountManager = AccountManager.get(context);
            Account[] accounts = accountManager.getAccounts();
            C04220Ms.A06(accounts);
            int length = accounts.length;
            int i = 0;
            while (i < length) {
                Account account = accounts[i];
                if (account == null || !"com.google".equalsIgnoreCase(account.type) || !str.equalsIgnoreCase(account.name)) {
                    i++;
                } else {
                    A06(r12, str2, length);
                    boolean z2 = z;
                    if (z || C63173fJ.A05(AnonymousClass0TJ.A05, 18299713186957107L)) {
                        C31155GhB.A03(new C25031lb(account, accountManager, r11, r8, str4, z2));
                        return;
                    }
                    return;
                }
            }
            str3 = "no_match_found";
        } else {
            str3 = "no_permission";
        }
        A07(r12, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r15 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.accounts.Account r13, android.accounts.AccountManager r14, X.C11630kW r15, X.C10300i6 r16, java.lang.String r17) {
        /*
            java.lang.String r4 = "audience:server:client_id:894032761246-7f5ii0dscmtvqu9lcs7bquii0vb6ddc8.apps.googleusercontent.com"
            boolean r3 = X.C18240wQ.A1X(r13)
            java.lang.String r8 = ""
            r6 = 1
            r10 = r15
            r12 = r17
            if (r17 == 0) goto L_0x0011
            r9 = 1
            if (r15 != 0) goto L_0x0012
        L_0x0011:
            r9 = 0
        L_0x0012:
            java.lang.String r5 = "Required value was null."
            r11 = r16
            if (r9 == 0) goto L_0x0039
            if (r17 == 0) goto L_0x00c7
            if (r15 == 0) goto L_0x00c2
            X.0nS r1 = X.C13330nS.A02(r11)
            java.lang.String r0 = "get_google_token_attempt"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 698(0x2ba, float:9.78E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.C18210wN.A19(r1, r12)
            X.AnonymousClass269.A05(r1)
            java.lang.String r0 = r15.getModuleName()
            X.C18210wN.A1C(r1, r0)
        L_0x0039:
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r8 = r14.blockingGetAuthToken(r13, r4, r3)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            java.lang.String r2 = "com.google"
            r14.invalidateAuthToken(r2, r8)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            java.lang.String r8 = r14.blockingGetAuthToken(r13, r4, r3)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            if (r9 == 0) goto L_0x00c1
            if (r17 == 0) goto L_0x0092
            if (r15 == 0) goto L_0x0097
            if (r8 == 0) goto L_0x0059
            int r2 = r8.length()     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            if (r2 == 0) goto L_0x0059
            r6 = 0
        L_0x0059:
            if (r6 != 0) goto L_0x0084
            double r4 = (double) r0     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            double r2 = (double) r6     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            X.0nS r7 = X.C13330nS.A02(r11)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            java.lang.String r6 = "get_google_token_success"
            X.0A2 r7 = X.AnonymousClass0wJ.A0M(r7, r6)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            r6 = 700(0x2bc, float:9.81E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r6 = X.C18180wK.A0I(r7, r6)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            X.C18210wN.A19(r6, r12)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            X.AnonymousClass269.A05(r6)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            X.C18240wQ.A14(r6, r15)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            X.AnonymousClass0wJ.A1A(r6, r2, r4)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            X.AnonymousClass0wJ.A1D(r6, r4, r2)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            r6.Bb4()     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            return r8
        L_0x0084:
            java.lang.String r13 = "empty_token"
            double r14 = (double) r0     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            double r4 = (double) r2     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            r16 = r4
            A04(r10, r11, r12, r13, r14, r16)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            return r8
        L_0x0092:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r5)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
            goto L_0x009b
        L_0x0097:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r5)     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
        L_0x009b:
            throw r2     // Catch:{ AuthenticatorException -> 0x00a7, OperationCanceledException -> 0x00b2, IOException -> 0x009c }
        L_0x009c:
            if (r9 == 0) goto L_0x00c1
            double r14 = (double) r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            double r0 = (double) r2
            java.lang.String r13 = "IOException"
            goto L_0x00bc
        L_0x00a7:
            if (r9 == 0) goto L_0x00c1
            double r14 = (double) r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            double r0 = (double) r2
            java.lang.String r13 = "AuthenticatorException"
            goto L_0x00bc
        L_0x00b2:
            if (r9 == 0) goto L_0x00c1
            double r14 = (double) r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            double r0 = (double) r2
            java.lang.String r13 = "OperationCanceledException"
        L_0x00bc:
            r16 = r0
            A04(r10, r11, r12, r13, r14, r16)
        L_0x00c1:
            return r8
        L_0x00c2:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        L_0x00c7:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63633hx.A00(android.accounts.Account, android.accounts.AccountManager, X.0kW, X.0i6, java.lang.String):java.lang.String");
    }

    public static final List A02(Context context, C10300i6 r8, String str) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (str != null) {
            A05(r8, str);
        }
        if (C18180wK.A1W(context.checkSelfPermission("android.permission.GET_ACCOUNTS"))) {
            Account[] accounts = AccountManager.get(context).getAccounts();
            C04220Ms.A06(accounts);
            for (Account account : accounts) {
                if (account != null && "com.google".equalsIgnoreCase(account.type)) {
                    A0v.add(account);
                }
            }
            if (str != null) {
                A06(r8, str, r3);
                return A0v;
            }
        } else if (str != null) {
            A07(r8, str, "no_permission");
        }
        return A0v;
    }

    public static final void A04(C11630kW r2, C10300i6 r3, String str, String str2, double d, double d2) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r3), "get_google_token_fail"), 699);
        A0I.A0T("error_type", str2);
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        C18210wN.A19(A0I, str);
        AnonymousClass269.A05(A0I);
        AnonymousClass0wJ.A1B(A0I, d2, d);
        C63683i7.A08(A0I);
        if (r2 != null) {
            str3 = r2.getModuleName();
        }
        C18240wQ.A15(A0I, str3);
        C63683i7.A09(A0I, r3);
        C18200wM.A1K(A0I, d);
        A0I.Bb4();
    }

    public static final void A05(C10300i6 r6, String str) {
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "get_google_account_attempt"), 695);
        AnonymousClass0wJ.A1B(A0I, A002, A003);
        C18210wN.A19(A0I, str);
        AnonymousClass269.A06(A0I, A003);
        C18180wK.A19(A0I);
        A0I.A0S("api_level", C18230wP.A0f(Build.VERSION.SDK_INT));
        C63683i7.A0A(A0I, r6);
    }

    public static final void A06(C10300i6 r6, String str, int i) {
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "get_google_account_success"), 697);
        AnonymousClass269.A07(A0I, A002, A003);
        C18180wK.A1A(A0I, A003);
        C18180wK.A1B(A0I, A002);
        C18210wN.A19(A0I, str);
        C63683i7.A08(A0I);
        A0I.A0S("os_version", C18230wP.A0f(Build.VERSION.SDK_INT));
        A0I.A0S("num_of_google_account", C18230wP.A0f(i));
        C63683i7.A06(A0I, r6);
        C63683i7.A09(A0I, r6);
        A0I.Bb4();
    }

    public static final void A07(C10300i6 r6, String str, String str2) {
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "get_google_account_failure"), 696);
        AnonymousClass0wJ.A1B(A0I, A002, A003);
        A0I.A0T("error_type", str2);
        C18210wN.A19(A0I, str);
        C18180wK.A19(A0I);
        AnonymousClass269.A06(A0I, A003);
        C63683i7.A0A(A0I, r6);
    }
}
