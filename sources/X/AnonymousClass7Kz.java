package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.view.View;
import com.facebook.quicklog.MarkerEditor;
import com.facebookpay.widget.listcell.ListCell;
import java.util.Locale;

/* renamed from: X.7Kz  reason: invalid class name */
public final class AnonymousClass7Kz {
    public static volatile AnonymousClass7Kz A02;
    public C114036sa A00;
    public boolean A01;

    public static AnonymousClass7Kz A0B() {
        if (A02 == null) {
            synchronized (AnonymousClass7Kz.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass7Kz();
                }
            }
        }
        return A02;
    }

    public static int A00(Context context, int i) {
        return A0G().A03(context, i);
    }

    public static TypedArray A01(Context context, ListCell listCell) {
        return context.obtainStyledAttributes(A0G().A02(listCell.getFbpayWidgetStyleType()), C29934Fwk.A0c);
    }

    public static MarkerEditor A02(int i, int i2) {
        A06().A00.markerStart(i, i2, true);
        return A06().A00.withMarker(i, i2);
    }

    public static MarkerEditor A03(String str, int i, int i2) {
        A06().A00.markerStart(i, i2, true);
        MarkerEditor withMarker = A06().A00.withMarker(i, i2);
        withMarker.annotate("entry_point", str);
        withMarker.point("entry_point_clicked");
        return withMarker;
    }

    public static C146768mp A04() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A02, "BloksScreenConfigHelper Factory is not provided!");
        return (C146768mp) A0A.A00.A02.get();
    }

    public static AnonymousClass7JJ A05() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A07, "ECPManager Factory is not provided!");
        return (AnonymousClass7JJ) A0A.A00.A07.get();
    }

    public static C115366uw A06() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A0D, "MSCManager Factory is not provided!");
        return (C115366uw) A0A.A00.A0D.get();
    }

    public static C1203379t A07() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A01, "FBPayAuthManager Factory is not provided!");
        return (C1203379t) A0A.A00.A01.get();
    }

    public static C143688h9 A08() {
        return A06().A01;
    }

    public static AnonymousClass76O A09() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A0E, "PttManager Factory is not provided!");
        return (AnonymousClass76O) A0A.A00.A0E.get();
    }

    public static AnonymousClass7Kz A0A() {
        AnonymousClass7Kz A0B = A0B();
        C002801h.A04(A0B().A01, "FBPay SDK has not been initialized");
        C002801h.A02(A0B.A00, "FBPay SDK has not been initialized");
        return A0B;
    }

    public static C104996ci A0C() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A08, "Executors Factory is not provided!");
        return (C104996ci) A0A.A00.A08.get();
    }

    public static C111566nt A0D() {
        Object obj = A06().A05.get();
        C04220Ms.A06(obj);
        return (C111566nt) obj;
    }

    public static C108216i0 A0E() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A00, "AppInfo Factory is not provided!");
        return (C108216i0) A0A.A00.A00.get();
    }

    public static AnonymousClass6S2 A0F() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A0F, "ResourcesManager Factory is not provided!");
        return (AnonymousClass6S2) A0A.A00.A0F.get();
    }

    public static C121097Ec A0G() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A0H, "Theme Factory is not provided!");
        return (C121097Ec) A0A.A00.A0H.get();
    }

    public static C106106eV A0H() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A05, "FBPayCoroutines Factory is not provided!");
        return (C106106eV) A0A.A00.A05.get();
    }

    public static C1198677j A0I() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A06, "DeviceInfo Factory is not provided!");
        return (C1198677j) A0A.A00.A06.get();
    }

    public static AnonymousClass7HK A0J() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A0A, "FBPayGating Factory is not provided!");
        return (AnonymousClass7HK) A0A.A00.A0A.get();
    }

    public static C121817Ig A0K() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A0B, "FBPayHubManager Factory is not provided!");
        return (C121817Ig) A0A.A00.A0B.get();
    }

    public static C111906oc A0L() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A0C, "FBPayImageLoader Factory is not provided!");
        return (C111906oc) A0A.A00.A0C.get();
    }

    public static AnonymousClass77R A0M() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A09, "FbPayUIHelper Factory is not provided!");
        return (AnonymousClass77R) A0A.A00.A09.get();
    }

    public static AnonymousClass3VP A0N() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A0I, "FBPayUrlLauncher Factory is not provided!");
        return (AnonymousClass3VP) A0A.A00.A0I.get();
    }

    public static Locale A0O() {
        A0E();
        return C31103Gfm.A02();
    }

    public static void A0P() {
        C04220Ms.A06(A06().A04.get());
    }

    public static void A0Q() {
        C04220Ms.A06(A06().A05.get());
    }

    public static void A0R() {
        AnonymousClass7Kz A0A = A0A();
        C002801h.A02(A0A.A00.A03, "CardScanner Factory is not provided!");
        A0A.A00.A03.get();
    }

    public static void A0S(SparseArray sparseArray, Object obj, int i) {
        sparseArray.put(i, obj);
        C04220Ms.A06(A06().A05.get());
    }

    public static void A0T(View view, int i) {
        AnonymousClass7Fe.A01(view, A0G().A02(i));
    }

    public static boolean A0U() {
        Object obj = A06().A04.get();
        C04220Ms.A06(obj);
        return C63803iN.A0E(AnonymousClass0TJ.A05, ((AnonymousClass750) obj).A00, 36320803255490814L);
    }

    public static boolean A0V() {
        Object obj = A06().A04.get();
        C04220Ms.A06(obj);
        return C63803iN.A0E(AnonymousClass0TJ.A05, ((AnonymousClass750) obj).A00, 36320803255556351L);
    }
}
