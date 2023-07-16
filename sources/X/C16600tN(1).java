package X;

import android.text.TextUtils;
import java.util.LinkedList;

/* renamed from: X.0tN  reason: invalid class name and case insensitive filesystem */
public final class C16600tN {
    public final C12310lg A00;

    public final void A01(String str, String[] strArr, long j) {
        LinkedList linkedList = new LinkedList();
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                linkedList.add(str2);
            }
        }
        C12310lg r1 = this.A00;
        C14540pc r0 = new C14540pc(str, j);
        r0.A01 = linkedList;
        r1.A00(r0);
    }

    public C16600tN(C12310lg r1) {
        this.A00 = r1;
    }

    public final void A00(String str, String str2) {
        A01("failures", new String[]{str, str2}, 1);
    }
}
