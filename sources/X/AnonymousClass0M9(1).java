package X;

import java.lang.ref.WeakReference;
import java.util.HashSet;

/* renamed from: X.0M9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0M9 implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ WeakReference A02;
    public final /* synthetic */ HashSet A03;

    public /* synthetic */ AnonymousClass0M9(String str, String str2, WeakReference weakReference, HashSet hashSet) {
        this.A03 = hashSet;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = weakReference;
    }

    public final void run() {
        HashSet<AnonymousClass0MD> hashSet = this.A03;
        String str = this.A00;
        String str2 = this.A01;
        WeakReference weakReference = this.A02;
        for (AnonymousClass0MD BwM : hashSet) {
            BwM.BwM(str, str2, weakReference);
        }
    }
}
