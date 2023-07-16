package X;

import android.util.Log;
import android.view.MenuItem;

/* renamed from: X.02S  reason: invalid class name */
public final class AnonymousClass02S {
    public static void A00(MenuItem menuItem, C003501q r2) {
        if (menuItem instanceof AnonymousClass01W) {
            ((AnonymousClass01W) menuItem).CqI(r2);
        } else {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }
    }
}
