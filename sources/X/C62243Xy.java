package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Xy  reason: invalid class name and case insensitive filesystem */
public final class C62243Xy {
    public final UserSession A00;

    public C62243Xy(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A02(FragmentActivity fragmentActivity, LocationPageInformation locationPageInformation, boolean z) {
        String A002 = A00(locationPageInformation, z);
        Object systemService = fragmentActivity.getSystemService("clipboard");
        C04220Ms.A0C(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipData newPlainText = ClipData.newPlainText(A002, A002);
        C04220Ms.A06(newPlainText);
        ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
        C63813iO.A03(fragmentActivity, (String) null, 2131836670, 0);
    }

    public static final String A00(LocationPageInformation locationPageInformation, boolean z) {
        String str;
        if (z) {
            str = locationPageInformation.A08;
        } else {
            str = "";
        }
        List A17 = C06750aI.A17(str, locationPageInformation.A05, locationPageInformation.A07, locationPageInformation.A0B);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : A17) {
            String str2 = (String) next;
            if (!(str2 == null || str2.length() == 0)) {
                A0v.add(next);
            }
        }
        return C18200wM.A0l(" ", A0v);
    }

    public static final void A01(FragmentActivity fragmentActivity, MediaMapPin mediaMapPin) {
        boolean z;
        String str;
        LocationPageInformation locationPageInformation = mediaMapPin.A06;
        if (locationPageInformation != null) {
            String str2 = locationPageInformation.A05;
            String str3 = locationPageInformation.A07;
            String str4 = locationPageInformation.A0B;
            Double d = mediaMapPin.A0A;
            Double d2 = mediaMapPin.A0B;
            if (d == null || d2 == null) {
                C62933bA.A04(fragmentActivity, str2, str3, str4);
            }
            double doubleValue = d.doubleValue();
            double doubleValue2 = d2.doubleValue();
            if ((str2 == null || !str2.isEmpty()) && ((str3 == null || !str3.isEmpty()) && (str4 == null || !str4.isEmpty()))) {
                z = false;
            } else {
                z = true;
            }
            StringBuilder A0r = C18200wM.A0r();
            if (!z) {
                A0r.append(str2);
                String str5 = "";
                if (str3 == null || str3.isEmpty()) {
                    str = str5;
                } else {
                    str = AnonymousClass00U.A0L(", ", str3);
                }
                A0r.append(str);
                if (str4 != null && !str4.isEmpty()) {
                    str5 = AnonymousClass00U.A0L(", ", str4);
                }
                A0r.append(str5);
                A0r.append("&center=");
            }
            A0r.append(doubleValue);
            A0r.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            A0r.append(doubleValue2);
            C10650ih.A0B(fragmentActivity, C62933bA.A00(fragmentActivity, AnonymousClass006.A00, A0r.toString()));
        }
    }
}
