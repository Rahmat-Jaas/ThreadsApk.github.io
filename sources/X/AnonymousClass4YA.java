package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* renamed from: X.4YA  reason: invalid class name */
public final class AnonymousClass4YA extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ Fragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4YA(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    public final Object invoke() {
        Class<AnonymousClass19V> cls = AnonymousClass19V.class;
        if (Serializable.class.isAssignableFrom(cls)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                requireArguments.getSerializable("direct_ssc_category_args", Object.class);
                return null;
            }
            requireArguments.getSerializable("direct_ssc_category_args");
            return null;
        } else if (Parcelable.class.isAssignableFrom(cls)) {
            Fragment fragment2 = this.A00;
            int i2 = Build.VERSION.SDK_INT;
            Bundle requireArguments2 = fragment2.requireArguments();
            if (i2 >= 33) {
                requireArguments2.getParcelable("direct_ssc_category_args", Object.class);
                return null;
            }
            requireArguments2.getParcelable("direct_ssc_category_args");
            return null;
        } else {
            throw C18180wK.A0a(AnonymousClass00U.A0V("Argument type for ", "direct_ssc_category_args", " is not yet supported"));
        }
    }
}
