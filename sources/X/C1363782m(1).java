package X;

import com.facebook.browser.lite.BrowserLiteFragment;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.82m  reason: invalid class name and case insensitive filesystem */
public final class C1363782m implements Runnable {
    public final /* synthetic */ AnonymousClass55x A00;
    public final /* synthetic */ C111316n8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C113056qe A03;

    public final void run() {
        String str;
        C12560m7 r1;
        C108706io r12;
        try {
            C113056qe r7 = this.A03;
            List list = r7.A04;
            Collections.sort(list, new C1365283b());
            int size = list.size();
            if (list.isEmpty() || (r12 = (C108706io) list.get(0)) == null) {
                r7.A00 = this.A00;
                r7.A01 = this.A01;
            } else {
                r7.A00 = r12.A01;
                r7.A01 = r12.A02;
            }
            C89405Ej r6 = r7.A06;
            L3B l3b = r6.A02;
            if (l3b != null) {
                l3b.getParentFragmentManager();
                AnonymousClass55x r5 = r7.A00;
                r5.A00 = new C104396bi(this);
                if (r5 instanceof AnonymousClass5ES) {
                    r6.A0X = true;
                }
                L3B l3b2 = r6.A02;
                if (l3b2 != null) {
                    r1 = l3b2.getParentFragmentManager();
                } else {
                    r1 = null;
                }
                r5.A0A(r1, this.A02);
                C111316n8 r0 = r7.A01;
                if (r0 != null) {
                    AnonymousClass7KI.A08(r0);
                }
            }
            String str2 = r6.A0c;
            C39730Kys kys = r6.A03;
            if (kys == null) {
                str = null;
            } else {
                str = ((BrowserLiteFragment) kys).A0e;
            }
            AnonymousClass7KI.A08(new C111316n8("MERGE_AUTOFILL_DIALOG", str2, (String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 0, 0, 0, (long) size, false, false, false));
        } catch (Exception unused) {
            this.A03.A05 = false;
        }
    }

    public C1363782m(C113056qe r1, AnonymousClass55x r2, C111316n8 r3, String str) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = str;
    }
}
