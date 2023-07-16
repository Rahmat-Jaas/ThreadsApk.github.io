package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0X0  reason: invalid class name */
public final class AnonymousClass0X0 {
    public final C04560Oe A00;

    public static void A05(AnonymousClass0X0 r6, AnonymousClass0X5 r7) {
        AnonymousClass0A3 r4 = (AnonymousClass0A3) r6.A00.get();
        if (r4.A00.isSampled()) {
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass0X6 r5 : r7.A01) {
                LEY A002 = C40358LeG.A00();
                ArrayList arrayList2 = new ArrayList();
                A09(r5, arrayList2);
                A07(r5, arrayList2);
                A002.A0B("dimensions", arrayList2);
                ArrayList arrayList3 = new ArrayList();
                A0A(r5, arrayList3);
                A08(r5, arrayList3);
                A06(r5, arrayList3);
                A002.A0B("aggregations", arrayList3);
                A002.A09("count", Long.valueOf((long) r5.A00));
                arrayList.add(A002);
            }
            r4.A0T("scenario", r7.A00);
            r4.A0U("summaries", arrayList);
            r4.Bb4();
        }
    }

    public static void A06(AnonymousClass0X6 r6, List list) {
        String[] strArr = r6.A04;
        double[] dArr = r6.A01;
        for (int i = 0; i < strArr.length; i++) {
            LEU A002 = C40359LeH.A00();
            A002.A0A("metric", strArr[i]);
            A002.A06(A00(dArr[i]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            list.add(A002);
        }
    }

    public static void A07(AnonymousClass0X6 r6, List list) {
        String[] strArr = r6.A06;
        long[] jArr = r6.A02;
        for (int i = 0; i < strArr.length; i++) {
            LEW A002 = LeJ.A00();
            A002.A0A(FXPFAccessLibraryDebugFragment.NAME, strArr[i]);
            A002.A06(A03(jArr[i]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            list.add(A002);
        }
    }

    public static void A08(AnonymousClass0X6 r6, List list) {
        String[] strArr = r6.A05;
        long[] jArr = r6.A03;
        for (int i = 0; i < strArr.length; i++) {
            LEU A002 = C40359LeH.A00();
            A002.A0A("metric", strArr[i]);
            A002.A06(A01(jArr[i]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            list.add(A002);
        }
    }

    public static void A09(AnonymousClass0X6 r6, List list) {
        String[] strArr = r6.A09;
        String[] strArr2 = r6.A08;
        for (int i = 0; i < strArr.length; i++) {
            LEW A002 = LeJ.A00();
            A002.A0A(FXPFAccessLibraryDebugFragment.NAME, strArr[i]);
            A002.A06(A04(strArr2[i]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            list.add(A002);
        }
    }

    public static void A0A(AnonymousClass0X6 r6, List list) {
        String[] strArr = r6.A07;
        String[] strArr2 = r6.A0A;
        for (int i = 0; i < strArr.length; i++) {
            LEU A002 = C40359LeH.A00();
            A002.A0A("metric", strArr[i]);
            A002.A06(A02(strArr2[i]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            list.add(A002);
        }
    }

    public AnonymousClass0X0(C04560Oe r1) {
        this.A00 = r1;
    }

    public static LEV A00(double d) {
        LEV A002 = C40360LeI.A00();
        A002.A08("double_value", Double.valueOf(d));
        return A002;
    }

    public static LEV A01(long j) {
        LEV A002 = C40360LeI.A00();
        A002.A09("int_value", Long.valueOf(j));
        return A002;
    }

    public static LEV A02(String str) {
        LEV A002 = C40360LeI.A00();
        A002.A0A("string_value", str);
        return A002;
    }

    public static LEX A03(long j) {
        LEX A002 = LeK.A00();
        A002.A09("int_value", Long.valueOf(j));
        return A002;
    }

    public static LEX A04(String str) {
        LEX A002 = LeK.A00();
        A002.A0A("string_value", str);
        return A002;
    }
}
