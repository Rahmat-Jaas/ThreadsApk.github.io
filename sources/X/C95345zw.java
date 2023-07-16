package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.LocationServices;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.5zw  reason: invalid class name and case insensitive filesystem */
public final class C95345zw extends C19819BBt implements C21800C0z, C148648rc, C148658rd {
    public AnonymousClass7AL A00;
    public boolean A01 = false;
    public C108766iu A02;
    public final Activity A03;
    public final C111756oL A04;
    public final C112396pW A05;
    public final AnonymousClass8f3 A06;
    public final String A07;
    public final String A08;

    public final void Brh(Bundle bundle) {
    }

    public final void Brq(int i) {
    }

    public C95345zw(Activity activity, AnonymousClass8f3 r23, UserSession userSession, String str, String str2) {
        Activity activity2 = activity;
        this.A03 = activity2;
        this.A06 = r23;
        this.A08 = str;
        this.A07 = str2;
        HashSet A0u = C18200wM.A0u();
        HashSet A0u2 = C18200wM.A0u();
        C013306f r16 = new C013306f();
        C013306f r1 = new C013306f();
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C93175l8 r9 = C103846ap.A01;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        Looper mainLooper = activity2.getMainLooper();
        String packageName = activity2.getPackageName();
        String A0q = C18220wO.A0q(activity2);
        A0v.add(this);
        A0v2.add(this);
        C108946jD r5 = LocationServices.A00;
        C13320nQ.A02(r5, "Api must not be null");
        r1.put(r5, (Object) null);
        C13320nQ.A02(r5.A00, "Base client builder must not be null");
        List emptyList = Collections.emptyList();
        A0u2.addAll(emptyList);
        A0u.addAll(emptyList);
        C013306f r17 = r1;
        this.A00 = C99306Ix.A00(activity2, mainLooper, googleApiAvailability, r9, (C148658rd) null, (C105036cm) null, packageName, A0q, A0v, A0v2, r16, r17, A0u, A0u2, -1);
        UserSession userSession2 = userSession;
        this.A05 = ((C106226eh) C86134wK.A0f(userSession2, C106226eh.class, 11)).A00;
        this.A04 = ((C106216eg) C86134wK.A0f(userSession2, C106216eg.class, 10)).A00;
    }

    public final C108766iu A01() {
        C108766iu r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C108766iu r02 = new C108766iu(this.A07, C18230wP.A0h(), this.A08);
        this.A02 = r02;
        return r02;
    }

    public final void Bro(ConnectionResult connectionResult) {
        C22266CRf cRf = ((C133227vM) this.A06).A00;
        cRf.A0N = true;
        C22266CRf.A09(cRf);
        this.A04.A00(A00(this), "UNKNOWN_FAILURE");
        C112396pW r0 = this.A05;
        AnonymousClass3UO r1 = r0.A01;
        Map map = r0.A02;
        r1.A00(map);
        map.clear();
        synchronized (r1.A00) {
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Integer num;
        C112396pW r3;
        String str;
        if (this.A01 && i == 5005) {
            this.A01 = false;
            if (i2 == -1) {
                num = AnonymousClass006.A00;
                r3 = this.A05;
                r3.A00(true);
            } else {
                num = AnonymousClass006.A01;
                r3 = this.A05;
                r3.A00(false);
            }
            Integer num2 = AnonymousClass006.A01;
            C22266CRf cRf = ((C133227vM) this.A06).A00;
            if (num == num2) {
                C22266CRf.A0A(cRf);
            } else {
                cRf.A0N = true;
                C22266CRf.A09(cRf);
            }
            C111756oL r2 = this.A04;
            String A002 = A00(this);
            if (num.intValue() != 0) {
                str = "DIALOG_CANCEL";
            } else {
                str = "DIALOG_SUCCESS";
            }
            r2.A00(A002, str);
            AnonymousClass3UO r1 = r3.A01;
            Map map = r3.A02;
            r1.A00(map);
            map.clear();
            synchronized (r1.A00) {
            }
        }
    }

    public static String A00(C95345zw r1) {
        if (TextUtils.isEmpty(r1.A01().A02)) {
            return "surface_location_upsell_fragment";
        }
        return r1.A01().A02;
    }
}
