package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.41b  reason: invalid class name and case insensitive filesystem */
public final class C679141b implements C39516Kv0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C10300i6 A01;
    public final /* synthetic */ C311624m A02;
    public final /* synthetic */ AnonymousClass24G A03;

    public C679141b(Context context, C10300i6 r2, C311624m r3, AnonymousClass24G r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = context;
    }

    public final ListenableFuture ABh() {
        ArrayList arrayList;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C57723Cf r4 = new C57723Cf();
        r4.A03 = new C81124nC(this.A01);
        C63053bO r12 = new C63053bO(r4);
        C311624m r10 = this.A02;
        C307822y A022 = C61923Wj.A02(r10);
        if (A022 != null) {
            int ordinal = this.A03.ordinal();
            if (ordinal != 0) {
                Context context = this.A00;
                arrayList = AnonymousClass0wJ.A0v();
                if (ordinal != 2) {
                    List list = AnonymousClass329.A01;
                    ArrayList<C62273Yb> A0v2 = AnonymousClass0wJ.A0v();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C62273Yb.A00(A022, A0v2, it);
                    }
                    for (C62273Yb A032 : A0v2) {
                        AnonymousClass3ZN r5 = r12.A03;
                        String name = r10.name();
                        AnonymousClass24G r11 = AnonymousClass24G.ALL_ACCOUNTS;
                        r5.A0D(name, "ALL_ACCOUNTS", "LITE_PROVIDER", (Map) null);
                        C63053bO.A03(context, arrayList, A032, r10, r11, r12);
                    }
                } else {
                    List list2 = AnonymousClass329.A02;
                    ArrayList<C62273Yb> A0v3 = AnonymousClass0wJ.A0v();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C62273Yb.A00(A022, A0v3, it2);
                    }
                    for (C62273Yb A033 : A0v3) {
                        AnonymousClass3ZN r52 = r12.A03;
                        String name2 = r10.name();
                        AnonymousClass24G r112 = AnonymousClass24G.SAVED_ACCOUNTS;
                        r52.A0D(name2, "SAVED_ACCOUNTS", "LITE_PROVIDER", (Map) null);
                        C63053bO.A03(context, arrayList, A033, r10, r112, r12);
                    }
                }
            } else {
                Context context2 = this.A00;
                arrayList = AnonymousClass0wJ.A0v();
                List list3 = AnonymousClass329.A00;
                ArrayList<C62273Yb> A0v4 = AnonymousClass0wJ.A0v();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    C62273Yb.A00(A022, A0v4, it3);
                }
                for (C62273Yb A034 : A0v4) {
                    AnonymousClass3ZN r53 = r12.A03;
                    String name3 = r10.name();
                    AnonymousClass24G r113 = AnonymousClass24G.ACTIVE_ACCOUNT;
                    r53.A0D(name3, "ACTIVE_ACCOUNT", "LITE_PROVIDER", (Map) null);
                    C63053bO.A03(context2, arrayList, A034, r10, r113, r12);
                }
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            C04220Ms.A06(unmodifiableList);
            A0v.addAll(unmodifiableList);
        }
        return C30954Gc6.A01(AnonymousClass00J.A0N(C61923Wj.A00(A0v)));
    }
}
