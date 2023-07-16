package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.resources.stringoverride.bloks.BloksStringOverrideFactory;
import java.util.HashMap;

/* renamed from: X.7Mh  reason: invalid class name and case insensitive filesystem */
public final class C122297Mh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C04220Ms.A0B(parcel, 0);
        HashMap A0y = AnonymousClass0wJ.A0y();
        int i = Build.VERSION.SDK_INT;
        ClassLoader classLoader = HashMap.class.getClassLoader();
        if (i >= 33) {
            Class<String> cls = String.class;
            parcel.readMap(A0y, classLoader, cls, cls);
        } else {
            parcel.readMap(A0y, classLoader);
        }
        return new BloksStringOverrideFactory(A0y);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BloksStringOverrideFactory[i];
    }
}
