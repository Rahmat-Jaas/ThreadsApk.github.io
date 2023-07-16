package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem;
import libraries.access.src.main.base.common.FXDeviceItem;

/* renamed from: X.2HY  reason: invalid class name */
public final class AnonymousClass2HY {
    public static final Object A00(AnonymousClass601 r21, C63893iY r22) {
        ArrayList<C62273Yb> arrayList;
        ArrayList arrayList2;
        FXDeviceItem fXDeviceItem;
        AnonymousClass601 r5 = r21;
        C63893iY r7 = r22;
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r5);
        AnonymousClass3HX r0 = r5.A00;
        if (!(r0 == null || r0.A00 == null)) {
            Object A0B = C63893iY.A0B(r7, A1Z ? 1 : 0);
            A0B.getClass();
            C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) A0B;
            List list2 = (List) C63893iY.A0C(r7, "null cannot be cast to non-null type kotlin.collections.List<*>", 2);
            Object A0B2 = C63893iY.A0B(r7, 3);
            A0B2.getClass();
            C18240wQ.A1I(A0B2);
            C109326jp A06 = C63893iY.A06(r7, 5);
            C109326jp A062 = C63893iY.A06(r7, 6);
            if (!list.isEmpty() && !list2.isEmpty()) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                if (AnonymousClass00J.A0C(list) instanceof String) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            A0v.add(C311624m.valueOf(C18180wK.A0k(it)));
                        } catch (IllegalArgumentException | NullPointerException unused) {
                        }
                    }
                    if (AnonymousClass00J.A0C(list2) instanceof String) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            try {
                                A0v2.add(AnonymousClass23U.valueOf(C18180wK.A0k(it2)));
                            } catch (IllegalArgumentException | NullPointerException unused2) {
                            }
                        }
                        ArrayList A0v3 = AnonymousClass0wJ.A0v();
                        Iterator it3 = A0v.iterator();
                        while (it3.hasNext()) {
                            C311624m r3 = (C311624m) it3.next();
                            Iterator it4 = A0v2.iterator();
                            while (it4.hasNext()) {
                                A0v3.add(new FXAccessLibraryDeviceRequestItem(r3, (AnonymousClass23U) it4.next()));
                            }
                        }
                        FXAccessLibraryDeviceRequest fXAccessLibraryDeviceRequest = new FXAccessLibraryDeviceRequest((List) A0v3);
                        C10300i6 A0F = C63913ic.A0F(r5);
                        C04220Ms.A0B(A0F, 0);
                        ArrayList A0v4 = AnonymousClass0wJ.A0v();
                        for (Object next : C18200wM.A0s(fXAccessLibraryDeviceRequest.A00)) {
                            C04220Ms.A06(next);
                            FXAccessLibraryDeviceRequestItem fXAccessLibraryDeviceRequestItem = (FXAccessLibraryDeviceRequestItem) next;
                            C311624m r1 = fXAccessLibraryDeviceRequestItem.A00;
                            C311624m r32 = C311624m.INSTAGRAM;
                            if (r1 == r32) {
                                AnonymousClass23U r02 = fXAccessLibraryDeviceRequestItem.A01;
                                C04220Ms.A06(r02);
                                AnonymousClass23U r12 = AnonymousClass23U.MACHINE_ID;
                                if (r02 == r12) {
                                    String str = C61793Vp.A00(A0F).A01.A00;
                                    C04220Ms.A06(str);
                                    fXDeviceItem = new FXDeviceItem((Long) null, str, r32, r12);
                                } else {
                                    fXDeviceItem = new FXDeviceItem((Long) null, C09140ev.A00(C10600ic.A00), r32, AnonymousClass23U.DEVICE_ID);
                                }
                                A0v4.add(fXDeviceItem);
                            } else {
                                Context context = C10600ic.A00;
                                C57723Cf r03 = new C57723Cf();
                                C84644tb r122 = r03.A02;
                                C15780rs r11 = r03.A00;
                                ArrayList A0v5 = AnonymousClass0wJ.A0v();
                                C307822y A02 = C61923Wj.A02(r1);
                                if (A02 != null) {
                                    AnonymousClass23U r72 = fXAccessLibraryDeviceRequestItem.A01;
                                    ArrayList A0v6 = AnonymousClass0wJ.A0v();
                                    C04220Ms.A0B(r72, A1Z);
                                    if (r72 == AnonymousClass23U.MACHINE_ID) {
                                        List list3 = C60983Rj.A02;
                                        arrayList = AnonymousClass0wJ.A0v();
                                        Iterator it5 = list3.iterator();
                                        while (it5.hasNext()) {
                                            C62273Yb.A00(A02, arrayList, it5);
                                        }
                                    } else {
                                        List list4 = C60983Rj.A01;
                                        arrayList = AnonymousClass0wJ.A0v();
                                        Iterator it6 = list4.iterator();
                                        while (it6.hasNext()) {
                                            C62273Yb.A00(A02, arrayList, it6);
                                        }
                                    }
                                    for (C62273Yb r13 : arrayList) {
                                        try {
                                            PackageManager packageManager = context.getPackageManager();
                                            if (packageManager != null) {
                                                HashMap A0y = AnonymousClass0wJ.A0y();
                                                try {
                                                    if (!packageManager.getApplicationInfo(r13.A02, 0).enabled) {
                                                        A0y.put("app_not_installed", "app_disabled");
                                                        r122.CLn(A0y, r13);
                                                    }
                                                } catch (PackageManager.NameNotFoundException e) {
                                                    A0y.put("app_not_installed", e.getMessage());
                                                    r122.CLn(A0y, r13);
                                                }
                                            }
                                            Uri uri = r13.A00;
                                            C04220Ms.A0B(uri, A1Z);
                                            ContentProviderClient A03 = r11.A03(context, uri);
                                            if (A03 != null) {
                                                try {
                                                    Cursor A00 = AnonymousClass3YU.A00(A03, (String) null, r13, r122);
                                                    if (A00 != null) {
                                                        arrayList2 = AnonymousClass0wJ.A0v();
                                                        C307822y r2 = r13.A04;
                                                        C84424t7 r14 = (C84424t7) C549531b.A00.get(r2);
                                                        while (A00.moveToNext()) {
                                                            try {
                                                                FXDeviceItem D7c = r14.D7c(A00, r72, r2);
                                                                if (D7c != null) {
                                                                    arrayList2.add(D7c);
                                                                }
                                                            } catch (C73914Va e2) {
                                                                r122.CQY(r13, e2);
                                                                A00.close();
                                                            } catch (Throwable th) {
                                                                A00.close();
                                                                throw th;
                                                            }
                                                        }
                                                        A00.close();
                                                        A0v6 = arrayList2;
                                                        A03.close();
                                                    }
                                                    arrayList2 = AnonymousClass0wJ.A0v();
                                                    A0v6 = arrayList2;
                                                    A03.close();
                                                } catch (RemoteException unused3) {
                                                    continue;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } catch (SecurityException unused4) {
                                            r122.CLm(r13);
                                        }
                                    }
                                    A0v5.addAll(Collections.unmodifiableList(A0v6));
                                }
                                A0v4.addAll(A0v5);
                            }
                        }
                        if (!C18250wR.A1K(A0v4) || A0v4.isEmpty()) {
                            C63893iY.A0G(r5, A062);
                        } else {
                            ArrayList A0v7 = AnonymousClass0wJ.A0v();
                            Iterator it7 = A0v4.iterator();
                            while (it7.hasNext()) {
                                FXDeviceItem fXDeviceItem2 = (FXDeviceItem) it7.next();
                                C311624m r04 = fXDeviceItem2.A00;
                                AnonymousClass23U r73 = fXDeviceItem2.A03;
                                String str2 = fXDeviceItem2.A02;
                                if (!(r04 == null || r73 == null || str2 == null)) {
                                    HashMap A0y2 = AnonymousClass0wJ.A0y();
                                    A0y2.put("app_source", r04.name());
                                    A0y2.put("device_id_type", r73.name());
                                    A0y2.put(C61973Wo.A01(0, 9, 37), str2);
                                    A0v7.add(A0y2);
                                }
                            }
                            C63893iY.A0F(r5, AnonymousClass3VO.A00(), A06, A0v7, 0);
                            return null;
                        }
                    }
                }
            }
        }
        return null;
    }
}
