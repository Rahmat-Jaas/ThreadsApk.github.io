package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3OS  reason: invalid class name */
public final class AnonymousClass3OS {
    public static void A00(Activity activity, DialogInterface.OnClickListener onClickListener) {
        C25828Dsm A0W = C18190wL.A0W(activity);
        A0W.A02 = activity.getString(2131831748);
        C18220wO.A14(activity, A0W, 2131831747);
        A0W.A0O(onClickListener, 2131831976);
        AnonymousClass0wJ.A1K(A0W);
    }

    public static void A01(Context context, FragmentActivity fragmentActivity, UserSession userSession, ArrayList arrayList, boolean z) {
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("enableGeoGating", z);
        A06.putStringArrayList("selectedRegions", arrayList);
        A06.putString("settingType", "reel");
        C63343hJ.getInstance();
        C71494Ja r1 = new C71494Ja(userSession, "IgMediaGeoGatingSettingsApp");
        r1.A07 = context.getString(2131835596);
        r1.Cod(A06);
        r1.CxN(fragmentActivity).A05();
    }
}
