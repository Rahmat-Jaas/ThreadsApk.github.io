package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.instagram.appreciation.analytics.LoggingData;

/* renamed from: X.6yp  reason: invalid class name and case insensitive filesystem */
public final class C117526yp {
    public static final LoggingData A00(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("appreciation_logging_data");
        if (parcelable != null) {
            return (LoggingData) parcelable;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static LoggingData A01(Fragment fragment) {
        return A00(fragment.requireArguments());
    }
}
