package X;

import android.app.Activity;
import android.content.Context;
import androidx.navigation.Navigator$Name;
import java.util.Iterator;

@Navigator$Name("activity")
/* renamed from: X.59D  reason: invalid class name */
public final class AnonymousClass59D extends C114586tX {
    public final Activity A00;
    public final Context A01;

    public AnonymousClass59D(Context context) {
        Object obj;
        this.A01 = context;
        Iterator it = AnonymousClass8bL.A08(context, AnonymousClass8MT.A00).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof Activity) {
                break;
            }
        }
        this.A00 = (Activity) obj;
    }
}
