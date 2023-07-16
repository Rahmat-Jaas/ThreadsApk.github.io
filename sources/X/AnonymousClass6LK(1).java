package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;

/* renamed from: X.6LK  reason: invalid class name */
public final class AnonymousClass6LK {
    public static final CreatorLoggingData A00(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("appreciation_creator_logging_data");
        if (parcelable != null) {
            return (CreatorLoggingData) parcelable;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
