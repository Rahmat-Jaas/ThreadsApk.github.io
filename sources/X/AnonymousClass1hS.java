package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import com.instagram.nux.ndx.util.NdxStepsFilterer;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1hS  reason: invalid class name */
public final class AnonymousClass1hS extends C63873iU {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass3AT A02;
    public final /* synthetic */ Integer A03;

    public AnonymousClass1hS(Activity activity, AnonymousClass3AT r2, Integer num, long j) {
        this.A02 = r2;
        this.A00 = j;
        this.A03 = num;
        this.A01 = activity;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = C14030oh.A03(-1320734051);
        AnonymousClass1SR r1 = (AnonymousClass1SR) obj;
        int A002 = AnonymousClass0wJ.A00(-832751050, r1);
        List list = r1.A00;
        C04220Ms.A0C(list, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        ArrayList arrayList = (ArrayList) list;
        AnonymousClass3AT r4 = this.A02;
        UserSession userSession = r4.A02;
        SharedPreferences.Editor A003 = C696949q.A00(AnonymousClass3Zs.A03(userSession), D2R.A1a);
        A003.putLong("ndx_immersive_written_timestamp", System.currentTimeMillis());
        A003.apply();
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A00;
        C58593Gj r11 = r4.A01;
        Integer num = this.A03;
        r11.A01(num, arrayList, currentTimeMillis - j);
        if (arrayList.isEmpty()) {
            r11.A00(AnonymousClass006.A15, Long.valueOf(C18240wQ.A09(j)));
            i = -1486879032;
        } else {
            NdxStepsFilterer ndxStepsFilterer = new NdxStepsFilterer(this.A01, r11, userSession, num, arrayList);
            ArrayList arrayList2 = ndxStepsFilterer.A01;
            if (arrayList2.contains("contact_importer") && !ndxStepsFilterer.A02()) {
                arrayList2.remove("contact_importer");
            }
            if (arrayList2.isEmpty()) {
                i = -1198366184;
            } else {
                r11.A00(AnonymousClass006.A0u, Long.valueOf(C18240wQ.A09(j)));
                if (Build.VERSION.SDK_INT >= 33) {
                    r11.A00(AnonymousClass006.A05, (Long) null);
                    i = -2065298308;
                } else if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36326476907423319L)) {
                    i = -103151592;
                } else {
                    HashMap A0y = AnonymousClass0wJ.A0y();
                    A0y.put("ndx_eligible_flows", C18200wM.A0o(arrayList2));
                    A0y.put("qp_id", "3");
                    A0y.put("family_device_id", C18190wL.A0l(userSession));
                    A0y.put("app_scoped_device_id", C18200wM.A0g());
                    A0y.put("app_id", "567067343352427");
                    C34640IcN icN = r4.A00;
                    C130667qT A022 = C130667qT.A02(icN, userSession, (C30938GbW) null);
                    AnonymousClass4A9 A004 = C63263h8.A00(userSession, "com.instagram.ndx.common.push_ig_ndx_screen", A0y);
                    A004.A00 = new AnonymousClass1eJ(A022, r4, j);
                    icN.schedule(A004);
                    i = 1722689896;
                }
            }
        }
        C14030oh.A0A(i, A002);
        C14030oh.A0A(-160228574, A032);
    }

    public final void onFail(AnonymousClass3XX r8) {
        String str;
        int A002 = AnonymousClass0wJ.A00(-1669014374, r8);
        AnonymousClass1j3 r0 = (AnonymousClass1j3) r8.A00;
        if (r0 != null) {
            str = r0.getErrorMessage();
        } else {
            str = null;
        }
        AnonymousClass3AT r3 = this.A02;
        C14100oo ABJ = C10770iu.A00().ABJ("ig_ndx_server_request_error", 817895070);
        ABJ.Ciu(new Exception(str));
        ABJ.report();
        r3.A01.A00(AnonymousClass006.A1L, Long.valueOf(System.currentTimeMillis() - this.A00));
        C14030oh.A0A(2069674381, A002);
    }
}
