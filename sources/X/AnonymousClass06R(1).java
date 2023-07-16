package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.ref.WeakReference;

/* renamed from: X.06R  reason: invalid class name */
public final class AnonymousClass06R extends AnonymousClass0F6 {
    public final C03180Et A00;
    public final AnonymousClass0F0 A01;

    public AnonymousClass06R(C03180Et r7, C03190Eu r8, AnonymousClass0F0 r9, AnonymousClass0F2 r10, C03410If r11) {
        super(r8, r9, r10, r11, "AppThread Binder Codes");
        this.A00 = r7;
        this.A01 = r9;
    }

    public final /* bridge */ /* synthetic */ Parcelable A00(Object obj) {
        Parcel parcel = (Parcel) obj;
        AnonymousClass0F0 r0 = this.A01;
        if (r0 == null) {
            return null;
        }
        return r0.A01(parcel);
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass01Q r2, AnonymousClass012 r3, int i) {
        return this.A00.A01();
    }

    public final /* bridge */ /* synthetic */ boolean A04(C016507v r3, Object obj) {
        WeakReference weakReference;
        AnonymousClass0KW.A03(!r3.A0A);
        if (obj != null) {
            weakReference = new WeakReference(obj);
        } else {
            weakReference = null;
        }
        r3.A09 = weakReference;
        r3.A0B = true;
        return true;
    }
}
