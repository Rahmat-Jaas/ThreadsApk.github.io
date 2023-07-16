package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17;

/* renamed from: X.4Qr  reason: invalid class name and case insensitive filesystem */
public final class C73034Qr implements Runnable {
    public final /* synthetic */ C10300i6 A00;
    public final /* synthetic */ List A01;

    public C73034Qr(C10300i6 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        C10300i6 r10 = this.A00;
        List list = this.A01;
        if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18304102643536410L)) {
            Context A08 = C18230wP.A08();
            AnonymousClass01V r1 = C62623aQ.A00;
            if (r1 != null) {
                r1.markerPoint(896612552, "get_google_accounts_start");
                List<Account> A02 = C63633hx.A02(A08, r10, "LOG_IN");
                AnonymousClass01V r12 = C62623aQ.A00;
                if (r12 != null) {
                    r12.markerPoint(896612552, "get_google_accounts_end");
                    AnonymousClass01V r2 = C62623aQ.A00;
                    if (r2 != null) {
                        r2.markerAnnotate(896612552, "count_of_google_accounts_for_token_fetch", A02.size());
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        KtLambdaShape37S0100000_I2_17 ktLambdaShape37S0100000_I2_17 = new KtLambdaShape37S0100000_I2_17(A0v, 45);
                        if (A02.isEmpty()) {
                            ktLambdaShape37S0100000_I2_17.invoke();
                            return;
                        }
                        AccountManager accountManager = AccountManager.get(A08);
                        ArrayList A0v2 = AnonymousClass0wJ.A0v();
                        AnonymousClass01V r13 = C62623aQ.A00;
                        if (r13 != null) {
                            r13.markerPoint(896612552, "add_google_oauth_accounts_start");
                            int i = 0;
                            for (Account account : A02) {
                                C04220Ms.A06(accountManager);
                                A0v.add(AnonymousClass4WJ.A0G(C18180wK.A0p("token", C63633hx.A00(account, accountManager, (C11630kW) null, r10, "LOG_IN")), C18180wK.A0p("account_type", "google_oauth")));
                                i++;
                                A0v2.add(C62623aQ.A00(C62623aQ.A00(account.toString())));
                            }
                            if (i == 0) {
                                C62893b5.A01(r10, "google_oauth");
                            } else {
                                C62893b5.A04(r10, "google_oauth", A0v2);
                            }
                            list.addAll(A0v);
                            ktLambdaShape37S0100000_I2_17.invoke();
                            AnonymousClass01V r14 = C62623aQ.A00;
                            if (r14 != null) {
                                r14.markerPoint(896612552, "add_google_oauth_accounts_end");
                                return;
                            }
                        }
                    }
                }
            }
            C04220Ms.A0E("qplLogger");
            throw null;
        }
    }
}
