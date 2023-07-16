package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7yW  reason: invalid class name and case insensitive filesystem */
public final class C134877yW implements Iterable {
    public static void A00(Context context, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            context.startActivities(intentArr, (Bundle) null);
            return;
        }
        throw C18180wK.A0a("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public final Iterator iterator() {
        throw new NullPointerException("iterator");
    }
}
