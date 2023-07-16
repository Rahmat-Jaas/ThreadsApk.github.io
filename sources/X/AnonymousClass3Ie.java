package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.redex.IDxCCallbackShape301S0200000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape44S0000000_1_I2;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.service.session.UserSession;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Ie  reason: invalid class name */
public final class AnonymousClass3Ie {
    public final Context A00;
    public final C62253Xz A01;
    public final String A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final boolean A04;
    public final Set A05;

    public final C10060hf A01() {
        C10060hf r3 = new C10060hf();
        AnonymousClass0TM r2 = new AnonymousClass0TM();
        r2.A04 = false;
        r2.A01 = new IDxCCallbackShape301S0200000_1_I2(1, this, r3);
        C67603zp r0 = this.A01.A00;
        r0.A0A();
        r0.A06().updateConfigs(r2);
        return r3;
    }

    public final Object A02(long j, Object obj) {
        Object obj2 = obj;
        C67603zp r3 = this.A01.A00;
        long j2 = j;
        int A012 = C18190wL.A01(j);
        if (A012 == 1) {
            return Boolean.valueOf(r3.ATw(AnonymousClass0TJ.A06, j, AnonymousClass0wJ.A1X(obj)));
        } else if (A012 == 2) {
            return Long.valueOf(r3.At9(AnonymousClass0TJ.A06, j, C18190wL.A08(obj)));
        } else if (A012 == 3) {
            return r3.BEU(AnonymousClass0TJ.A06, (String) obj2, j);
        } else if (A012 != 4) {
            return obj2;
        } else {
            return Double.valueOf(r3.Adu(AnonymousClass0TJ.A06, ((Number) obj2).doubleValue(), j2));
        }
    }

    public final void A03() {
        C10060hf r2 = new C10060hf();
        AnonymousClass0TM r1 = new AnonymousClass0TM();
        r1.A04 = true;
        r1.A01 = new IDxCCallbackShape301S0200000_1_I2(1, this, r2);
        C67603zp r0 = this.A01.A00;
        r0.A0A();
        r0.A06().updateConfigs(r1);
    }

    public final C07810cE A00() {
        return this.A01.A00;
    }

    public final void A04(C10300i6 r25, boolean z) {
        String str;
        C10300i6 r22 = r25;
        if (r22 instanceof UserSession) {
            C67603zp r9 = this.A01.A00;
            UserSession A022 = C05030Qo.A02(r22);
            long currentTimeMillis = System.currentTimeMillis();
            long A052 = C18180wK.A05(C28161tl.A04(A022), "launcher_last_consistency_check_time_ms");
            if (!z) {
                if (!r9.ATs(36314584143300584L, false)) {
                    return;
                }
                if (currentTimeMillis <= (r9.At3(36596059120404664L, SandboxRepository.CACHE_TTL) * 1000) + A052 && currentTimeMillis >= A052) {
                    return;
                }
            }
            AnonymousClass3IC A09 = r9.A09();
            C07810cE A07 = r9.A07();
            String str2 = "{}";
            String str3 = str2;
            if (A09 != null) {
                C85764vj r11 = null;
                if (A07 instanceof C85764vj) {
                    r11 = (C85764vj) A07;
                }
                try {
                    JSONObject A0y = C18230wP.A0y();
                    JSONObject A0y2 = C18230wP.A0y();
                    AnonymousClass0TJ A0Q = C18200wM.A0Q();
                    A0Q.A03 = true;
                    AnonymousClass0TJ A002 = AnonymousClass0TJ.A00(A0Q);
                    A002.A02 = true;
                    String str4 = "";
                    for (AnonymousClass3GH r14 : A09.A03) {
                        if (r14.A08 == r9.A03) {
                            int i = r14.A03;
                            String str5 = r14.A00;
                            if (i > 0 && i < 1048576) {
                                str5 = String.valueOf(i);
                            }
                            if (!TextUtils.isEmpty(str5)) {
                                if (!str4.equals(str5)) {
                                    JSONObject A0y3 = C18230wP.A0y();
                                    A0y2 = C18230wP.A0y();
                                    A0y3.put("parameters", A0y2);
                                    A0y.put(str5, A0y3);
                                } else {
                                    str5 = str4;
                                }
                                JSONObject A0y4 = C18230wP.A0y();
                                long A003 = r14.A00();
                                Object A004 = C62253Xz.A00(A07, A002, r14, A003);
                                if (A004 != null) {
                                    A0y4.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A004);
                                }
                                if (r11 != null) {
                                    String Asv = r11.Asv(A003);
                                    if (!TextUtils.isEmpty(Asv)) {
                                        A0y4.put("logging_id", Asv);
                                    }
                                }
                                AnonymousClass0TN r4 = A002.A00.A00;
                                if (!(r4 == AnonymousClass0TN.SERVER || r4 == AnonymousClass0TN.DEFAULT__SERVER_RETURNED_NULL)) {
                                    A0y4.put("src", r4.A00);
                                }
                                if (A0y4.length() > 0) {
                                    int i2 = r14.A04;
                                    if (i2 == -1 || i2 >= 16384) {
                                        str = r14.A01;
                                    } else {
                                        str = Integer.toString(i2);
                                    }
                                    if (!TextUtils.isEmpty(str)) {
                                        A0y2.put(str, A0y4);
                                    }
                                }
                                str4 = str5;
                            }
                        }
                    }
                    str2 = A0y.toString();
                } catch (JSONException e) {
                    AnonymousClass0LU.A0H("MobileConfigFunctions", "Failed to generate consistency JSON.", e);
                }
            }
            String str6 = this.A02;
            H1T A0N = AnonymousClass0wJ.A0N(r22);
            A0N.A0J("launcher/check_consistency/");
            A0N.A0O("id", str6);
            A0N.A0O("serialized_configs", str3);
            A0N.A0O("mc_configs", str2);
            A0N.A0R("is_realtime_subscription_enabled", false);
            C32165H8c A0S = AnonymousClass0wJ.A0S(A0N);
            A0S.A00 = new IDxACallbackShape44S0000000_1_I2(1);
            C31155GhB.A05(A0S, 238, 3, true, true);
            AnonymousClass0wJ.A12(C28161tl.A03(A022), "launcher_last_consistency_check_time_ms", currentTimeMillis);
        }
    }

    public AnonymousClass3Ie(Context context, C10300i6 r4, C62253Xz r5, String str, Set set) {
        boolean z = false;
        this.A00 = context.getApplicationContext();
        this.A02 = str;
        this.A05 = set;
        this.A01 = r5;
        this.A04 = r4 instanceof UserSession ? true : z;
    }
}
