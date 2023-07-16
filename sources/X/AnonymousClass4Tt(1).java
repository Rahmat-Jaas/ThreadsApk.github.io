package X;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.redex.IDxPredicateShape214S0200000_1_I2;
import com.google.common.collect.IDxFIterableShape27S0200000_5_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.nux.activity.BloksSignedOutFragmentActivity;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Tt  reason: invalid class name */
public final class AnonymousClass4Tt implements Callable {
    public final /* synthetic */ AnonymousClass2GF A00;
    public final /* synthetic */ List A01;

    public AnonymousClass4Tt(AnonymousClass2GF r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C07530bf r1;
        String str;
        boolean A1X;
        Runnable r0;
        AnonymousClass2GF r12 = this.A00;
        List<Map> list = this.A01;
        if (r12 instanceof AnonymousClass1e1) {
            BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity = ((AnonymousClass1e1) r12).A00;
            AnonymousClass01V.A0p.markerPoint(896612552, "endClientDataFetch");
            Handler handler = bloksSignedOutFragmentActivity.A07;
            handler.postDelayed(bloksSignedOutFragmentActivity.A08, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            AnonymousClass01V.A0p.markerPoint(896612552, 0, AnonymousClass00U.A0L(AnonymousClass000.A00(1292), RealtimeSubscription.GRAPHQL_MQTT_VERSION));
            C130667qT A002 = C130667qT.A00((SparseArray) null, bloksSignedOutFragmentActivity, bloksSignedOutFragmentActivity, bloksSignedOutFragmentActivity.A03);
            JSONObject jSONObject = new JSONObject(BloksSignedOutFragmentActivity.A01(bloksSignedOutFragmentActivity));
            HashMap A0y = AnonymousClass0wJ.A0y();
            try {
                JSONArray A0i = C18250wR.A0i();
                for (Map map : list) {
                    if (map != null) {
                        A0i.put(new JSONObject(map));
                    }
                }
                jSONObject.put("account_list", A0i);
                jSONObject.put("blocked_uid", new JSONArray(C09120et.A02().A0E()));
                jSONObject.put("INTERNAL_INFRA_THEME", AnonymousClass3QU.A00());
            } catch (JSONException unused) {
            }
            C18200wM.A1T(jSONObject, A0y);
            if (ImmutableList.copyOf((Iterable) new IDxFIterableShape27S0200000_5_I2(0, list, new IDxPredicateShape214S0200000_1_I2(2, bloksSignedOutFragmentActivity, C09120et.A02().A0E()))).isEmpty()) {
                AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
                if (C63173fJ.A05(r2, 18310811382457327L) || (!C63173fJ.A05(r2, 18310811382522864L) && !C63173fJ.A05(r2, 18310811382916086L))) {
                    if (C63173fJ.A05(r2, 18310811382588401L) && C63173fJ.A05(r2, 18310811382653938L)) {
                        C62893b5.A02(bloksSignedOutFragmentActivity.A03, "ig_aymh_not_shown_feature_kill_switch_enabled");
                    }
                    if (C63173fJ.A05(AnonymousClass0TJ.A06, 18313774909892914L)) {
                        C62893b5.A02(bloksSignedOutFragmentActivity.A03, "ig_prepackaged_login_home_shown");
                        r0 = new AnonymousClass4PR(bloksSignedOutFragmentActivity);
                    } else {
                        AnonymousClass3Y4 r9 = bloksSignedOutFragmentActivity.A02;
                        if (C63173fJ.A05(r2, 18313774910023988L)) {
                            A1X = false;
                        } else {
                            AnonymousClass4C6 r22 = AnonymousClass4C6.A00;
                            A1X = AnonymousClass0wJ.A1X(C62073Xa.A00(r9.A01, (C62073Xa) AnonymousClass4C6.A01.BKJ(r22, AnonymousClass4C6.A02[0])));
                        }
                        if (A1X) {
                            C62893b5.A02(bloksSignedOutFragmentActivity.A03, "ig_cacheable_login_home_shown");
                            AnonymousClass01V.A0p.markerAnnotate(896612552, "caching_experiment_group", AnonymousClass3Y4.A01());
                            r0 = new C73184Rg(A002, bloksSignedOutFragmentActivity);
                        } else {
                            if (AnonymousClass3YK.A00(C60913Rb.A00(AnonymousClass4C6.A00)).A01.equals("control")) {
                                AnonymousClass01V.A0p.markerAnnotate(896612552, "caching_experiment_group", AnonymousClass3Y4.A01());
                            }
                            r1 = bloksSignedOutFragmentActivity.A03;
                            str = "ig_login_home_shown";
                            C62893b5.A02(r1, str);
                            AnonymousClass4A9 A003 = C63263h8.A00(bloksSignedOutFragmentActivity.A03, "com.bloks.www.bloks.caa.login.process_client_data_and_redirect", A0y);
                            AnonymousClass4A9.A01(A003, A002, bloksSignedOutFragmentActivity, 11);
                            bloksSignedOutFragmentActivity.schedule(A003);
                        }
                    }
                    handler.post(r0);
                } else {
                    C62893b5.A02(bloksSignedOutFragmentActivity.A03, "ig_aymh_not_shown_caa_kill_switch_enabled");
                }
            }
            r1 = bloksSignedOutFragmentActivity.A03;
            str = "ig_aymh_shown";
            C62893b5.A02(r1, str);
            AnonymousClass4A9 A0032 = C63263h8.A00(bloksSignedOutFragmentActivity.A03, "com.bloks.www.bloks.caa.login.process_client_data_and_redirect", A0y);
            AnonymousClass4A9.A01(A0032, A002, bloksSignedOutFragmentActivity, 11);
            bloksSignedOutFragmentActivity.schedule(A0032);
        } else {
            AnonymousClass1e2 r13 = (AnonymousClass1e2) r12;
            C109326jp r3 = r13.A01;
            AnonymousClass601 r4 = r13.A00;
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            A0y2.put("accounts", list);
            C09120et A0X = C18190wL.A0X();
            A0y2.put("blocked_uid", AnonymousClass00J.A0N(A0X.A0E()));
            A0y2.put("fetch_account_center_list", AnonymousClass00J.A0N((Iterable) C18220wO.A0f(A0X.A05)));
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0300000_I2(r3, r4, A0y2, (C146958n9) null, 19), AnonymousClass7Ja.A04(C550531n.A00.A03, C550531n.A01), 3);
        }
        return Unit.A00;
    }
}
