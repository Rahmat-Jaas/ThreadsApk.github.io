package X;

import android.widget.BaseAdapter;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* renamed from: X.0og  reason: invalid class name and case insensitive filesystem */
public final class C14020og {
    public static void A00(BaseAdapter baseAdapter, int i) {
        ExternalProviders.A07.A08().A00(6, 19, i, 0, 0);
        baseAdapter.notifyDataSetChanged();
    }

    public static void A01(BaseAdapter baseAdapter, int i) {
        ExternalProviders.A07.A08().A00(6, 19, i, 0, 0);
        baseAdapter.notifyDataSetInvalidated();
    }
}
