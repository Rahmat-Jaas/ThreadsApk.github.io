package X;

import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.user.model.MicroUserDict;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.49X  reason: invalid class name */
public final class AnonymousClass49X implements AnonymousClass0i4 {
    public static final long A07 = TimeUnit.HOURS.toMillis(24);
    public AtomicInteger A00;
    public boolean A01;
    public final C62813an A02;
    public final C62353Yv A03;
    public final C10300i6 A04;
    public final AnonymousClass0BO A05;
    public final ConcurrentHashMap A06 = new ConcurrentHashMap();

    public final void onSessionWillEnd() {
        this.A01 = true;
    }

    public static AnonymousClass49X A00(C10300i6 r2) {
        return (AnonymousClass49X) C18180wK.A0c(r2, AnonymousClass49X.class, 0);
    }

    public final void A03() {
        if (!this.A01) {
            AtomicInteger atomicInteger = this.A00;
            if (atomicInteger.get() == 0) {
                Set A0c = AnonymousClass00J.A0c(this.A05.A0G((String) null));
                atomicInteger.set(A0c.size());
                Iterator it = A0c.iterator();
                while (it.hasNext()) {
                    String A0k = C18180wK.A0k(it);
                    AnonymousClass4KM r2 = new AnonymousClass4KM(new AnonymousClass1i6(this, A0k));
                    if (!AnonymousClass0RA.A0C.A09(new AnonymousClass4KD(), (C04850Pk) null, r2, A0k)) {
                        C18250wR.A1G("Failed to add account family fetching operation. want info for user: ", A0k, "AccountLinkingDataFetcher");
                    }
                }
            }
        }
    }

    public AnonymousClass49X(C10300i6 r5) {
        this.A04 = r5;
        this.A05 = C05030Qo.A01(r5);
        C62813an A012 = C62813an.A01(r5);
        this.A02 = A012;
        this.A03 = A012.A00;
        this.A00 = new AtomicInteger(0);
        this.A01 = r5.hasEnded();
        C31155GhB.A05(new AnonymousClass4A2(this), 244, 3, true, true);
    }

    public static void A01(AnonymousClass49X r8) {
        JSONObject A0y = C18230wP.A0y();
        try {
            C62813an r0 = r8.A02;
            ConcurrentHashMap concurrentHashMap = r8.A06;
            Map map = r0.A02;
            map.clear();
            map.putAll(concurrentHashMap);
            Iterator it = concurrentHashMap.keySet().iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                AccountFamily accountFamily = (AccountFamily) concurrentHashMap.get(A0k);
                StringWriter A0d = C18230wP.A0d();
                MMp A0K = C18180wK.A0K(A0d);
                String str = accountFamily.A02;
                if (str != null) {
                    A0K.A0d("user_id", str);
                }
                AnonymousClass22H r02 = accountFamily.A00;
                if (r02 != null) {
                    A0K.A0d("type", C18240wQ.A0g(r02.name()));
                }
                if (accountFamily.A01 != null) {
                    A0K.A0U("account");
                    AnonymousClass3PL.A00(A0K, accountFamily.A01);
                }
                if (accountFamily.A04 != null) {
                    A0K.A0U("main_accounts");
                    A0K.A0I();
                    for (MicroUserDict microUserDict : accountFamily.A04) {
                        if (microUserDict != null) {
                            AnonymousClass3PL.A00(A0K, microUserDict);
                        }
                    }
                    A0K.A0F();
                }
                if (accountFamily.A03 != null) {
                    A0K.A0U("child_accounts");
                    A0K.A0I();
                    for (MicroUserDict microUserDict2 : accountFamily.A03) {
                        if (microUserDict2 != null) {
                            AnonymousClass3PL.A00(A0K, microUserDict2);
                        }
                    }
                    A0K.A0F();
                }
                A0y.put(A0k, C18180wK.A0h(A0K, A0d));
            }
            C08350dD A002 = C08360dF.A00();
            String obj = A0y.toString();
            C04220Ms.A0B(obj, 0);
            C18180wK.A0v(C18220wO.A0B(A002), "account_linking_family_map_data", obj);
            C08350dD A003 = C08360dF.A00();
            AnonymousClass0wJ.A12(C18220wO.A0B(A003), "account_linking_last_fetch_time", System.currentTimeMillis());
        } catch (IOException | JSONException unused) {
            C10450iM.A03("AccountLinkingDataFetcher", "Error parsing family map to the preference");
        }
    }

    public static void A02(C10300i6 r0) {
        A00(r0).A03();
    }

    public final void A04() {
        long currentTimeMillis = System.currentTimeMillis() - C18180wK.A05(C18200wM.A0C(), "account_linking_last_fetch_time");
        C62813an r2 = this.A02;
        AnonymousClass0BO r4 = r2.A01;
        int size = C18210wN.A0i(r4).size();
        Map map = r2.A02;
        if (size == map.size()) {
            Iterator A0x = C18220wO.A0x(map);
            while (true) {
                if (A0x.hasNext()) {
                    String A0k = C18180wK.A0k(A0x);
                    if (r4.A0O(A0k)) {
                        if (((AccountFamily) map.get(A0k)).A00 == AnonymousClass22H.UNKNOWN) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (currentTimeMillis <= A07) {
                    ConcurrentHashMap concurrentHashMap = this.A06;
                    map.clear();
                    map.putAll(concurrentHashMap);
                    return;
                }
            }
        }
        A03();
    }
}
