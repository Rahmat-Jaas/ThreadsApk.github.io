package X;

import android.os.Message;
import android.os.Parcelable;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.09r  reason: invalid class name and case insensitive filesystem */
public final class C020809r extends AnonymousClass0F6 {
    public final AnonymousClass0Er A00;
    public final AnonymousClass0F0 A01;

    public C020809r(AnonymousClass0Er r7, C03190Eu r8, AnonymousClass0F0 r9, AnonymousClass0F2 r10, C03410If r11) {
        super(r8, r9, r10, r11, "AppThread Handler What Codes");
        this.A00 = r7;
        this.A01 = r9;
    }

    public final /* bridge */ /* synthetic */ Parcelable A00(Object obj) {
        Class cls;
        Message message = (Message) obj;
        if (message == null) {
            return null;
        }
        AnonymousClass0F0 r0 = this.A01;
        Object obj2 = message.obj;
        if (obj2 == null || (cls = r0.A03) == null || !cls.isAssignableFrom(obj2.getClass())) {
            return null;
        }
        return (Parcelable) obj2;
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass01Q r7, AnonymousClass012 r8, int i) {
        List list;
        AnonymousClass0Er r0 = this.A00;
        C03220Ey r1 = r0.A01;
        AnonymousClass013 r5 = r0.A00;
        if (!C03220Ey.A0C || C03220Ey.A0B) {
            throw new IllegalStateException("Must init ActivityThreadHooker first");
        } else if (r5 != null) {
            synchronized (r1.A01) {
                SparseArray sparseArray = r1.A00;
                list = (List) sparseArray.get(i);
                if (list == null) {
                    list = new ArrayList(2);
                    sparseArray.put(i, list);
                }
            }
            list.size();
            synchronized (list) {
                list.add(r5);
            }
            AnonymousClass0KF.A01(true, 1);
            return true;
        } else {
            throw new IllegalArgumentException(String.format("Cannot hook activity thread with what: %d since the hook was null", new Object[]{Integer.valueOf(i)}));
        }
    }

    public final /* bridge */ /* synthetic */ boolean A04(C016507v r3, Object obj) {
        WeakReference weakReference;
        AnonymousClass0KW.A03(!r3.A0A);
        if (obj != null) {
            weakReference = new WeakReference(obj);
        } else {
            weakReference = null;
        }
        r3.A08 = weakReference;
        r3.A0B = true;
        return true;
    }
}
