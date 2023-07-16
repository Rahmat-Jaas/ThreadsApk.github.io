package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.1fO  reason: invalid class name */
public final class AnonymousClass1fO extends I4A implements C82214pG, C81334nc {
    public AnonymousClass3IK A00;
    public AnonymousClass3IK A01;
    public boolean A02;
    public boolean A03;
    public final C84104sY A04;
    public final List A05 = AnonymousClass0wJ.A0v();
    public final C23951ge A06;
    public final C24141gx A07;
    public final C24091gs A08;
    public final AnonymousClass1gR A09;
    public final boolean A0A;

    public final void BsT() {
        if (!this.A03) {
            this.A04.BsT();
        }
    }

    public AnonymousClass1fO(Context context, C84104sY r6, C11630kW r7, String str, String str2, String str3, boolean z) {
        this.A04 = r6;
        AnonymousClass1gR r3 = new AnonymousClass1gR(context, this, r7);
        this.A09 = r3;
        C24141gx r2 = new C24141gx(context, str2 == null ? "" : str2);
        this.A07 = r2;
        C23951ge r1 = new C23951ge(context, this);
        this.A06 = r1;
        this.A0A = z;
        C24091gs r0 = new C24091gs(context, str == null ? "" : str, str3 == null ? "" : str3);
        this.A08 = r0;
        A08(r0, r3, r1, r2);
    }

    public static void A00(AnonymousClass1fO r7) {
        String str;
        List list;
        r7.A03();
        if (r7.A02) {
            r7.A06(r7.A08, (Object) null, (Object) null);
        }
        boolean z = r7.A0A;
        AnonymousClass3IK r0 = r7.A00;
        if (r0 == null) {
            str = "0";
        } else {
            str = r0.A08;
        }
        int i = 0;
        while (true) {
            list = r7.A05;
            if (i >= list.size()) {
                break;
            }
            AnonymousClass3IK r3 = (AnonymousClass3IK) list.get(i);
            r7.A06(r7.A09, r3, Boolean.valueOf(r3.A08.equals(str)));
            i++;
        }
        if (z) {
            r7.A06(r7.A06, (Object) null, (Object) null);
        }
        if (!list.isEmpty()) {
            r7.A06(r7.A07, (Object) null, (Object) null);
        }
        r7.A04();
    }
}
